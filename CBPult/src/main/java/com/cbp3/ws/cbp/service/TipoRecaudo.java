
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoRecaudo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoRecaudo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoRecaudoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tipoRecaudoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRecaudo", propOrder = {
    "tipoRecaudoId",
    "tipoRecaudoNombre"
})
public class TipoRecaudo {

    protected Long tipoRecaudoId;
    protected String tipoRecaudoNombre;

    /**
     * Obtiene el valor de la propiedad tipoRecaudoId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTipoRecaudoId() {
        return tipoRecaudoId;
    }

    /**
     * Define el valor de la propiedad tipoRecaudoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTipoRecaudoId(Long value) {
        this.tipoRecaudoId = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRecaudoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRecaudoNombre() {
        return tipoRecaudoNombre;
    }

    /**
     * Define el valor de la propiedad tipoRecaudoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRecaudoNombre(String value) {
        this.tipoRecaudoNombre = value;
    }

}
