/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.validator.jws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;
import za.ac.common.Utility;
import za.ac.union.client.Clientt;
import za.ac.union.client.Exception_Exception;
import za.ac.union.client.UnionSOAPService_Service;

/**
 *
 * @author leseg
 */
@WebService(serviceName = "UnionBankValidatorSOAP")
@Stateless()
public class UnionBankValidatorSOAP {
    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/UnionSOAPService/UnionSOAPService.wsdl")
    private UnionSOAPService_Service service;

    /**
     * This is a sample web service operation
     * @param userXml
     * @throws java.lang.Exception
     */
    @WebMethod(operationName = "fowardClientUser")
    public void fowardClientUser(@WebParam(name = "userXml") String userXml) throws Exception {
        
        String clientXsltFile = "C:\\Users\\leseg\\Documents\\java\\javaClientXSL.xsl";
        String clienttXml =  Utility.transform(userXml, clientXsltFile);
        System.out.println("Client : " + clienttXml);
        createClient(clienttXml);
        
    }
    
    @WebMethod(operationName = "fowardEditUser")
    public void fowardEditUser(@WebParam(name = "userXml") String userXml) throws Exception {
        
        String clientXsltFile = "C:\\Users\\leseg\\Documents\\java\\javaClientXSL.xsl";
        String clienttXml =  Utility.transform(userXml, clientXsltFile);
        editClient(clienttXml);
        
    }
    
    @WebMethod(operationName = "fowardRemoveUser")
    public void fowardRemoveUser(@WebParam(name = "id") Long id) throws Exception {
        
        removeClient(id);
        
    }
    
    private void createClient(java.lang.String clienttXml) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.ac.union.client.UnionSOAPService port = service.getUnionSOAPServicePort();
        port.createClient(clienttXml);
    }

    private Clientt findClient(java.lang.Long id) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.ac.union.client.UnionSOAPService port = service.getUnionSOAPServicePort();
        return port.findClient(id);
    }

    private void removeClient(java.lang.Long id) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.ac.union.client.UnionSOAPService port = service.getUnionSOAPServicePort();
        port.removeClient(id);
    }

    private void editClient(java.lang.String clienttXml) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.ac.union.client.UnionSOAPService port = service.getUnionSOAPServicePort();
        port.editClient(clienttXml);
    }
    
    
}
