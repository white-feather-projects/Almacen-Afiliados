
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para almacenDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="almacenDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gerenteSucursal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="officeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tipoAlmacenId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="warehouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warehouseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "almacenDTO", propOrder = {
    "direccion",
    "gerenteSucursal",
    "officeId",
    "productId",
    "tipoAlmacenId",
    "warehouseName",
    "warehouseNumber"
})
public class AlmacenDTO {

    protected String direccion;
    protected long gerenteSucursal;
    protected long officeId;
    protected long productId;
    protected long tipoAlmacenId;
    protected String warehouseName;
    protected String warehouseNumber;

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad gerenteSucursal.
     * 
     */
    public long getGerenteSucursal() {
        return gerenteSucursal;
    }

    /**
     * Define el valor de la propiedad gerenteSucursal.
     * 
     */
    public void setGerenteSucursal(long value) {
        this.gerenteSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad officeId.
     * 
     */
    public long getOfficeId() {
        return officeId;
    }

    /**
     * Define el valor de la propiedad officeId.
     * 
     */
    public void setOfficeId(long value) {
        this.officeId = value;
    }

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoAlmacenId.
     * 
     */
    public long getTipoAlmacenId() {
        return tipoAlmacenId;
    }

    /**
     * Define el valor de la propiedad tipoAlmacenId.
     * 
     */
    public void setTipoAlmacenId(long value) {
        this.tipoAlmacenId = value;
    }

    /**
     * Obtiene el valor de la propiedad warehouseName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseName() {
        return warehouseName;
    }

    /**
     * Define el valor de la propiedad warehouseName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseName(String value) {
        this.warehouseName = value;
    }

    /**
     * Obtiene el valor de la propiedad warehouseNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseNumber() {
        return warehouseNumber;
    }

    /**
     * Define el valor de la propiedad warehouseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseNumber(String value) {
        this.warehouseNumber = value;
    }

}
