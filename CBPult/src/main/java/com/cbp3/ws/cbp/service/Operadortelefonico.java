
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para operadortelefonico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="operadortelefonico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="codOperadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operadortelfId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="operadortelfNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operadortelefonico", propOrder = {
    "active",
    "codOperadora",
    "operadortelfId",
    "operadortelfNombre"
})
public class Operadortelefonico {

    @XmlSchemaType(name = "unsignedShort")
    protected Integer active;
    protected String codOperadora;
    protected Long operadortelfId;
    protected String operadortelfNombre;

    /**
     * Obtiene el valor de la propiedad active.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActive() {
        return active;
    }

    /**
     * Define el valor de la propiedad active.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActive(Integer value) {
        this.active = value;
    }

    /**
     * Obtiene el valor de la propiedad codOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOperadora() {
        return codOperadora;
    }

    /**
     * Define el valor de la propiedad codOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOperadora(String value) {
        this.codOperadora = value;
    }

    /**
     * Obtiene el valor de la propiedad operadortelfId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperadortelfId() {
        return operadortelfId;
    }

    /**
     * Define el valor de la propiedad operadortelfId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperadortelfId(Long value) {
        this.operadortelfId = value;
    }

    /**
     * Obtiene el valor de la propiedad operadortelfNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperadortelfNombre() {
        return operadortelfNombre;
    }

    /**
     * Define el valor de la propiedad operadortelfNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperadortelfNombre(String value) {
        this.operadortelfNombre = value;
    }

}
