/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

/**
 *
 * @author pablo
 */
public class Vista {

    private static VPasajero vistaPasajero = new VPasajero();
    private static VTicket vistaTicket = new VTicket();
    private static VVuelo vistaVuelo = new VVuelo();
    private static VAeropuerto vistaAeropuerto = new VAeropuerto();

    /**
     * @return the vistaPasajero
     */
    public static VPasajero pasajero() {
        return vistaPasajero;
    }

    /**
     * @return the vistaTicket
     */
    public static VTicket ticket() {
        return vistaTicket;
    }

    /**
     * @return the vistaVuelo
     */
    public static VVuelo vuelo() {
        return vistaVuelo;
    }

    /**
     * @return the vistaAeropuerto
     */
    public static VAeropuerto aeropuerto() {
        return vistaAeropuerto;
    }
    
    
}