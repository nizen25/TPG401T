
package org.com.ttranformer.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UNIONSOAPWebService", targetNamespace = "http://jws.union.com.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UNIONSOAPWebService {


    /**
     * 
     * @param id
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "removeApplicant", targetNamespace = "http://jws.union.com.org/", className = "org.com.ttranformer.client.RemoveApplicant")
    @ResponseWrapper(localName = "removeApplicantResponse", targetNamespace = "http://jws.union.com.org/", className = "org.com.ttranformer.client.RemoveApplicantResponse")
    @Action(input = "http://jws.union.com.org/UNIONSOAPWebService/removeApplicantRequest", output = "http://jws.union.com.org/UNIONSOAPWebService/removeApplicantResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://jws.union.com.org/UNIONSOAPWebService/removeApplicant/Fault/Exception")
    })
    public void removeApplicant(
        @WebParam(name = "id", targetNamespace = "")
        Long id)
        throws Exception_Exception
    ;

    /**
     * 
     * @param id
     * @return
     *     returns org.com.ttranformer.client.Applicant
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findApplicant", targetNamespace = "http://jws.union.com.org/", className = "org.com.ttranformer.client.FindApplicant")
    @ResponseWrapper(localName = "findApplicantResponse", targetNamespace = "http://jws.union.com.org/", className = "org.com.ttranformer.client.FindApplicantResponse")
    @Action(input = "http://jws.union.com.org/UNIONSOAPWebService/findApplicantRequest", output = "http://jws.union.com.org/UNIONSOAPWebService/findApplicantResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://jws.union.com.org/UNIONSOAPWebService/findApplicant/Fault/Exception")
    })
    public Applicant findApplicant(
        @WebParam(name = "id", targetNamespace = "")
        Long id)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<org.com.ttranformer.client.Applicant>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllApplicants", targetNamespace = "http://jws.union.com.org/", className = "org.com.ttranformer.client.FindAllApplicants")
    @ResponseWrapper(localName = "findAllApplicantsResponse", targetNamespace = "http://jws.union.com.org/", className = "org.com.ttranformer.client.FindAllApplicantsResponse")
    @Action(input = "http://jws.union.com.org/UNIONSOAPWebService/findAllApplicantsRequest", output = "http://jws.union.com.org/UNIONSOAPWebService/findAllApplicantsResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://jws.union.com.org/UNIONSOAPWebService/findAllApplicants/Fault/Exception")
    })
    public List<Applicant> findAllApplicants()
        throws Exception_Exception
    ;

    /**
     * 
     * @param applicantXML
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "createApplicant", targetNamespace = "http://jws.union.com.org/", className = "org.com.ttranformer.client.CreateApplicant")
    @ResponseWrapper(localName = "createApplicantResponse", targetNamespace = "http://jws.union.com.org/", className = "org.com.ttranformer.client.CreateApplicantResponse")
    @Action(input = "http://jws.union.com.org/UNIONSOAPWebService/createApplicantRequest", output = "http://jws.union.com.org/UNIONSOAPWebService/createApplicantResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://jws.union.com.org/UNIONSOAPWebService/createApplicant/Fault/Exception")
    })
    public void createApplicant(
        @WebParam(name = "applicantXML", targetNamespace = "")
        String applicantXML)
        throws Exception_Exception
    ;

    /**
     * 
     * @param applicantXML
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "editApplicant", targetNamespace = "http://jws.union.com.org/", className = "org.com.ttranformer.client.EditApplicant")
    @ResponseWrapper(localName = "editApplicantResponse", targetNamespace = "http://jws.union.com.org/", className = "org.com.ttranformer.client.EditApplicantResponse")
    @Action(input = "http://jws.union.com.org/UNIONSOAPWebService/editApplicantRequest", output = "http://jws.union.com.org/UNIONSOAPWebService/editApplicantResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://jws.union.com.org/UNIONSOAPWebService/editApplicant/Fault/Exception")
    })
    public void editApplicant(
        @WebParam(name = "applicantXML", targetNamespace = "")
        String applicantXML)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStatus", targetNamespace = "http://jws.union.com.org/", className = "org.com.ttranformer.client.GetStatus")
    @ResponseWrapper(localName = "getStatusResponse", targetNamespace = "http://jws.union.com.org/", className = "org.com.ttranformer.client.GetStatusResponse")
    @Action(input = "http://jws.union.com.org/UNIONSOAPWebService/getStatusRequest", output = "http://jws.union.com.org/UNIONSOAPWebService/getStatusResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://jws.union.com.org/UNIONSOAPWebService/getStatus/Fault/Exception")
    })
    public String getStatus()
        throws Exception_Exception
    ;

}