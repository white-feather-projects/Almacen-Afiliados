
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listSlotsByEstanteriaIdWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listSlotsByEstanteriaIdWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idEstanteria" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listSlotsByEstanteriaIdWS", propOrder = {
    "idEstanteria"
})
public class ListSlotsByEstanteriaIdWS {

    protected long idEstanteria;

    /**
     * Obtiene el valor de la propiedad idEstanteria.
     * 
     */
    public long getIdEstanteria() {
        return idEstanteria;
    }

    /**
     * Define el valor de la propiedad idEstanteria.
     * 
     */
    public void setIdEstanteria(long value) {
        this.idEstanteria = value;
    }

}
