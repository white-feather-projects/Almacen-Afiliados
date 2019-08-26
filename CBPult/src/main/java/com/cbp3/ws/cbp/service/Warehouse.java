
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para warehouse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="warehouse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHoraCarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="gerenteSucursal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idWarehouse" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="officeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "warehouse", propOrder = {
    "codigoUsuarioModifica",
    "direccion",
    "fechaHoraCarga",
    "fechaHoraModificacion",
    "gerenteSucursal",
    "idWarehouse",
    "officeId",
    "tipoAlmacenId",
    "warehouseName",
    "warehouseNumber"
})
public class Warehouse {

    protected Long codigoUsuarioModifica;
    protected String direccion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraCarga;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    protected long gerenteSucursal;
    protected Long idWarehouse;
    protected long officeId;
    protected long tipoAlmacenId;
    protected String warehouseName;
    protected String warehouseNumber;

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
     * Obtiene el valor de la propiedad idWarehouse.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdWarehouse() {
        return idWarehouse;
    }

    /**
     * Define el valor de la propiedad idWarehouse.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdWarehouse(Long value) {
        this.idWarehouse = value;
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
