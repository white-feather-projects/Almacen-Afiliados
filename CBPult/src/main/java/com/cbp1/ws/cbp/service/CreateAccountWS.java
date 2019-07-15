
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para createAccountWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createAccountWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="officeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAccountWS", propOrder = {
    "officeCode",
    "accountType",
    "clientDocumentId"
})
public class CreateAccountWS {

    protected String officeCode;
    protected String accountType;
    protected String clientDocumentId;

    /**
     * Obtiene el valor de la propiedad officeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeCode() {
        return officeCode;
    }

    /**
     * Define el valor de la propiedad officeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeCode(String value) {
        this.officeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad accountType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Define el valor de la propiedad accountType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Obtiene el valor de la propiedad clientDocumentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientDocumentId() {
        return clientDocumentId;
    }

    /**
     * Define el valor de la propiedad clientDocumentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientDocumentId(String value) {
        this.clientDocumentId = value;
    }

}
