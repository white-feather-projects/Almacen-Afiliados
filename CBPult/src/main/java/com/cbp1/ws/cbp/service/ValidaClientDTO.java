
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validaClientDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validaClientDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="client" type="{http://service.cbp.ws.cbp1.com/}client" minOccurs="0"/>
 *         &lt;element name="existeClient" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validaClientDTO", propOrder = {
    "client",
    "existeClient"
})
public class ValidaClientDTO {

    protected Client client;
    protected long existeClient;

    /**
     * Obtiene el valor de la propiedad client.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Define el valor de la propiedad client.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Obtiene el valor de la propiedad existeClient.
     * 
     */
    public long getExisteClient() {
        return existeClient;
    }

    /**
     * Define el valor de la propiedad existeClient.
     * 
     */
    public void setExisteClient(long value) {
        this.existeClient = value;
    }

}
