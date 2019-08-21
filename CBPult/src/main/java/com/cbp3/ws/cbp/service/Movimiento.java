
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para movimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="movimiento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="almacen" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="comentarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encargadoMovimiento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fechaCargaDatos" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaMovimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idOrder" type="{http://service.cbp.ws.cbp3.com/}purchaseOrder" minOccurs="0"/>
 *         &lt;element name="idWarehouse" type="{http://service.cbp.ws.cbp3.com/}warehouse" minOccurs="0"/>
 *         &lt;element name="movimientoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tipoMovimiento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tipoMovimientoId" type="{http://service.cbp.ws.cbp3.com/}tipoMovimiento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movimiento", propOrder = {
    "almacen",
    "codigoUsuarioModifica",
    "comentarios",
    "encargadoMovimiento",
    "fechaCargaDatos",
    "fechaHoraModificacion",
    "fechaMovimiento",
    "idOrder",
    "idWarehouse",
    "movimientoId",
    "tipoMovimiento",
    "tipoMovimientoId"
})
public class Movimiento {

    protected long almacen;
    protected Long codigoUsuarioModifica;
    protected String comentarios;
    protected long encargadoMovimiento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCargaDatos;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaMovimiento;
    protected PurchaseOrder idOrder;
    protected Warehouse idWarehouse;
    protected Long movimientoId;
    protected long tipoMovimiento;
    protected TipoMovimiento tipoMovimientoId;

    /**
     * Obtiene el valor de la propiedad almacen.
     * 
     */
    public long getAlmacen() {
        return almacen;
    }

    /**
     * Define el valor de la propiedad almacen.
     * 
     */
    public void setAlmacen(long value) {
        this.almacen = value;
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
     * Obtiene el valor de la propiedad comentarios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Define el valor de la propiedad comentarios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarios(String value) {
        this.comentarios = value;
    }

    /**
     * Obtiene el valor de la propiedad encargadoMovimiento.
     * 
     */
    public long getEncargadoMovimiento() {
        return encargadoMovimiento;
    }

    /**
     * Define el valor de la propiedad encargadoMovimiento.
     * 
     */
    public void setEncargadoMovimiento(long value) {
        this.encargadoMovimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCargaDatos.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCargaDatos() {
        return fechaCargaDatos;
    }

    /**
     * Define el valor de la propiedad fechaCargaDatos.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCargaDatos(XMLGregorianCalendar value) {
        this.fechaCargaDatos = value;
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
     * Obtiene el valor de la propiedad fechaMovimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaMovimiento() {
        return fechaMovimiento;
    }

    /**
     * Define el valor de la propiedad fechaMovimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaMovimiento(XMLGregorianCalendar value) {
        this.fechaMovimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad idOrder.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrder }
     *     
     */
    public PurchaseOrder getIdOrder() {
        return idOrder;
    }

    /**
     * Define el valor de la propiedad idOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrder }
     *     
     */
    public void setIdOrder(PurchaseOrder value) {
        this.idOrder = value;
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
     * Obtiene el valor de la propiedad movimientoId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMovimientoId() {
        return movimientoId;
    }

    /**
     * Define el valor de la propiedad movimientoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMovimientoId(Long value) {
        this.movimientoId = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMovimiento.
     * 
     */
    public long getTipoMovimiento() {
        return tipoMovimiento;
    }

    /**
     * Define el valor de la propiedad tipoMovimiento.
     * 
     */
    public void setTipoMovimiento(long value) {
        this.tipoMovimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMovimientoId.
     * 
     * @return
     *     possible object is
     *     {@link TipoMovimiento }
     *     
     */
    public TipoMovimiento getTipoMovimientoId() {
        return tipoMovimientoId;
    }

    /**
     * Define el valor de la propiedad tipoMovimientoId.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMovimiento }
     *     
     */
    public void setTipoMovimientoId(TipoMovimiento value) {
        this.tipoMovimientoId = value;
    }

}
