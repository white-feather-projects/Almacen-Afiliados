
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para departamento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="departamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dptoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dptoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empresaId" type="{http://service.cbp.ws.cbp3.com/}empresa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "departamento", propOrder = {
    "dptoId",
    "dptoNombre",
    "empresaId"
})
public class Departamento {

    protected Long dptoId;
    protected String dptoNombre;
    protected Empresa empresaId;

    /**
     * Obtiene el valor de la propiedad dptoId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDptoId() {
        return dptoId;
    }

    /**
     * Define el valor de la propiedad dptoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDptoId(Long value) {
        this.dptoId = value;
    }

    /**
     * Obtiene el valor de la propiedad dptoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDptoNombre() {
        return dptoNombre;
    }

    /**
     * Define el valor de la propiedad dptoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDptoNombre(String value) {
        this.dptoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad empresaId.
     * 
     * @return
     *     possible object is
     *     {@link Empresa }
     *     
     */
    public Empresa getEmpresaId() {
        return empresaId;
    }

    /**
     * Define el valor de la propiedad empresaId.
     * 
     * @param value
     *     allowed object is
     *     {@link Empresa }
     *     
     */
    public void setEmpresaId(Empresa value) {
        this.empresaId = value;
    }

}
