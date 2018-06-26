
package za.ac.dha.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DepartmentSOAPWebService", targetNamespace = "http://jws.dha.ac.za/", wsdlLocation = "http://localhost:8080/DepartmentSOAPWebService/DepartmentSOAPWebService?WSDL")
public class DepartmentSOAPWebService_Service
    extends Service
{

    private final static URL DEPARTMENTSOAPWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException DEPARTMENTSOAPWEBSERVICE_EXCEPTION;
    private final static QName DEPARTMENTSOAPWEBSERVICE_QNAME = new QName("http://jws.dha.ac.za/", "DepartmentSOAPWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/DepartmentSOAPWebService/DepartmentSOAPWebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DEPARTMENTSOAPWEBSERVICE_WSDL_LOCATION = url;
        DEPARTMENTSOAPWEBSERVICE_EXCEPTION = e;
    }

    public DepartmentSOAPWebService_Service() {
        super(__getWsdlLocation(), DEPARTMENTSOAPWEBSERVICE_QNAME);
    }

    public DepartmentSOAPWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DEPARTMENTSOAPWEBSERVICE_QNAME, features);
    }

    public DepartmentSOAPWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, DEPARTMENTSOAPWEBSERVICE_QNAME);
    }

    public DepartmentSOAPWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DEPARTMENTSOAPWEBSERVICE_QNAME, features);
    }

    public DepartmentSOAPWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DepartmentSOAPWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DepartmentSOAPWebService
     */
    @WebEndpoint(name = "DepartmentSOAPWebServicePort")
    public DepartmentSOAPWebService getDepartmentSOAPWebServicePort() {
        return super.getPort(new QName("http://jws.dha.ac.za/", "DepartmentSOAPWebServicePort"), DepartmentSOAPWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DepartmentSOAPWebService
     */
    @WebEndpoint(name = "DepartmentSOAPWebServicePort")
    public DepartmentSOAPWebService getDepartmentSOAPWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jws.dha.ac.za/", "DepartmentSOAPWebServicePort"), DepartmentSOAPWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DEPARTMENTSOAPWEBSERVICE_EXCEPTION!= null) {
            throw DEPARTMENTSOAPWEBSERVICE_EXCEPTION;
        }
        return DEPARTMENTSOAPWEBSERVICE_WSDL_LOCATION;
    }

}