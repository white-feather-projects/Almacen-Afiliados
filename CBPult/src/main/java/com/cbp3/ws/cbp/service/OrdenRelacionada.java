
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ordenRelacionada complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ordenRelacionada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cantidadMaxima" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cantidadMinima" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codUsuarioAprueba" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUsuarioCarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="comentarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaAprobacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaCargaDatos" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaOrden" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idProduct" type="{http://service.cbp.ws.cbp3.com/}product" minOccurs="0"/>
 *         &lt;element name="movimientoId" type="{http://service.cbp.ws.cbp3.com/}movimiento" minOccurs="0"/>
 *         &lt;element name="ordenRelacionadaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ordenRelacionadaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoGeneracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOrdenId" type="{http://service.cbp.ws.cbp3.com/}tipoOrden" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ordenRelacionada", propOrder = {
    "cantidad",
    "cantidadMaxima",
    "cantidadMinima",
    "codUsuarioAprueba",
    "codUsuarioCarga",
    "codigoUsuarioModifica",
    "comentarios",
    "descripcion",
    "fechaAprobacion",
    "fechaCargaDatos",
    "fechaHoraModificacion",
    "fechaOrden",
    "idProduct",
    "movimientoId",
    "ordenRelacionadaId",
    "ordenRelacionadaNumber",
    "statusOrden",
    "tipoGeneracion",
    "tipoOrdenId"
})
public class OrdenRelacionada {

    protected long cantidad;
    protected Long cantidadMaxima;
    protected Long cantidadMinima;
    protected String codUsuarioAprueba;
    protected String codUsuarioCarga;
    protected Long codigoUsuarioModifica;
    protected String comentarios;
    protected String descripcion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAprobacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCargaDatos;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaOrden;
    protected Product idProduct;
    protected Movimiento movimientoId;
    protected Long ordenRelacionadaId;
    protected String ordenRelacionadaNumber;
    protected String statusOrden;
    protected String tipoGeneracion;
    protected TipoOrden tipoOrdenId;

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
     * Obtiene el valor de la propiedad cantidadMaxima.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCantidadMaxima() {
        return cantidadMaxima;
    }

    /**
     * Define el valor de la propiedad cantidadMaxima.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCantidadMaxima(Long value) {
        this.cantidadMaxima = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadMinima.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCantidadMinima() {
        return cantidadMinima;
    }

    /**
     * Define el valor de la propiedad cantidadMinima.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCantidadMinima(Long value) {
        this.cantidadMinima = value;
    }

    /**
     * Obtiene el valor de la propiedad codUsuarioAprueba.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUsuarioAprueba() {
        return codUsuarioAprueba;
    }

    /**
     * Define el valor de la propiedad codUsuarioAprueba.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUsuarioAprueba(String value) {
        this.codUsuarioAprueba = value;
    }

    /**
     * Obtiene el valor de la propiedad codUsuarioCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUsuarioCarga() {
        return codUsuarioCarga;
    }

    /**
     * Define el valor de la propiedad codUsuarioCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUsuarioCarga(String value) {
        this.codUsuarioCarga = value;
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
     * Obtiene el valor de la propiedad fechaAprobacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAprobacion() {
        return fechaAprobacion;
    }

    /**
     * Define el valor de la propiedad fechaAprobacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAprobacion(XMLGregorianCalendar value) {
        this.fechaAprobacion = value;
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
     * Obtiene el valor de la propiedad fechaOrden.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaOrden() {
        return fechaOrden;
    }

    /**
     * Define el valor de la propiedad fechaOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaOrden(XMLGregorianCalendar value) {
        this.fechaOrden = value;
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
     * Obtiene el valor de la propiedad movimientoId.
     * 
     * @return
     *     possible object is
     *     {@link Movimiento }
     *     
     */
    public Movimiento getMovimientoId() {
        return movimientoId;
    }

    /**
     * Define el valor de la propiedad movimientoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Movimiento }
     *     
     */
    public void setMovimientoId(Movimiento value) {
        this.movimientoId = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenRelacionadaId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrdenRelacionadaId() {
        return ordenRelacionadaId;
    }

    /**
     * Define el valor de la propiedad ordenRelacionadaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrdenRelacionadaId(Long value) {
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

}
