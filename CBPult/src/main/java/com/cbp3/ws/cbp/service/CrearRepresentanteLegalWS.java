
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearRepresentanteLegalWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearRepresentanteLegalWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoIdentificacionId" type="{http://service.cbp.ws.cbp3.com/}tipoidentificacion" minOccurs="0"/>
 *         &lt;element name="identificacionRepresentante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailRepresentante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusRepresentante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearRepresentanteLegalWS", propOrder = {
    "tipoIdentificacionId",
    "identificacionRepresentante",
    "primerNombre",
    "segundoNombre",
    "primerApellido",
    "segundoApellido",
    "telefonoLocal",
    "telefonoCelular",
    "emailRepresentante",
    "statusRepresentante"
})
public class CrearRepresentanteLegalWS {

    protected Tipoidentificacion tipoIdentificacionId;
    protected String identificacionRepresentante;
    protected String primerNombre;
    protected String segundoNombre;
    protected String primerApellido;
    protected String segundoApellido;
    protected String telefonoLocal;
    protected String telefonoCelular;
    protected String emailRepresentante;
    protected String statusRepresentante;

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
     * Obtiene el valor de la propiedad identificacionRepresentante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionRepresentante() {
        return identificacionRepresentante;
    }

    /**
     * Define el valor de la propiedad identificacionRepresentante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionRepresentante(String value) {
        this.identificacionRepresentante = value;
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
     * Obtiene el valor de la propiedad emailRepresentante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailRepresentante() {
        return emailRepresentante;
    }

    /**
     * Define el valor de la propiedad emailRepresentante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailRepresentante(String value) {
        this.emailRepresentante = value;
    }

    /**
     * Obtiene el valor de la propiedad statusRepresentante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusRepresentante() {
        return statusRepresentante;
    }

    /**
     * Define el valor de la propiedad statusRepresentante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusRepresentante(String value) {
        this.statusRepresentante = value;
    }

}
