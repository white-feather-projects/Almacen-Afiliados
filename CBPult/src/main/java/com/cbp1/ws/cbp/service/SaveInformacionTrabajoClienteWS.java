
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para saveInformacionTrabajoClienteWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="saveInformacionTrabajoClienteWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dto" type="{http://service.cbp.ws.cbp1.com/}informacionTrabajoDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveInformacionTrabajoClienteWS", propOrder = {
    "dto"
})
public class SaveInformacionTrabajoClienteWS {

    protected InformacionTrabajoDTO dto;

    /**
     * Obtiene el valor de la propiedad dto.
     * 
     * @return
     *     possible object is
     *     {@link InformacionTrabajoDTO }
     *     
     */
    public InformacionTrabajoDTO getDto() {
        return dto;
    }

    /**
     * Define el valor de la propiedad dto.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionTrabajoDTO }
     *     
     */
    public void setDto(InformacionTrabajoDTO value) {
        this.dto = value;
    }

}
