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
public class Travel {
    private GregorianCalendar start;
    private int duration;
    private Hotel hotel;
    private BookedFlight outbound;
    private BookedFlight retorno;
    private GregorianCalendar cero = new GregorianCalendar(0,0,0);

    public Travel(int duration, int year, int month, int date) {
        this.duration = duration;
        this.start = new GregorianCalendar(year, month, date);
        this.outbound = new BookedFlight(0,cero,cero);
        this.retorno = new BookedFlight(0,cero,cero);
    }
    
    public void addOutbound(BookedFlight book){
        this.outbound = book;
    }
    
    public void addRetorno(BookedFlight book){
        this.retorno = book;
    }
    
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public GregorianCalendar getStart() {
        return start;
    }

    public BookedFlight getOutbound() {
        return outbound;
    }
    
    public int getOutboundFlightNumber(){
        return this.outbound.getFlightNumber();
    }
    public String getOutboundAirport(){
        return this.outbound.getOrigen().getDescripcion();
    }

    public BookedFlight getRetorno() {
        return retorno;
    }
    
    public int getRetornoFlightNumber(){
        return this.retorno.getFlightNumber();
    }
    public String getRetornoAirport(){
        return this.retorno.getOrigen().getDescripcion();
    }

    public void setStart(GregorianCalendar start) {
        this.start = start;
    }

    public void setOutbound(BookedFlight outbound) {
        this.outbound = outbound;
    }

    public void setRetorno(BookedFlight retorno) {
        this.retorno = retorno;
    }
    
    
    
}
