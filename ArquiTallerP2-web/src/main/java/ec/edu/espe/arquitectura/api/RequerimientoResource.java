/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.api;

import ec.edu.espe.arquitectura.model.Requerimiento;
import ec.edu.espe.arquitectura.session.RequerimientoFacadeLocal;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author User
 */
@Path("requerimiento")
@RequestScoped
public class RequerimientoResource {

    @EJB
    RequerimientoFacadeLocal EJBreq;
    Requerimiento req;
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RequerimientoResource
     */
    public RequerimientoResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.arquitectura.api.RequerimientoResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of RequerimientoResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postJson(Requerimiento content) {
        System.out.println("los datos ingresados son"+content);
      //  try{
            EJBreq.insertarRequerimiento(content);
            return Response.ok().build();
       
        
    }
    
}
