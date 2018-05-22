/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.org.dha.jws;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import za.org.dha.business.CitizenFacadeLocal;
import za.org.dha.entities.Citizen;

/**
 *
 * @author Katlego
 */
@WebService(serviceName = "DeptOfHomeAffairsSOAPWebService")
@Stateless()
public class DeptOfHomeAffairsSOAPWebService {

    @EJB
    private CitizenFacadeLocal ejbRef;
    
    
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "create")
    public void create(@WebParam(name = "citizenXML") String citizenXML) throws Exception {
        ejbRef.addCitizen(citizenXML);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "edit")
    public void edit(@WebParam(name = "citizenXML") String citizenXML) throws Exception{
        ejbRef.editCitizen(citizenXML);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "remove")
    public void remove(@WebParam(name = "citizenXML") String citizenXML) throws Exception {
        ejbRef.removeCitizen(citizenXML);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "find")
    public Citizen find(@WebParam(name = "id") Object id) throws Exception {
        return ejbRef.findCitizen(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findAll")
    public List<Citizen> findAll() throws Exception {
        //TODO write your implementation code here:
        return ejbRef.findAll();
    }
    
    
    
    
    
    
    

    
}
