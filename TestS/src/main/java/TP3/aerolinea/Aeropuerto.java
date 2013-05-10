/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
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
public class Aeropuerto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique=true)
    private Long codigoAeropuerto;
    
    private String ciudad;
    private String pais;
    @OneToMany
    @JoinTable(name = "entrada_lista")
    List<Vuelo> entradaLista = new ArrayList();
    @OneToMany
    @JoinTable(name = "salida_lista")
    List<Vuelo> salidaLista = new ArrayList();
}
