
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cargaArchivosDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cargaArchivosDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="client" type="{http://service.cbp.ws.cbp1.com/}client" minOccurs="0"/>
 *         &lt;element name="fileBurotSuppor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileCreditSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileFinantialInformationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filePersonalInformationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "cargaArchivosDTO", propOrder = {
    "client",
    "fileBurotSuppor",
    "fileCreditSupport",
    "fileFinantialInformationName",
    "filePersonalInformationName",
    "respuesta"
})
public class CargaArchivosDTO {

    protected Client client;
    protected String fileBurotSuppor;
    protected String fileCreditSupport;
    protected String fileFinantialInformationName;
    protected String filePersonalInformationName;
    protected RespuestaDTO respuesta;

    /**
     * Obtiene el valor de la propiedad client.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Define el valor de la propiedad client.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Obtiene el valor de la propiedad fileBurotSuppor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileBurotSuppor() {
        return fileBurotSuppor;
    }

    /**
     * Define el valor de la propiedad fileBurotSuppor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileBurotSuppor(String value) {
        this.fileBurotSuppor = value;
    }

    /**
     * Obtiene el valor de la propiedad fileCreditSupport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileCreditSupport() {
        return fileCreditSupport;
    }

    /**
     * Define el valor de la propiedad fileCreditSupport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileCreditSupport(String value) {
        this.fileCreditSupport = value;
    }

    /**
     * Obtiene el valor de la propiedad fileFinantialInformationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileFinantialInformationName() {
        return fileFinantialInformationName;
    }

    /**
     * Define el valor de la propiedad fileFinantialInformationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileFinantialInformationName(String value) {
        this.fileFinantialInformationName = value;
    }

    /**
     * Obtiene el valor de la propiedad filePersonalInformationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePersonalInformationName() {
        return filePersonalInformationName;
    }

    /**
     * Define el valor de la propiedad filePersonalInformationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePersonalInformationName(String value) {
        this.filePersonalInformationName = value;
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
