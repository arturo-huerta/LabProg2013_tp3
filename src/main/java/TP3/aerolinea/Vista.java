/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import TP3.aerolinea.controller.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pablo
 */
public class Vista {

    public void PLImprimirDatos(javax.swing.JTextField dni, javax.swing.JTextField apellido, javax.swing.JTextField nombre, javax.swing.JTable tickets, Pasajero pasajero) {
        // Asignar DNI al textfield del resultado de busqueda
        dni.setText(pasajero.getDNI().toString());
        // Asignar Apellido
        apellido.setText(pasajero.getApellido());
        // Asignar Nombre
        nombre.setText(pasajero.getNombre());
        // Asignar lista de tickets
        // 1. Limpiar datos de tickets anteriores
        tickets.removeAll();
        DefaultTableModel temp = (DefaultTableModel) tickets.getModel();
        // 2. Agregar cada ticket del pasajero
        try {
            List<Tickets> lista = pasajero.getTicketLista();
            for (int i = 0; i < lista.size(); i++) {
                Tickets t = lista.get(i);
                Vuelo v = Controladores.getVjc().findVuelo(t.getCodigoVuelo());
                Object fila[] = {t.getNumeroTicket(), t.getCodigoVuelo(), v.getCodigoAeropuertoPartida(),v.getCodigoAeropuertoLlegada()};
                temp.addRow(fila);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sin elementos");
        }
    }

    public void PLLimpiarDatos(JTextField jTextFieldPLBuscarDNI, JTextField jTextFieldPLDNI, JTextField jTextFieldPLApe, JTextField jTextFieldPLnombre, JTable jTablePLTickets) {
        jTextFieldPLBuscarDNI.setText("");
        jTextFieldPLDNI.setText("");
        jTextFieldPLApe.setText("");
        jTextFieldPLnombre.setText("");
        jTablePLTickets.removeAll();
    }

    public void PMImprimirDatos(JTextField dni, JTextField apellido, JTextField nombre, Pasajero pasajero) {
        dni.setText(pasajero.getDNI().toString());
        apellido.setText(pasajero.getApellido());
        nombre.setText(pasajero.getNombre());
    }

    public void PMModificarDatos(JTextField dni, JTextField apellido, JTextField nombre) throws NonexistentEntityException, Exception {
        Pasajero pasajero = Controladores.getPjc().findPasajero(Long.parseLong(dni.getText()));
        pasajero.setApellido(apellido.getText());
        pasajero.setNombre(nombre.getText());
        Controladores.getPjc().edit(pasajero);
    }
//Probando de aca para abajo

    void PEliminarDatos(JTextField dni,Pasajero pasajero) {

        // Asignar DNI al textfield del resultado de busqueda
        Pasajero pasajer = Controladores.getPjc().findPasajero(Long.parseLong(dni.getText()));
        try {
            Controladores.getPjc().destroy(pasajer.getDNI());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void PCrearPasajero(JTextField dni, JTextField apellido, JTextField nombre) {
        Pasajero pasajero = new Pasajero();
        pasajero.setApellido(apellido.getText());
        pasajero.setNombre(nombre.getText());
        pasajero.setTicketLista(null);
        pasajero.setDNI(Long.parseLong(dni.getText()));
        Controladores.getPjc().create(pasajero);
    }
}
