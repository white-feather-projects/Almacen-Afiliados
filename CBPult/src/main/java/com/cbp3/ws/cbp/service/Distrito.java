
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para distrito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="distrito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantonId" type="{http://service.cbp.ws.cbp3.com/}canton" minOccurs="0"/>
 *         &lt;element name="idDistrito" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nombreDistrito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distrito", propOrder = {
    "cantonId",
    "idDistrito",
    "nombreDistrito"
})
public class Distrito {

    protected Canton cantonId;
    protected Long idDistrito;
    protected String nombreDistrito;

    /**
     * Obtiene el valor de la propiedad cantonId.
     * 
     * @return
     *     possible object is
     *     {@link Canton }
     *     
     */
    public Canton getCantonId() {
        return cantonId;
    }

    /**
     * Define el valor de la propiedad cantonId.
     * 
     * @param value
     *     allowed object is
     *     {@link Canton }
     *     
     */
    public void setCantonId(Canton value) {
        this.cantonId = value;
    }

    /**
     * Obtiene el valor de la propiedad idDistrito.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdDistrito() {
        return idDistrito;
    }

    /**
     * Define el valor de la propiedad idDistrito.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdDistrito(Long value) {
        this.idDistrito = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDistrito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDistrito() {
        return nombreDistrito;
    }

    /**
     * Define el valor de la propiedad nombreDistrito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDistrito(String value) {
        this.nombreDistrito = value;
    }

}
