
package za.ac.validator.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the za.ac.validator.client package. 
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

    private final static QName _FowardClientUser_QNAME = new QName("http://jws.validator.ac.za/", "fowardClientUser");
    private final static QName _FowardRemoveUserResponse_QNAME = new QName("http://jws.validator.ac.za/", "fowardRemoveUserResponse");
    private final static QName _FowardEditUserResponse_QNAME = new QName("http://jws.validator.ac.za/", "fowardEditUserResponse");
    private final static QName _FowardRemoveUser_QNAME = new QName("http://jws.validator.ac.za/", "fowardRemoveUser");
    private final static QName _FowardEditUser_QNAME = new QName("http://jws.validator.ac.za/", "fowardEditUser");
    private final static QName _Exception_QNAME = new QName("http://jws.validator.ac.za/", "Exception");
    private final static QName _FowardClientUserResponse_QNAME = new QName("http://jws.validator.ac.za/", "fowardClientUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: za.ac.validator.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FowardRemoveUserResponse }
     * 
     */
    public FowardRemoveUserResponse createFowardRemoveUserResponse() {
        return new FowardRemoveUserResponse();
    }

    /**
     * Create an instance of {@link FowardClientUser }
     * 
     */
    public FowardClientUser createFowardClientUser() {
        return new FowardClientUser();
    }

    /**
     * Create an instance of {@link FowardEditUserResponse }
     * 
     */
    public FowardEditUserResponse createFowardEditUserResponse() {
        return new FowardEditUserResponse();
    }

    /**
     * Create an instance of {@link FowardRemoveUser }
     * 
     */
    public FowardRemoveUser createFowardRemoveUser() {
        return new FowardRemoveUser();
    }

    /**
     * Create an instance of {@link FowardEditUser }
     * 
     */
    public FowardEditUser createFowardEditUser() {
        return new FowardEditUser();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link FowardClientUserResponse }
     * 
     */
    public FowardClientUserResponse createFowardClientUserResponse() {
        return new FowardClientUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FowardClientUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.validator.ac.za/", name = "fowardClientUser")
    public JAXBElement<FowardClientUser> createFowardClientUser(FowardClientUser value) {
        return new JAXBElement<FowardClientUser>(_FowardClientUser_QNAME, FowardClientUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FowardRemoveUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.validator.ac.za/", name = "fowardRemoveUserResponse")
    public JAXBElement<FowardRemoveUserResponse> createFowardRemoveUserResponse(FowardRemoveUserResponse value) {
        return new JAXBElement<FowardRemoveUserResponse>(_FowardRemoveUserResponse_QNAME, FowardRemoveUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FowardEditUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.validator.ac.za/", name = "fowardEditUserResponse")
    public JAXBElement<FowardEditUserResponse> createFowardEditUserResponse(FowardEditUserResponse value) {
        return new JAXBElement<FowardEditUserResponse>(_FowardEditUserResponse_QNAME, FowardEditUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FowardRemoveUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.validator.ac.za/", name = "fowardRemoveUser")
    public JAXBElement<FowardRemoveUser> createFowardRemoveUser(FowardRemoveUser value) {
        return new JAXBElement<FowardRemoveUser>(_FowardRemoveUser_QNAME, FowardRemoveUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FowardEditUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.validator.ac.za/", name = "fowardEditUser")
    public JAXBElement<FowardEditUser> createFowardEditUser(FowardEditUser value) {
        return new JAXBElement<FowardEditUser>(_FowardEditUser_QNAME, FowardEditUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.validator.ac.za/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FowardClientUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.validator.ac.za/", name = "fowardClientUserResponse")
    public JAXBElement<FowardClientUserResponse> createFowardClientUserResponse(FowardClientUserResponse value) {
        return new JAXBElement<FowardClientUserResponse>(_FowardClientUserResponse_QNAME, FowardClientUserResponse.class, null, value);
    }

}
