/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author tincho
 */
@Entity
public class Vuelo implements Serializable {

    @Id
    @Column(unique = true)
    private Long codigoVuelo;
    // tal vez sea mejor tener una lista de precios, segun el tipo de ticket?
    // segun el tipo de clase del asiento, como minimo
    // ej: private List<Double> listaPrecios = new ArrayList();
    // una lista donde se pueden guardar los posibles precios de cada vuelo
    private Double precio;
    private Long codigoAeropuertoPartida;
    private Long codigoAeropuertoLlegada;
    @OneToMany
    private List<Tickets> ticketsLista;

    public Vuelo() {
        this.ticketsLista = new ArrayList<Tickets>();
    }

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

    /**
     * @return the codigoAeropuertoPartida
     */
    public Long getCodigoAeropuertoPartida() {
        return codigoAeropuertoPartida;
    }

    /**
     * @param codigoAeropuertoPartida the codigoAeropuertoPartida to set
     */
    public void setCodigoAeropuertoPartida(Long codigoAeropuertoPartida) {
        this.codigoAeropuertoPartida = codigoAeropuertoPartida;
    }

    /**
     * @return the codigoAeropuertoLlegada
     */
    public Long getCodigoAeropuertoLlegada() {
        return codigoAeropuertoLlegada;
    }

    /**
     * @param codigoAeropuertoLlegada the codigoAeropuertoLlegada to set
     */
    public void setCodigoAeropuertoLlegada(Long codigoAeropuertoLlegada) {
        this.codigoAeropuertoLlegada = codigoAeropuertoLlegada;
    }

    /**
     * @param codigoVuelo the codigoVuelo to set
     */
    public void setCodigoVuelo(Long codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }
}
