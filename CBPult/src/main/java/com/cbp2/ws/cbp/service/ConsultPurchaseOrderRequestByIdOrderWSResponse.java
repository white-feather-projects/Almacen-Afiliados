
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultPurchaseOrderRequestByIdOrderWSResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultPurchaseOrderRequestByIdOrderWSResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.cbp.ws.cbp2.com/}purchaseOrderRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultPurchaseOrderRequestByIdOrderWSResponse", propOrder = {
    "_return"
})
public class ConsultPurchaseOrderRequestByIdOrderWSResponse {

    @XmlElement(name = "return")
    protected PurchaseOrderRequest _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderRequest }
     *     
     */
    public PurchaseOrderRequest getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderRequest }
     *     
     */
    public void setReturn(PurchaseOrderRequest value) {
        this._return = value;
    }

}
