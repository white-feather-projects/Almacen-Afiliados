
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para bancoAfiliacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bancoAfiliacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bancoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="comercioId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fechaCargaDatos" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idEntityBank" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numAfiliacionBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numTerminalesComprar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bancoAfiliacion", propOrder = {
    "bancoId",
    "codigoUsuarioModifica",
    "comercioId",
    "fechaCargaDatos",
    "fechaHoraModificacion",
    "idEntityBank",
    "numAfiliacionBanco",
    "numTerminalesComprar"
})
public class BancoAfiliacion {

    protected Long bancoId;
    protected Long codigoUsuarioModifica;
    protected long comercioId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCargaDatos;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    protected long idEntityBank;
    protected String numAfiliacionBanco;
    protected long numTerminalesComprar;

    /**
     * Obtiene el valor de la propiedad bancoId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBancoId() {
        return bancoId;
    }

    /**
     * Define el valor de la propiedad bancoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBancoId(Long value) {
        this.bancoId = value;
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
     */
    public long getComercioId() {
        return comercioId;
    }

    /**
     * Define el valor de la propiedad comercioId.
     * 
     */
    public void setComercioId(long value) {
        this.comercioId = value;
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
     * Obtiene el valor de la propiedad idEntityBank.
     * 
     */
    public long getIdEntityBank() {
        return idEntityBank;
    }

    /**
     * Define el valor de la propiedad idEntityBank.
     * 
     */
    public void setIdEntityBank(long value) {
        this.idEntityBank = value;
    }

    /**
     * Obtiene el valor de la propiedad numAfiliacionBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAfiliacionBanco() {
        return numAfiliacionBanco;
    }

    /**
     * Define el valor de la propiedad numAfiliacionBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAfiliacionBanco(String value) {
        this.numAfiliacionBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad numTerminalesComprar.
     * 
     */
    public long getNumTerminalesComprar() {
        return numTerminalesComprar;
    }

    /**
     * Define el valor de la propiedad numTerminalesComprar.
     * 
     */
    public void setNumTerminalesComprar(long value) {
        this.numTerminalesComprar = value;
    }

}
