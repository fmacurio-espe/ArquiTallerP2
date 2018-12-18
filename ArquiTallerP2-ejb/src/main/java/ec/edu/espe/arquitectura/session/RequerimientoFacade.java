/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.session;

import com.mongodb.MongoClient;
import ec.edu.espe.arquitectura.model.Requerimiento;
import javax.ejb.Stateless;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 *
 * @author User
 */
@Stateless
public class RequerimientoFacade implements RequerimientoFacadeLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
     @Override
     public void insertarRequerimiento(Requerimiento req) {
        Morphia morphia = new Morphia();
// tell Morphia where to find your classes
// can be called multiple times with different packages or classes
        morphia.mapPackage("ec.edu.espe.arquitectura.model");
// create the Datastore connecting to the default port on the local host
        Datastore ds = morphia.createDatastore(new MongoClient(), "tallerP2");
        ds.ensureIndexes();
        //datastore.ensureIndexes();
        System.out.println("conexion establecida");
        try{
            Requerimiento reqAux=new Requerimiento();
            reqAux.setCodigo(req.getCodigo());
            reqAux.setNombre(req.getNombre());
            reqAux.setFecha_planificada(req.getFecha_planificada());
            reqAux.setFecha_real(req.getFecha_real());
            reqAux.setDias_esfuerzo(req.getDias_esfuerzo());
            reqAux.setEntregable(req.getEntregable());
            reqAux.setEstado("DEF");
            ds.save(reqAux);
            System.out.println("Requerimiento Creado");
        }catch (Exception e) {
            //throw new Exception("codigo duplicado");
        }
        
        
        
        
        
        
        
        
        /*
        List<Funcionalidad> funcionalidades2=new ArrayList<Funcionalidad>();
        Funcionalidad fun=new Funcionalidad();
        fun.setCodigoFuncionalidad("001");
        fun.setNombreFuncionalidad("detallePrestamos");
        fun.setNombreSistema("sPrestamos");
        funcionalidades2.add(fun);
        
        Funcionalidad fun2=new Funcionalidad();
        fun2.setCodigoFuncionalidad("002");
        fun2.setNombreFuncionalidad("detalleCobranza");
        fun2.setNombreSistema("sCobranza");
        funcionalidades2.add(fun2);
        
        */
        /*
        rol.setCodigoRol(codigoRol);
        rol.setNombreRol(nombreRol);
        rol.setDescripcionRol(descripcionRol);
        rol.setFuncionalidad(funcionalidades);
        */
        
        
    }

     /*
    public Rol findRol(String codRol) {
        Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.model");
        Datastore ds = morphia.createDatastore(new MongoClient(), "modRest");
        System.out.println("conexion establecida");
        
        /*
        Query<Usuario> qry=ds.createQuery(Usuario.class)
                .field("codigoUsuario").equal("fmacurio").asList();
        List<Usuario> usuarios=new ArrayList<Usuario>();
*/
     /*
        List<Rol> roles=ds.createQuery(Rol.class)
                .field("codigoRol").equal(codRol).asList();
        return roles.get(0);
        
    }


    public void updateRol(Rol rol) {
        Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.model");
        Datastore ds = morphia.createDatastore(new MongoClient(), "modRest");
        System.out.println("conexion establecida");
        Query<Rol> rolUpdate=ds.createQuery(Rol.class)
                .field("codigoRol").equal(rol.getCodigoRol());
        
        UpdateOperations<Rol> uo;
        if(!rol.getNombreRol().equals("")){
        uo=ds.createUpdateOperations(Rol.class).set("nombreRol", rol.getNombreRol());
        ds.update(rolUpdate, uo);    
        }
        if(!rol.getDescripcionRol().equals("")){
        uo=ds.createUpdateOperations(Rol.class).set("descripcionRol", rol.getDescripcionRol());
        ds.update(rolUpdate, uo);    
        }
        if(!rol.getFuncionalidad().isEmpty()){
        uo=ds.createUpdateOperations(Rol.class).set("funcionalidades", rol.getFuncionalidad());
        ds.update(rolUpdate, uo);    
        }
        
        
        
    }

    public void deleteRol(String codigoRol) {
        Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arquitectura.model");
        Datastore ds = morphia.createDatastore(new MongoClient(), "modRest");
        System.out.println("conexion establecida");
        
        Query<Rol> rolUpdate=ds.createQuery(Rol.class)
                .field("codigoRol").equal(codigoRol);
        
        ///UpdateOperations<Rol> uo=ds.createUpdateOperations(Rol.class).set("nombreRol", nombreRol).set("descripcionRol", descripcionRol);
        ds.delete(rolUpdate);
    }
    
    
    
    */
    
}
