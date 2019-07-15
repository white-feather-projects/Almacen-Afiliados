
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultAllClientByIdClientWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultAllClientByIdClientWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idClient" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultAllClientByIdClientWS", propOrder = {
    "idClient"
})
public class ConsultAllClientByIdClientWS {

    protected long idClient;

    /**
     * Obtiene el valor de la propiedad idClient.
     * 
     */
    public long getIdClient() {
        return idClient;
    }

    /**
     * Define el valor de la propiedad idClient.
     * 
     */
    public void setIdClient(long value) {
        this.idClient = value;
    }

}
