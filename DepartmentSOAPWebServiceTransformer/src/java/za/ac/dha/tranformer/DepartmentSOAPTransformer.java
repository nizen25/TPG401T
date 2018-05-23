/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.dha.tranformer;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;
import za.ac.dha.client.DepartmentSOAPWebService_Service;
import za.ac.dha.client.Exception_Exception;

/**
 *
 * @author leseg
 */
@WebService(serviceName = "DepartmentSOAPTransformer")
@Stateless()
public class DepartmentSOAPTransformer {
    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/DepartmentSOAPWebService/DepartmentSOAPWebService.wsdl")
    private DepartmentSOAPWebService_Service service;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "FowardPerson")
    public boolean findPerson(@WebParam(name = "id") Long id) throws Exception_Exception {
          return isIdFound(id);
    }

    private boolean isIdFound(java.lang.Long id) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.ac.dha.client.DepartmentSOAPWebService port = service.getDepartmentSOAPWebServicePort();
        return port.isIdFound(id);
    }
    
    
}
