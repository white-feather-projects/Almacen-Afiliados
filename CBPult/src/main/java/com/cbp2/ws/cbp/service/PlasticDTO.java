
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para plasticDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="plasticDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cvv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaExp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPlastic" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberPlastic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plasticDTO", propOrder = {
    "cvv",
    "fechaExp",
    "idPlastic",
    "numberPlastic"
})
public class PlasticDTO {

    protected int cvv;
    protected String fechaExp;
    protected int idPlastic;
    protected String numberPlastic;

    /**
     * Obtiene el valor de la propiedad cvv.
     * 
     */
    public int getCvv() {
        return cvv;
    }

    /**
     * Define el valor de la propiedad cvv.
     * 
     */
    public void setCvv(int value) {
        this.cvv = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExp() {
        return fechaExp;
    }

    /**
     * Define el valor de la propiedad fechaExp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExp(String value) {
        this.fechaExp = value;
    }

    /**
     * Obtiene el valor de la propiedad idPlastic.
     * 
     */
    public int getIdPlastic() {
        return idPlastic;
    }

    /**
     * Define el valor de la propiedad idPlastic.
     * 
     */
    public void setIdPlastic(int value) {
        this.idPlastic = value;
    }

    /**
     * Obtiene el valor de la propiedad numberPlastic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberPlastic() {
        return numberPlastic;
    }

    /**
     * Define el valor de la propiedad numberPlastic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberPlastic(String value) {
        this.numberPlastic = value;
    }

}
