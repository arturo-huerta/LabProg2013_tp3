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
    private long numeroTicket;

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
    
    
}
