
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para createPurchaseOrderRequestWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createPurchaseOrderRequestWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descriptionOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codeUserLouder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeUserAproved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHoraCarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{http://service.cbp.ws.cbp2.com/}product" minOccurs="0"/>
 *         &lt;element name="idCanal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "createPurchaseOrderRequestWS", propOrder = {
    "descriptionOrder",
    "quantity",
    "codeUserLouder",
    "codeUserAproved",
    "statusOrder",
    "fechaHoraCarga",
    "product",
    "idCanal",
    "nombreCanal"
})
public class CreatePurchaseOrderRequestWS {

    protected String descriptionOrder;
    protected long quantity;
    protected String codeUserLouder;
    protected String codeUserAproved;
    protected String statusOrder;
    protected String fechaHoraCarga;
    protected Product product;
    protected String idCanal;
    protected String nombreCanal;

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

    /**
     * Obtiene el valor de la propiedad fechaHoraCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHoraCarga() {
        return fechaHoraCarga;
    }

    /**
     * Define el valor de la propiedad fechaHoraCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHoraCarga(String value) {
        this.fechaHoraCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad product.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Define el valor de la propiedad product.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Obtiene el valor de la propiedad idCanal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCanal() {
        return idCanal;
    }

    /**
     * Define el valor de la propiedad idCanal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCanal(String value) {
        this.idCanal = value;
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
