
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para purchaseOrderRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="purchaseOrderRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeUserAproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeUserLouder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="descriptionOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHoraCarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idOrderRequest" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://service.cbp.ws.cbp2.com/}product" minOccurs="0"/>
 *         &lt;element name="purchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "purchaseOrderRequest", propOrder = {
    "codeUserAproved",
    "codeUserLouder",
    "codigoUsuarioModifica",
    "descriptionOrder",
    "fechaHoraCarga",
    "fechaHoraModificacion",
    "idOrderRequest",
    "productId",
    "purchaseOrderNumber",
    "quantity",
    "statusOrder"
})
public class PurchaseOrderRequest {

    protected String codeUserAproved;
    protected String codeUserLouder;
    protected Long codigoUsuarioModifica;
    protected String descriptionOrder;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraCarga;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    protected Long idOrderRequest;
    protected Product productId;
    protected String purchaseOrderNumber;
    protected long quantity;
    protected String statusOrder;

    /**
     * Obtiene el valor de la propiedad codeUserAproved.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeUserAproved() {
        return codeUserAproved;
    }

    /**
     * Define el valor de la propiedad codeUserAproved.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeUserAproved(String value) {
        this.codeUserAproved = value;
    }

    /**
     * Obtiene el valor de la propiedad codeUserLouder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeUserLouder() {
        return codeUserLouder;
    }

    /**
     * Define el valor de la propiedad codeUserLouder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeUserLouder(String value) {
        this.codeUserLouder = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUsuarioModifica.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoUsuarioModifica() {
        return codigoUsuarioModifica;
    }

    /**
     * Define el valor de la propiedad codigoUsuarioModifica.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoUsuarioModifica(Long value) {
        this.codigoUsuarioModifica = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionOrder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionOrder() {
        return descriptionOrder;
    }

    /**
     * Define el valor de la propiedad descriptionOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionOrder(String value) {
        this.descriptionOrder = value;
    }

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
     * Obtiene el valor de la propiedad fechaHoraModificacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraModificacion() {
        return fechaHoraModificacion;
    }

    /**
     * Define el valor de la propiedad fechaHoraModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraModificacion(XMLGregorianCalendar value) {
        this.fechaHoraModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idOrderRequest.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdOrderRequest() {
        return idOrderRequest;
    }

    /**
     * Define el valor de la propiedad idOrderRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdOrderRequest(Long value) {
        this.idOrderRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProductId(Product value) {
        this.productId = value;
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
     * Obtiene el valor de la propiedad quantity.
     * 
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     */
    public void setQuantity(long value) {
        this.quantity = value;
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
