
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearPagoComercioWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearPagoComercioWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numComprobanteRecibo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pagoStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comercioId" type="{http://service.cbp.ws.cbp3.com/}comercio" minOccurs="0"/>
 *         &lt;element name="entityBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearPagoComercioWS", propOrder = {
    "modoPago",
    "numComprobanteRecibo",
    "pagoStatus",
    "comercioId",
    "entityBankName"
})
public class CrearPagoComercioWS {

    protected String modoPago;
    protected String numComprobanteRecibo;
    protected String pagoStatus;
    protected Comercio comercioId;
    protected String entityBankName;

    /**
     * Obtiene el valor de la propiedad modoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModoPago() {
        return modoPago;
    }

    /**
     * Define el valor de la propiedad modoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModoPago(String value) {
        this.modoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad numComprobanteRecibo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumComprobanteRecibo() {
        return numComprobanteRecibo;
    }

    /**
     * Define el valor de la propiedad numComprobanteRecibo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumComprobanteRecibo(String value) {
        this.numComprobanteRecibo = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagoStatus() {
        return pagoStatus;
    }

    /**
     * Define el valor de la propiedad pagoStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagoStatus(String value) {
        this.pagoStatus = value;
    }

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
     * Obtiene el valor de la propiedad entityBankName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityBankName() {
        return entityBankName;
    }

    /**
     * Define el valor de la propiedad entityBankName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityBankName(String value) {
        this.entityBankName = value;
    }

}
