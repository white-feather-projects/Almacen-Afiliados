
package com.cbp3.ws.cbp.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cbp3.ws.cbp.service package. 
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

    private final static QName _CodigoPostalWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "codigoPostalWSResponse");
    private final static QName _ListCantonWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "listCantonWSResponse");
    private final static QName _ListProvinciasWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "listProvinciasWS");
    private final static QName _Canton_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "canton");
    private final static QName _ListPaisWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "listPaisWSResponse");
    private final static QName _CodigoPostalWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "codigoPostalWS");
    private final static QName _ListDistritoWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "listDistritoWSResponse");
    private final static QName _ListDistritoWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "listDistritoWS");
    private final static QName _ListProvinciasWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "listProvinciasWSResponse");
    private final static QName _Distrito_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "distrito");
    private final static QName _ListPaisWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "listPaisWS");
    private final static QName _CodigoPostal_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "codigoPostal");
    private final static QName _ListCantonWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "listCantonWS");
    private final static QName _Pais_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "pais");
    private final static QName _Provincia_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "provincia");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cbp3.ws.cbp.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Distrito }
     * 
     */
    public Distrito createDistrito() {
        return new Distrito();
    }

    /**
     * Create an instance of {@link ListProvinciasWSResponse }
     * 
     */
    public ListProvinciasWSResponse createListProvinciasWSResponse() {
        return new ListProvinciasWSResponse();
    }

    /**
     * Create an instance of {@link ListDistritoWS }
     * 
     */
    public ListDistritoWS createListDistritoWS() {
        return new ListDistritoWS();
    }

    /**
     * Create an instance of {@link CodigoPostal }
     * 
     */
    public CodigoPostal createCodigoPostal() {
        return new CodigoPostal();
    }

    /**
     * Create an instance of {@link ListPaisWS }
     * 
     */
    public ListPaisWS createListPaisWS() {
        return new ListPaisWS();
    }

    /**
     * Create an instance of {@link ListCantonWS }
     * 
     */
    public ListCantonWS createListCantonWS() {
        return new ListCantonWS();
    }

    /**
     * Create an instance of {@link Provincia }
     * 
     */
    public Provincia createProvincia() {
        return new Provincia();
    }

    /**
     * Create an instance of {@link Pais }
     * 
     */
    public Pais createPais() {
        return new Pais();
    }

    /**
     * Create an instance of {@link ListProvinciasWS }
     * 
     */
    public ListProvinciasWS createListProvinciasWS() {
        return new ListProvinciasWS();
    }

    /**
     * Create an instance of {@link CodigoPostalWSResponse }
     * 
     */
    public CodigoPostalWSResponse createCodigoPostalWSResponse() {
        return new CodigoPostalWSResponse();
    }

    /**
     * Create an instance of {@link ListCantonWSResponse }
     * 
     */
    public ListCantonWSResponse createListCantonWSResponse() {
        return new ListCantonWSResponse();
    }

    /**
     * Create an instance of {@link ListPaisWSResponse }
     * 
     */
    public ListPaisWSResponse createListPaisWSResponse() {
        return new ListPaisWSResponse();
    }

    /**
     * Create an instance of {@link Canton }
     * 
     */
    public Canton createCanton() {
        return new Canton();
    }

    /**
     * Create an instance of {@link ListDistritoWSResponse }
     * 
     */
    public ListDistritoWSResponse createListDistritoWSResponse() {
        return new ListDistritoWSResponse();
    }

    /**
     * Create an instance of {@link CodigoPostalWS }
     * 
     */
    public CodigoPostalWS createCodigoPostalWS() {
        return new CodigoPostalWS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoPostalWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "codigoPostalWSResponse")
    public JAXBElement<CodigoPostalWSResponse> createCodigoPostalWSResponse(CodigoPostalWSResponse value) {
        return new JAXBElement<CodigoPostalWSResponse>(_CodigoPostalWSResponse_QNAME, CodigoPostalWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCantonWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "listCantonWSResponse")
    public JAXBElement<ListCantonWSResponse> createListCantonWSResponse(ListCantonWSResponse value) {
        return new JAXBElement<ListCantonWSResponse>(_ListCantonWSResponse_QNAME, ListCantonWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProvinciasWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "listProvinciasWS")
    public JAXBElement<ListProvinciasWS> createListProvinciasWS(ListProvinciasWS value) {
        return new JAXBElement<ListProvinciasWS>(_ListProvinciasWS_QNAME, ListProvinciasWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Canton }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "canton")
    public JAXBElement<Canton> createCanton(Canton value) {
        return new JAXBElement<Canton>(_Canton_QNAME, Canton.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPaisWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "listPaisWSResponse")
    public JAXBElement<ListPaisWSResponse> createListPaisWSResponse(ListPaisWSResponse value) {
        return new JAXBElement<ListPaisWSResponse>(_ListPaisWSResponse_QNAME, ListPaisWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoPostalWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "codigoPostalWS")
    public JAXBElement<CodigoPostalWS> createCodigoPostalWS(CodigoPostalWS value) {
        return new JAXBElement<CodigoPostalWS>(_CodigoPostalWS_QNAME, CodigoPostalWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDistritoWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "listDistritoWSResponse")
    public JAXBElement<ListDistritoWSResponse> createListDistritoWSResponse(ListDistritoWSResponse value) {
        return new JAXBElement<ListDistritoWSResponse>(_ListDistritoWSResponse_QNAME, ListDistritoWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDistritoWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "listDistritoWS")
    public JAXBElement<ListDistritoWS> createListDistritoWS(ListDistritoWS value) {
        return new JAXBElement<ListDistritoWS>(_ListDistritoWS_QNAME, ListDistritoWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProvinciasWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "listProvinciasWSResponse")
    public JAXBElement<ListProvinciasWSResponse> createListProvinciasWSResponse(ListProvinciasWSResponse value) {
        return new JAXBElement<ListProvinciasWSResponse>(_ListProvinciasWSResponse_QNAME, ListProvinciasWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Distrito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "distrito")
    public JAXBElement<Distrito> createDistrito(Distrito value) {
        return new JAXBElement<Distrito>(_Distrito_QNAME, Distrito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPaisWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "listPaisWS")
    public JAXBElement<ListPaisWS> createListPaisWS(ListPaisWS value) {
        return new JAXBElement<ListPaisWS>(_ListPaisWS_QNAME, ListPaisWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoPostal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "codigoPostal")
    public JAXBElement<CodigoPostal> createCodigoPostal(CodigoPostal value) {
        return new JAXBElement<CodigoPostal>(_CodigoPostal_QNAME, CodigoPostal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCantonWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "listCantonWS")
    public JAXBElement<ListCantonWS> createListCantonWS(ListCantonWS value) {
        return new JAXBElement<ListCantonWS>(_ListCantonWS_QNAME, ListCantonWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "pais")
    public JAXBElement<Pais> createPais(Pais value) {
        return new JAXBElement<Pais>(_Pais_QNAME, Pais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Provincia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "provincia")
    public JAXBElement<Provincia> createProvincia(Provincia value) {
        return new JAXBElement<Provincia>(_Provincia_QNAME, Provincia.class, null, value);
    }

}
