
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para generatePurchaseOrderWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="generatePurchaseOrderWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderCommetns" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeUserLoader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeUserAproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseOrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseOrderAprovedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://service.cbp.ws.cbp2.com/}product" minOccurs="0"/>
 *         &lt;element name="orderRequestId" type="{http://service.cbp.ws.cbp2.com/}purchaseOrderRequest" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "generatePurchaseOrderWS", propOrder = {
    "orderDescription",
    "orderCommetns",
    "idProvider",
    "codeUserLoader",
    "codeUserAproved",
    "orderType",
    "orderStatus",
    "purchaseOrderDate",
    "purchaseOrderAprovedDate",
    "productId",
    "orderRequestId",
    "quantity",
    "nombreCanal"
})
public class GeneratePurchaseOrderWS {

    protected String orderDescription;
    protected String orderCommetns;
    protected String idProvider;
    protected String codeUserLoader;
    protected String codeUserAproved;
    protected String orderType;
    protected String orderStatus;
    protected String purchaseOrderDate;
    protected String purchaseOrderAprovedDate;
    protected Product productId;
    protected PurchaseOrderRequest orderRequestId;
    protected String quantity;
    protected String nombreCanal;

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
     * Obtiene el valor de la propiedad orderCommetns.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderCommetns() {
        return orderCommetns;
    }

    /**
     * Define el valor de la propiedad orderCommetns.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderCommetns(String value) {
        this.orderCommetns = value;
    }

    /**
     * Obtiene el valor de la propiedad idProvider.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProvider() {
        return idProvider;
    }

    /**
     * Define el valor de la propiedad idProvider.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProvider(String value) {
        this.idProvider = value;
    }

    /**
     * Obtiene el valor de la propiedad codeUserLoader.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeUserLoader() {
        return codeUserLoader;
    }

    /**
     * Define el valor de la propiedad codeUserLoader.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeUserLoader(String value) {
        this.codeUserLoader = value;
    }

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
     * Obtiene el valor de la propiedad orderType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Define el valor de la propiedad orderType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Obtiene el valor de la propiedad orderStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Define el valor de la propiedad orderStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseOrderDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderDate() {
        return purchaseOrderDate;
    }

    /**
     * Define el valor de la propiedad purchaseOrderDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderDate(String value) {
        this.purchaseOrderDate = value;
    }

    /**
     * Obtiene el valor de la propiedad purchaseOrderAprovedDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderAprovedDate() {
        return purchaseOrderAprovedDate;
    }

    /**
     * Define el valor de la propiedad purchaseOrderAprovedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderAprovedDate(String value) {
        this.purchaseOrderAprovedDate = value;
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
     * Obtiene el valor de la propiedad orderRequestId.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderRequest }
     *     
     */
    public PurchaseOrderRequest getOrderRequestId() {
        return orderRequestId;
    }

    /**
     * Define el valor de la propiedad orderRequestId.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderRequest }
     *     
     */
    public void setOrderRequestId(PurchaseOrderRequest value) {
        this.orderRequestId = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
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
