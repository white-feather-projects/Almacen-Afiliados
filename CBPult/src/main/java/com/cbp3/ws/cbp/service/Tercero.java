
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tercero complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tercero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actividadComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacionTercero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoAlternativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terceroId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tipoIdentificacionId" type="{http://service.cbp.ws.cbp3.com/}tipoidentificacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tercero", propOrder = {
    "actividadComercial",
    "direccion",
    "email",
    "horaFin",
    "horaInicio",
    "identificacionTercero",
    "nombre",
    "telefonoAlternativo",
    "telefonoLocal",
    "terceroId",
    "tipoIdentificacionId"
})
public class Tercero {

    protected String actividadComercial;
    protected String direccion;
    protected String email;
    protected String horaFin;
    protected String horaInicio;
    protected String identificacionTercero;
    protected String nombre;
    protected String telefonoAlternativo;
    protected String telefonoLocal;
    protected Long terceroId;
    protected Tipoidentificacion tipoIdentificacionId;

    /**
     * Obtiene el valor de la propiedad actividadComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActividadComercial() {
        return actividadComercial;
    }

    /**
     * Define el valor de la propiedad actividadComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActividadComercial(String value) {
        this.actividadComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad horaFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraFin() {
        return horaFin;
    }

    /**
     * Define el valor de la propiedad horaFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraFin(String value) {
        this.horaFin = value;
    }

    /**
     * Obtiene el valor de la propiedad horaInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * Define el valor de la propiedad horaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraInicio(String value) {
        this.horaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionTercero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionTercero() {
        return identificacionTercero;
    }

    /**
     * Define el valor de la propiedad identificacionTercero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionTercero(String value) {
        this.identificacionTercero = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoAlternativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoAlternativo() {
        return telefonoAlternativo;
    }

    /**
     * Define el valor de la propiedad telefonoAlternativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoAlternativo(String value) {
        this.telefonoAlternativo = value;
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
     * Obtiene el valor de la propiedad terceroId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTerceroId() {
        return terceroId;
    }

    /**
     * Define el valor de la propiedad terceroId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTerceroId(Long value) {
        this.terceroId = value;
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

}
