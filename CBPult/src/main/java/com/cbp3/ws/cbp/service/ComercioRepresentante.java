
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para comercioRepresentante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="comercioRepresentante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comercioId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="comercioRepresentanteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="representanteId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="representanteLegal" type="{http://service.cbp.ws.cbp3.com/}representanteLegal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comercioRepresentante", propOrder = {
    "comercioId",
    "comercioRepresentanteId",
    "representanteId",
    "representanteLegal"
})
public class ComercioRepresentante {

    protected long comercioId;
    protected Long comercioRepresentanteId;
    protected long representanteId;
    protected RepresentanteLegal representanteLegal;

    /**
     * Obtiene el valor de la propiedad comercioId.
     * 
     */
    public long getComercioId() {
        return comercioId;
    }

    /**
     * Define el valor de la propiedad comercioId.
     * 
     */
    public void setComercioId(long value) {
        this.comercioId = value;
    }

    /**
     * Obtiene el valor de la propiedad comercioRepresentanteId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComercioRepresentanteId() {
        return comercioRepresentanteId;
    }

    /**
     * Define el valor de la propiedad comercioRepresentanteId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComercioRepresentanteId(Long value) {
        this.comercioRepresentanteId = value;
    }

    /**
     * Obtiene el valor de la propiedad representanteId.
     * 
     */
    public long getRepresentanteId() {
        return representanteId;
    }

    /**
     * Define el valor de la propiedad representanteId.
     * 
     */
    public void setRepresentanteId(long value) {
        this.representanteId = value;
    }

    /**
     * Obtiene el valor de la propiedad representanteLegal.
     * 
     * @return
     *     possible object is
     *     {@link RepresentanteLegal }
     *     
     */
    public RepresentanteLegal getRepresentanteLegal() {
        return representanteLegal;
    }

    /**
     * Define el valor de la propiedad representanteLegal.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentanteLegal }
     *     
     */
    public void setRepresentanteLegal(RepresentanteLegal value) {
        this.representanteLegal = value;
    }

}
