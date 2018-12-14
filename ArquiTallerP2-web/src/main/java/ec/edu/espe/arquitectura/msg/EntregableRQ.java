/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.msg;

import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author jeffe
 */
public class EntregableRQ {

    /**
     * @return the codigoEntregable
     */
    public String getCodigoEntregable() {
        return codigoEntregable;
    }

    /**
     * @param codigoEntregable the codigoEntregable to set
     */
    public void setCodigoEntregable(String codigoEntregable) {
        this.codigoEntregable = codigoEntregable;
    }

    /**
     * @return the fechaPlanificada
     */
    public String getFechaPlanificada() {
        return fechaPlanificada;
    }

    /**
     * @param fechaPlanificada the fechaPlanificada to set
     */
    public void setFechaPlanificada(String fechaPlanificada) {
        this.fechaPlanificada = fechaPlanificada;
    }

    /**
     * @return the fechaReal
     */
    public String getFechaReal() {
        return fechaReal;
    }

    /**
     * @param fechaReal the fechaReal to set
     */
    public void setFechaReal(String fechaReal) {
        this.fechaReal = fechaReal;
    }
    
    private String codigoEntregable;

    private String fechaPlanificada;

  
    private String fechaReal;
    
}
