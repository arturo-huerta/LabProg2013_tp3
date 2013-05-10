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
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigoVuelo;
    
    private Double precio;
    
    @OneToMany
    @JoinTable(name = "vuelo_lista")
    List<Tickets> vueloLista = new ArrayList();
    
    
}
