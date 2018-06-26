/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.bank.entites.service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.ws.WebServiceRef;
import za.ac.bank.entites.Userr;
import za.ac.validator.client.Exception_Exception;
import za.ac.validator.client.UnionBankValidatorSOAP_Service;

/**
 *
 * @author leseg
 */
@Stateless
@Path("BankService3")
public class UserrFacadeREST extends AbstractFacade<Userr> {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/Lesego_8080/UnionBankValidatorSOAP/UnionBankValidatorSOAP.wsdl")
    private UnionBankValidatorSOAP_Service service;
    @PersistenceContext(unitName = "BankRESTServiceApp3PU")
    private EntityManager em;

    public UserrFacadeREST() {
        super(Userr.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Userr entity) {
        
            super.create(entity);
            
            String userr = "<userr>" +
                                "<id>"+ entity.getId()+"</id>"+
                                "<name>"+entity.getName()+"</name>"+
                                "<surname>"+entity.getSurname()+"</surname>"+
                                "<status>"+entity.getStatus()+"</status>" +
                            "</userr>";
            System.out.println( "Userr xml : " +  userr);
         try {  
            fowardClientUser(userr);
        } catch (Exception_Exception ex) {
            Logger.getLogger(UserrFacadeREST.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Long id, Userr entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Userr find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Userr> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Userr> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    private void fowardClientUser(java.lang.String userXml) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.ac.validator.client.UnionBankValidatorSOAP port = service.getUnionBankValidatorSOAPPort();
        port.fowardClientUser(userXml);
    }
  
    
    
    
}
