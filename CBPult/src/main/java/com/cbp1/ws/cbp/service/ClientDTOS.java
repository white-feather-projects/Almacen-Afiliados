
package com.cbp1.ws.cbp.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clientDTOS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clientDTOS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documents" type="{http://service.cbp.ws.cbp1.com/}documents" minOccurs="0"/>
 *         &lt;element name="listClient" type="{http://service.cbp.ws.cbp1.com/}client" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "clientDTOS", propOrder = {
    "documents",
    "listClient",
    "respuesta"
})
public class ClientDTOS {

    protected Documents documents;
    @XmlElement(nillable = true)
    protected List<Client> listClient;
    protected RespuestaDTO respuesta;

    /**
     * Obtiene el valor de la propiedad documents.
     * 
     * @return
     *     possible object is
     *     {@link Documents }
     *     
     */
    public Documents getDocuments() {
        return documents;
    }

    /**
     * Define el valor de la propiedad documents.
     * 
     * @param value
     *     allowed object is
     *     {@link Documents }
     *     
     */
    public void setDocuments(Documents value) {
        this.documents = value;
    }

    /**
     * Gets the value of the listClient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listClient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListClient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Client }
     * 
     * 
     */
    public List<Client> getListClient() {
        if (listClient == null) {
            listClient = new ArrayList<Client>();
        }
        return this.listClient;
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
