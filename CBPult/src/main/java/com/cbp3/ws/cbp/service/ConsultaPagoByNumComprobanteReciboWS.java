
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaPagoByNumComprobanteReciboWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaPagoByNumComprobanteReciboWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numComprobanteRecibo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaPagoByNumComprobanteReciboWS", propOrder = {
    "numComprobanteRecibo"
})
public class ConsultaPagoByNumComprobanteReciboWS {

    protected String numComprobanteRecibo;

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

}
