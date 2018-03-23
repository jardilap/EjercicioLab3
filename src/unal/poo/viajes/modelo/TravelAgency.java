/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.viajes.modelo;
//import java.util.*;
/**
 *
 * @author Juan_Ardila
 */
public class TravelAgency {
    private String name;
    private Hotel[] knownHotels;
    private Travel[] offeredTravels;
    private Airport[] airports;
    
    public TravelAgency(String name){
        this.name = name;
        this.knownHotels = new Hotel[5];
        this.airports = new Airport[4];
        this.offeredTravels = new Travel[10];
    }
    
    public boolean addHotel(Hotel hotel){
        for(int i = 0; i < knownHotels.length; i ++){
            if(this.knownHotels[i]==null){
                this.knownHotels[i] = hotel;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeHotel(Hotel hotel){
        for(int i = 0; i < knownHotels.length; i ++){
            if(hotel.equals(this.knownHotels[i])){
                this.knownHotels[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public boolean addAirport(Airport aeropuerto){
        for(int i = 0; i < airports.length; i ++){
            if(this.airports[i]==null){
                this.airports[i] = aeropuerto;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeAirport(Airport aeropuerto){
        for(int i = 0; i < airports.length; i ++){
            if(aeropuerto.equals(this.airports[i])){
                this.airports[i] = null;
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
    public boolean addTravel(Travel viaje){
        for(int i = 0; i < offeredTravels.length; i ++){
            if(this.offeredTravels[i]==null){
                this.offeredTravels[i] = viaje;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeTravel(Travel viaje){
        for(int i = 0; i < offeredTravels.length; i ++){
            if(viaje.equals(this.offeredTravels[i])){
                this.offeredTravels[i] = null;
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
    public String informacionViajes(){
        String mensaje = "La información de los viajes es la siguiente:\n\n";
        if (offeredTravels!=null){
            for (int i = 0; i<offeredTravels.length; i++) {
                if (offeredTravels[i]!=null){
                mensaje+="Viaje "+ (i+1) + ":\n" +offeredTravels[i].informacionViaje() + "\n";
                }
            }
        }   
        return mensaje;
    }
    
    public void viajeMasLargo(){
        Travel viaje = new Travel(0,0,0,0);
        if (offeredTravels!=null){
        for (int i = 0; i<offeredTravels.length; i++) {
            if (offeredTravels[i]!=null){
                if (viaje.getDuration() < offeredTravels[i].getDuration()) {
                    viaje = offeredTravels[i];
                }
            }
        }
        }
        System.out.println("El viaje más largo fue:\n\n" + 
                viaje.informacionViaje());
    }
    
    public void viajeMasCorto(){
        Travel viaje = new Travel(1000000000,0,0,0);
        if (offeredTravels!=null){
        for (int i = 0; i<offeredTravels.length; i++) {
            if (offeredTravels[i]!=null){
            if (viaje.getDuration() > offeredTravels[i].getDuration()) {
                viaje = offeredTravels[i];
            }
            }
        }
        }
        System.out.println("El viaje más corto fue:\n\n" + 
                viaje.informacionViaje());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hotel[] getKnownHotels() {
        return knownHotels;
    }

    public void setKnownHotels(Hotel[] knownHotels) {
        this.knownHotels = knownHotels;
    }

    public Travel[] getOfferedTravels() {
        return offeredTravels;
    }

    public void setOfferedTravels(Travel[] offeredTravels) {
        this.offeredTravels = offeredTravels;
    }

    public Airport[] getAirports() {
        return airports;
    }

    public void setAirports(Airport[] airports) {
        this.airports = airports;
    }
    
}
