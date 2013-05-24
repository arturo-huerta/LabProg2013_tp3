/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

/**
 *
 * @author tincho
 */
@Entity
public class Tickets {
    @Id
    @Column(unique=true)
    private long numeroTicket;
    /**
     * @return the numeroTicket
     */
    @OneToOne
    @JoinTable(name = "pasajero")
    private Pasajero pasajero;
    
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
     * @return the pasajero
     */
    public Pasajero getPasajero() {
        return pasajero;
    }

    /**
     * @param pasajero the pasajero to set
     */
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
    
    
}
