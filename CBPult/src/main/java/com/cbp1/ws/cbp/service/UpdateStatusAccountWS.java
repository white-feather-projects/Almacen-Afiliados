
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para updateStatusAccountWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateStatusAccountWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentClientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commentsStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStatusAccountWS", propOrder = {
    "documentClientId",
    "statusAccount",
    "commentsStatus"
})
public class UpdateStatusAccountWS {

    protected String documentClientId;
    protected String statusAccount;
    protected String commentsStatus;

    /**
     * Obtiene el valor de la propiedad documentClientId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentClientId() {
        return documentClientId;
    }

    /**
     * Define el valor de la propiedad documentClientId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentClientId(String value) {
        this.documentClientId = value;
    }

    /**
     * Obtiene el valor de la propiedad statusAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusAccount() {
        return statusAccount;
    }

    /**
     * Define el valor de la propiedad statusAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusAccount(String value) {
        this.statusAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad commentsStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentsStatus() {
        return commentsStatus;
    }

    /**
     * Define el valor de la propiedad commentsStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentsStatus(String value) {
        this.commentsStatus = value;
    }

}
