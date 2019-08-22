
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para crearOrdenRelacionadaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearOrdenRelacionadaWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ordenRelacionadaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoOrdenId" type="{http://service.cbp.ws.cbp3.com/}tipoOrden" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movimientoId" type="{http://service.cbp.ws.cbp3.com/}movimiento" minOccurs="0"/>
 *         &lt;element name="idProduct" type="{http://service.cbp.ws.cbp3.com/}product" minOccurs="0"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fechaCargaDatos" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearOrdenRelacionadaWS", propOrder = {
    "ordenRelacionadaNumber",
    "tipoOrdenId",
    "descripcion",
    "movimientoId",
    "idProduct",
    "cantidad",
    "fechaCargaDatos"
})
public class CrearOrdenRelacionadaWS {

    protected String ordenRelacionadaNumber;
    protected TipoOrden tipoOrdenId;
    protected String descripcion;
    protected Movimiento movimientoId;
    protected Product idProduct;
    protected long cantidad;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCargaDatos;

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

}
