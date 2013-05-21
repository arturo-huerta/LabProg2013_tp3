/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import javax.swing.JTextField;

/**
 *
 * @author pablo
 */
public class ControladorPasajero {


    public void crear(JTextField ape, JTextField nom, JTextField dni) {
        Pasajero pasajero = new Pasajero();
        pasajero.setApellido(ape.getText());
        pasajero.setNombre(nom.getText());
        pasajero.setDNI(Long.parseLong(dni.getText()));
        Controladores.getPjc().create(pasajero);
    }
    
}
