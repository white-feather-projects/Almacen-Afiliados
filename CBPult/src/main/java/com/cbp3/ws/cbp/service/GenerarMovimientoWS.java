
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para generarMovimientoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="generarMovimientoWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaMovimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="encargadoMovimiento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idWarehouse" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tipoMovimientoId" type="{http://service.cbp.ws.cbp3.com/}tipoMovimiento" minOccurs="0"/>
 *         &lt;element name="comentarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idOrder" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="zona" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="zonaActualId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="zonaDestinoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="comercioDespachar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terceroId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cantidadDetalle" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="descripcionDetalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idProductDetalle" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generarMovimientoWS", propOrder = {
    "fechaMovimiento",
    "encargadoMovimiento",
    "idWarehouse",
    "tipoMovimientoId",
    "comentarios",
    "idOrder",
    "zona",
    "zonaActualId",
    "zonaDestinoId",
    "comercioDespachar",
    "terceroId",
    "cantidadDetalle",
    "descripcionDetalle",
    "idProductDetalle"
})
public class GenerarMovimientoWS {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaMovimiento;
    protected long encargadoMovimiento;
    protected long idWarehouse;
    protected TipoMovimiento tipoMovimientoId;
    protected String comentarios;
    protected long idOrder;
    protected long zona;
    protected long zonaActualId;
    protected long zonaDestinoId;
    protected String comercioDespachar;
    protected long terceroId;
    protected long cantidadDetalle;
    protected String descripcionDetalle;
    protected long idProductDetalle;

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
     * Obtiene el valor de la propiedad idWarehouse.
     * 
     */
    public long getIdWarehouse() {
        return idWarehouse;
    }

    /**
     * Define el valor de la propiedad idWarehouse.
     * 
     */
    public void setIdWarehouse(long value) {
        this.idWarehouse = value;
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
     * Obtiene el valor de la propiedad zona.
     * 
     */
    public long getZona() {
        return zona;
    }

    /**
     * Define el valor de la propiedad zona.
     * 
     */
    public void setZona(long value) {
        this.zona = value;
    }

    /**
     * Obtiene el valor de la propiedad zonaActualId.
     * 
     */
    public long getZonaActualId() {
        return zonaActualId;
    }

    /**
     * Define el valor de la propiedad zonaActualId.
     * 
     */
    public void setZonaActualId(long value) {
        this.zonaActualId = value;
    }

    /**
     * Obtiene el valor de la propiedad zonaDestinoId.
     * 
     */
    public long getZonaDestinoId() {
        return zonaDestinoId;
    }

    /**
     * Define el valor de la propiedad zonaDestinoId.
     * 
     */
    public void setZonaDestinoId(long value) {
        this.zonaDestinoId = value;
    }

    /**
     * Obtiene el valor de la propiedad comercioDespachar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComercioDespachar() {
        return comercioDespachar;
    }

    /**
     * Define el valor de la propiedad comercioDespachar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComercioDespachar(String value) {
        this.comercioDespachar = value;
    }

    /**
     * Obtiene el valor de la propiedad terceroId.
     * 
     */
    public long getTerceroId() {
        return terceroId;
    }

    /**
     * Define el valor de la propiedad terceroId.
     * 
     */
    public void setTerceroId(long value) {
        this.terceroId = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadDetalle.
     * 
     */
    public long getCantidadDetalle() {
        return cantidadDetalle;
    }

    /**
     * Define el valor de la propiedad cantidadDetalle.
     * 
     */
    public void setCantidadDetalle(long value) {
        this.cantidadDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionDetalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionDetalle() {
        return descripcionDetalle;
    }

    /**
     * Define el valor de la propiedad descripcionDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionDetalle(String value) {
        this.descripcionDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad idProductDetalle.
     * 
     */
    public long getIdProductDetalle() {
        return idProductDetalle;
    }

    /**
     * Define el valor de la propiedad idProductDetalle.
     * 
     */
    public void setIdProductDetalle(long value) {
        this.idProductDetalle = value;
    }

}
