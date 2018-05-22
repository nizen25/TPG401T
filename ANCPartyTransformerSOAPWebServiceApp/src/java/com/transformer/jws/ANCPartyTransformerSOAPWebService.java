/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.transformer.jws;

import com.transformer.common.Utility;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Katlego
 */
@WebService(serviceName = "ANCPartyTransformerSOAPWebService")
@Stateless()
public class ANCPartyTransformerSOAPWebService {
    @WebServiceRef(wsdlLocation = "META-INF/wsdl/Selepe_8080/DeptOfHomeAffairsSOAPWebService/DeptOfHomeAffairsSOAPWebService.wsdl")
    //private com.transformer.jws.client.DeptOfHomeAffairsSOAPWebService_Service service;
    //@WebServiceRef(wsdlLocation = "META-INF/Selepe_8080/DeptOfHomeAffairsSOAPWebService/DeptOfHomeAffairsSOAPWebService.wsdl")
    //private DeptOfHomeAffairsSOAPWebService_Service service;
    
    
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
    @WebMethod(operationName = "forwardCitizen")
    public void forwardCitizen(@WebParam(name = "memberXML") String memberXML) throws Exception {
        String memberXSLT = "C:\\Users\\Katlego\\Documents\\Tutorial 9\\memberXSLTFile.xsl";
        
        String citizenXML = Utility.transform(memberXML, memberXSLT);
    
       // create(citizenXML);
    }

    /*private void create(java.lang.String citizenXML) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.transformer.jws.client.DeptOfHomeAffairsSOAPWebService port = service.getDeptOfHomeAffairsSOAPWebServicePort();
        port.create(citizenXML);
    }*/

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ForwardEdit")
    public void ForwardEdit(@WebParam(name = "memberXML") String memberXML) throws Exception{
        String memberXSLT = "C:\\Users\\Katlego\\Documents\\Tutorial 9\\memberXSLTFile.xsl";
        
        String citizenXML = Utility.transform(memberXML, memberXSLT);
    
       // edit(citizenXML);
    
    }

    /*private void edit(java.lang.String citizenXML) throws com.transformer.jws.client.Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.transformer.jws.client.DeptOfHomeAffairsSOAPWebService port = service.getDeptOfHomeAffairsSOAPWebServicePort();
        port.edit(citizenXML);
    }*/

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ForwardRemove")
    public void ForwardRemove(@WebParam(name = "memberXML") String memberXML) throws Exception {
         String memberXSLT = "C:\\Users\\Katlego\\Documents\\Tutorial 9\\memberXSLTFile.xsl";
        
        String citizenXML = Utility.transform(memberXML, memberXSLT);
    
       // remove(citizenXML);
    
    }

    /*private void remove(java.lang.String citizenXML) throws com.transformer.jws.client.Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.transformer.jws.client.DeptOfHomeAffairsSOAPWebService port = service.getDeptOfHomeAffairsSOAPWebServicePort();
        port.remove(citizenXML);
    }*/

    
   
    
    
    
    
    
    
    
    

    
    
}
