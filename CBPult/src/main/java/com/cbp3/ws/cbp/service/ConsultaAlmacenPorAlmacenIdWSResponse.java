
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaAlmacenPorAlmacenIdWSResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaAlmacenPorAlmacenIdWSResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.cbp.ws.cbp3.com/}warehouse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaAlmacenPorAlmacenIdWSResponse", propOrder = {
    "_return"
})
public class ConsultaAlmacenPorAlmacenIdWSResponse {

    @XmlElement(name = "return")
    protected Warehouse _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link Warehouse }
     *     
     */
    public Warehouse getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link Warehouse }
     *     
     */
    public void setReturn(Warehouse value) {
        this._return = value;
    }

}