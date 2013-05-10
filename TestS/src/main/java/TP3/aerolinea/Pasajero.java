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

}
