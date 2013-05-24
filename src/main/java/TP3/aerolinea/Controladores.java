/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import TP3.aerolinea.controller.AeropuertoJpaController;
import TP3.aerolinea.controller.PasajeroJpaController;
import TP3.aerolinea.controller.TicketsJpaController;
import TP3.aerolinea.controller.VueloJpaController;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pablo
 */
public class Controladores {

    private static Controladores instancia = new Controladores();
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("TP3_Aerolinea");
    private static AeropuertoJpaController ajc = new AeropuertoJpaController(emf);
    private static PasajeroJpaController pjc = new PasajeroJpaController(emf);
    private static TicketsJpaController tjc = new TicketsJpaController(emf);
    private static VueloJpaController vjc = new VueloJpaController(emf);
    private static Vista vista = new Vista();

    /**
     * @return the ajc
     */
    public static AeropuertoJpaController getAjc() {
        return ajc;
    }

    /**
     * @return the pjc
     */
    public static PasajeroJpaController getPjc() {
        return pjc;
    }

    /**
     * @return the tjc
     */
    public static TicketsJpaController getTjc() {
        return tjc;
    }

    /**
     * @return the vjc
     */
    public static VueloJpaController getVjc() {
        return vjc;
    }

    /**
     * @return the vista
     */
    public static Vista getVista() {
        return vista;
    }

    private Controladores() {
    }

    public static Controladores getInstance() {
        return controladoresHolder.INSTANCE;
    }

    private static class controladoresHolder {

        private static final Controladores INSTANCE = new Controladores();
    }
}
