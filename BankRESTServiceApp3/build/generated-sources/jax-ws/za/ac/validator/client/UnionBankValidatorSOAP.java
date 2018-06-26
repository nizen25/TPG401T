
package za.ac.validator.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UnionBankValidatorSOAP", targetNamespace = "http://jws.validator.ac.za/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UnionBankValidatorSOAP {


    /**
     * 
     * @param userXml
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "fowardClientUser", targetNamespace = "http://jws.validator.ac.za/", className = "za.ac.validator.client.FowardClientUser")
    @ResponseWrapper(localName = "fowardClientUserResponse", targetNamespace = "http://jws.validator.ac.za/", className = "za.ac.validator.client.FowardClientUserResponse")
    @Action(input = "http://jws.validator.ac.za/UnionBankValidatorSOAP/fowardClientUserRequest", output = "http://jws.validator.ac.za/UnionBankValidatorSOAP/fowardClientUserResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://jws.validator.ac.za/UnionBankValidatorSOAP/fowardClientUser/Fault/Exception")
    })
    public void fowardClientUser(
        @WebParam(name = "userXml", targetNamespace = "")
        String userXml)
        throws Exception_Exception
    ;

    /**
     * 
     * @param userXml
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "fowardEditUser", targetNamespace = "http://jws.validator.ac.za/", className = "za.ac.validator.client.FowardEditUser")
    @ResponseWrapper(localName = "fowardEditUserResponse", targetNamespace = "http://jws.validator.ac.za/", className = "za.ac.validator.client.FowardEditUserResponse")
    @Action(input = "http://jws.validator.ac.za/UnionBankValidatorSOAP/fowardEditUserRequest", output = "http://jws.validator.ac.za/UnionBankValidatorSOAP/fowardEditUserResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://jws.validator.ac.za/UnionBankValidatorSOAP/fowardEditUser/Fault/Exception")
    })
    public void fowardEditUser(
        @WebParam(name = "userXml", targetNamespace = "")
        String userXml)
        throws Exception_Exception
    ;

    /**
     * 
     * @param id
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "fowardRemoveUser", targetNamespace = "http://jws.validator.ac.za/", className = "za.ac.validator.client.FowardRemoveUser")
    @ResponseWrapper(localName = "fowardRemoveUserResponse", targetNamespace = "http://jws.validator.ac.za/", className = "za.ac.validator.client.FowardRemoveUserResponse")
    @Action(input = "http://jws.validator.ac.za/UnionBankValidatorSOAP/fowardRemoveUserRequest", output = "http://jws.validator.ac.za/UnionBankValidatorSOAP/fowardRemoveUserResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://jws.validator.ac.za/UnionBankValidatorSOAP/fowardRemoveUser/Fault/Exception")
    })
    public void fowardRemoveUser(
        @WebParam(name = "id", targetNamespace = "")
        Long id)
        throws Exception_Exception
    ;

}
