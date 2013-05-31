/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import TP3.aerolinea.controller.exceptions.NonexistentEntityException;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tincho
 */
class VVuelo {

    /**
     *
     * @param codigoVuelo the value of codigoVuelo
     * @param codigoAeropuertoPartida the value of codigoAeropuertoPartida
     * @param codigoAeropuertoLlegada the value of codigoAeropuertoLlegada
     * @param precio the value of precio
     */
    public void crear(JTextField codigoVuelo, JTextField codigoAeropuertoPartida, JTextField codigoAeropuertoLlegada, JTextField precio) throws NonexistentEntityException, Exception {
        // Si existen ambos aeropuertos, se crea el vuelo
        Aeropuerto a1 = Controladores.getAjc().findAeropuerto(Long.parseLong(codigoAeropuertoPartida.getText()));
        Aeropuerto a2 = Controladores.getAjc().findAeropuerto(Long.parseLong(codigoAeropuertoLlegada.getText()));
        // Los aeropuertos de llegada y partida deben existir
        // Estos aeropuertos no pueden ser iguales
        if (a1 != null && a2 != null) {
            // generar vuelo
            if (!a1.equals(a2)) {
            Vuelo v = new Vuelo();
            v.setCodigoVuelo(Long.parseLong(codigoVuelo.getText()));
            v.setCodigoAeropuertoPartida(a1.getCodigoAeropuerto());
            v.setCodigoAeropuertoLlegada(a2.getCodigoAeropuerto());
            v.setPrecio(Double.parseDouble(precio.getText()));
            // asignar vuelo a ambos aeropuertos
            // crear vuelo
            Controladores.getVjc().create(v);
            a1.getListaVuelos().add(v.getCodigoVuelo());
            Controladores.getAjc().edit(a1);
            a2.getListaVuelos().add(v.getCodigoVuelo());
            Controladores.getAjc().edit(a2);
        }
        }
    }

    /**
     *
     * @param v the value of v
     * @param codigoVuelo the value of codigoVuelo
     * @param aeropuertoP the value of aeropuertoP
     * @param aeropuertoL the value of aeropuertoL
     * @param tickets the value of tickets
     */
    public void imprimir(Vuelo v, JTextField codigoVuelo, JTextField aeropuertoP, JTextField aeropuertoL, JTextField precio, JTable tickets) {
        codigoVuelo.setText(v.getCodigoVuelo().toString());
        aeropuertoP.setText(v.getCodigoAeropuertoPartida().toString());
        aeropuertoL.setText(v.getCodigoAeropuertoLlegada().toString());
        precio.setText(v.getPrecio().toString());
        if (tickets != null) {
            DefaultTableModel temp = (DefaultTableModel) tickets.getModel();
            for (; temp.getRowCount() > 0;) {
                temp.removeRow(temp.getRowCount() - 1);
            }
            Set<Long> ticketLista = v.getTicketsLista();
            if (ticketLista != null) {
            for (Long t : ticketLista) {
                Tickets tAux = Controladores.getTjc().findTickets(t);
                tAux.getNumeroTicket();
                Object fila[] = {tAux.getNumeroTicket(), tAux.getDniPasajero()};
                temp.addRow(fila);
            }
            }
        }

    }

    /**
     *
     *
     */
    public void modificar(Vuelo v, JTextField aeropuertoP, JTextField aeropuertoL, JTextField precio) throws NonexistentEntityException, Exception {
        // Remover el vuelo de los aeropuertos originales
        Aeropuerto a = Controladores.getAjc().findAeropuerto(v.getCodigoAeropuertoPartida());
        Aeropuerto a2 = Controladores.getAjc().findAeropuerto(v.getCodigoAeropuertoLlegada());
        Vuelo vAux = new Vuelo();
        vAux.setCodigoVuelo(v.getCodigoVuelo());
        vAux.setTicketsLista(v.getTicketsLista());
        vAux.setCodigoAeropuertoPartida(v.getCodigoAeropuertoPartida());
        vAux.setCodigoAeropuertoLlegada(v.getCodigoAeropuertoLlegada());
        vAux.setPrecio(vAux.getPrecio());
        // Asignar la informacion recibida de la GUI al vuelo
        v.setCodigoAeropuertoPartida(Long.parseLong(aeropuertoP.getText()));
        v.setCodigoAeropuertoLlegada(Long.parseLong(aeropuertoL.getText()));
        v.setPrecio(Double.parseDouble(precio.getText()));
        // asignar vuelo a los nuevos aeropuertos
        Aeropuerto a3 = Controladores.getAjc().findAeropuerto(v.getCodigoAeropuertoPartida());
        Aeropuerto a4 = Controladores.getAjc().findAeropuerto(v.getCodigoAeropuertoLlegada());
        Controladores.getVjc().edit(v);
        a3.getListaVuelos().add(v.getCodigoVuelo());
        Controladores.getAjc().edit(a3);
        a4.getListaVuelos().add(v.getCodigoVuelo());
        Controladores.getAjc().edit(a4);
        // Editar vuelo en la DB
        a.getListaVuelos().remove(vAux.getCodigoVuelo());
        Controladores.getAjc().edit(a);
        a2.getListaVuelos().remove(vAux.getCodigoVuelo());
        Controladores.getAjc().edit(a2);
    }

    void eliminar(Vuelo findVuelo) throws NonexistentEntityException, Exception {
        // Obtener lista de tickets del vuelo que vamos a eliminar
        Set<Long> listaTickets = findVuelo.getTicketsLista();
        if (listaTickets != null) {
        for (Long t:listaTickets) {
            // Sacar clave foranea de vuelo
            findVuelo.getTicketsLista().remove(t);
            Controladores.getVjc().edit(findVuelo);
            // Sacar clave foranea de pasajero
            Tickets tAux = Controladores.getTjc().findTickets(t);
            Pasajero p = Controladores.getPjc().findPasajero(tAux.getDniPasajero());
            p.getTicketLista().remove(t);
            Controladores.getPjc().edit(p);
            // Eliminar ticket
            Controladores.getTjc().destroy(tAux.getNumeroTicket());
        }
        }
        // Quitar referencia de vuelo en ambos aeropuertos
        Aeropuerto a = Controladores.getAjc().findAeropuerto(findVuelo.getCodigoAeropuertoPartida());
        a.getListaVuelos().remove(findVuelo.getCodigoVuelo());
        Controladores.getAjc().edit(a);
        a = Controladores.getAjc().findAeropuerto(findVuelo.getCodigoAeropuertoLlegada());
        a.getListaVuelos().remove(findVuelo.getCodigoVuelo());
        Controladores.getAjc().edit(a);
        // Eliminar vuelo
        Controladores.getVjc().destroy(findVuelo.getCodigoVuelo());
    }
}
