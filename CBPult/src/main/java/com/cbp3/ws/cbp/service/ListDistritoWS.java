
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listDistritoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listDistritoWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canton" type="{http://service.cbp.ws.cbp3.com/}canton" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listDistritoWS", propOrder = {
    "canton"
})
public class ListDistritoWS {

    protected Canton canton;

    /**
     * Obtiene el valor de la propiedad canton.
     * 
     * @return
     *     possible object is
     *     {@link Canton }
     *     
     */
    public Canton getCanton() {
        return canton;
    }

    /**
     * Define el valor de la propiedad canton.
     * 
     * @param value
     *     allowed object is
     *     {@link Canton }
     *     
     */
    public void setCanton(Canton value) {
        this.canton = value;
    }

}
