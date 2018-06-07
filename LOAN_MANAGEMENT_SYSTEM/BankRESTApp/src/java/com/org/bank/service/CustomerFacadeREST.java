/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.bank.service;

import com.org.bank.client.BankTransformerWebService_Service;
import com.org.bank.client.Exception_Exception;
import com.org.bank.common.Utility;
import com.org.bank.entities.Customer;
import java.util.Date;
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
import javax.ws.rs.core.MediaType;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author sydney
 */
@Stateless
@Path("BankREST")
public class CustomerFacadeREST extends AbstractFacade<Customer> {

    @WebServiceRef(wsdlLocation = "/home/sydney/BankTransformerWebService.wsdl")
    private BankTransformerWebService_Service service;

    @PersistenceContext(unitName = "BankRESTAppPU")
    private EntityManager em;

    public CustomerFacadeREST() {
        super(Customer.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Customer entity) {
        try {
            final String status = getApplicationStatus();
            if (!status.equals("TOO_RISKY")) {
                entity.setClientCategory(status);
                entity.setDateTimeStamp(new Date().toString());
                super.create(entity);
                final String customerXML = generateCustomerXML(entity);
                forwardCustomer(customerXML);
            }
        } catch (Exception_Exception ex) {
            Logger.getLogger(CustomerFacadeREST.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CustomerFacadeREST.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, Customer entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Customer find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Customer> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Customer> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    private String getApplicationStatus() throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.org.bank.client.BankTransformerWebService port = service.getBankTransformerWebServicePort();
        return port.getApplicationStatus();
    }

    private void forwardCustomer(java.lang.String customerXML) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.org.bank.client.BankTransformerWebService port = service.getBankTransformerWebServicePort();
        port.forwardCustomer(customerXML);
    }

    private void forwardDelete(java.lang.Long id) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.org.bank.client.BankTransformerWebService port = service.getBankTransformerWebServicePort();
        port.forwardDelete(id);
    }

    private void forwardUpdate(java.lang.String customerXML) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.org.bank.client.BankTransformerWebService port = service.getBankTransformerWebServicePort();
        port.forwardUpdate(customerXML);
    }

    private String generateCustomerXML(Customer customer) throws Exception {
        final String customerXML="<customer>" +
                             "<id>"+ customer.getId() +"</id>" +
                             "<name>"+ customer.getName() +"</name>" +
                             "<surname>"+ customer.getSurname() +"</surname>" +
                             "<idNumber>"+ customer.getIdNumber() +"</idNumber>" +
                             "<loanAmount>"+ customer.getLoanAmount() +"</loanAmount>" +
                           "</customer>";
        return customerXML;
    }
    
}
