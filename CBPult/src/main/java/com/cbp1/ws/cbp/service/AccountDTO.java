
package com.cbp1.ws.cbp.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para accountDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="accountDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listAccount" type="{http://service.cbp.ws.cbp1.com/}account" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="respuesta" type="{http://service.cbp.ws.cbp1.com/}respuestaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountDTO", propOrder = {
    "listAccount",
    "respuesta"
})
public class AccountDTO {

    @XmlElement(nillable = true)
    protected List<Account> listAccount;
    protected RespuestaDTO respuesta;

    /**
     * Gets the value of the listAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    public List<Account> getListAccount() {
        if (listAccount == null) {
            listAccount = new ArrayList<Account>();
        }
        return this.listAccount;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaDTO }
     *     
     */
    public RespuestaDTO getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaDTO }
     *     
     */
    public void setRespuesta(RespuestaDTO value) {
        this.respuesta = value;
    }

}
