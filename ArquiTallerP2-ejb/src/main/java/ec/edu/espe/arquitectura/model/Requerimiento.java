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
    private List<Prueba>pruebas;

    
    
}

