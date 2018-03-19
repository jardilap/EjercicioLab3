/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.viajes.modelo;
import java.util.*;
/**
 *
 * @author Juan_Ardila
 */
public class BookedFlight {
    private int flightNumber;
    private GregorianCalendar departure;
    private GregorianCalendar arrival;
    private Airport origen;
    private Airport destino;

    public BookedFlight(int flightNumber, GregorianCalendar departure, GregorianCalendar arrival) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
    }

    public Airport getOrigen() {
        return origen;
    }

    public void setOrigen(Airport origen) {
        this.origen = origen;
    }

    public Airport getDestino() {
        return destino;
    }

    public void setDestino(Airport destino) {
        this.destino = destino;
    }
    
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public GregorianCalendar getDeparture() {
        return departure;
    }

    public void setDeparture(GregorianCalendar departure) {
        this.departure = departure;
    }

    public GregorianCalendar getArrival() {
        return arrival;
    }

    public void setArrival(GregorianCalendar arrival) {
        this.arrival = arrival;
    }
    
    
    
}
