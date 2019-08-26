
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para productoUbicacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productoUbicacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estanteriaId" type="{http://service.cbp.ws.cbp3.com/}estanteria" minOccurs="0"/>
 *         &lt;element name="idProduct" type="{http://service.cbp.ws.cbp3.com/}product" minOccurs="0"/>
 *         &lt;element name="idWarehouse" type="{http://service.cbp.ws.cbp3.com/}warehouse" minOccurs="0"/>
 *         &lt;element name="productoUbicacionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="zonaId" type="{http://service.cbp.ws.cbp3.com/}zona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productoUbicacion", propOrder = {
    "comentario",
    "estanteriaId",
    "idProduct",
    "idWarehouse",
    "productoUbicacionId",
    "zonaId"
})
public class ProductoUbicacion {

    protected String comentario;
    protected Estanteria estanteriaId;
    protected Product idProduct;
    protected Warehouse idWarehouse;
    protected Long productoUbicacionId;
    protected Zona zonaId;

    /**
     * Obtiene el valor de la propiedad comentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Define el valor de la propiedad comentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentario(String value) {
        this.comentario = value;
    }

    /**
     * Obtiene el valor de la propiedad estanteriaId.
     * 
     * @return
     *     possible object is
     *     {@link Estanteria }
     *     
     */
    public Estanteria getEstanteriaId() {
        return estanteriaId;
    }

    /**
     * Define el valor de la propiedad estanteriaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Estanteria }
     *     
     */
    public void setEstanteriaId(Estanteria value) {
        this.estanteriaId = value;
    }

    /**
     * Obtiene el valor de la propiedad idProduct.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getIdProduct() {
        return idProduct;
    }

    /**
     * Define el valor de la propiedad idProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setIdProduct(Product value) {
        this.idProduct = value;
    }

    /**
     * Obtiene el valor de la propiedad idWarehouse.
     * 
     * @return
     *     possible object is
     *     {@link Warehouse }
     *     
     */
    public Warehouse getIdWarehouse() {
        return idWarehouse;
    }

    /**
     * Define el valor de la propiedad idWarehouse.
     * 
     * @param value
     *     allowed object is
     *     {@link Warehouse }
     *     
     */
    public void setIdWarehouse(Warehouse value) {
        this.idWarehouse = value;
    }

    /**
     * Obtiene el valor de la propiedad productoUbicacionId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductoUbicacionId() {
        return productoUbicacionId;
    }

    /**
     * Define el valor de la propiedad productoUbicacionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductoUbicacionId(Long value) {
        this.productoUbicacionId = value;
    }

    /**
     * Obtiene el valor de la propiedad zonaId.
     * 
     * @return
     *     possible object is
     *     {@link Zona }
     *     
     */
    public Zona getZonaId() {
        return zonaId;
    }

    /**
     * Define el valor de la propiedad zonaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Zona }
     *     
     */
    public void setZonaId(Zona value) {
        this.zonaId = value;
    }

}
