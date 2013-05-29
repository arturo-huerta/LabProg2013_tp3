/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import java.util.ArrayList;
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
    public void crear(JTextField codigoVuelo, JTextField codigoAeropuertoPartida, JTextField codigoAeropuertoLlegada, JTextField precio) {
        // Si existen ambos aeropuertos, se crea el vuelo
        if ((Controladores.getAjc().findAeropuerto(Long.parseLong(codigoAeropuertoPartida.getText()))) != null && (Controladores.getAjc().findAeropuerto(Long.parseLong(codigoAeropuertoLlegada.getText()))) != null) {
            Vuelo v = new Vuelo();
            v.setCodigoVuelo(Long.parseLong(codigoVuelo.getText()));
            v.setCodigoAeropuertoPartida(Long.parseLong(codigoAeropuertoPartida.getText()));
            v.setCodigoAeropuertoLlegada(Long.parseLong(codigoAeropuertoLlegada.getText()));
            v.setPrecio(Double.parseDouble(precio.getText()));
            v.setTicketsLista(new ArrayList<Tickets>());
            Controladores.getVjc().create(v);
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
    public void imprimir(Vuelo v, JTextField codigoVuelo, JTextField aeropuertoP, JTextField aeropuertoL, JTable tickets) {
        try {
            codigoVuelo.setText(v.getCodigoVuelo().toString());
            aeropuertoP.setText(v.getCodigoAeropuertoPartida().toString());
            aeropuertoL.setText(v.getCodigoAeropuertoLlegada().toString());
        } catch (Exception e) {
        }
        if (tickets != null) {
            try {
                tickets.removeAll();
                DefaultTableModel temp = (DefaultTableModel) tickets.getModel();

                for (Tickets t : v.getTicketsLista()) {
                    t.getNumeroTicket();
                    Object fila[] = {t.getNumeroTicket(), t.getDniPasajero()};
                    temp.addRow(fila);
                }
            } catch (Exception e) {
            }
        }
    }

    /**
     *
     *
     */
    public void modificar(Vuelo v, JTextField aeropuertoP, JTextField aeropuertoL, JTextField precio) {
        try {
            // Remover el vuelo del aeropuerto original
            Aeropuerto a = Controladores.getAjc().findAeropuerto(v.getCodigoAeropuertoPartida());
            a.getListaVuelos().remove(v);
            // Asignar la informacion recibida de la GUI al vuelo
            v.setCodigoAeropuertoPartida(Long.parseLong(aeropuertoP.getText()));
            v.setCodigoAeropuertoLlegada(Long.parseLong(aeropuertoL.getText()));
            v.setPrecio(Double.parseDouble(precio.getText()));
            // Editar vuelo en la DB
            Controladores.getVjc().edit(v);
        } catch (Exception e) {
        }
    }

    void eliminar(Vuelo findVuelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
