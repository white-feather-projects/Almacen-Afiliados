
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearOperadorTelefonicoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearOperadorTelefonicoWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreOperador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOperador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearOperadorTelefonicoWS", propOrder = {
    "nombreOperador",
    "codOperador",
    "active"
})
public class CrearOperadorTelefonicoWS {

    protected String nombreOperador;
    protected String codOperador;
    @XmlSchemaType(name = "unsignedShort")
    protected int active;

    /**
     * Obtiene el valor de la propiedad nombreOperador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreOperador() {
        return nombreOperador;
    }

    /**
     * Define el valor de la propiedad nombreOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreOperador(String value) {
        this.nombreOperador = value;
    }

    /**
     * Obtiene el valor de la propiedad codOperador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOperador() {
        return codOperador;
    }

    /**
     * Define el valor de la propiedad codOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOperador(String value) {
        this.codOperador = value;
    }

    /**
     * Obtiene el valor de la propiedad active.
     * 
     */
    public int getActive() {
        return active;
    }

    /**
     * Define el valor de la propiedad active.
     * 
     */
    public void setActive(int value) {
        this.active = value;
    }

}
