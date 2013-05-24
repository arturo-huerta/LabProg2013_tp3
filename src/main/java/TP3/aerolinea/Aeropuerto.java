/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.aerolinea;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
    @OneToMany
    private List<Vuelo> listaVuelos;

    public Aeropuerto() {
        this.listaVuelos = new ArrayList<Vuelo>();
    }

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
    public List<Vuelo> getListaVuelos() {
        return listaVuelos;
    }

    /**
     * @param listaVuelos the listaVuelos to set
     */
    public void setListaVuelos(List<Vuelo> listaVuelos) {
        this.listaVuelos = listaVuelos;
    }
}
