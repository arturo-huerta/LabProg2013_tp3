/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import TP3.aerolinea.controller.exceptions.NonexistentEntityException;
import TP3.aerolinea.controller.exceptions.PreexistingEntityException;
import javax.swing.JTextField;

/**
 *
 * @author tincho
 */
class VTicket {

    void crear(JTextField codigoVuelo, JTextField numeroTicket, JTextField dni) throws PreexistingEntityException, Exception {

        Pasajero p = Controladores.getPjc().findPasajero(Long.parseLong(dni.getText()));
        Vuelo v = Controladores.getVjc().findVuelo(Long.parseLong(codigoVuelo.getText()));
        // Crea el ticket solamente si: el pasajero existe, el vuelo existe
        Tickets t = new Tickets();
        t.setCodigoVuelo(Long.parseLong(codigoVuelo.getText()));
        t.setNumeroTicket(Long.parseLong(numeroTicket.getText()));
        t.setDniPasajero(Long.parseLong(dni.getText()));
        Controladores.getTjc().create(t);
        p.getTicketLista().add(t.getNumeroTicket());
        Controladores.getPjc().edit(p);
        v.getTicketsLista().add(t.getNumeroTicket());
        Controladores.getVjc().edit(v);
    }

    void imprimir(JTextField numeroTicket, JTextField codigoAeropuertoPartida, JTextField codigoAeropuertoLlegada, JTextField codigoVuelo, JTextField dni, Tickets t) {
        numeroTicket.setText(t.getNumeroTicket().toString());
        Vuelo v = Controladores.getVjc().findVuelo(t.getCodigoVuelo());
        if ((codigoAeropuertoPartida != null) && (codigoAeropuertoLlegada != null)) {
            codigoAeropuertoPartida.setText(v.getCodigoAeropuertoPartida().toString());
            codigoAeropuertoLlegada.setText(v.getCodigoAeropuertoLlegada().toString());
        }
        codigoVuelo.setText(t.getCodigoVuelo().toString());
        dni.setText(t.getDniPasajero().toString());
    }

    /**
     *
     * @param busqueda the value of busqueda
     * @param numeroTicket the value of numeroTicket
     * @param codigoVuelo the value of codigoVuelo
     * @param dni the value of dni
     * @throws NonexistentEntityException
     * @throws Exception
     */
    void modificar(JTextField busqueda, JTextField numeroTicket, JTextField codigoVuelo, JTextField dni) throws NonexistentEntityException, Exception {
        Tickets t = Controladores.getTjc().findTickets(Long.parseLong(busqueda.getText()));
        // Eliminarlo de la lista de tickets del vuelo anterior
        Vuelo v = Controladores.getVjc().findVuelo(t.getCodigoVuelo());
        v.getTicketsLista().remove(t.getNumeroTicket());
        Controladores.getVjc().edit(v);
        // Eliminarlo de la lista de tickets del pasajero anterior
        Pasajero p = Controladores.getPjc().findPasajero(t.getDniPasajero());
        p.getTicketLista().remove(t.getNumeroTicket());
        Controladores.getPjc().edit(p);
        // Asignar nuevos datos, recibidos de la GUI
        t.setCodigoVuelo(Long.parseLong(codigoVuelo.getText()));
        t.setDniPasajero(Long.parseLong(dni.getText()));
        Controladores.getTjc().edit(t);
        p = Controladores.getPjc().findPasajero(t.getDniPasajero());
        p.getTicketLista().add(t.getNumeroTicket());
        Controladores.getPjc().edit(p);
        v = Controladores.getVjc().findVuelo(t.getCodigoVuelo());
        v.getTicketsLista().add(t.getNumeroTicket());
        Controladores.getVjc().edit(v);
        // Actualizar datos del ticket

    }

    void eliminar(JTextField numeroTicket) throws NonexistentEntityException, Exception {
        Tickets ticket = Controladores.getTjc().findTickets(Long.parseLong(numeroTicket.getText()));
        // Si el ticket existe, eliminarlo de los tickets del pasajero y luego de la lista de tickets del vuelo
        /*       Pasajero pasajero = Controladores.getPjc().findPasajero(ticket.getDniPasajero());
         * pasajero.getTicketLista().remove(ticket);
         * Controladores.getPjc().edit(pasajero);
         * Vuelo vuelo = Controladores.getVjc().findVuelo(ticket.getCodigoVuelo());
         * vuelo.getTicketsLista().remove(ticket);
         * Controladores.getVjc().edit(vuelo);*/
        // Sacar clave foranea de vuelo
        Vuelo v = Controladores.getVjc().findVuelo(ticket.getCodigoVuelo());
        v.getTicketsLista().remove(ticket.getNumeroTicket());
        Controladores.getVjc().edit(v);
        // Sacar clave foranea de pasajero
        Pasajero p = Controladores.getPjc().findPasajero(ticket.getDniPasajero());
        p.getTicketLista().remove(ticket.getNumeroTicket());
        Controladores.getPjc().edit(p);
        
        Controladores.getTjc().destroy(ticket.getNumeroTicket());
    }
}
