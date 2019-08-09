
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para recaudo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="recaudo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comercioId" type="{http://service.cbp.ws.cbp3.com/}comercio" minOccurs="0"/>
 *         &lt;element name="fechaCarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idComercioConsulta" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idTipoRecaudo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="recaudoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="recaudoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recaudoVerificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoRecaudoId" type="{http://service.cbp.ws.cbp3.com/}tipoRecaudo" minOccurs="0"/>
 *         &lt;element name="ubicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recaudo", propOrder = {
    "comercioId",
    "fechaCarga",
    "fechaVigencia",
    "idComercioConsulta",
    "idTipoRecaudo",
    "recaudoId",
    "recaudoNombre",
    "recaudoVerificado",
    "tipoRecaudoId",
    "ubicacion"
})
public class Recaudo {

    protected Comercio comercioId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCarga;
    protected String fechaVigencia;
    protected long idComercioConsulta;
    protected long idTipoRecaudo;
    protected Long recaudoId;
    protected String recaudoNombre;
    protected String recaudoVerificado;
    protected TipoRecaudo tipoRecaudoId;
    protected String ubicacion;

    /**
     * Obtiene el valor de la propiedad comercioId.
     * 
     * @return
     *     possible object is
     *     {@link Comercio }
     *     
     */
    public Comercio getComercioId() {
        return comercioId;
    }

    /**
     * Define el valor de la propiedad comercioId.
     * 
     * @param value
     *     allowed object is
     *     {@link Comercio }
     *     
     */
    public void setComercioId(Comercio value) {
        this.comercioId = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCarga.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCarga() {
        return fechaCarga;
    }

    /**
     * Define el valor de la propiedad fechaCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCarga(XMLGregorianCalendar value) {
        this.fechaCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVigencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVigencia() {
        return fechaVigencia;
    }

    /**
     * Define el valor de la propiedad fechaVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVigencia(String value) {
        this.fechaVigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad idComercioConsulta.
     * 
     */
    public long getIdComercioConsulta() {
        return idComercioConsulta;
    }

    /**
     * Define el valor de la propiedad idComercioConsulta.
     * 
     */
    public void setIdComercioConsulta(long value) {
        this.idComercioConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoRecaudo.
     * 
     */
    public long getIdTipoRecaudo() {
        return idTipoRecaudo;
    }

    /**
     * Define el valor de la propiedad idTipoRecaudo.
     * 
     */
    public void setIdTipoRecaudo(long value) {
        this.idTipoRecaudo = value;
    }

    /**
     * Obtiene el valor de la propiedad recaudoId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecaudoId() {
        return recaudoId;
    }

    /**
     * Define el valor de la propiedad recaudoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecaudoId(Long value) {
        this.recaudoId = value;
    }

    /**
     * Obtiene el valor de la propiedad recaudoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecaudoNombre() {
        return recaudoNombre;
    }

    /**
     * Define el valor de la propiedad recaudoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecaudoNombre(String value) {
        this.recaudoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad recaudoVerificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecaudoVerificado() {
        return recaudoVerificado;
    }

    /**
     * Define el valor de la propiedad recaudoVerificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecaudoVerificado(String value) {
        this.recaudoVerificado = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRecaudoId.
     * 
     * @return
     *     possible object is
     *     {@link TipoRecaudo }
     *     
     */
    public TipoRecaudo getTipoRecaudoId() {
        return tipoRecaudoId;
    }

    /**
     * Define el valor de la propiedad tipoRecaudoId.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRecaudo }
     *     
     */
    public void setTipoRecaudoId(TipoRecaudo value) {
        this.tipoRecaudoId = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacion(String value) {
        this.ubicacion = value;
    }

}
