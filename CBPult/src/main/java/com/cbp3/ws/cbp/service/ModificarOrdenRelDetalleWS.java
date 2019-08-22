
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para modificarOrdenRelDetalleWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarOrdenRelDetalleWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ordenRelDetId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ordenRelacionadaId" type="{http://service.cbp.ws.cbp3.com/}ordenRelacionada" minOccurs="0"/>
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
@XmlType(name = "modificarOrdenRelDetalleWS", propOrder = {
    "ordenRelDetId",
    "ordenRelacionadaId",
    "idProduct",
    "cantidad",
    "comentarios",
    "codigoUsuarioModifica",
    "fechaHoraModificacion"
})
public class ModificarOrdenRelDetalleWS {

    protected long ordenRelDetId;
    protected OrdenRelacionada ordenRelacionadaId;
    protected Product idProduct;
    protected long cantidad;
    protected String comentarios;
    protected long codigoUsuarioModifica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;

    /**
     * Obtiene el valor de la propiedad ordenRelDetId.
     * 
     */
    public long getOrdenRelDetId() {
        return ordenRelDetId;
    }

    /**
     * Define el valor de la propiedad ordenRelDetId.
     * 
     */
    public void setOrdenRelDetId(long value) {
        this.ordenRelDetId = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenRelacionadaId.
     * 
     * @return
     *     possible object is
     *     {@link OrdenRelacionada }
     *     
     */
    public OrdenRelacionada getOrdenRelacionadaId() {
        return ordenRelacionadaId;
    }

    /**
     * Define el valor de la propiedad ordenRelacionadaId.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdenRelacionada }
     *     
     */
    public void setOrdenRelacionadaId(OrdenRelacionada value) {
        this.ordenRelacionadaId = value;
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
