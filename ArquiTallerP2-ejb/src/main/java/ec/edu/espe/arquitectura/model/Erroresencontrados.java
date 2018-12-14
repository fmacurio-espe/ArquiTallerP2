/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 *
 * @author jefferson
 */
public class Erroresencontrados {
        
   

    @Property("tipo_error")
    private String tipo_error;

    @Property("descripcion")
    private String descripcion;

    @Property("estado")
    private String estado;
    
    
}
