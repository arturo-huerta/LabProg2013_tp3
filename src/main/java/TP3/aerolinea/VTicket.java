/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import TP3.aerolinea.controller.exceptions.NonexistentEntityException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author tincho
 */
class VTicket {

    void crear(JTextField codigoVuelo, JTextField numeroTicket, JTextField dni) {

        try {
            Pasajero p = Controladores.getPjc().findPasajero(Long.parseLong(dni.getText()));
            Vuelo v = Controladores.getVjc().findVuelo(Long.parseLong(codigoVuelo.getText()));
            if (p == null ||  v == null) {
                throw new Exception();
            }
            // Crea el ticket solamente si: el pasajero existe, el vuelo existe
            Tickets t = new Tickets();
            t.setCodigoVuelo(Long.parseLong(codigoVuelo.getText()));
            t.setNumeroTicket(Long.parseLong(numeroTicket.getText()));
            t.setDniPasajero(p.getDNI());
            Controladores.getTjc().create(t);
            p.getTicketLista().add(t);
            v.getTicketsLista().add(t);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error: confirme que los datos sean correctos");
        }

    }

    void imprimir(JTextField numeroTicket, JTextField codigoAeropuertoPartida, JTextField codigoAeropuertoLlegada, JTextField codigoVuelo, JTextField dni, Tickets t) {
        numeroTicket.setText(t.getNumeroTicket().toString());
        Vuelo v = Controladores.getVjc().findVuelo(t.getCodigoVuelo());
        codigoAeropuertoPartida.setText(v.getCodigoAeropuertoPartida().toString());
        codigoAeropuertoLlegada.setText(v.getCodigoAeropuertoLlegada().toString());
        codigoVuelo.setText(t.getCodigoVuelo().toString());
        dni.setText(t.getDniPasajero().toString());
    }

    void modificar(JTextField numeroTicket, JTextField codigoVuelo, JTextField dni) throws NonexistentEntityException, Exception {
        Tickets t = Controladores.getTjc().findTickets(Long.parseLong(numeroTicket.getText()));
        if (t != null) {
            // Eliminarlo de la lista de tickets del vuelo anterior
            Vuelo v = Controladores.getVjc().findVuelo(t.getCodigoVuelo());
            v.getTicketsLista().remove(t);
            // Eliminarlo de la lista de tickets del pasajero anterior
            Pasajero p = Controladores.getPjc().findPasajero(t.getDniPasajero());
            p.getTicketLista().remove(t);
            // Asignar nuevos datos, recibidos de la GUI
            t.setCodigoVuelo(Long.parseLong(codigoVuelo.getText()));
            t.setDniPasajero(Long.parseLong(dni.getText()));
            // Actualizar datos del ticket
            Controladores.getTjc().edit(t);
        }
        
    }

    void eliminar(JTextField numeroTicket) throws NonexistentEntityException {
        Tickets ticket = Controladores.getTjc().findTickets(Long.parseLong(numeroTicket.getText()));
        if ( ticket != null) {
            // Si el ticket existe, eliminarlo de los tickets del pasajero y luego de la lista de tickets del vuelo
            Pasajero pasajero = Controladores.getPjc().findPasajero(ticket.getDniPasajero());
            List<Tickets> ticketLista = pasajero.getTicketLista();
            ticketLista.remove(ticket);
            Vuelo vuelo = Controladores.getVjc().findVuelo(ticket.getCodigoVuelo());
            vuelo.getTicketsLista().remove(ticket);
            Controladores.getTjc().destroy(ticket.getNumeroTicket());
        } else {
            JOptionPane.showMessageDialog(null,
                    "El ticket no existe.");
        }
    }
}
