/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

/**
 *
 * @author tincho
 */
@Entity
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique=true)
    private Long codigoVuelo;
    // una lista donde se pueden guardar los posibles precios de los tickets
    // por ej, segun clase del asiento
    private List<Double> listaPrecios = new ArrayList();
    @OneToMany
    @JoinTable(name = "tickets_lista")
    private List<Tickets> ticketsLista = new ArrayList();

    /**
     * @return the codigoVuelo
     */
    public Long getCodigoVuelo() {
        return codigoVuelo;
    }

    /**
     * @return the vueloLista
     */
    public List<Tickets> getTicketsLista() {
        return ticketsLista;
    }

    /**
     * @param vueloLista the vueloLista to set
     */
    public void setTicketsLista(List<Tickets> ticketsLista) {
        this.ticketsLista = ticketsLista;
    }

    /**
     * @return the listaPrecios
     */
    public List<Double> getListaPrecios() {
        return listaPrecios;
    }

    /**
     * @param listaPrecios the listaPrecios to set
     */
    public void setListaPrecios(List<Double> listaPrecios) {
        this.listaPrecios = listaPrecios;
    }
}
