
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para editarAsociacionBancoComercioWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="editarAsociacionBancoComercioWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAsociacion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idEntityBanck" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="numeroAfiliacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numTerminalesComprar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="operadorTelefonicoId" type="{http://service.cbp.ws.cbp3.com/}operadortelefonico" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editarAsociacionBancoComercioWS", propOrder = {
    "idAsociacion",
    "idEntityBanck",
    "numeroAfiliacion",
    "numTerminalesComprar",
    "operadorTelefonicoId"
})
public class EditarAsociacionBancoComercioWS {

    protected long idAsociacion;
    protected long idEntityBanck;
    protected String numeroAfiliacion;
    protected long numTerminalesComprar;
    protected Operadortelefonico operadorTelefonicoId;

    /**
     * Obtiene el valor de la propiedad idAsociacion.
     * 
     */
    public long getIdAsociacion() {
        return idAsociacion;
    }

    /**
     * Define el valor de la propiedad idAsociacion.
     * 
     */
    public void setIdAsociacion(long value) {
        this.idAsociacion = value;
    }

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

    /**
     * Obtiene el valor de la propiedad operadorTelefonicoId.
     * 
     * @return
     *     possible object is
     *     {@link Operadortelefonico }
     *     
     */
    public Operadortelefonico getOperadorTelefonicoId() {
        return operadorTelefonicoId;
    }

    /**
     * Define el valor de la propiedad operadorTelefonicoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Operadortelefonico }
     *     
     */
    public void setOperadorTelefonicoId(Operadortelefonico value) {
        this.operadorTelefonicoId = value;
    }

}
