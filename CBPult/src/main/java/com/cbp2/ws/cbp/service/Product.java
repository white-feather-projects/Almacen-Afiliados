
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para product complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="catalogueId" type="{http://service.cbp.ws.cbp2.com/}catalogue" minOccurs="0"/>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fechaHoraCarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idProduct" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="productActive" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="productLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warehouseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = {
    "catalogue",
    "catalogueId",
    "codigoUsuarioModifica",
    "fechaHoraCarga",
    "fechaHoraModificacion",
    "idProduct",
    "productActive",
    "productLogo",
    "productName",
    "warehouseId"
})
public class Product {

    protected long catalogue;
    protected Catalogue catalogueId;
    protected Long codigoUsuarioModifica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraCarga;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    protected Long idProduct;
    protected Long productActive;
    protected String productLogo;
    protected String productName;
    protected Long warehouseId;

    /**
     * Obtiene el valor de la propiedad catalogue.
     * 
     */
    public long getCatalogue() {
        return catalogue;
    }

    /**
     * Define el valor de la propiedad catalogue.
     * 
     */
    public void setCatalogue(long value) {
        this.catalogue = value;
    }

    /**
     * Obtiene el valor de la propiedad catalogueId.
     * 
     * @return
     *     possible object is
     *     {@link Catalogue }
     *     
     */
    public Catalogue getCatalogueId() {
        return catalogueId;
    }

    /**
     * Define el valor de la propiedad catalogueId.
     * 
     * @param value
     *     allowed object is
     *     {@link Catalogue }
     *     
     */
    public void setCatalogueId(Catalogue value) {
        this.catalogueId = value;
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
     * Obtiene el valor de la propiedad idProduct.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdProduct() {
        return idProduct;
    }

    /**
     * Define el valor de la propiedad idProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdProduct(Long value) {
        this.idProduct = value;
    }

    /**
     * Obtiene el valor de la propiedad productActive.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductActive() {
        return productActive;
    }

    /**
     * Define el valor de la propiedad productActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductActive(Long value) {
        this.productActive = value;
    }

    /**
     * Obtiene el valor de la propiedad productLogo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLogo() {
        return productLogo;
    }

    /**
     * Define el valor de la propiedad productLogo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLogo(String value) {
        this.productLogo = value;
    }

    /**
     * Obtiene el valor de la propiedad productName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Define el valor de la propiedad productName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Obtiene el valor de la propiedad warehouseId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWarehouseId() {
        return warehouseId;
    }

    /**
     * Define el valor de la propiedad warehouseId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWarehouseId(Long value) {
        this.warehouseId = value;
    }

}
