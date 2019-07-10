
package com.cbp1.ws.cbp.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tdcRequestDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tdcRequestDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listRequestTDC" type="{http://service.cbp.ws.cbp1.com/}tdcRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="respuestaDTO" type="{http://service.cbp.ws.cbp1.com/}respuestaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tdcRequestDTO", propOrder = {
    "listRequestTDC",
    "respuestaDTO"
})
public class TdcRequestDTO {

    @XmlElement(nillable = true)
    protected List<TdcRequest> listRequestTDC;
    protected RespuestaDTO respuestaDTO;

    /**
     * Gets the value of the listRequestTDC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listRequestTDC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListRequestTDC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TdcRequest }
     * 
     * 
     */
    public List<TdcRequest> getListRequestTDC() {
        if (listRequestTDC == null) {
            listRequestTDC = new ArrayList<TdcRequest>();
        }
        return this.listRequestTDC;
    }

    /**
     * Obtiene el valor de la propiedad respuestaDTO.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTO }
     *     
     */
    public RespuestaDTO getRespuestaDTO() {
        return respuestaDTO;
    }

    /**
     * Define el valor de la propiedad respuestaDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTO }
     *     
     */
    public void setRespuestaDTO(RespuestaDTO value) {
        this.respuestaDTO = value;
    }

}
