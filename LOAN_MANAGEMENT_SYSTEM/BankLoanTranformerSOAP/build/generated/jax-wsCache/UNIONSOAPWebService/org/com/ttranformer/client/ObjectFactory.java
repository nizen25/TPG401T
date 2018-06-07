
package org.com.ttranformer.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.com.ttranformer.client package. 
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

    private final static QName _RemoveApplicantResponse_QNAME = new QName("http://jws.union.com.org/", "removeApplicantResponse");
    private final static QName _CreateApplicantResponse_QNAME = new QName("http://jws.union.com.org/", "createApplicantResponse");
    private final static QName _FindAllApplicantsResponse_QNAME = new QName("http://jws.union.com.org/", "findAllApplicantsResponse");
    private final static QName _GetStatusResponse_QNAME = new QName("http://jws.union.com.org/", "getStatusResponse");
    private final static QName _Applicant_QNAME = new QName("http://jws.union.com.org/", "applicant");
    private final static QName _Exception_QNAME = new QName("http://jws.union.com.org/", "Exception");
    private final static QName _FindApplicant_QNAME = new QName("http://jws.union.com.org/", "findApplicant");
    private final static QName _GetStatus_QNAME = new QName("http://jws.union.com.org/", "getStatus");
    private final static QName _FindApplicantResponse_QNAME = new QName("http://jws.union.com.org/", "findApplicantResponse");
    private final static QName _RemoveApplicant_QNAME = new QName("http://jws.union.com.org/", "removeApplicant");
    private final static QName _EditApplicant_QNAME = new QName("http://jws.union.com.org/", "editApplicant");
    private final static QName _EditApplicantResponse_QNAME = new QName("http://jws.union.com.org/", "editApplicantResponse");
    private final static QName _CreateApplicant_QNAME = new QName("http://jws.union.com.org/", "createApplicant");
    private final static QName _FindAllApplicants_QNAME = new QName("http://jws.union.com.org/", "findAllApplicants");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.com.ttranformer.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link CreateApplicantResponse }
     * 
     */
    public CreateApplicantResponse createCreateApplicantResponse() {
        return new CreateApplicantResponse();
    }

    /**
     * Create an instance of {@link FindAllApplicantsResponse }
     * 
     */
    public FindAllApplicantsResponse createFindAllApplicantsResponse() {
        return new FindAllApplicantsResponse();
    }

    /**
     * Create an instance of {@link RemoveApplicantResponse }
     * 
     */
    public RemoveApplicantResponse createRemoveApplicantResponse() {
        return new RemoveApplicantResponse();
    }

    /**
     * Create an instance of {@link FindApplicantResponse }
     * 
     */
    public FindApplicantResponse createFindApplicantResponse() {
        return new FindApplicantResponse();
    }

    /**
     * Create an instance of {@link FindApplicant }
     * 
     */
    public FindApplicant createFindApplicant() {
        return new FindApplicant();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Applicant }
     * 
     */
    public Applicant createApplicant() {
        return new Applicant();
    }

    /**
     * Create an instance of {@link EditApplicantResponse }
     * 
     */
    public EditApplicantResponse createEditApplicantResponse() {
        return new EditApplicantResponse();
    }

    /**
     * Create an instance of {@link EditApplicant }
     * 
     */
    public EditApplicant createEditApplicant() {
        return new EditApplicant();
    }

    /**
     * Create an instance of {@link RemoveApplicant }
     * 
     */
    public RemoveApplicant createRemoveApplicant() {
        return new RemoveApplicant();
    }

    /**
     * Create an instance of {@link CreateApplicant }
     * 
     */
    public CreateApplicant createCreateApplicant() {
        return new CreateApplicant();
    }

    /**
     * Create an instance of {@link FindAllApplicants }
     * 
     */
    public FindAllApplicants createFindAllApplicants() {
        return new FindAllApplicants();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveApplicantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.com.org/", name = "removeApplicantResponse")
    public JAXBElement<RemoveApplicantResponse> createRemoveApplicantResponse(RemoveApplicantResponse value) {
        return new JAXBElement<RemoveApplicantResponse>(_RemoveApplicantResponse_QNAME, RemoveApplicantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateApplicantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.com.org/", name = "createApplicantResponse")
    public JAXBElement<CreateApplicantResponse> createCreateApplicantResponse(CreateApplicantResponse value) {
        return new JAXBElement<CreateApplicantResponse>(_CreateApplicantResponse_QNAME, CreateApplicantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllApplicantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.com.org/", name = "findAllApplicantsResponse")
    public JAXBElement<FindAllApplicantsResponse> createFindAllApplicantsResponse(FindAllApplicantsResponse value) {
        return new JAXBElement<FindAllApplicantsResponse>(_FindAllApplicantsResponse_QNAME, FindAllApplicantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.com.org/", name = "getStatusResponse")
    public JAXBElement<GetStatusResponse> createGetStatusResponse(GetStatusResponse value) {
        return new JAXBElement<GetStatusResponse>(_GetStatusResponse_QNAME, GetStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Applicant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.com.org/", name = "applicant")
    public JAXBElement<Applicant> createApplicant(Applicant value) {
        return new JAXBElement<Applicant>(_Applicant_QNAME, Applicant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.com.org/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindApplicant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.com.org/", name = "findApplicant")
    public JAXBElement<FindApplicant> createFindApplicant(FindApplicant value) {
        return new JAXBElement<FindApplicant>(_FindApplicant_QNAME, FindApplicant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.com.org/", name = "getStatus")
    public JAXBElement<GetStatus> createGetStatus(GetStatus value) {
        return new JAXBElement<GetStatus>(_GetStatus_QNAME, GetStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindApplicantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.com.org/", name = "findApplicantResponse")
    public JAXBElement<FindApplicantResponse> createFindApplicantResponse(FindApplicantResponse value) {
        return new JAXBElement<FindApplicantResponse>(_FindApplicantResponse_QNAME, FindApplicantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveApplicant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.com.org/", name = "removeApplicant")
    public JAXBElement<RemoveApplicant> createRemoveApplicant(RemoveApplicant value) {
        return new JAXBElement<RemoveApplicant>(_RemoveApplicant_QNAME, RemoveApplicant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditApplicant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.com.org/", name = "editApplicant")
    public JAXBElement<EditApplicant> createEditApplicant(EditApplicant value) {
        return new JAXBElement<EditApplicant>(_EditApplicant_QNAME, EditApplicant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditApplicantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.com.org/", name = "editApplicantResponse")
    public JAXBElement<EditApplicantResponse> createEditApplicantResponse(EditApplicantResponse value) {
        return new JAXBElement<EditApplicantResponse>(_EditApplicantResponse_QNAME, EditApplicantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateApplicant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.com.org/", name = "createApplicant")
    public JAXBElement<CreateApplicant> createCreateApplicant(CreateApplicant value) {
        return new JAXBElement<CreateApplicant>(_CreateApplicant_QNAME, CreateApplicant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllApplicants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.union.com.org/", name = "findAllApplicants")
    public JAXBElement<FindAllApplicants> createFindAllApplicants(FindAllApplicants value) {
        return new JAXBElement<FindAllApplicants>(_FindAllApplicants_QNAME, FindAllApplicants.class, null, value);
    }

}
