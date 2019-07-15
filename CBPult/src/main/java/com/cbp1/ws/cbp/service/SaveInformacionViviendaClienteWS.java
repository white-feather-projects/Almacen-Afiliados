
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para saveInformacionViviendaClienteWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="saveInformacionViviendaClienteWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dto" type="{http://service.cbp.ws.cbp1.com/}informacionViviendaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveInformacionViviendaClienteWS", propOrder = {
    "dto"
})
public class SaveInformacionViviendaClienteWS {

    protected InformacionViviendaDTO dto;

    /**
     * Obtiene el valor de la propiedad dto.
     * 
     * @return
     *     possible object is
     *     {@link InformacionViviendaDTO }
     *     
     */
    public InformacionViviendaDTO getDto() {
        return dto;
    }

    /**
     * Define el valor de la propiedad dto.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionViviendaDTO }
     *     
     */
    public void setDto(InformacionViviendaDTO value) {
        this.dto = value;
    }

}
