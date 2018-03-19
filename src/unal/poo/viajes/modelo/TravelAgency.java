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
        boolean valor = false;
        for(int i = 0; i < knownHotels.length; i ++){
            if(hotel.equals(this.knownHotels[i])){
                valor = false;
            }else{
                this.knownHotels[i] = hotel;
                valor = true;
            }
        }
        return valor;
    }
    
    public boolean removeHotel(Hotel hotel){
        boolean valor = false;
        for(int i = 0; i < knownHotels.length; i ++){
            if(hotel.equals(this.knownHotels[i])){
                this.knownHotels[i] = null;
                valor = true;
            }else{
                valor = false;
            }
        }
        return valor;
    }
    
    public boolean addAirport(Airport aeropuerto){
        boolean valor = false;
        for(int i = 0; i < airports.length; i ++){
            if(aeropuerto.equals(this.airports[i])){
                valor = false;
            }else{
                this.airports[i] = aeropuerto;
                valor = true;
            }
        }
        return valor;
    }
    
    public boolean removeAirport(Airport aeropuerto){
        boolean valor = false;
        for(int i = 0; i < airports.length; i ++){
            if(aeropuerto.equals(this.airports[i])){
                this.airports[i] = null;
                valor = true;
            }else{
                valor = false;
            }
        }
        return valor;
    }
    
    public boolean addTravel(Travel viaje){
        //boolean valor=false;
        for(int i = 0; i < offeredTravels.length; i ++){
            if (offeredTravels!=null){
                if(!viaje.equals(this.offeredTravels[i])){
                    this.offeredTravels[i] = viaje;
                    return true;
                    
                }
            }
        }
        return false;
    }
    
    public boolean removeTravel(Travel viaje){
        boolean valor = false;
        for(int i = 0; i < offeredTravels.length; i ++){
            if(viaje.equals(this.offeredTravels[i])){
                this.offeredTravels[i] = null;
                valor = true;
            }else{
                valor = false;
            }
        }
        return valor;
    }
    
    public String informacionViajes(){
        String mensaje = "La información de los viajes es la siguiente:\n\n";
        if (offeredTravels!=null){
            for (Travel offeredTravel : offeredTravels) {
                if (offeredTravel!=null){
                mensaje+=offeredTravel.informacionViaje();
                }
            }
        }   
        return mensaje;
    }
    
    public void viajeMasLargo(){
        Travel viaje = new Travel(0,0,0,0);
        if (offeredTravels!=null){
        for (Travel offeredTravel : offeredTravels) {
            if (offeredTravel!=null){
                if (viaje.getDuration() < offeredTravel.getDuration()) {
                    viaje = offeredTravel;
                }
            }
        }
        }
        System.out.println("El viaje más largo fue:\n" + 
                viaje.informacionViaje());
    }
    
    public void viajeMasCorto(){
        Travel viaje = new Travel(1000000000,0,0,0);
        if (offeredTravels!=null){
        for (Travel offeredTravel : offeredTravels) {
            if (offeredTravel!=null){
            if (viaje.getDuration() > offeredTravel.getDuration()) {
                viaje = offeredTravel;
            }
            }
        }
        }
        System.out.println("El viaje más corto fue:\n" + 
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
