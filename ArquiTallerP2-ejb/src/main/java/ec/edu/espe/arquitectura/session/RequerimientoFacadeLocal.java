/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.session;

import ec.edu.espe.arquitectura.model.Requerimiento;
import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface RequerimientoFacadeLocal {
    
    public void insertarRequerimiento(Requerimiento req);
}
