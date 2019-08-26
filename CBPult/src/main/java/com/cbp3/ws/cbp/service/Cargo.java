
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cargo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cargo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cargoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cargoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dptoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cargo", propOrder = {
    "cargoId",
    "cargoNombre",
    "dptoId"
})
public class Cargo {

    protected Long cargoId;
    protected String cargoNombre;
    protected long dptoId;

    /**
     * Obtiene el valor de la propiedad cargoId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCargoId() {
        return cargoId;
    }

    /**
     * Define el valor de la propiedad cargoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCargoId(Long value) {
        this.cargoId = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoNombre() {
        return cargoNombre;
    }

    /**
     * Define el valor de la propiedad cargoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoNombre(String value) {
        this.cargoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad dptoId.
     * 
     */
    public long getDptoId() {
        return dptoId;
    }

    /**
     * Define el valor de la propiedad dptoId.
     * 
     */
    public void setDptoId(long value) {
        this.dptoId = value;
    }

}
