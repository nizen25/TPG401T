
package za.ac.dha.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the za.ac.dha.client package. 
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

    private final static QName _Exception_QNAME = new QName("http://jws.dha.ac.za/", "Exception");
    private final static QName _IsIdFound_QNAME = new QName("http://jws.dha.ac.za/", "isIdFound");
    private final static QName _IsIdFoundResponse_QNAME = new QName("http://jws.dha.ac.za/", "isIdFoundResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: za.ac.dha.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsIdFoundResponse }
     * 
     */
    public IsIdFoundResponse createIsIdFoundResponse() {
        return new IsIdFoundResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link IsIdFound }
     * 
     */
    public IsIdFound createIsIdFound() {
        return new IsIdFound();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dha.ac.za/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsIdFound }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dha.ac.za/", name = "isIdFound")
    public JAXBElement<IsIdFound> createIsIdFound(IsIdFound value) {
        return new JAXBElement<IsIdFound>(_IsIdFound_QNAME, IsIdFound.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsIdFoundResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dha.ac.za/", name = "isIdFoundResponse")
    public JAXBElement<IsIdFoundResponse> createIsIdFoundResponse(IsIdFoundResponse value) {
        return new JAXBElement<IsIdFoundResponse>(_IsIdFoundResponse_QNAME, IsIdFoundResponse.class, null, value);
    }

}
