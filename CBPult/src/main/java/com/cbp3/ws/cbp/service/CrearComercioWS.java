
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearComercioWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearComercioWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionComercio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreEmpresarial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoComercioActivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCuentaAsociado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="afiliadoOtroBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoIdentificacionId" type="{http://service.cbp.ws.cbp3.com/}tipoidentificacion" minOccurs="0"/>
 *         &lt;element name="actividadComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCanal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreCanal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearComercioWS", propOrder = {
    "identificacionComercio",
    "nombreEmpresarial",
    "nombreComercial",
    "email",
    "telefonoContacto",
    "estadoComercioActivo",
    "telefonoLocal",
    "numCuentaAsociado",
    "afiliadoOtroBanco",
    "tipoIdentificacionId",
    "actividadComercial",
    "horaInicio",
    "horaFin",
    "idCanal",
    "nombreCanal"
})
public class CrearComercioWS {

    protected String identificacionComercio;
    protected String nombreEmpresarial;
    protected String nombreComercial;
    protected String email;
    protected String telefonoContacto;
    protected String estadoComercioActivo;
    protected String telefonoLocal;
    protected String numCuentaAsociado;
    protected String afiliadoOtroBanco;
    protected Tipoidentificacion tipoIdentificacionId;
    protected String actividadComercial;
    protected String horaInicio;
    protected String horaFin;
    protected String idCanal;
    protected String nombreCanal;

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
     * Obtiene el valor de la propiedad nombreComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComercial() {
        return nombreComercial;
    }

    /**
     * Define el valor de la propiedad nombreComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComercial(String value) {
        this.nombreComercial = value;
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
     * Obtiene el valor de la propiedad telefonoContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    /**
     * Define el valor de la propiedad telefonoContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoContacto(String value) {
        this.telefonoContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoComercioActivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoComercioActivo() {
        return estadoComercioActivo;
    }

    /**
     * Define el valor de la propiedad estadoComercioActivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoComercioActivo(String value) {
        this.estadoComercioActivo = value;
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
     * Obtiene el valor de la propiedad numCuentaAsociado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCuentaAsociado() {
        return numCuentaAsociado;
    }

    /**
     * Define el valor de la propiedad numCuentaAsociado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCuentaAsociado(String value) {
        this.numCuentaAsociado = value;
    }

    /**
     * Obtiene el valor de la propiedad afiliadoOtroBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfiliadoOtroBanco() {
        return afiliadoOtroBanco;
    }

    /**
     * Define el valor de la propiedad afiliadoOtroBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfiliadoOtroBanco(String value) {
        this.afiliadoOtroBanco = value;
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
     * Obtiene el valor de la propiedad idCanal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCanal() {
        return idCanal;
    }

    /**
     * Define el valor de la propiedad idCanal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCanal(String value) {
        this.idCanal = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCanal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCanal() {
        return nombreCanal;
    }

    /**
     * Define el valor de la propiedad nombreCanal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCanal(String value) {
        this.nombreCanal = value;
    }

}
