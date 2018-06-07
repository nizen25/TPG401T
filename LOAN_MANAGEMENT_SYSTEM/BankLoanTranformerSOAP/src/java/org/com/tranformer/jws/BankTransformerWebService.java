/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.com.tranformer.jws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;
import org.com.tranformer.common.Utility;
import org.com.ttranformer.client.Exception_Exception;
import org.com.ttranformer.client.UNIONSOAPWebService_Service;

/**
 *
 * @author sydney
 */
@WebService(serviceName = "BankTransformerWebService")
@Stateless()
public class BankTransformerWebService {

    @WebServiceRef(wsdlLocation = "/home/sydney/UNIONSOAPWebService.wsdl")
    private UNIONSOAPWebService_Service service;

    /**
     * Web service operation
     */
    
    @WebMethod(operationName = "forwardCustomer")
    public void forwardCustomer(@WebParam(name = "customerXML") String customerXML) throws Exception {
        final String customerXSL = "/home/sydney/customerXSL.xsl";
        final String applicantXML = Utility.transform(customerXML, customerXSL);
        createApplicant(applicantXML);
    }
    
    /**
     * Web service operation
     */
    
    @WebMethod(operationName = "forwardDelete")
    public void forwardDelete(@WebParam(name = "id") Long id) throws Exception {
        removeApplicant(id);
    }
    
    /**
     * Web service operation
     */
    
    @WebMethod(operationName = "forwardUpdate")
    public void forwardUpdate(@WebParam(name = "customerXML") String customerXML) throws Exception {
        final String customerXSL = "/home/sydney/customerXSL.xsl";
        final String applicantXML = Utility.transform(customerXML, customerXSL);
        editApplicant(applicantXML);
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getApplicationStatus")
    public String getApplicationStatus() throws Exception {
        return getStatus();
    }
    
    private void createApplicant(java.lang.String applicantXML) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.com.ttranformer.client.UNIONSOAPWebService port = service.getUNIONSOAPWebServicePort();
        port.createApplicant(applicantXML);
    }

    private void editApplicant(java.lang.String applicantXML) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.com.ttranformer.client.UNIONSOAPWebService port = service.getUNIONSOAPWebServicePort();
        port.editApplicant(applicantXML);
    }

    private String getStatus() throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.com.ttranformer.client.UNIONSOAPWebService port = service.getUNIONSOAPWebServicePort();
        return port.getStatus();
    }

    private void removeApplicant(java.lang.Long id) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.com.ttranformer.client.UNIONSOAPWebService port = service.getUNIONSOAPWebServicePort();
        port.removeApplicant(id);
    }

}
