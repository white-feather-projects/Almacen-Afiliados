
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para modificarAlmacenWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarAlmacenWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroAlmacen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAlmacen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacionOficina" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="identificacionProducto" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fechaHoraModifica" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tipoAlmacen" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gerenteSucursal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarAlmacenWS", propOrder = {
    "numeroAlmacen",
    "nombreAlmacen",
    "identificacionOficina",
    "identificacionProducto",
    "codigoUsuarioModifica",
    "fechaHoraModifica",
    "tipoAlmacen",
    "direccion",
    "gerenteSucursal"
})
public class ModificarAlmacenWS {

    protected String numeroAlmacen;
    protected String nombreAlmacen;
    protected long identificacionOficina;
    protected long identificacionProducto;
    protected long codigoUsuarioModifica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModifica;
    protected long tipoAlmacen;
    protected String direccion;
    protected long gerenteSucursal;

    /**
     * Obtiene el valor de la propiedad numeroAlmacen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAlmacen() {
        return numeroAlmacen;
    }

    /**
     * Define el valor de la propiedad numeroAlmacen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAlmacen(String value) {
        this.numeroAlmacen = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAlmacen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    /**
     * Define el valor de la propiedad nombreAlmacen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAlmacen(String value) {
        this.nombreAlmacen = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionOficina.
     * 
     */
    public long getIdentificacionOficina() {
        return identificacionOficina;
    }

    /**
     * Define el valor de la propiedad identificacionOficina.
     * 
     */
    public void setIdentificacionOficina(long value) {
        this.identificacionOficina = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionProducto.
     * 
     */
    public long getIdentificacionProducto() {
        return identificacionProducto;
    }

    /**
     * Define el valor de la propiedad identificacionProducto.
     * 
     */
    public void setIdentificacionProducto(long value) {
        this.identificacionProducto = value;
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
     * Obtiene el valor de la propiedad fechaHoraModifica.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraModifica() {
        return fechaHoraModifica;
    }

    /**
     * Define el valor de la propiedad fechaHoraModifica.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraModifica(XMLGregorianCalendar value) {
        this.fechaHoraModifica = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoAlmacen.
     * 
     */
    public long getTipoAlmacen() {
        return tipoAlmacen;
    }

    /**
     * Define el valor de la propiedad tipoAlmacen.
     * 
     */
    public void setTipoAlmacen(long value) {
        this.tipoAlmacen = value;
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

}
