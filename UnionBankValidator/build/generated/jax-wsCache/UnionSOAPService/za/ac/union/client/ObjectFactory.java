
package za.ac.union.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the za.ac.union.client package. 
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

    private final static QName _RemoveClientResponse_QNAME = new QName("http://jws.union.ac.za/", "removeClientResponse");
    private final static QName _CreateClient_QNAME = new QName("http://jws.union.ac.za/", "createClient");
    private final static QName _RemoveClient_QNAME = new QName("http://jws.union.ac.za/", "removeClient");
    private final static QName _EditClientResponse_QNAME = new QName("http://jws.union.ac.za/", "editClientResponse");
    private final static QName _Clientt_QNAME = new QName("http://jws.union.ac.za/", "clientt");
    private final static QName _Exception_QNAME = new QName("http://jws.union.ac.za/", "Exception");
    private final static QName _CreateClientResponse_QNAME = new QName("http://jws.union.ac.za/", "createClientResponse");
    private final static QName _EditClient_QNAME = new QName("http://jws.union.ac.za/", "editClient");
    private final static QName _FindAllClients_QNAME = new QName("http://jws.union.ac.za/", "findAllClients");
    private final static QName _FindClientResponse_QNAME = new QName("http://jws.union.ac.za/", "findClientResponse");
    private final static QName _FindAllClientsResponse_QNAME = new QName("http://jws.union.ac.za/", "findAllClientsResponse");
    private final static QName _FindClient_QNAME = new QName("http://jws.union.ac.za/", "findClient");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: za.ac.union.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateClient }
     * 
     */
    public CreateClient createCreateClient() {
        return new CreateClient();
    }

    /**
     * Create an instance of {@link RemoveClient }
     * 
     */
    public RemoveClient createRemoveClient() {
        return new RemoveClient();
    }

    /**
     * Create an instance of {@link Clientt }
     * 
     */
    public Clientt createClientt() {
        return new Clientt();
    }

    /**
     * Create an instance of {@link EditClientResponse }
     * 
     */
    public EditClientResponse createEditClientResponse() {
        return new EditClientResponse();
    }

    /**
     * Create an instance of {@link RemoveClientResponse }
     * 
     */
    public RemoveClientResponse createRemoveClientResponse() {
        return new RemoveClientResponse();
    }

    /**
     * Create an instance of {@link FindClient }
     * 
     */
    public FindClient createFindClient() {
        return new FindClient();
    }

    /**
     * Create an instance of {@link FindAllClientsResponse }
     * 
     */
    public FindAllClientsResponse createFindAllClientsResponse() {
        return new FindAllClientsResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link CreateClientResponse }
     * 
     */
    public CreateClientResponse createCreateClientResponse() {
        return new CreateClientResponse();
    }

    /**
     * Create an instance of {@link EditClient }
     * 
     */
    public EditClient createEditClient() {
        return new EditClient();
    }

    /**
     * Create an instance of {@link FindAllClients }
     * 
     */
    public FindAllClients createFindAllClients() {
        return new FindAllClients();
    }

    /**
     * Create an instance of {@link FindClientResponse }
     * 
     */
    public FindClientResponse createFindClientResponse() {
        return new FindClientResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.ac.za/", name = "removeClientResponse")
    public JAXBElement<RemoveClientResponse> createRemoveClientResponse(RemoveClientResponse value) {
        return new JAXBElement<RemoveClientResponse>(_RemoveClientResponse_QNAME, RemoveClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.ac.za/", name = "createClient")
    public JAXBElement<CreateClient> createCreateClient(CreateClient value) {
        return new JAXBElement<CreateClient>(_CreateClient_QNAME, CreateClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.ac.za/", name = "removeClient")
    public JAXBElement<RemoveClient> createRemoveClient(RemoveClient value) {
        return new JAXBElement<RemoveClient>(_RemoveClient_QNAME, RemoveClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.ac.za/", name = "editClientResponse")
    public JAXBElement<EditClientResponse> createEditClientResponse(EditClientResponse value) {
        return new JAXBElement<EditClientResponse>(_EditClientResponse_QNAME, EditClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Clientt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.ac.za/", name = "clientt")
    public JAXBElement<Clientt> createClientt(Clientt value) {
        return new JAXBElement<Clientt>(_Clientt_QNAME, Clientt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.ac.za/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.ac.za/", name = "createClientResponse")
    public JAXBElement<CreateClientResponse> createCreateClientResponse(CreateClientResponse value) {
        return new JAXBElement<CreateClientResponse>(_CreateClientResponse_QNAME, CreateClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.ac.za/", name = "editClient")
    public JAXBElement<EditClient> createEditClient(EditClient value) {
        return new JAXBElement<EditClient>(_EditClient_QNAME, EditClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllClients }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.ac.za/", name = "findAllClients")
    public JAXBElement<FindAllClients> createFindAllClients(FindAllClients value) {
        return new JAXBElement<FindAllClients>(_FindAllClients_QNAME, FindAllClients.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.ac.za/", name = "findClientResponse")
    public JAXBElement<FindClientResponse> createFindClientResponse(FindClientResponse value) {
        return new JAXBElement<FindClientResponse>(_FindClientResponse_QNAME, FindClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllClientsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.ac.za/", name = "findAllClientsResponse")
    public JAXBElement<FindAllClientsResponse> createFindAllClientsResponse(FindAllClientsResponse value) {
        return new JAXBElement<FindAllClientsResponse>(_FindAllClientsResponse_QNAME, FindAllClientsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.ac.za/", name = "findClient")
    public JAXBElement<FindClient> createFindClient(FindClient value) {
        return new JAXBElement<FindClient>(_FindClient_QNAME, FindClient.class, null, value);
    }

}
