
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaOrdenRelacionadaPorNumeroOrdenIdWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaOrdenRelacionadaPorNumeroOrdenIdWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ordenRelacionadaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaOrdenRelacionadaPorNumeroOrdenIdWS", propOrder = {
    "ordenRelacionadaNumber"
})
public class ConsultaOrdenRelacionadaPorNumeroOrdenIdWS {

    protected String ordenRelacionadaNumber;

    /**
     * Obtiene el valor de la propiedad ordenRelacionadaNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdenRelacionadaNumber() {
        return ordenRelacionadaNumber;
    }

    /**
     * Define el valor de la propiedad ordenRelacionadaNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdenRelacionadaNumber(String value) {
        this.ordenRelacionadaNumber = value;
    }

}
