/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import TP3.aerolinea.controller.exceptions.NonexistentEntityException;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tincho
 */
class VAeropuerto {

    /**
     *
     * @param jTextFieldACCodigoAeropuerto the value of
     * jTextFieldACCodigoAeropuerto
     * @param jTextFieldACPais the value of jTextFieldACPais
     * @param jTextFieldACCiudad the value of jTextFieldACCiudad
     */
    public void crear(JTextField codigo, JTextField pais, JTextField ciudad) {
        Aeropuerto a = new Aeropuerto();
        a.setCodigoAeropuerto(Long.parseLong(codigo.getText()));
        a.setPais(pais.getText());
        a.setCiudad(ciudad.getText());
        Controladores.getAjc().create(a);
    }

    /**
     *
     *
     * @param precio the value of precio
     * @param vuelos the value of vuelos
     */
    public void imprimir(Aeropuerto a, JTextField codigo, JTextField pais, JTextField ciudad, javax.swing.JTable vuelos) {
        codigo.setText(a.getCodigoAeropuerto().toString());
        pais.setText(a.getPais());
        ciudad.setText(a.getCiudad());
        // Imprimir vuelos        
        try {
            vuelos.removeAll();
        } catch (Exception e) {
        }
        try {
            DefaultTableModel temp = (DefaultTableModel) vuelos.getModel();

            for (Vuelo v : a.getListaVuelos()) {
                Object fila[] = {v.getCodigoVuelo(), v.getCodigoAeropuertoLlegada()};
                temp.addRow(fila);
            }
        } catch (Exception e) {
        }
    }

    void eliminar(Aeropuerto findAeropuerto) throws NonexistentEntityException {
        // Tickets
        // Eliminar referencia de todos los tickets en los pasajeros de todos los vuelos del aeropuerto
        List<Vuelo> listaVuelos = findAeropuerto.getListaVuelos();
        try {
            for (Vuelo v : listaVuelos) {
                List<Tickets> listaTickets = v.getTicketsLista();
                try {
                    for (Tickets t : listaTickets) {
                        Pasajero p = Controladores.getPjc().findPasajero(t.getDniPasajero());
                        p.getTicketLista().remove(t);
                        Controladores.getTjc().destroy(t.getNumeroTicket());
                    }
                } catch (Exception e) {
                }
                Controladores.getVjc().destroy(v.getCodigoVuelo());
            }
        } catch (Exception e) {
        }
        try {
        Controladores.getAjc().destroy(findAeropuerto.getCodigoAeropuerto());}
        catch (Exception e) {}
    }
}
