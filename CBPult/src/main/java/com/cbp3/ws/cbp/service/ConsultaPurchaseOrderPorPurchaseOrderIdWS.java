
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaPurchaseOrderPorPurchaseOrderIdWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaPurchaseOrderPorPurchaseOrderIdWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idOrder" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaPurchaseOrderPorPurchaseOrderIdWS", propOrder = {
    "idOrder"
})
public class ConsultaPurchaseOrderPorPurchaseOrderIdWS {

    protected long idOrder;

    /**
     * Obtiene el valor de la propiedad idOrder.
     * 
     */
    public long getIdOrder() {
        return idOrder;
    }

    /**
     * Define el valor de la propiedad idOrder.
     * 
     */
    public void setIdOrder(long value) {
        this.idOrder = value;
    }

}
