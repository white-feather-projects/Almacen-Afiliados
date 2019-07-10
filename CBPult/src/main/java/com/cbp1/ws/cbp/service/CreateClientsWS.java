
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para createClientsWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createClientsWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientDTO" type="{http://service.cbp.ws.cbp1.com/}newClientDTO" minOccurs="0"/>
 *         &lt;element name="nombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCanal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreCanal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createClientsWS", propOrder = {
    "clientDTO",
    "nombreUsuario",
    "idCanal",
    "nombreCanal"
})
public class CreateClientsWS {

    protected NewClientDTO clientDTO;
    protected String nombreUsuario;
    protected String idCanal;
    protected String nombreCanal;

    /**
     * Obtiene el valor de la propiedad clientDTO.
     * 
     * @return
     *     possible object is
     *     {@link NewClientDTO }
     *     
     */
    public NewClientDTO getClientDTO() {
        return clientDTO;
    }

    /**
     * Define el valor de la propiedad clientDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link NewClientDTO }
     *     
     */
    public void setClientDTO(NewClientDTO value) {
        this.clientDTO = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Define el valor de la propiedad nombreUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUsuario(String value) {
        this.nombreUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad idCanal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCanal() {
        return idCanal;
    }

    /**
     * Define el valor de la propiedad idCanal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCanal(String value) {
        this.idCanal = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCanal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCanal() {
        return nombreCanal;
    }

    /**
     * Define el valor de la propiedad nombreCanal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCanal(String value) {
        this.nombreCanal = value;
    }

}
