/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author tincho
 */
@Entity
public class Tickets implements Serializable {

    @Id
    @Column(unique = true)
    private Long numeroTicket;
    
    private Long codigoVuelo;
    private Long dniPasajero;

    /**
     * @return the numeroTicket
     */
    public Long getNumeroTicket() {
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
     * @return the dniPasajero
     */
    public Long getDniPasajero() {
        return dniPasajero;
    }

    /**
     * @param dniPasajero the dniPasajero to set
     */
    public void setDniPasajero(Long dniPasajero) {
        this.dniPasajero = dniPasajero;
    }
}
