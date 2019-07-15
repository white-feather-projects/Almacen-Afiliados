
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ordersDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ordersDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaHoraCarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idOrder" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idRequest" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="orderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantityRequest" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="quenatityOrder" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="requestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ordersDTO", propOrder = {
    "fechaHoraCarga",
    "idOrder",
    "idRequest",
    "orderDescription",
    "purchaseOrderNumber",
    "quantityRequest",
    "quenatityOrder",
    "requestDescription",
    "statusOrder"
})
public class OrdersDTO {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraCarga;
    protected long idOrder;
    protected long idRequest;
    protected String orderDescription;
    protected String purchaseOrderNumber;
    protected long quantityRequest;
    protected long quenatityOrder;
    protected String requestDescription;
    protected String statusOrder;

    /**
     * Obtiene el valor de la propiedad fechaHoraCarga.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraCarga() {
        return fechaHoraCarga;
    }

    /**
     * Define el valor de la propiedad fechaHoraCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraCarga(XMLGregorianCalendar value) {
        this.fechaHoraCarga = value;
    }

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

    /**
     * Obtiene el valor de la propiedad idRequest.
     * 
     */
    public long getIdRequest() {
        return idRequest;
    }

    /**
     * Define el valor de la propiedad idRequest.
     * 
     */
    public void setIdRequest(long value) {
        this.idRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad orderDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDescription() {
        return orderDescription;
    }

    /**
     * Define el valor de la propiedad orderDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDescription(String value) {
        this.orderDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseOrderNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Define el valor de la propiedad purchaseOrderNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderNumber(String value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad quantityRequest.
     * 
     */
    public long getQuantityRequest() {
        return quantityRequest;
    }

    /**
     * Define el valor de la propiedad quantityRequest.
     * 
     */
    public void setQuantityRequest(long value) {
        this.quantityRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad quenatityOrder.
     * 
     */
    public long getQuenatityOrder() {
        return quenatityOrder;
    }

    /**
     * Define el valor de la propiedad quenatityOrder.
     * 
     */
    public void setQuenatityOrder(long value) {
        this.quenatityOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad requestDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestDescription() {
        return requestDescription;
    }

    /**
     * Define el valor de la propiedad requestDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDescription(String value) {
        this.requestDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad statusOrder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusOrder() {
        return statusOrder;
    }

    /**
     * Define el valor de la propiedad statusOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusOrder(String value) {
        this.statusOrder = value;
    }

}
