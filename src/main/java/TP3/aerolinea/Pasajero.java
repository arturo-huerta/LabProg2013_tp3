/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author tincho
 */
@Entity
public class Pasajero implements Serializable {
    // id es la clave primaria

    @Id
    private Long DNI;
    // otros campos
    private Integer version;
    private String Apellido;
    private String Nombre;
    // relacion 1 a muchos: 1 pasajero tiene * tickets, los tickets
    // se almacenan en un array list
    //@OneToMany(orphanRemoval=true, cascade={CascadeType.REMOVE})
    private Set<Long> ticketLista = new HashSet<Long>();

    public Pasajero() {
    }

    /**
     * @return the version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * @return the DNI
     */
    public Long getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the ticketLista
     */
    public Set<Long> getTicketLista() {
        return ticketLista;
    }

    /**
     * @param ticketLista the ticketLista to set
     */
    public void setTicketLista(Set<Long> ticketLista) {
        this.ticketLista = ticketLista;
    }
}
