/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import TP3.aerolinea.controller.exceptions.NonexistentEntityException;
import java.util.List;
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
        try {
            tickets.removeAll();
        } catch (Exception e) {
        }
        try {
            DefaultTableModel temp = (DefaultTableModel) tickets.getModel();
            List<Tickets> lista = pasajero.getTicketLista();
            for (int i = 0; i < lista.size(); i++) {
                Tickets t = lista.get(i);
                Vuelo v = Controladores.getVjc().findVuelo(t.getCodigoVuelo());
                Object fila[] = {t.getNumeroTicket(), t.getCodigoVuelo(), v.getCodigoAeropuertoPartida(), v.getCodigoAeropuertoLlegada()};
                temp.addRow(fila);
            }

        } catch (Exception e) {
            System.out.println("Sin elementos");
        }
    }

    public void modificar(JTextField dni, JTextField apellido, JTextField nombre) throws NonexistentEntityException, Exception {
        Pasajero pasajero = Controladores.getPjc().findPasajero(Long.parseLong(dni.getText()));
        pasajero.setApellido(apellido.getText());
        pasajero.setNombre(nombre.getText());
        try {
        Controladores.getPjc().edit(pasajero);}
        catch (NonexistentEntityException noee) {}
        catch (Exception e) {}
    }

    public void eliminar(JTextField dni) throws NonexistentEntityException {
        // Eliminar tickets del pasajero
        Pasajero p = Controladores.getPjc().findPasajero(Long.parseLong(dni.getText()));
        List<Tickets> listaTickets = p.getTicketLista();
        try {
            for (Tickets t : listaTickets) {
                JTextField jt = new JTextField();
                jt.setText(t.getNumeroTicket().toString());
                Vista.ticket().eliminar(jt);
            }
        } catch (Exception e) {
        }
        try {
        Controladores.getPjc().destroy(p.getDNI());}
        catch (NonexistentEntityException noee) {}
        catch (Exception e) {}
    }

    public void crear(JTextField dni, JTextField apellido, JTextField nombre) {
        Pasajero pasajero = new Pasajero();
        pasajero.setApellido(apellido.getText());
        pasajero.setNombre(nombre.getText());
        pasajero.setTicketLista(null);
        pasajero.setDNI(Long.parseLong(dni.getText()));
        Controladores.getPjc().create(pasajero);
    }
}
