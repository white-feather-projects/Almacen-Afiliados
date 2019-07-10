
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listTdcRequestByStatusWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listTdcRequestByStatusWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusTdcRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreCanal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listTdcRequestByStatusWS", propOrder = {
    "statusTdcRequest",
    "nombreCanal"
})
public class ListTdcRequestByStatusWS {

    protected String statusTdcRequest;
    protected String nombreCanal;

    /**
     * Obtiene el valor de la propiedad statusTdcRequest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusTdcRequest() {
        return statusTdcRequest;
    }

    /**
     * Define el valor de la propiedad statusTdcRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusTdcRequest(String value) {
        this.statusTdcRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCanal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCanal() {
        return nombreCanal;
    }

    /**
     * Define el valor de la propiedad nombreCanal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCanal(String value) {
        this.nombreCanal = value;
    }

}
