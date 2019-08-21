
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
 *         &lt;element name="tipoAlmacenId" type="{http://service.cbp.ws.cbp3.com/}tipoAlmacen" minOccurs="0"/>
 *         &lt;element name="warehouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "tipoAlmacenId",
    "warehouseName"
})
public class AlmacenDTO {

    protected String direccion;
    protected long gerenteSucursal;
    protected long officeId;
    protected TipoAlmacen tipoAlmacenId;
    protected String warehouseName;

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
     * Obtiene el valor de la propiedad tipoAlmacenId.
     * 
     * @return
     *     possible object is
     *     {@link TipoAlmacen }
     *     
     */
    public TipoAlmacen getTipoAlmacenId() {
        return tipoAlmacenId;
    }

    /**
     * Define el valor de la propiedad tipoAlmacenId.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAlmacen }
     *     
     */
    public void setTipoAlmacenId(TipoAlmacen value) {
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

}
