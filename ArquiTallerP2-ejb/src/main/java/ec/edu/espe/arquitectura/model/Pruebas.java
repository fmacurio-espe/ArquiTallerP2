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
 * @author jefferson
 */

@Entity(noClassnameStored = true, value = "pruebas")
public class Pruebas {
    @Id
    private ObjectId id;

    @Property("fecha_planificada")
    private String fecha_planificada;

    @Property("fecha_inicio_real")
    private String fecha_inicio_real;

    @Property("fecha_aprobacion")
    private String fecha_aprobacion;

    @Property("estado")
    private String estado;

    @Embedded
    private List<Erroresencontrados> erroresencontrados;
    
}
