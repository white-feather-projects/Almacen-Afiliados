
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modificarOrdenRelacionadaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarOrdenRelacionadaWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ordenRelacionadaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ordenRelacionadaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOrdenId" type="{http://service.cbp.ws.cbp3.com/}tipoOrden" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idProduct" type="{http://service.cbp.ws.cbp3.com/}product" minOccurs="0"/>
 *         &lt;element name="comentarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoGeneracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cantidadMinima" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cantidadMaxima" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="almacenOrigen" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="almacenDestino" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idTercero" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idComercio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarOrdenRelacionadaWS", propOrder = {
    "ordenRelacionadaId",
    "ordenRelacionadaNumber",
    "tipoOrdenId",
    "descripcion",
    "idProduct",
    "comentarios",
    "statusOrden",
    "tipoGeneracion",
    "cantidad",
    "cantidadMinima",
    "cantidadMaxima",
    "almacenOrigen",
    "almacenDestino",
    "idTercero",
    "idComercio"
})
public class ModificarOrdenRelacionadaWS {

    protected long ordenRelacionadaId;
    protected String ordenRelacionadaNumber;
    protected TipoOrden tipoOrdenId;
    protected String descripcion;
    protected Product idProduct;
    protected String comentarios;
    protected String statusOrden;
    protected String tipoGeneracion;
    protected long cantidad;
    protected long cantidadMinima;
    protected long cantidadMaxima;
    protected long almacenOrigen;
    protected long almacenDestino;
    protected long idTercero;
    protected long idComercio;

    /**
     * Obtiene el valor de la propiedad ordenRelacionadaId.
     * 
     */
    public long getOrdenRelacionadaId() {
        return ordenRelacionadaId;
    }

    /**
     * Define el valor de la propiedad ordenRelacionadaId.
     * 
     */
    public void setOrdenRelacionadaId(long value) {
        this.ordenRelacionadaId = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenRelacionadaNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenRelacionadaNumber() {
        return ordenRelacionadaNumber;
    }

    /**
     * Define el valor de la propiedad ordenRelacionadaNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenRelacionadaNumber(String value) {
        this.ordenRelacionadaNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOrdenId.
     * 
     * @return
     *     possible object is
     *     {@link TipoOrden }
     *     
     */
    public TipoOrden getTipoOrdenId() {
        return tipoOrdenId;
    }

    /**
     * Define el valor de la propiedad tipoOrdenId.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOrden }
     *     
     */
    public void setTipoOrdenId(TipoOrden value) {
        this.tipoOrdenId = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
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
     * Obtiene el valor de la propiedad statusOrden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusOrden() {
        return statusOrden;
    }

    /**
     * Define el valor de la propiedad statusOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusOrden(String value) {
        this.statusOrden = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoGeneracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoGeneracion() {
        return tipoGeneracion;
    }

    /**
     * Define el valor de la propiedad tipoGeneracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoGeneracion(String value) {
        this.tipoGeneracion = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public long getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(long value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadMinima.
     * 
     */
    public long getCantidadMinima() {
        return cantidadMinima;
    }

    /**
     * Define el valor de la propiedad cantidadMinima.
     * 
     */
    public void setCantidadMinima(long value) {
        this.cantidadMinima = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadMaxima.
     * 
     */
    public long getCantidadMaxima() {
        return cantidadMaxima;
    }

    /**
     * Define el valor de la propiedad cantidadMaxima.
     * 
     */
    public void setCantidadMaxima(long value) {
        this.cantidadMaxima = value;
    }

    /**
     * Obtiene el valor de la propiedad almacenOrigen.
     * 
     */
    public long getAlmacenOrigen() {
        return almacenOrigen;
    }

    /**
     * Define el valor de la propiedad almacenOrigen.
     * 
     */
    public void setAlmacenOrigen(long value) {
        this.almacenOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad almacenDestino.
     * 
     */
    public long getAlmacenDestino() {
        return almacenDestino;
    }

    /**
     * Define el valor de la propiedad almacenDestino.
     * 
     */
    public void setAlmacenDestino(long value) {
        this.almacenDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad idTercero.
     * 
     */
    public long getIdTercero() {
        return idTercero;
    }

    /**
     * Define el valor de la propiedad idTercero.
     * 
     */
    public void setIdTercero(long value) {
        this.idTercero = value;
    }

    /**
     * Obtiene el valor de la propiedad idComercio.
     * 
     */
    public long getIdComercio() {
        return idComercio;
    }

    /**
     * Define el valor de la propiedad idComercio.
     * 
     */
    public void setIdComercio(long value) {
        this.idComercio = value;
    }

}
