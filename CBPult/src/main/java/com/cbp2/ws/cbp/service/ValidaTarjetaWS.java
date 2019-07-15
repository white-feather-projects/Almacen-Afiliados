
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validaTarjetaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validaTarjetaWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="plasticNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validaTarjetaWS", propOrder = {
    "plasticNumber"
})
public class ValidaTarjetaWS {

    protected String plasticNumber;

    /**
     * Obtiene el valor de la propiedad plasticNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlasticNumber() {
        return plasticNumber;
    }

    /**
     * Define el valor de la propiedad plasticNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlasticNumber(String value) {
        this.plasticNumber = value;
    }

}
