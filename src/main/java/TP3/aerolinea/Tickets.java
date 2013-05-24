/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author tincho
 */
@Entity
public class Tickets implements Serializable {
    @Id
    private Long numeroTicket;
    private Long codigoVuelo;
    private Long codigoAeropuerto;

    /**
     * @return the numeroTicket
     */
    public long getNumeroTicket() {
        return numeroTicket;
    }

    /**
     * @param numeroTicket the numeroTicket to set
     */
    public void setNumeroTicket(long numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    /**
     * @return the codigoVuelo
     */
    public Long getCodigoVuelo() {
        return codigoVuelo;
    }

    /**
     * @param codigoVuelo the codigoVuelo to set
     */
    public void setCodigoVuelo(Long codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    /**
     * @return the codigoAeropuerto
     */
    public Long getCodigoAeropuerto() {
        return codigoAeropuerto;
    }

    /**
     * @param codigoAeropuerto the codigoAeropuerto to set
     */
    public void setCodigoAeropuerto(Long codigoAeropuerto) {
        this.codigoAeropuerto = codigoAeropuerto;
    }
    
    
}
