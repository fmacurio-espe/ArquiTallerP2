/*
/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.session;

import com.mongodb.MongoClient;
import ec.edu.espe.arquitectura.model.Entregable;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

/**
 *
 * @author jeffe
 */
@Stateless
@LocalBean
public class EntregableFacade {
   public String insertarRol(String codigo, String fechaPlan, String fechaRea) throws Exception {
        Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.model");
        Datastore ds = morphia.createDatastore(new MongoClient(), "tallerP2");

        System.out.println("conexion establecida");
        try {
            ds.ensureIndexes();
            Entregable cliente= new Entregable();
            cliente.setCodigoEntregable(codigo);
           cliente.setFechaPlanificada(fechaPlan);
           cliente.setFechaReal(fechaRea);
            ds.save(cliente);
            return "Ingreso Correcto";
        } catch (Exception e) {
            throw new Exception("codigo duplicado");
        }

    }
     public List<Entregable> findRol() {
        Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.model");
        Datastore ds = morphia.createDatastore(new MongoClient(), "tallerP2");
        System.out.println("conexion establecida");

        List<Entregable> roles = ds.createQuery(Entregable.class).asList();
        //   .field("codigoRol").equal(codRol).asList();
        return roles;

    }
    public void updateRol(String codigoRol,  String fechaPlan, String fechaRea) {
        Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.model");
        Datastore ds = morphia.createDatastore(new MongoClient(), "tallerP2");
        System.out.println("conexion establecida");

        Query<Entregable> rolUpdate = ds.createQuery(Entregable.class
        )
                .field("codigoEntregable").equal(codigoRol);

        UpdateOperations<Entregable> uo = ds.createUpdateOperations(Entregable.class
        ).set("fechaReal", fechaRea);
        ds.update(rolUpdate, uo);

    }
}
