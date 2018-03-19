/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.viajes.vistas;
import unal.poo.viajes.modelo.Airport;
import unal.poo.viajes.modelo.BookedFlight;
import unal.poo.viajes.modelo.Hotel;
import unal.poo.viajes.modelo.Travel;
import unal.poo.viajes.modelo.TravelAgency;
import java.util.*;
/**
 *
 * @author Juan_Ardila
 */
public class Application {
    public static void main(String[] args) {
        TravelAgency agencia = new TravelAgency("Aviatur");
        Hotel hotel = new Hotel("Fontanar", "Cra. 21a # 159a - 28");
        Travel viaje = new Travel(30, 2017, 3, 22);
        agencia.addHotel(hotel);
        GregorianCalendar departure = new GregorianCalendar(2017,3,22);
        GregorianCalendar arrival = new GregorianCalendar(2017,3,22);
        GregorianCalendar departure2 = new GregorianCalendar(2017,3,29);
        GregorianCalendar arrival2 = new GregorianCalendar(2017,3,29);
        BookedFlight ida = new BookedFlight(1345, departure, arrival);
        BookedFlight vuelta = new BookedFlight(1346, departure2, arrival2);
        Airport salida = new Airport("Aeropuerto Jose Maria Cordoba");
        Airport llegada = new Airport("Aeropuerto El Dorado");
        agencia.addAirport(llegada);
        agencia.addAirport(salida);
        ida.setDestino(llegada);
        ida.setOrigen(salida);
        viaje.addOutbound(ida);
        viaje.addRetorno(vuelta);
        vuelta.setDestino(salida);
        vuelta.setOrigen(llegada);
        
        
        //tengo problemas con estos metodos
        agencia.informacionViajes();
        agencia.viajeMasCorto();
        agencia.viajeMasLargo();
    }
}
