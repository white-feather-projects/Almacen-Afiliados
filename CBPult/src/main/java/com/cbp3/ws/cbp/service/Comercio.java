
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para comercio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="comercio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actividadComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="afiliadoOtroBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUsuarioCarga" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="comercioId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCargaDatos" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horarioComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacionComercio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreEmpresarial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCuentaAsociado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusComercio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoAlternativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoContacto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "comercio", propOrder = {
    "actividadComercial",
    "afiliadoOtroBanco",
    "codigoUsuarioCarga",
    "codigoUsuarioModifica",
    "comercioId",
    "email",
    "fechaCargaDatos",
    "fechaHoraModificacion",
    "horarioComercial",
    "identificacionComercio",
    "nombreComercial",
    "nombreEmpresarial",
    "numCuentaAsociado",
    "statusComercio",
    "telefonoAlternativo",
    "telefonoContacto",
    "telefonoLocal",
    "tipoIdentificacionId"
})
public class Comercio {

    protected String actividadComercial;
    protected String afiliadoOtroBanco;
    protected Long codigoUsuarioCarga;
    protected Long codigoUsuarioModifica;
    protected Long comercioId;
    protected String email;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCargaDatos;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    protected String horarioComercial;
    protected String identificacionComercio;
    protected String nombreComercial;
    protected String nombreEmpresarial;
    protected String numCuentaAsociado;
    protected String statusComercio;
    protected String telefonoAlternativo;
    protected String telefonoContacto;
    protected String telefonoLocal;
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
     * Obtiene el valor de la propiedad codigoUsuarioCarga.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoUsuarioCarga() {
        return codigoUsuarioCarga;
    }

    /**
     * Define el valor de la propiedad codigoUsuarioCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoUsuarioCarga(Long value) {
        this.codigoUsuarioCarga = value;
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
     * Obtiene el valor de la propiedad comercioId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComercioId() {
        return comercioId;
    }

    /**
     * Define el valor de la propiedad comercioId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComercioId(Long value) {
        this.comercioId = value;
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
     * Obtiene el valor de la propiedad horarioComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorarioComercial() {
        return horarioComercial;
    }

    /**
     * Define el valor de la propiedad horarioComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorarioComercial(String value) {
        this.horarioComercial = value;
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
