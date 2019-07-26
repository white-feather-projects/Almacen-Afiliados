
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para asociarComercioConContactoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asociarComercioConContactoWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comercioId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="contactoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asociarComercioConContactoWS", propOrder = {
    "comercioId",
    "contactoId"
})
public class AsociarComercioConContactoWS {

    protected long comercioId;
    protected long contactoId;

    /**
     * Obtiene el valor de la propiedad comercioId.
     * 
     */
    public long getComercioId() {
        return comercioId;
    }

    /**
     * Define el valor de la propiedad comercioId.
     * 
     */
    public void setComercioId(long value) {
        this.comercioId = value;
    }

    /**
     * Obtiene el valor de la propiedad contactoId.
     * 
     */
    public long getContactoId() {
        return contactoId;
    }

    /**
     * Define el valor de la propiedad contactoId.
     * 
     */
    public void setContactoId(long value) {
        this.contactoId = value;
    }

}
