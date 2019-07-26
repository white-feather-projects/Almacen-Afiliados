
package com.cbp3.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaRepresentanteLegalByIdentificacionRepresentanteWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaRepresentanteLegalByIdentificacionRepresentanteWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacionRepresentante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaRepresentanteLegalByIdentificacionRepresentanteWS", propOrder = {
    "identificacionRepresentante"
})
public class ConsultaRepresentanteLegalByIdentificacionRepresentanteWS {

    protected String identificacionRepresentante;

    /**
     * Obtiene el valor de la propiedad identificacionRepresentante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionRepresentante() {
        return identificacionRepresentante;
    }

    /**
     * Define el valor de la propiedad identificacionRepresentante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionRepresentante(String value) {
        this.identificacionRepresentante = value;
    }

}
