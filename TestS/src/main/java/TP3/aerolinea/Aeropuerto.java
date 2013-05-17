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
    private List<Vuelo> entradaLista = new ArrayList();
    @OneToMany
    @JoinTable(name = "salida_lista")
    private List<Vuelo> salidaLista = new ArrayList();

    /**
     * @return the codigoAeropuerto
     */
    public Long getCodigoAeropuerto() {
        return codigoAeropuerto;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the entradaLista
     */
    public List<Vuelo> getEntradaLista() {
        return entradaLista;
    }

    /**
     * @param entradaLista the entradaLista to set
     */
    public void setEntradaLista(List<Vuelo> entradaLista) {
        this.entradaLista = entradaLista;
    }

    /**
     * @return the salidaLista
     */
    public List<Vuelo> getSalidaLista() {
        return salidaLista;
    }

    /**
     * @param salidaLista the salidaLista to set
     */
    public void setSalidaLista(List<Vuelo> salidaLista) {
        this.salidaLista = salidaLista;
    }
}
