/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author tincho
 */
@Entity
public class Vuelo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigoVuelo;
    
    // tal vez sea mejor tener una lista de precios, segun el tipo de ticket?
    // segun el tipo de clase del asiento, como minimo
    // ej: private List<Double> listaPrecios = new ArrayList();
    // una lista donde se pueden guardar los posibles precios de cada vuelo
    private Double precio;
    
    @OneToMany
    private List<Tickets> ticketsLista = new ArrayList();

    /**
     * @return the codigoVuelo
     */
    public Long getCodigoVuelo() {
        return codigoVuelo;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
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
    
    
}
