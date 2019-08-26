
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modificarAsociacionComercioOtroBancoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarAsociacionComercioOtroBancoWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantidadPos" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="comercioId" type="{http://service.cbp.ws.cbp3.com/}comercio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarAsociacionComercioOtroBancoWS", propOrder = {
    "nombreBanco",
    "tipoPos",
    "cantidadPos",
    "comercioId"
})
public class ModificarAsociacionComercioOtroBancoWS {

    protected String nombreBanco;
    protected String tipoPos;
    protected Long cantidadPos;
    protected Comercio comercioId;

    /**
     * Obtiene el valor de la propiedad nombreBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreBanco() {
        return nombreBanco;
    }

    /**
     * Define el valor de la propiedad nombreBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreBanco(String value) {
        this.nombreBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPos() {
        return tipoPos;
    }

    /**
     * Define el valor de la propiedad tipoPos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPos(String value) {
        this.tipoPos = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadPos.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCantidadPos() {
        return cantidadPos;
    }

    /**
     * Define el valor de la propiedad cantidadPos.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCantidadPos(Long value) {
        this.cantidadPos = value;
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

}
