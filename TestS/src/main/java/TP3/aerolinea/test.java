/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import java.util.ArrayList;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author tincho
 */
public class test {

    public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("TP3_Aerolinea");
    public static EntityManager em = test.factory.createEntityManager();

    public static void main(String[] args) {
        // transaccion para generar un nuevo pasajero
        em.getTransaction().begin();
        // generar instancia de persona para asignar datos
        Pasajero p = new Pasajero();
        // obtener del input del usuario los datos del pasajero y asignarlos
        p.setApellido("INPUT APELLIDO");
        p.setNombre("INPUT NOMBRE");
        p.setDNI(12345678l);
        p.setTicketLista(new ArrayList());
        // aceptar (persist) y aplicar los cambios (commit) en la base de datos
        em.persist(p);
        em.getTransaction().commit();

        //transaccion para generar un nuevo aeropuerto
        em.getTransaction().begin();
        // generar instancia de aeropuerto para asignar datos
        Aeropuerto a = new Aeropuerto();
        // obtener del input del usuario la ciudad y asignarlo
        a.setCiudad("INPUT CIUDAD");
        // obtener del input del usuario el pais y asignarlo
        a.setPais("INPUT PAIS");
        // lista de vuelos que entran
        a.setEntradaLista(new ArrayList());
        // lista de vuelos que salen
        a.setSalidaLista(new ArrayList());
        // el codigo del aeropuerto es generado automaticamente
        // aceptar (persist) y aplicar los cambios (commit) en la base de datos
        em.persist(a);
        em.getTransaction().commit();

        // transaccion para generar un nuevo vuelo
        em.getTransaction().begin();
        // generar instancia de vuelo para asignar al aeropuerto en la db
        Vuelo v = new Vuelo();
        // obtener datos a asignar del input del usuario (tickets vendidos,
        // lista de precios)
        v.setTicketsLista(new ArrayList());
        v.setListaPrecios(new ArrayList<Double>());

        em.persist(v);
        em.getTransaction().commit();

        // transaccion para generar un nuevo ticket
        em.getTransaction().begin();

        Tickets t = new Tickets();

        // numero de ticket obtenido del input del usuario
        t.setNumeroTicket(0);
        // asignar el pasajero que compro dicho ticket
        t.setPasajero(new Pasajero());

        em.persist(t);
        em.getTransaction().commit();

    }
}
