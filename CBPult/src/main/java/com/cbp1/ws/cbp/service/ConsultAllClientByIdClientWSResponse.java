
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultAllClientByIdClientWSResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultAllClientByIdClientWSResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.cbp.ws.cbp1.com/}informacionAdicionalClienteDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultAllClientByIdClientWSResponse", propOrder = {
    "_return"
})
public class ConsultAllClientByIdClientWSResponse {

    @XmlElement(name = "return")
    protected InformacionAdicionalClienteDTO _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link InformacionAdicionalClienteDTO }
     *     
     */
    public InformacionAdicionalClienteDTO getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionAdicionalClienteDTO }
     *     
     */
    public void setReturn(InformacionAdicionalClienteDTO value) {
        this._return = value;
    }

}
