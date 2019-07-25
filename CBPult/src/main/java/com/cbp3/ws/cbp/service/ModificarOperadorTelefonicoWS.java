
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para modificarOperadorTelefonicoWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="modificarOperadorTelefonicoWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operadortelfId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nombreOperador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOperador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificarOperadorTelefonicoWS", propOrder = {
    "operadortelfId",
    "nombreOperador",
    "codOperador"
})
public class ModificarOperadorTelefonicoWS {

    protected long operadortelfId;
    protected String nombreOperador;
    protected String codOperador;

    /**
     * Obtiene el valor de la propiedad operadortelfId.
     * 
     */
    public long getOperadortelfId() {
        return operadortelfId;
    }

    /**
     * Define el valor de la propiedad operadortelfId.
     * 
     */
    public void setOperadortelfId(long value) {
        this.operadortelfId = value;
    }

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

}
