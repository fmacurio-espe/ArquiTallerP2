/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.model;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author User
 */
@Embedded
public class documentoFuncional {
    
    
    @Property("nombreDocumento")
    private String nombreDocumento;
    @Property("fechaPlanificada")
    private String fechaPlanificada;
    @Property("fechaAprobacion")
    private String fechaAprobacion;
    @Property("estado")
    private String estado;

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getFechaPlanificada() {
        return fechaPlanificada;
    }

    public void setFechaPlanificada(String fechaPlanificada) {
        this.fechaPlanificada = fechaPlanificada;
    }

    public String getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(String fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public documentoFuncional() {
    }

    @Override
    public String toString() {
        return "documentoFuncional{" + "nombreDocumento=" + nombreDocumento + ", fechaPlanificada=" + fechaPlanificada + ", fechaAprobacion=" + fechaAprobacion + ", estado=" + estado + '}';
    }
    
    
    
    
    

}
