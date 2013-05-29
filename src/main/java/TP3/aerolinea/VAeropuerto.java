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
     * @param vuelos the value of vuelos
     */
    public void imprimir(Aeropuerto a, JTextField codigo, JTextField pais, JTextField ciudad, javax.swing.JTable vuelos) {
        codigo.setText(a.getCodigoAeropuerto().toString());
        pais.setText(a.getPais());
        ciudad.setText(a.getCiudad());
        // Imprimir vuelos        
        try {
                vuelos.removeAll();
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
        for (Vuelo v: listaVuelos) {
            List<Tickets> listaTickets = v.getTicketsLista();
            for (Tickets t: listaTickets) {
                Pasajero p = Controladores.getPjc().findPasajero(t.getDniPasajero());
                p.getTicketLista().remove(t);
                Controladores.getTjc().destroy(t.getNumeroTicket());
            }
            Controladores.getVjc().destroy(v.getCodigoVuelo());
        }
        Controladores.getAjc().destroy(findAeropuerto.getCodigoAeropuerto());
        
        // Eliminar ticket
        
        // Vuelo
        // Eliminar vuelo
        
        // Aeropuerto
        // Eliminar Aeropuerto
    }
}
