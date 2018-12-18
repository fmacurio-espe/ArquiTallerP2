/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.model;

import java.util.Objects;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author jeffe
 */
@Entity(noClassnameStored = true, value = "Entregable")
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entregable other = (Entregable) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entregable{" + "id=" + id + ", codigoEntregable=" + codigoEntregable + ", fechaPlanificada=" + fechaPlanificada + ", fechaReal=" + fechaReal + '}';
    }
    
    
}
