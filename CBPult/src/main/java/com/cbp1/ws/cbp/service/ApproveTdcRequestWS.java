
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para approveTdcRequestWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="approveTdcRequestWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tdcRequest" type="{http://service.cbp.ws.cbp1.com/}tdcRequest" minOccurs="0"/>
 *         &lt;element name="statusTdcRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "approveTdcRequestWS", propOrder = {
    "tdcRequest",
    "statusTdcRequest",
    "canal"
})
public class ApproveTdcRequestWS {

    protected TdcRequest tdcRequest;
    protected String statusTdcRequest;
    protected String canal;

    /**
     * Obtiene el valor de la propiedad tdcRequest.
     * 
     * @return
     *     possible object is
     *     {@link TdcRequest }
     *     
     */
    public TdcRequest getTdcRequest() {
        return tdcRequest;
    }

    /**
     * Define el valor de la propiedad tdcRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TdcRequest }
     *     
     */
    public void setTdcRequest(TdcRequest value) {
        this.tdcRequest = value;
    }

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
     * Obtiene el valor de la propiedad canal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanal() {
        return canal;
    }

    /**
     * Define el valor de la propiedad canal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanal(String value) {
        this.canal = value;
    }

}
