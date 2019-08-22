
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para modificarAjusteInventarioWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarAjusteInventarioWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ajusteInventarioId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fechaAjusteInventario" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="movimientoId" type="{http://service.cbp.ws.cbp3.com/}movimiento" minOccurs="0"/>
 *         &lt;element name="tipoAjuste" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idProduct" type="{http://service.cbp.ws.cbp3.com/}product" minOccurs="0"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="comentarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarAjusteInventarioWS", propOrder = {
    "ajusteInventarioId",
    "fechaAjusteInventario",
    "movimientoId",
    "tipoAjuste",
    "idProduct",
    "cantidad",
    "comentarios",
    "codigoUsuarioModifica",
    "fechaHoraModificacion"
})
public class ModificarAjusteInventarioWS {

    protected long ajusteInventarioId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAjusteInventario;
    protected Movimiento movimientoId;
    protected String tipoAjuste;
    protected Product idProduct;
    protected long cantidad;
    protected String comentarios;
    protected long codigoUsuarioModifica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;

    /**
     * Obtiene el valor de la propiedad ajusteInventarioId.
     * 
     */
    public long getAjusteInventarioId() {
        return ajusteInventarioId;
    }

    /**
     * Define el valor de la propiedad ajusteInventarioId.
     * 
     */
    public void setAjusteInventarioId(long value) {
        this.ajusteInventarioId = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAjusteInventario.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAjusteInventario() {
        return fechaAjusteInventario;
    }

    /**
     * Define el valor de la propiedad fechaAjusteInventario.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAjusteInventario(XMLGregorianCalendar value) {
        this.fechaAjusteInventario = value;
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
     * Obtiene el valor de la propiedad tipoAjuste.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAjuste() {
        return tipoAjuste;
    }

    /**
     * Define el valor de la propiedad tipoAjuste.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAjuste(String value) {
        this.tipoAjuste = value;
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
     * Obtiene el valor de la propiedad codigoUsuarioModifica.
     * 
     */
    public long getCodigoUsuarioModifica() {
        return codigoUsuarioModifica;
    }

    /**
     * Define el valor de la propiedad codigoUsuarioModifica.
     * 
     */
    public void setCodigoUsuarioModifica(long value) {
        this.codigoUsuarioModifica = value;
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

}
