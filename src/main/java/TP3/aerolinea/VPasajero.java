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
public class VPasajero {

    public void imprimir(JTextField dni, JTextField apellido, JTextField nombre, JTable tickets, Pasajero pasajero) {
        // Asignar DNI al textfield del resultado de busqueda
        dni.setText(pasajero.getDNI().toString());
        // Asignar Apellido
        apellido.setText(pasajero.getApellido());
        // Asignar Nombre
        nombre.setText(pasajero.getNombre());
        // Asignar lista de tickets
        // 1. Limpiar datos de tickets anteriores
        // 2. Agregar cada ticket del pasajero
        if (tickets != null) {
            DefaultTableModel temp = (DefaultTableModel) tickets.getModel();
            for (; temp.getRowCount() > 0;) {
                temp.removeRow(temp.getRowCount() - 1);
            }
            Set<Long> lista = pasajero.getTicketLista();
            if (lista != null) {
            for (Long t : lista) {
                Tickets tAux = Controladores.getTjc().findTickets(t);
                Vuelo v = Controladores.getVjc().findVuelo(tAux.getCodigoVuelo());
                Object fila[] = {tAux.getNumeroTicket(), tAux.getCodigoVuelo(), v.getCodigoAeropuertoPartida(), v.getCodigoAeropuertoLlegada()};
                temp.addRow(fila);
            }
            }
        }
    }

    public void modificar(JTextField dni, JTextField apellido, JTextField nombre) throws NonexistentEntityException, Exception {
        Pasajero pasajero = Controladores.getPjc().findPasajero(Long.parseLong(dni.getText()));
        if (pasajero != null) {
            pasajero.setApellido(apellido.getText());
            pasajero.setNombre(nombre.getText());
            Controladores.getPjc().edit(pasajero);
        }
    }

    public void eliminar(JTextField dni) throws NonexistentEntityException, Exception {
        // Eliminar tickets del pasajero
        Pasajero p = Controladores.getPjc().findPasajero(Long.parseLong(dni.getText()));
        Set<Long> listaTickets = p.getTicketLista();
        if (listaTickets != null) {
        for (Long t:listaTickets) {
            Tickets tAux = Controladores.getTjc().findTickets(t);
            JTextField aux = new JTextField();
            aux.setText(tAux.getNumeroTicket().toString());
            Vista.ticket().eliminar(aux);
        }
        }
        Controladores.getPjc().destroy(p.getDNI());
    }

    public void crear(JTextField dni, JTextField apellido, JTextField nombre) {
        Pasajero pasajero = new Pasajero();
        pasajero.setApellido(apellido.getText());
        pasajero.setNombre(nombre.getText());
        pasajero.setDNI(Long.parseLong(dni.getText()));
        Controladores.getPjc().create(pasajero);
    }
}
