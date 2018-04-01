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
    public static int seleccionarOpcion(){
       Scanner teclado = new Scanner(System.in);
       int opcion = -1; 
       System.out.println("Presione: \n");
       System.out.println("1. Ingresar Aeropuerto\n2. Ingresar Hotel\n"
               + "3. Ingresar Viaje\n4. Listar informacion Viajes\n"
               + "5. Viaje mas corto\n6. Viaje mas largo\n"
               + "7. Salir");
       opcion = teclado.nextInt();
       return opcion;  
    }
    public static int seleccionarOpcionAeropuerto(TravelAgency agencia){
       Scanner teclado = new Scanner(System.in);
       int opcion = -1; 
        System.out.println("Presione:\n");
       for(int i = 0; i<agencia.getAirports().length;i++){
            if(agencia.getAirports()[i]!=null)
                System.out.println(i+ ". " + agencia.getAirports()[i].getDescripcion() + "\n");
       }
       
       opcion = teclado.nextInt();
       return opcion;  
    }
    public static int seleccionarOpcionHotel(TravelAgency agencia){
       Scanner teclado = new Scanner(System.in);
       int opcion = -1; 
        System.out.println("Presione:\n");
       for(int i = 0; i<agencia.getKnownHotels().length;i++){
            if(agencia.getKnownHotels()[i]!=null)
                System.out.println(i+ ". " + agencia.getKnownHotels()[i].getNombre() + "\n");
       }
       
       opcion = teclado.nextInt();
       return opcion;  
    }
    
    public static void main(String[] args) {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        TravelAgency agencia = new TravelAgency("Aviatur");
        do{
            opcion=seleccionarOpcion();
            switch(opcion){
                case 1:
                    //Ingresar Aeropuerto
                    System.out.print("Ingresa nombre del aeropuerto:\n");
                    String nombreAir = teclado.nextLine();
                    Airport a1 = new Airport(nombreAir);
                    agencia.addAirport(a1);
                    break;
                case 2:
                    //Ingresar hotel
                    System.out.print("Ingrese nombre del hotel:\n");
                    String nombreHotel = teclado.nextLine();
                    System.out.print("Ingrese direccion Hotel:\n");
                    String direccionHotel = teclado.nextLine();
                    Hotel h1 = new Hotel(nombreHotel, direccionHotel);
                    agencia.addHotel(h1);
                    break;
                case 3:
                    //Ingresar Viaje
                    System.out.println("Ingresar duracion del viaje");
                    int duracionViaje = teclado.nextInt();
                    System.out.println("Ingresar anio viaje Ida");
                    int aniod = teclado.nextInt();
                    System.out.println("Ingresar mes viaje Ida");
                    int mesd = teclado.nextInt();
                    System.out.println("Ingresar dia viaje Ida");
                    int diad = teclado.nextInt();
                    
                    GregorianCalendar departure = new GregorianCalendar(aniod,mesd-1,diad);
                    GregorianCalendar arrival = new GregorianCalendar(aniod,mesd-1,diad);
                    System.out.println("Ingresar anio viaje Vuelta");
                    int aniod2 = teclado.nextInt();
                    System.out.println("Ingresar mes viaje Vuelta");
                    int mesd2 = teclado.nextInt();
                    System.out.println("Ingresar dia viaje Vuelta");
                    int diad2 = teclado.nextInt();
                    GregorianCalendar departure2 = new GregorianCalendar(aniod2,mesd2-1,diad2);
                    GregorianCalendar arrival2 = new GregorianCalendar(aniod2,mesd2-1,diad2);
                    System.out.println("Ingrese numero de viaje Ida");
                    int numeroIda = teclado.nextInt();
                    System.out.println("Ingrese numero de viaje vuelta");
                    int numeroVuelta = teclado.nextInt();
                    BookedFlight ida = new BookedFlight(numeroIda, departure, arrival);
                    BookedFlight vuelta = new BookedFlight(numeroVuelta, departure2, arrival2);
                    System.out.println("Seleccione aeropuerto origen");
                    int salidaInt;
                    salidaInt = seleccionarOpcionAeropuerto(agencia);
                    ida.setOrigen(agencia.getAirports()[salidaInt]);
                    vuelta.setDestino(agencia.getAirports()[salidaInt]);
                    System.out.println("Seleccione aeropuerto destino");
                    int destinoInt;
                    destinoInt = seleccionarOpcionAeropuerto(agencia);
                    ida.setDestino(agencia.getAirports()[destinoInt]);
                    vuelta.setOrigen(agencia.getAirports()[destinoInt]);
                    System.out.println("seleccione Hotel");
                    int hotelInt;
                    hotelInt = seleccionarOpcionHotel(agencia);
                    Travel viaje = new Travel(duracionViaje, aniod, mesd, diad, 
                    agencia.getKnownHotels()[hotelInt]);
                    viaje.addOutbound(ida);
                    viaje.addRetorno(vuelta);
                    agencia.addTravel(viaje);
                    
                    break;
                case 4:
                    //Listar informacion viajes
                    System.out.println(agencia.informacionViajes());
                    break;
                case 5:
                    //Viaje mas corto
                    agencia.viajeMasCorto();
                    break;
                case 6:
                    //Viaje mas largo
                    agencia.viajeMasLargo();
                    break;
                default:
                    break;
            }
        }while(opcion!=7);
    }
}
