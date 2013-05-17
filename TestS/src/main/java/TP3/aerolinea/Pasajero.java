/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import java.util.ArrayList;
import java.util.List;
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
public class Pasajero {
    // id es la clave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    // otros campos
    private Integer version;
    private Long DNI;
    private String Apellido;
    private String Nombre;
    
    // relacion 1 a muchos: 1 pasajero tiene * tickets, los tickets
    // se almacenan en un array list
    @OneToMany
    @JoinTable(name = "ticket_lista")
    private List<Tickets> ticketLista = new ArrayList();

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
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
    public List<Tickets> getTicketLista() {
        return ticketLista;
    }

    /**
     * @param ticketLista the ticketLista to set
     */
    public void setTicketLista(List<Tickets> ticketLista) {
        this.ticketLista = ticketLista;
    }

}
