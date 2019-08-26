
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaTerceroPorTerceroIdWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaTerceroPorTerceroIdWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terceroId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaTerceroPorTerceroIdWS", propOrder = {
    "terceroId"
})
public class ConsultaTerceroPorTerceroIdWS {

    protected long terceroId;

    /**
     * Obtiene el valor de la propiedad terceroId.
     * 
     */
    public long getTerceroId() {
        return terceroId;
    }

    /**
     * Define el valor de la propiedad terceroId.
     * 
     */
    public void setTerceroId(long value) {
        this.terceroId = value;
    }

}
