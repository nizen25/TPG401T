
package com.org.bank.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.org.bank.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ForwardCustomerResponse_QNAME = new QName("http://jws.tranformer.com.org/", "forwardCustomerResponse");
    private final static QName _ForwardUpdate_QNAME = new QName("http://jws.tranformer.com.org/", "forwardUpdate");
    private final static QName _ForwardCustomer_QNAME = new QName("http://jws.tranformer.com.org/", "forwardCustomer");
    private final static QName _ForwardDelete_QNAME = new QName("http://jws.tranformer.com.org/", "forwardDelete");
    private final static QName _ForwardDeleteResponse_QNAME = new QName("http://jws.tranformer.com.org/", "forwardDeleteResponse");
    private final static QName _GetApplicationStatus_QNAME = new QName("http://jws.tranformer.com.org/", "getApplicationStatus");
    private final static QName _GetApplicationStatusResponse_QNAME = new QName("http://jws.tranformer.com.org/", "getApplicationStatusResponse");
    private final static QName _Exception_QNAME = new QName("http://jws.tranformer.com.org/", "Exception");
    private final static QName _ForwardUpdateResponse_QNAME = new QName("http://jws.tranformer.com.org/", "forwardUpdateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.org.bank.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ForwardUpdate }
     * 
     */
    public ForwardUpdate createForwardUpdate() {
        return new ForwardUpdate();
    }

    /**
     * Create an instance of {@link ForwardCustomerResponse }
     * 
     */
    public ForwardCustomerResponse createForwardCustomerResponse() {
        return new ForwardCustomerResponse();
    }

    /**
     * Create an instance of {@link ForwardCustomer }
     * 
     */
    public ForwardCustomer createForwardCustomer() {
        return new ForwardCustomer();
    }

    /**
     * Create an instance of {@link ForwardDelete }
     * 
     */
    public ForwardDelete createForwardDelete() {
        return new ForwardDelete();
    }

    /**
     * Create an instance of {@link ForwardDeleteResponse }
     * 
     */
    public ForwardDeleteResponse createForwardDeleteResponse() {
        return new ForwardDeleteResponse();
    }

    /**
     * Create an instance of {@link GetApplicationStatus }
     * 
     */
    public GetApplicationStatus createGetApplicationStatus() {
        return new GetApplicationStatus();
    }

    /**
     * Create an instance of {@link GetApplicationStatusResponse }
     * 
     */
    public GetApplicationStatusResponse createGetApplicationStatusResponse() {
        return new GetApplicationStatusResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ForwardUpdateResponse }
     * 
     */
    public ForwardUpdateResponse createForwardUpdateResponse() {
        return new ForwardUpdateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.tranformer.com.org/", name = "forwardCustomerResponse")
    public JAXBElement<ForwardCustomerResponse> createForwardCustomerResponse(ForwardCustomerResponse value) {
        return new JAXBElement<ForwardCustomerResponse>(_ForwardCustomerResponse_QNAME, ForwardCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.tranformer.com.org/", name = "forwardUpdate")
    public JAXBElement<ForwardUpdate> createForwardUpdate(ForwardUpdate value) {
        return new JAXBElement<ForwardUpdate>(_ForwardUpdate_QNAME, ForwardUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.tranformer.com.org/", name = "forwardCustomer")
    public JAXBElement<ForwardCustomer> createForwardCustomer(ForwardCustomer value) {
        return new JAXBElement<ForwardCustomer>(_ForwardCustomer_QNAME, ForwardCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardDelete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.tranformer.com.org/", name = "forwardDelete")
    public JAXBElement<ForwardDelete> createForwardDelete(ForwardDelete value) {
        return new JAXBElement<ForwardDelete>(_ForwardDelete_QNAME, ForwardDelete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardDeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.tranformer.com.org/", name = "forwardDeleteResponse")
    public JAXBElement<ForwardDeleteResponse> createForwardDeleteResponse(ForwardDeleteResponse value) {
        return new JAXBElement<ForwardDeleteResponse>(_ForwardDeleteResponse_QNAME, ForwardDeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.tranformer.com.org/", name = "getApplicationStatus")
    public JAXBElement<GetApplicationStatus> createGetApplicationStatus(GetApplicationStatus value) {
        return new JAXBElement<GetApplicationStatus>(_GetApplicationStatus_QNAME, GetApplicationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.tranformer.com.org/", name = "getApplicationStatusResponse")
    public JAXBElement<GetApplicationStatusResponse> createGetApplicationStatusResponse(GetApplicationStatusResponse value) {
        return new JAXBElement<GetApplicationStatusResponse>(_GetApplicationStatusResponse_QNAME, GetApplicationStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.tranformer.com.org/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.tranformer.com.org/", name = "forwardUpdateResponse")
    public JAXBElement<ForwardUpdateResponse> createForwardUpdateResponse(ForwardUpdateResponse value) {
        return new JAXBElement<ForwardUpdateResponse>(_ForwardUpdateResponse_QNAME, ForwardUpdateResponse.class, null, value);
    }

}
