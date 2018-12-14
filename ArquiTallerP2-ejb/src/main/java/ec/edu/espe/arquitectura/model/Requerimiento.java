/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.model;

import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author Jefferson Fonseca
 */

@Entity(noClassnameStored = true, value = "requerimiento")
public class Requerimiento {
    
    @Id
    private ObjectId id;

    @Property("codigo")
    private String codigo;

    @Property("nombre")
    private String nombre;

    @Property("fecha_planificada")
    private String fecha_planificada;

    @Property("fecha_real")
    private String fecha_real;

    @Property("entregable")
    private String entregable;


    @Property("dias_esfuerzo")
    private String dias_esfuerzo;


    @Property("estado")
    private String estado;

//    @Embedded
//    private List<documentoFuncional>documentosfuncionales;

    @Embedded
    private List<Pruebas>pruebas;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_planificada() {
        return fecha_planificada;
    }

    public void setFecha_planificada(String fecha_planificada) {
        this.fecha_planificada = fecha_planificada;
    }

    public String getFecha_real() {
        return fecha_real;
    }

    public void setFecha_real(String fecha_real) {
        this.fecha_real = fecha_real;
    }

    public String getEntregable() {
        return entregable;
    }

    public void setEntregable(String entregable) {
        this.entregable = entregable;
    }

    public String getDias_esfuerzo() {
        return dias_esfuerzo;
    }

    public void setDias_esfuerzo(String dias_esfuerzo) {
        this.dias_esfuerzo = dias_esfuerzo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Pruebas> getPruebas() {
        return pruebas;
    }

    public void setPruebas(List<Pruebas> pruebas) {
        this.pruebas = pruebas;
    }

    public Requerimiento() {
    }

    @Override
    public String toString() {
        return "Requerimiento{" + "id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", fecha_planificada=" + fecha_planificada + ", fecha_real=" + fecha_real + ", entregable=" + entregable + ", dias_esfuerzo=" + dias_esfuerzo + ", estado=" + estado + ", pruebas=" + pruebas + '}';
    }

    
    
    
    
    
}

