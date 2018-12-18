/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.api;


import ec.edu.espe.arquitectura.model.Entregable;
import ec.edu.espe.arquitectura.msg.EntregableRQ;
import ec.edu.espe.arquitectura.session.EntregableFacade;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author jeffe
 */
@Path("Entregable")
@RequestScoped
public class EntregableResource {

    @Context
    private UriInfo context;
    @EJB
    EntregableFacade obj;

    /**
     * Creates a new instance of EntregableResource
     */
    public EntregableResource() {
    }

    @POST //PARA INGRESAR LOS DATOS
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postJson(Entregable content) throws Exception {
        System.out.println("los datos ingresados son" + content);
        
        
        try {
            String p = obj.insertarRol(content.getCodigoEntregable(), content.getFechaPlanificada(), content.getFechaReal());
            return Response.ok(p).build();
        } catch (Exception e) {
            System.out.println("este es el error" + e);
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).
                    entity(e.getMessage().toString()).build();
        }

    }

    @GET // Para la busqueda de todo
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {

        List<Entregable> lest = obj.findRol();
        List<EntregableRQ> lista = new ArrayList<>();
        for (Entregable e : lest) {
            EntregableRQ rq = new EntregableRQ();
            rq.setCodigoEntregable(e.getCodigoEntregable());
            rq.setFechaPlanificada(e.getFechaPlanificada());
            rq.setFechaReal(e.getFechaReal());

            lista.add(rq);

        }
        GenericEntity generic = new GenericEntity<List<EntregableRQ>>(lista) {
        };
        return Response.ok(generic).build();

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putJson(Entregable content) {
        System.out.println("los datos recibidos son: ");
        System.out.println(content);
        obj.updateRol(content.getCodigoEntregable(), content.getFechaPlanificada(), content.getFechaReal());
        return Response.ok("Actualizado").build();
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/borrar/{identificacion}")
    public Response deleteJson(@PathParam("identificacion") String identificacion) {

        return Response
                .status(Response.Status.OK)
                .entity("Persona eliminada con CI ")
                .build();
    }

}
