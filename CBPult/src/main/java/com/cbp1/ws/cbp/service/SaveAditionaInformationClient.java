
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para saveAditionaInformationClient complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="saveAditionaInformationClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dto" type="{http://service.cbp.ws.cbp1.com/}informacionAdicionalClienteDTO" minOccurs="0"/>
 *         &lt;element name="idClient" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveAditionaInformationClient", propOrder = {
    "dto",
    "idClient"
})
public class SaveAditionaInformationClient {

    protected InformacionAdicionalClienteDTO dto;
    protected long idClient;

    /**
     * Obtiene el valor de la propiedad dto.
     * 
     * @return
     *     possible object is
     *     {@link InformacionAdicionalClienteDTO }
     *     
     */
    public InformacionAdicionalClienteDTO getDto() {
        return dto;
    }

    /**
     * Define el valor de la propiedad dto.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionAdicionalClienteDTO }
     *     
     */
    public void setDto(InformacionAdicionalClienteDTO value) {
        this.dto = value;
    }

    /**
     * Obtiene el valor de la propiedad idClient.
     * 
     */
    public long getIdClient() {
        return idClient;
    }

    /**
     * Define el valor de la propiedad idClient.
     * 
     */
    public void setIdClient(long value) {
        this.idClient = value;
    }

}
