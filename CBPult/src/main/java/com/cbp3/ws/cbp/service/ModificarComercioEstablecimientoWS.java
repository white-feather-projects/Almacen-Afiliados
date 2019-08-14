
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modificarComercioEstablecimientoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarComercioEstablecimientoWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comercioEstablId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="comercioId" type="{http://service.cbp.ws.cbp3.com/}comercio" minOccurs="0"/>
 *         &lt;element name="establecimientoId" type="{http://service.cbp.ws.cbp3.com/}establecimiento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarComercioEstablecimientoWS", propOrder = {
    "comercioEstablId",
    "comercioId",
    "establecimientoId"
})
public class ModificarComercioEstablecimientoWS {

    protected long comercioEstablId;
    protected Comercio comercioId;
    protected Establecimiento establecimientoId;

    /**
     * Obtiene el valor de la propiedad comercioEstablId.
     * 
     */
    public long getComercioEstablId() {
        return comercioEstablId;
    }

    /**
     * Define el valor de la propiedad comercioEstablId.
     * 
     */
    public void setComercioEstablId(long value) {
        this.comercioEstablId = value;
    }

    /**
     * Obtiene el valor de la propiedad comercioId.
     * 
     * @return
     *     possible object is
     *     {@link Comercio }
     *     
     */
    public Comercio getComercioId() {
        return comercioId;
    }

    /**
     * Define el valor de la propiedad comercioId.
     * 
     * @param value
     *     allowed object is
     *     {@link Comercio }
     *     
     */
    public void setComercioId(Comercio value) {
        this.comercioId = value;
    }

    /**
     * Obtiene el valor de la propiedad establecimientoId.
     * 
     * @return
     *     possible object is
     *     {@link Establecimiento }
     *     
     */
    public Establecimiento getEstablecimientoId() {
        return establecimientoId;
    }

    /**
     * Define el valor de la propiedad establecimientoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Establecimiento }
     *     
     */
    public void setEstablecimientoId(Establecimiento value) {
        this.establecimientoId = value;
    }

}
