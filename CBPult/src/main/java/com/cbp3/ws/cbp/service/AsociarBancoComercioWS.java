
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para asociarBancoComercioWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asociarBancoComercioWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idEntityBanck" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idComercio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numeroAfiliacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numTerminalesComprar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asociarBancoComercioWS", propOrder = {
    "idEntityBanck",
    "idComercio",
    "numeroAfiliacion",
    "numTerminalesComprar"
})
public class AsociarBancoComercioWS {

    protected long idEntityBanck;
    protected long idComercio;
    protected String numeroAfiliacion;
    protected long numTerminalesComprar;

    /**
     * Obtiene el valor de la propiedad idEntityBanck.
     * 
     */
    public long getIdEntityBanck() {
        return idEntityBanck;
    }

    /**
     * Define el valor de la propiedad idEntityBanck.
     * 
     */
    public void setIdEntityBanck(long value) {
        this.idEntityBanck = value;
    }

    /**
     * Obtiene el valor de la propiedad idComercio.
     * 
     */
    public long getIdComercio() {
        return idComercio;
    }

    /**
     * Define el valor de la propiedad idComercio.
     * 
     */
    public void setIdComercio(long value) {
        this.idComercio = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroAfiliacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAfiliacion() {
        return numeroAfiliacion;
    }

    /**
     * Define el valor de la propiedad numeroAfiliacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAfiliacion(String value) {
        this.numeroAfiliacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numTerminalesComprar.
     * 
     */
    public long getNumTerminalesComprar() {
        return numTerminalesComprar;
    }

    /**
     * Define el valor de la propiedad numTerminalesComprar.
     * 
     */
    public void setNumTerminalesComprar(long value) {
        this.numTerminalesComprar = value;
    }

}