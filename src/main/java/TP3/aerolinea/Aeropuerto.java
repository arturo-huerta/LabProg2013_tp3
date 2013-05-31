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
public class Aeropuerto implements Serializable {

    @Id
    private Long codigoAeropuerto;
    private String ciudad;
    private String pais;
    //@OneToMany(orphanRemoval=true, cascade={CascadeType.REMOVE})
    private Set<Long> listaVuelos = new HashSet<Long>();

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
     * @return the listaVuelos
     */
    public Set<Long> getListaVuelos() {
        return listaVuelos;
    }

    /**
     * @param listaVuelos the listaVuelos to set
     */
    public void setListaVuelos(Set<Long> listaVuelos) {
        this.listaVuelos = listaVuelos;
    }

    /**
     * @param codigoAeropuerto the codigoAeropuerto to set
     */
    public void setCodigoAeropuerto(Long codigoAeropuerto) {
        this.codigoAeropuerto = codigoAeropuerto;
    }
}
