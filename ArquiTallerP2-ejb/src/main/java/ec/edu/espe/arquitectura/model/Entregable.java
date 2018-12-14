/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author jeffe
 */
public class Entregable {
    @Id
    private ObjectId id;
    @Property("codigoEntregable")
    @Indexed(options = @IndexOptions(name = "codigoEntregable", unique = true))
    private String codigoEntregable;

    @Property("fechaPlanificada")
    private String fechaPlanificada;

    @Property("fechaReal")
    private String fechaReal;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCodigoEntregable() {
        return codigoEntregable;
    }

    public void setCodigoEntregable(String codigoEntregable) {
        this.codigoEntregable = codigoEntregable;
    }

    public String getFechaPlanificada() {
        return fechaPlanificada;
    }

    public void setFechaPlanificada(String fechaPlanificada) {
        this.fechaPlanificada = fechaPlanificada;
    }

    public String getFechaReal() {
        return fechaReal;
    }

    public void setFechaReal(String fechaReal) {
        this.fechaReal = fechaReal;
    }
}
