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
    public void imprimir(Aeropuerto a, JTextField codigo, JTextField pais, JTextField ciudad, JTable vuelos) {
        codigo.setText(a.getCodigoAeropuerto().toString());
        pais.setText(a.getPais());
        ciudad.setText(a.getCiudad());
        // Imprimir vuelos        
        if (vuelos != null) {
            DefaultTableModel temp = (DefaultTableModel) vuelos.getModel();
            for (; temp.getRowCount() > 0;) {
                temp.removeRow(temp.getRowCount() - 1);
            }
            Set<Long> listaVuelos = a.getListaVuelos();
            if (listaVuelos != null) {
            for (Long v : listaVuelos) {
                Vuelo aux = Controladores.getVjc().findVuelo(v);
                Object fila[] = {aux.getCodigoVuelo().toString(), aux.getCodigoAeropuertoPartida().toString(), aux.getCodigoAeropuertoLlegada().toString()};
                temp.addRow(fila);
            }
            }
        }
    }

    void eliminar(Aeropuerto findAeropuerto) throws NonexistentEntityException, Exception {
        // Eliminar vuelo
        Set<Long> listaVuelos = findAeropuerto.getListaVuelos();
        if (listaVuelos != null) {
        for (Long v : listaVuelos) {
            Vuelo vAux = Controladores.getVjc().findVuelo(v);
            Set<Long> listaTickets = vAux.getTicketsLista();
            // Eliminar ticket
            if (listaTickets != null) {
            for (Long t : listaTickets) {
                Tickets tAux = Controladores.getTjc().findTickets(t);
                JTextField aux = new JTextField();
                aux.setText(tAux.getNumeroTicket().toString());
                Vista.ticket().eliminar(aux);
            }
                listaTickets.clear();
            }
            Vista.vuelo().eliminar(vAux);
        }
            listaVuelos.clear();
        }
        Controladores.getAjc().destroy(findAeropuerto.getCodigoAeropuerto());
    }

    /**
     *
     * @param findAeropuerto the value of findAeropuerto
     * @param jTextFieldAMCodigoAeropuerto the value of
     * jTextFieldAMCodigoAeropuerto
     * @param jTextFieldAMPais the value of jTextFieldAMPais
     * @param jTextFieldAMCiudad the value of jTextFieldAMCiudad
     */
    public void modificar(Aeropuerto a, JTextField codigo, JTextField pais, JTextField ciudad) throws NonexistentEntityException, Exception {
        if (a != null) {
            a.setPais(pais.getText());
            a.setCiudad(ciudad.getText());
            Controladores.getAjc().edit(a);
        }
    }
}
