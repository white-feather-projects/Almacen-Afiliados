
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

    private final static QName _CrearComercioWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "crearComercioWS");
    private final static QName _Tipoidentificacion_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "tipoidentificacion");
    private final static QName _Comercio_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "comercio");
    private final static QName _CrearComercioWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "crearComercioWSResponse");
    private final static QName _ConsultaComercioPorIdentificacionComercioWS_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "consultaComercioPorIdentificacionComercioWS");
    private final static QName _ConsultaComercioPorIdentificacionComercioWSResponse_QNAME = new QName("http://service.cbp.ws.cbp3.com/", "consultaComercioPorIdentificacionComercioWSResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cbp3.ws.cbp.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearComercioWS }
     * 
     */
    public CrearComercioWS createCrearComercioWS() {
        return new CrearComercioWS();
    }

    /**
     * Create an instance of {@link Tipoidentificacion }
     * 
     */
    public Tipoidentificacion createTipoidentificacion() {
        return new Tipoidentificacion();
    }

    /**
     * Create an instance of {@link Comercio }
     * 
     */
    public Comercio createComercio() {
        return new Comercio();
    }

    /**
     * Create an instance of {@link ConsultaComercioPorIdentificacionComercioWS }
     * 
     */
    public ConsultaComercioPorIdentificacionComercioWS createConsultaComercioPorIdentificacionComercioWS() {
        return new ConsultaComercioPorIdentificacionComercioWS();
    }

    /**
     * Create an instance of {@link CrearComercioWSResponse }
     * 
     */
    public CrearComercioWSResponse createCrearComercioWSResponse() {
        return new CrearComercioWSResponse();
    }

    /**
     * Create an instance of {@link ConsultaComercioPorIdentificacionComercioWSResponse }
     * 
     */
    public ConsultaComercioPorIdentificacionComercioWSResponse createConsultaComercioPorIdentificacionComercioWSResponse() {
        return new ConsultaComercioPorIdentificacionComercioWSResponse();
    }

    /**
     * Create an instance of {@link ErroresDTO }
     * 
     */
    public ErroresDTO createErroresDTO() {
        return new ErroresDTO();
    }

    /**
     * Create an instance of {@link BdsUtil }
     * 
     */
    public BdsUtil createBdsUtil() {
        return new BdsUtil();
    }

    /**
     * Create an instance of {@link RespuestaDTO }
     * 
     */
    public RespuestaDTO createRespuestaDTO() {
        return new RespuestaDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearComercioWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "crearComercioWS")
    public JAXBElement<CrearComercioWS> createCrearComercioWS(CrearComercioWS value) {
        return new JAXBElement<CrearComercioWS>(_CrearComercioWS_QNAME, CrearComercioWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tipoidentificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "tipoidentificacion")
    public JAXBElement<Tipoidentificacion> createTipoidentificacion(Tipoidentificacion value) {
        return new JAXBElement<Tipoidentificacion>(_Tipoidentificacion_QNAME, Tipoidentificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Comercio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "comercio")
    public JAXBElement<Comercio> createComercio(Comercio value) {
        return new JAXBElement<Comercio>(_Comercio_QNAME, Comercio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearComercioWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "crearComercioWSResponse")
    public JAXBElement<CrearComercioWSResponse> createCrearComercioWSResponse(CrearComercioWSResponse value) {
        return new JAXBElement<CrearComercioWSResponse>(_CrearComercioWSResponse_QNAME, CrearComercioWSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaComercioPorIdentificacionComercioWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "consultaComercioPorIdentificacionComercioWS")
    public JAXBElement<ConsultaComercioPorIdentificacionComercioWS> createConsultaComercioPorIdentificacionComercioWS(ConsultaComercioPorIdentificacionComercioWS value) {
        return new JAXBElement<ConsultaComercioPorIdentificacionComercioWS>(_ConsultaComercioPorIdentificacionComercioWS_QNAME, ConsultaComercioPorIdentificacionComercioWS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaComercioPorIdentificacionComercioWSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cbp.ws.cbp3.com/", name = "consultaComercioPorIdentificacionComercioWSResponse")
    public JAXBElement<ConsultaComercioPorIdentificacionComercioWSResponse> createConsultaComercioPorIdentificacionComercioWSResponse(ConsultaComercioPorIdentificacionComercioWSResponse value) {
        return new JAXBElement<ConsultaComercioPorIdentificacionComercioWSResponse>(_ConsultaComercioPorIdentificacionComercioWSResponse_QNAME, ConsultaComercioPorIdentificacionComercioWSResponse.class, null, value);
    }

}
