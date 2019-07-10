
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para codigoPostal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="codigoPostal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distritoId" type="{http://service.cbp.ws.cbp1.com/}distrito" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="valueCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codigoPostal", propOrder = {
    "distritoId",
    "id",
    "valueCod"
})
public class CodigoPostal {

    protected Distrito distritoId;
    protected Long id;
    protected String valueCod;

    /**
     * Obtiene el valor de la propiedad distritoId.
     * 
     * @return
     *     possible object is
     *     {@link Distrito }
     *     
     */
    public Distrito getDistritoId() {
        return distritoId;
    }

    /**
     * Define el valor de la propiedad distritoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Distrito }
     *     
     */
    public void setDistritoId(Distrito value) {
        this.distritoId = value;
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
     * Obtiene el valor de la propiedad valueCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueCod() {
        return valueCod;
    }

    /**
     * Define el valor de la propiedad valueCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueCod(String value) {
        this.valueCod = value;
    }

}
