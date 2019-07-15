
package com.cbp3.ws.cbp.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para erroresDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="erroresDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalleError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listErroresDTO" type="{http://service.cbp.ws.cbp3.com/}erroresDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="longitudCampo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "erroresDTO", propOrder = {
    "campoNombre",
    "detalleError",
    "error",
    "listErroresDTO",
    "longitudCampo",
    "message"
})
public class ErroresDTO {

    protected String campoNombre;
    protected String detalleError;
    @XmlElement(nillable = true)
    protected List<String> error;
    @XmlElement(nillable = true)
    protected List<ErroresDTO> listErroresDTO;
    protected String longitudCampo;
    protected String message;

    /**
     * Obtiene el valor de la propiedad campoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoNombre() {
        return campoNombre;
    }

    /**
     * Define el valor de la propiedad campoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoNombre(String value) {
        this.campoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleError() {
        return detalleError;
    }

    /**
     * Define el valor de la propiedad detalleError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleError(String value) {
        this.detalleError = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getError() {
        if (error == null) {
            error = new ArrayList<String>();
        }
        return this.error;
    }

    /**
     * Gets the value of the listErroresDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listErroresDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListErroresDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErroresDTO }
     * 
     * 
     */
    public List<ErroresDTO> getListErroresDTO() {
        if (listErroresDTO == null) {
            listErroresDTO = new ArrayList<ErroresDTO>();
        }
        return this.listErroresDTO;
    }

    /**
     * Obtiene el valor de la propiedad longitudCampo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitudCampo() {
        return longitudCampo;
    }

    /**
     * Define el valor de la propiedad longitudCampo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudCampo(String value) {
        this.longitudCampo = value;
    }

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
