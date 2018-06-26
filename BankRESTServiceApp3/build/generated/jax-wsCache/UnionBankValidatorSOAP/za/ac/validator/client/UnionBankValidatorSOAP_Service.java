
package za.ac.validator.client;

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
@WebServiceClient(name = "UnionBankValidatorSOAP", targetNamespace = "http://jws.validator.ac.za/", wsdlLocation = "http://Lesego:8080/UnionBankValidatorSOAP/UnionBankValidatorSOAP?WSDL")
public class UnionBankValidatorSOAP_Service
    extends Service
{

    private final static URL UNIONBANKVALIDATORSOAP_WSDL_LOCATION;
    private final static WebServiceException UNIONBANKVALIDATORSOAP_EXCEPTION;
    private final static QName UNIONBANKVALIDATORSOAP_QNAME = new QName("http://jws.validator.ac.za/", "UnionBankValidatorSOAP");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://Lesego:8080/UnionBankValidatorSOAP/UnionBankValidatorSOAP?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UNIONBANKVALIDATORSOAP_WSDL_LOCATION = url;
        UNIONBANKVALIDATORSOAP_EXCEPTION = e;
    }

    public UnionBankValidatorSOAP_Service() {
        super(__getWsdlLocation(), UNIONBANKVALIDATORSOAP_QNAME);
    }

    public UnionBankValidatorSOAP_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), UNIONBANKVALIDATORSOAP_QNAME, features);
    }

    public UnionBankValidatorSOAP_Service(URL wsdlLocation) {
        super(wsdlLocation, UNIONBANKVALIDATORSOAP_QNAME);
    }

    public UnionBankValidatorSOAP_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UNIONBANKVALIDATORSOAP_QNAME, features);
    }

    public UnionBankValidatorSOAP_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UnionBankValidatorSOAP_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UnionBankValidatorSOAP
     */
    @WebEndpoint(name = "UnionBankValidatorSOAPPort")
    public UnionBankValidatorSOAP getUnionBankValidatorSOAPPort() {
        return super.getPort(new QName("http://jws.validator.ac.za/", "UnionBankValidatorSOAPPort"), UnionBankValidatorSOAP.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UnionBankValidatorSOAP
     */
    @WebEndpoint(name = "UnionBankValidatorSOAPPort")
    public UnionBankValidatorSOAP getUnionBankValidatorSOAPPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jws.validator.ac.za/", "UnionBankValidatorSOAPPort"), UnionBankValidatorSOAP.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UNIONBANKVALIDATORSOAP_EXCEPTION!= null) {
            throw UNIONBANKVALIDATORSOAP_EXCEPTION;
        }
        return UNIONBANKVALIDATORSOAP_WSDL_LOCATION;
    }

}
