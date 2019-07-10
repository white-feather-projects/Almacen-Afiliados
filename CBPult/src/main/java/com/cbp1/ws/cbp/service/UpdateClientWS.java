
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para updateClientWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateClientWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientDTO" type="{http://service.cbp.ws.cbp1.com/}newClientDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateClientWS", propOrder = {
    "clientDTO"
})
public class UpdateClientWS {

    protected NewClientDTO clientDTO;

    /**
     * Obtiene el valor de la propiedad clientDTO.
     * 
     * @return
     *     possible object is
     *     {@link NewClientDTO }
     *     
     */
    public NewClientDTO getClientDTO() {
        return clientDTO;
    }

    /**
     * Define el valor de la propiedad clientDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link NewClientDTO }
     *     
     */
    public void setClientDTO(NewClientDTO value) {
        this.clientDTO = value;
    }

}
