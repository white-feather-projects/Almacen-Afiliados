
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para crearPrecargaComercioWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearPrecargaComercioWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoIdentificacionId" type="{http://service.cbp.ws.cbp3.com/}tipoidentificacion" minOccurs="0"/>
 *         &lt;element name="identificacionComercio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusComercio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreEmpresarial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urbanizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geolocalizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="puntoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idProvincia" type="{http://service.cbp.ws.cbp3.com/}provincia" minOccurs="0"/>
 *         &lt;element name="idCanton" type="{http://service.cbp.ws.cbp3.com/}canton" minOccurs="0"/>
 *         &lt;element name="idDistrito" type="{http://service.cbp.ws.cbp3.com/}distrito" minOccurs="0"/>
 *         &lt;element name="tipoIdentifContactoId" type="{http://service.cbp.ws.cbp3.com/}tipoidentificacion" minOccurs="0"/>
 *         &lt;element name="identificacionContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCargaDatos" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearPrecargaComercioWS", propOrder = {
    "tipoIdentificacionId",
    "identificacionComercio",
    "statusComercio",
    "nombreEmpresarial",
    "ciudad",
    "urbanizacion",
    "geolocalizacion",
    "puntoReferencia",
    "idProvincia",
    "idCanton",
    "idDistrito",
    "tipoIdentifContactoId",
    "identificacionContacto",
    "primerNombre",
    "segundoNombre",
    "primerApellido",
    "segundoApellido",
    "telefonoLocal",
    "telefonoCelular",
    "emailContacto",
    "fechaCargaDatos"
})
public class CrearPrecargaComercioWS {

    protected Tipoidentificacion tipoIdentificacionId;
    protected String identificacionComercio;
    protected String statusComercio;
    protected String nombreEmpresarial;
    protected String ciudad;
    protected String urbanizacion;
    protected String geolocalizacion;
    protected String puntoReferencia;
    protected Provincia idProvincia;
    protected Canton idCanton;
    protected Distrito idDistrito;
    protected Tipoidentificacion tipoIdentifContactoId;
    protected String identificacionContacto;
    protected String primerNombre;
    protected String segundoNombre;
    protected String primerApellido;
    protected String segundoApellido;
    protected String telefonoLocal;
    protected String telefonoCelular;
    protected String emailContacto;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCargaDatos;

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionId.
     * 
     * @return
     *     possible object is
     *     {@link Tipoidentificacion }
     *     
     */
    public Tipoidentificacion getTipoIdentificacionId() {
        return tipoIdentificacionId;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Tipoidentificacion }
     *     
     */
    public void setTipoIdentificacionId(Tipoidentificacion value) {
        this.tipoIdentificacionId = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionComercio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionComercio() {
        return identificacionComercio;
    }

    /**
     * Define el valor de la propiedad identificacionComercio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionComercio(String value) {
        this.identificacionComercio = value;
    }

    /**
     * Obtiene el valor de la propiedad statusComercio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusComercio() {
        return statusComercio;
    }

    /**
     * Define el valor de la propiedad statusComercio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusComercio(String value) {
        this.statusComercio = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEmpresarial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmpresarial() {
        return nombreEmpresarial;
    }

    /**
     * Define el valor de la propiedad nombreEmpresarial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmpresarial(String value) {
        this.nombreEmpresarial = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad urbanizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrbanizacion() {
        return urbanizacion;
    }

    /**
     * Define el valor de la propiedad urbanizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrbanizacion(String value) {
        this.urbanizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad geolocalizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeolocalizacion() {
        return geolocalizacion;
    }

    /**
     * Define el valor de la propiedad geolocalizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeolocalizacion(String value) {
        this.geolocalizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad puntoReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPuntoReferencia() {
        return puntoReferencia;
    }

    /**
     * Define el valor de la propiedad puntoReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPuntoReferencia(String value) {
        this.puntoReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad idProvincia.
     * 
     * @return
     *     possible object is
     *     {@link Provincia }
     *     
     */
    public Provincia getIdProvincia() {
        return idProvincia;
    }

    /**
     * Define el valor de la propiedad idProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link Provincia }
     *     
     */
    public void setIdProvincia(Provincia value) {
        this.idProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad idCanton.
     * 
     * @return
     *     possible object is
     *     {@link Canton }
     *     
     */
    public Canton getIdCanton() {
        return idCanton;
    }

    /**
     * Define el valor de la propiedad idCanton.
     * 
     * @param value
     *     allowed object is
     *     {@link Canton }
     *     
     */
    public void setIdCanton(Canton value) {
        this.idCanton = value;
    }

    /**
     * Obtiene el valor de la propiedad idDistrito.
     * 
     * @return
     *     possible object is
     *     {@link Distrito }
     *     
     */
    public Distrito getIdDistrito() {
        return idDistrito;
    }

    /**
     * Define el valor de la propiedad idDistrito.
     * 
     * @param value
     *     allowed object is
     *     {@link Distrito }
     *     
     */
    public void setIdDistrito(Distrito value) {
        this.idDistrito = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentifContactoId.
     * 
     * @return
     *     possible object is
     *     {@link Tipoidentificacion }
     *     
     */
    public Tipoidentificacion getTipoIdentifContactoId() {
        return tipoIdentifContactoId;
    }

    /**
     * Define el valor de la propiedad tipoIdentifContactoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Tipoidentificacion }
     *     
     */
    public void setTipoIdentifContactoId(Tipoidentificacion value) {
        this.tipoIdentifContactoId = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionContacto() {
        return identificacionContacto;
    }

    /**
     * Define el valor de la propiedad identificacionContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionContacto(String value) {
        this.identificacionContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad primerNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Define el valor de la propiedad primerNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombre(String value) {
        this.primerNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Define el valor de la propiedad segundoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombre(String value) {
        this.segundoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Define el valor de la propiedad segundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellido(String value) {
        this.segundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoLocal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoLocal() {
        return telefonoLocal;
    }

    /**
     * Define el valor de la propiedad telefonoLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoLocal(String value) {
        this.telefonoLocal = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoCelular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    /**
     * Define el valor de la propiedad telefonoCelular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoCelular(String value) {
        this.telefonoCelular = value;
    }

    /**
     * Obtiene el valor de la propiedad emailContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailContacto() {
        return emailContacto;
    }

    /**
     * Define el valor de la propiedad emailContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailContacto(String value) {
        this.emailContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCargaDatos.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCargaDatos() {
        return fechaCargaDatos;
    }

    /**
     * Define el valor de la propiedad fechaCargaDatos.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCargaDatos(XMLGregorianCalendar value) {
        this.fechaCargaDatos = value;
    }

}
