
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para activeOrInactiveOperadoraTelefonicaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="activeOrInactiveOperadoraTelefonicaWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operadortelfId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activeOrInactiveOperadoraTelefonicaWS", propOrder = {
    "operadortelfId",
    "active"
})
public class ActiveOrInactiveOperadoraTelefonicaWS {

    protected long operadortelfId;
    @XmlSchemaType(name = "unsignedShort")
    protected int active;

    /**
     * Obtiene el valor de la propiedad operadortelfId.
     * 
     */
    public long getOperadortelfId() {
        return operadortelfId;
    }

    /**
     * Define el valor de la propiedad operadortelfId.
     * 
     */
    public void setOperadortelfId(long value) {
        this.operadortelfId = value;
    }

    /**
     * Obtiene el valor de la propiedad active.
     * 
     */
    public int getActive() {
        return active;
    }

    /**
     * Define el valor de la propiedad active.
     * 
     */
    public void setActive(int value) {
        this.active = value;
    }

}
