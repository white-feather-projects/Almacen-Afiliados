
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearEstanteriaWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearEstanteriaWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zonaId" type="{http://service.cbp.ws.cbp3.com/}zona" minOccurs="0"/>
 *         &lt;element name="modulos" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="niveles" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearEstanteriaWS", propOrder = {
    "zonaId",
    "modulos",
    "niveles"
})
public class CrearEstanteriaWS {

    protected Zona zonaId;
    protected long modulos;
    protected long niveles;

    /**
     * Obtiene el valor de la propiedad zonaId.
     * 
     * @return
     *     possible object is
     *     {@link Zona }
     *     
     */
    public Zona getZonaId() {
        return zonaId;
    }

    /**
     * Define el valor de la propiedad zonaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Zona }
     *     
     */
    public void setZonaId(Zona value) {
        this.zonaId = value;
    }

    /**
     * Obtiene el valor de la propiedad modulos.
     * 
     */
    public long getModulos() {
        return modulos;
    }

    /**
     * Define el valor de la propiedad modulos.
     * 
     */
    public void setModulos(long value) {
        this.modulos = value;
    }

    /**
     * Obtiene el valor de la propiedad niveles.
     * 
     */
    public long getNiveles() {
        return niveles;
    }

    /**
     * Define el valor de la propiedad niveles.
     * 
     */
    public void setNiveles(long value) {
        this.niveles = value;
    }

}
