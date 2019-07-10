
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para procesarArchivosClienteWS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="procesarArchivosClienteWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cargaArchivosDTO" type="{http://service.cbp.ws.cbp1.com/}cargaArchivosDTO" minOccurs="0"/>
 *         &lt;element name="clientDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "procesarArchivosClienteWS", propOrder = {
    "cargaArchivosDTO",
    "clientDocumentId",
    "idCanal",
    "nombreCanal"
})
public class ProcesarArchivosClienteWS {

    protected CargaArchivosDTO cargaArchivosDTO;
    protected String clientDocumentId;
    protected String idCanal;
    protected String nombreCanal;

    /**
     * Obtiene el valor de la propiedad cargaArchivosDTO.
     * 
     * @return
     *     possible object is
     *     {@link CargaArchivosDTO }
     *     
     */
    public CargaArchivosDTO getCargaArchivosDTO() {
        return cargaArchivosDTO;
    }

    /**
     * Define el valor de la propiedad cargaArchivosDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link CargaArchivosDTO }
     *     
     */
    public void setCargaArchivosDTO(CargaArchivosDTO value) {
        this.cargaArchivosDTO = value;
    }

    /**
     * Obtiene el valor de la propiedad clientDocumentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientDocumentId() {
        return clientDocumentId;
    }

    /**
     * Define el valor de la propiedad clientDocumentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientDocumentId(String value) {
        this.clientDocumentId = value;
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
