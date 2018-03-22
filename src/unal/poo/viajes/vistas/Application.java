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
        agencia.addTravel(viaje);
        
        
        
        Hotel hotel2 = new Hotel("La Quintana", "Cra. 19a # 173 - 70");
        Travel viaje2 = new Travel(31, 2017, 5, 22);
        agencia.addHotel(hotel2);
        GregorianCalendar departure3 = new GregorianCalendar(2017,5,22);
        GregorianCalendar arrival3 = new GregorianCalendar(2017,5,22);
        GregorianCalendar departure4 = new GregorianCalendar(2017,5,29);
        GregorianCalendar arrival4 = new GregorianCalendar(2017,5,29);
        BookedFlight ida2 = new BookedFlight(1356, departure3, arrival3);
        BookedFlight vuelta2 = new BookedFlight(2345, departure4, arrival4);
        ida2.setDestino(llegada);
        ida2.setOrigen(salida);
        viaje2.addOutbound(ida2);
        viaje2.addRetorno(vuelta2);
        vuelta2.setDestino(salida);
        vuelta2.setOrigen(llegada);
        agencia.addTravel(viaje2);
        
        
        
        
        Travel viaje3 = new Travel(32, 2017, 7, 22);
        agencia.addHotel(hotel);
        GregorianCalendar departure5 = new GregorianCalendar(2017,7,22);
        GregorianCalendar arrival5 = new GregorianCalendar(2017,7,22);
        GregorianCalendar departure6 = new GregorianCalendar(2017,7,29);
        GregorianCalendar arrival6 = new GregorianCalendar(2017,7,29);
        BookedFlight ida3 = new BookedFlight(8754, departure5, arrival5);
        BookedFlight vuelta3 = new BookedFlight(9876, departure6, arrival6);
        ida3.setDestino(llegada);
        ida3.setOrigen(salida);
        viaje3.addOutbound(ida3);
        viaje3.addRetorno(vuelta3);
        vuelta3.setDestino(salida);
        vuelta3.setOrigen(llegada);
        agencia.addTravel(viaje3);
        
        
        
        Hotel hotel3 = new Hotel("Gran Oasis", "Cra. 5a # 100a - 58");
        Travel viaje4 = new Travel(33, 2017, 9, 22);
        agencia.addHotel(hotel3);
        GregorianCalendar departure7 = new GregorianCalendar(2017,9,22);
        GregorianCalendar arrival7 = new GregorianCalendar(2017,9,22);
        GregorianCalendar departure8 = new GregorianCalendar(2017,9,29);
        GregorianCalendar arrival8 = new GregorianCalendar(2017,9,29);
        BookedFlight ida4 = new BookedFlight(2346, departure7, arrival7);
        BookedFlight vuelta4 = new BookedFlight(7568, departure8, arrival8);
        ida4.setDestino(llegada);
        ida4.setOrigen(salida);
        viaje4.addOutbound(ida4);
        viaje4.addRetorno(vuelta4);
        vuelta4.setDestino(salida);
        vuelta4.setOrigen(llegada);
        agencia.addTravel(viaje4);
        
        
        System.out.println(agencia.informacionViajes());
        agencia.viajeMasCorto();
        agencia.viajeMasLargo();
    }
}
