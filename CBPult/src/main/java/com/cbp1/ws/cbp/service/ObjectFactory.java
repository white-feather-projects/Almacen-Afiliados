
package com.cbp1.ws.cbp.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cbp1.ws.cbp.service package. 
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

    private final static QName _Office_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "office");
    private final static QName _UsersFp_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "usersFp");
    private final static QName _CreateAccountWS_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "createAccountWS");
    private final static QName _CreateAccountWSResponse_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "createAccountWSResponse");
    private final static QName _UpdateStatusAccountWS_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "updateStatusAccountWS");
    private final static QName _Pais_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "pais");
    private final static QName _Catalogue_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "catalogue");
    private final static QName _EntityBank_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "entityBank");
    private final static QName _Product_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "product");
    private final static QName _FindAllAccountAndClientWS_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "findAllAccountAndClientWS");
    private final static QName _CategoriaOcupacional_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "categoriaOcupacional");
    private final static QName _ConsultAcoountByClientWS_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "consultAcoountByClientWS");
    private final static QName _Client_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "client");
    private final static QName _UpdateStatusAccountWSResponse_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "updateStatusAccountWSResponse");
    private final static QName _Account_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "account");
    private final static QName _ConsultAcoountByClientWSResponse_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "consultAcoountByClientWSResponse");
    private final static QName _FindAllAccountAndClientWSResponse_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "findAllAccountAndClientWSResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cbp1.ws.cbp.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAllAccountAndClientWS }
     * 
     */
    public FindAllAccountAndClientWS createFindAllAccountAndClientWS() {
        return new FindAllAccountAndClientWS();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link CreateAccountWS }
     * 
     */
    public CreateAccountWS createCreateAccountWS() {
        return new CreateAccountWS();
    }

    /**
     * Create an instance of {@link CreateAccountWSResponse }
     * 
     */
    public CreateAccountWSResponse createCreateAccountWSResponse() {
        return new CreateAccountWSResponse();
    }

    /**
     * Create an instance of {@link UpdateStatusAccountWS }
     * 
     */
    public UpdateStatusAccountWS createUpdateStatusAccountWS() {
        return new UpdateStatusAccountWS();
    }

    /**
     * Create an instance of {@link UsersFp }
     * 
     */
    public UsersFp createUsersFp() {
        return new UsersFp();
    }

    /**
     * Create an instance of {@link Office }
     * 
     */
    public Office createOffice() {
        return new Office();
    }

    /**
     * Create an instance of {@link EntityBank }
     * 
     */
    public EntityBank createEntityBank() {
        return new EntityBank();
    }

    /**
     * Create an instance of {@link Catalogue }
     * 
     */
    public Catalogue createCatalogue() {
        return new Catalogue();
    }

    /**
     * Create an instance of {@link Pais }
     * 
     */
    public Pais createPais() {
        return new Pais();
    }

    /**
     * Create an instance of {@link ConsultAcoountByClientWSResponse }
     * 
     */
    public ConsultAcoountByClientWSResponse createConsultAcoountByClientWSResponse() {
        return new ConsultAcoountByClientWSResponse();
    }

    /**
     * Create an instance of {@link FindAllAccountAndClientWSResponse }
     * 
     */
    public FindAllAccountAndClientWSResponse createFindAllAccountAndClientWSResponse() {
        return new FindAllAccountAndClientWSResponse();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link UpdateStatusAccountWSResponse }
     * 
     */
    public UpdateStatusAccountWSResponse createUpdateStatusAccountWSResponse() {
        return new UpdateStatusAccountWSResponse();
    }

    /**
     * Create an instance of {@link ConsultAcoountByClientWS }
     * 
     */
    public ConsultAcoountByClientWS createConsultAcoountByClientWS() {
        return new ConsultAcoountByClientWS();
    }

    /**
     * Create an instance of {@link CategoriaOcupacional }
     * 
     */
    public CategoriaOcupacional createCategoriaOcupacional() {
        return new CategoriaOcupacional();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link RespuestaDTO }
     * 
     */
    public RespuestaDTO createRespuestaDTO() {
        return new RespuestaDTO();
    }

    /**
     * Create an instance of {@link ErroresDTO }
     * 
     */
    public ErroresDTO createErroresDTO() {
        return new ErroresDTO();
    }

    /**
     * Create an instance of {@link ClientDTO }
     * 
     */
    public ClientDTO createClientDTO() {
        return new ClientDTO();
    }

    /**
     * Create an instance of {@link BdsUtil }
     * 
     */
    public BdsUtil createBdsUtil() {
        return new BdsUtil();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Office }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "office")
    public JAXBElement<Office> createOffice(Office value) {
        return new JAXBElement<Office>(_Office_QNAME, Office.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsersFp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "usersFp")
    public JAXBElement<UsersFp> createUsersFp(UsersFp value) {
        return new JAXBElement<UsersFp>(_UsersFp_QNAME, UsersFp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "createAccountWS")
    public JAXBElement<CreateAccountWS> createCreateAccountWS(CreateAccountWS value) {
        return new JAXBElement<CreateAccountWS>(_CreateAccountWS_QNAME, CreateAccountWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "createAccountWSResponse")
    public JAXBElement<CreateAccountWSResponse> createCreateAccountWSResponse(CreateAccountWSResponse value) {
        return new JAXBElement<CreateAccountWSResponse>(_CreateAccountWSResponse_QNAME, CreateAccountWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusAccountWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "updateStatusAccountWS")
    public JAXBElement<UpdateStatusAccountWS> createUpdateStatusAccountWS(UpdateStatusAccountWS value) {
        return new JAXBElement<UpdateStatusAccountWS>(_UpdateStatusAccountWS_QNAME, UpdateStatusAccountWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "pais")
    public JAXBElement<Pais> createPais(Pais value) {
        return new JAXBElement<Pais>(_Pais_QNAME, Pais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Catalogue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "catalogue")
    public JAXBElement<Catalogue> createCatalogue(Catalogue value) {
        return new JAXBElement<Catalogue>(_Catalogue_QNAME, Catalogue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityBank }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "entityBank")
    public JAXBElement<EntityBank> createEntityBank(EntityBank value) {
        return new JAXBElement<EntityBank>(_EntityBank_QNAME, EntityBank.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllAccountAndClientWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "findAllAccountAndClientWS")
    public JAXBElement<FindAllAccountAndClientWS> createFindAllAccountAndClientWS(FindAllAccountAndClientWS value) {
        return new JAXBElement<FindAllAccountAndClientWS>(_FindAllAccountAndClientWS_QNAME, FindAllAccountAndClientWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriaOcupacional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "categoriaOcupacional")
    public JAXBElement<CategoriaOcupacional> createCategoriaOcupacional(CategoriaOcupacional value) {
        return new JAXBElement<CategoriaOcupacional>(_CategoriaOcupacional_QNAME, CategoriaOcupacional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultAcoountByClientWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "consultAcoountByClientWS")
    public JAXBElement<ConsultAcoountByClientWS> createConsultAcoountByClientWS(ConsultAcoountByClientWS value) {
        return new JAXBElement<ConsultAcoountByClientWS>(_ConsultAcoountByClientWS_QNAME, ConsultAcoountByClientWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Client }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "client")
    public JAXBElement<Client> createClient(Client value) {
        return new JAXBElement<Client>(_Client_QNAME, Client.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusAccountWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "updateStatusAccountWSResponse")
    public JAXBElement<UpdateStatusAccountWSResponse> createUpdateStatusAccountWSResponse(UpdateStatusAccountWSResponse value) {
        return new JAXBElement<UpdateStatusAccountWSResponse>(_UpdateStatusAccountWSResponse_QNAME, UpdateStatusAccountWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultAcoountByClientWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "consultAcoountByClientWSResponse")
    public JAXBElement<ConsultAcoountByClientWSResponse> createConsultAcoountByClientWSResponse(ConsultAcoountByClientWSResponse value) {
        return new JAXBElement<ConsultAcoountByClientWSResponse>(_ConsultAcoountByClientWSResponse_QNAME, ConsultAcoountByClientWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllAccountAndClientWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp1.com/", name = "findAllAccountAndClientWSResponse")
    public JAXBElement<FindAllAccountAndClientWSResponse> createFindAllAccountAndClientWSResponse(FindAllAccountAndClientWSResponse value) {
        return new JAXBElement<FindAllAccountAndClientWSResponse>(_FindAllAccountAndClientWSResponse_QNAME, FindAllAccountAndClientWSResponse.class, null, value);
    }

}
