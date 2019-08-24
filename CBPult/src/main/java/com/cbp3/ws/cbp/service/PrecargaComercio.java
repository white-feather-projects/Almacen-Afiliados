
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para precargaComercio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="precargaComercio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="emailContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCargaDatos" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="geolocalizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idCanton" type="{http://service.cbp.ws.cbp3.com/}canton" minOccurs="0"/>
 *         &lt;element name="idDistrito" type="{http://service.cbp.ws.cbp3.com/}distrito" minOccurs="0"/>
 *         &lt;element name="idProvincia" type="{http://service.cbp.ws.cbp3.com/}provincia" minOccurs="0"/>
 *         &lt;element name="identificacionComercio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacionContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreEmpresarial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="puntoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusComercio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoIdentifContactoId" type="{http://service.cbp.ws.cbp3.com/}tipoidentificacion" minOccurs="0"/>
 *         &lt;element name="tipoIdentificacionId" type="{http://service.cbp.ws.cbp3.com/}tipoidentificacion" minOccurs="0"/>
 *         &lt;element name="urbanizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "precargaComercio", propOrder = {
    "ciudad",
    "codigoUsuarioModifica",
    "emailContacto",
    "fechaCargaDatos",
    "fechaHoraModificacion",
    "geolocalizacion",
    "id",
    "idCanton",
    "idDistrito",
    "idProvincia",
    "identificacionComercio",
    "identificacionContacto",
    "nombreEmpresarial",
    "primerApellido",
    "primerNombre",
    "puntoReferencia",
    "segundoApellido",
    "segundoNombre",
    "statusComercio",
    "telefonoCelular",
    "telefonoLocal",
    "tipoIdentifContactoId",
    "tipoIdentificacionId",
    "urbanizacion"
})
public class PrecargaComercio {

    protected String ciudad;
    protected Long codigoUsuarioModifica;
    protected String emailContacto;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCargaDatos;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    protected String geolocalizacion;
    protected Long id;
    protected Canton idCanton;
    protected Distrito idDistrito;
    protected Provincia idProvincia;
    protected String identificacionComercio;
    protected String identificacionContacto;
    protected String nombreEmpresarial;
    protected String primerApellido;
    protected String primerNombre;
    protected String puntoReferencia;
    protected String segundoApellido;
    protected String segundoNombre;
    protected String statusComercio;
    protected String telefonoCelular;
    protected String telefonoLocal;
    protected Tipoidentificacion tipoIdentifContactoId;
    protected Tipoidentificacion tipoIdentificacionId;
    protected String urbanizacion;

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
     * Obtiene el valor de la propiedad codigoUsuarioModifica.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoUsuarioModifica() {
        return codigoUsuarioModifica;
    }

    /**
     * Define el valor de la propiedad codigoUsuarioModifica.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoUsuarioModifica(Long value) {
        this.codigoUsuarioModifica = value;
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

    /**
     * Obtiene el valor de la propiedad fechaHoraModificacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraModificacion() {
        return fechaHoraModificacion;
    }

    /**
     * Define el valor de la propiedad fechaHoraModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraModificacion(XMLGregorianCalendar value) {
        this.fechaHoraModificacion = value;
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
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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

}
