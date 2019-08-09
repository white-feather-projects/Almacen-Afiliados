
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaAlmacenPorNumeroAlmacenWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaAlmacenPorNumeroAlmacenWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroAlmacen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaAlmacenPorNumeroAlmacenWS", propOrder = {
    "numeroAlmacen"
})
public class ConsultaAlmacenPorNumeroAlmacenWS {

    protected String numeroAlmacen;

    /**
     * Obtiene el valor de la propiedad numeroAlmacen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAlmacen() {
        return numeroAlmacen;
    }

    /**
     * Define el valor de la propiedad numeroAlmacen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAlmacen(String value) {
        this.numeroAlmacen = value;
    }

}
