
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validaClientbyDocumentIdWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validaClientbyDocumentIdWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idDocumentClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validaClientbyDocumentIdWS", propOrder = {
    "idDocumentClient"
})
public class ValidaClientbyDocumentIdWS {

    protected String idDocumentClient;

    /**
     * Obtiene el valor de la propiedad idDocumentClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumentClient() {
        return idDocumentClient;
    }

    /**
     * Define el valor de la propiedad idDocumentClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumentClient(String value) {
        this.idDocumentClient = value;
    }

}
