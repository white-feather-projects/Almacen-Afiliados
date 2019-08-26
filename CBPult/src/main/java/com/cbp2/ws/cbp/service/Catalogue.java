
package com.cbp2.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para catalogue complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="catalogue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogueActive" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="catalogueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fechaHoraCarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idCatalogue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="typeCatalogue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="typeCatalogueId" type="{http://service.cbp.ws.cbp2.com/}typeCatalogue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "catalogue", propOrder = {
    "catalogueActive",
    "catalogueName",
    "codigoUsuarioModifica",
    "fechaHoraCarga",
    "fechaHoraModificacion",
    "idCatalogue",
    "typeCatalogue",
    "typeCatalogueId"
})
public class Catalogue {

    protected long catalogueActive;
    protected String catalogueName;
    protected Long codigoUsuarioModifica;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraCarga;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    protected Long idCatalogue;
    protected long typeCatalogue;
    protected TypeCatalogue typeCatalogueId;

    /**
     * Obtiene el valor de la propiedad catalogueActive.
     * 
     */
    public long getCatalogueActive() {
        return catalogueActive;
    }

    /**
     * Define el valor de la propiedad catalogueActive.
     * 
     */
    public void setCatalogueActive(long value) {
        this.catalogueActive = value;
    }

    /**
     * Obtiene el valor de la propiedad catalogueName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogueName() {
        return catalogueName;
    }

    /**
     * Define el valor de la propiedad catalogueName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogueName(String value) {
        this.catalogueName = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUsuarioModifica.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoUsuarioModifica() {
        return codigoUsuarioModifica;
    }

    /**
     * Define el valor de la propiedad codigoUsuarioModifica.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoUsuarioModifica(Long value) {
        this.codigoUsuarioModifica = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraCarga.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraCarga() {
        return fechaHoraCarga;
    }

    /**
     * Define el valor de la propiedad fechaHoraCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraCarga(XMLGregorianCalendar value) {
        this.fechaHoraCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraModificacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraModificacion() {
        return fechaHoraModificacion;
    }

    /**
     * Define el valor de la propiedad fechaHoraModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraModificacion(XMLGregorianCalendar value) {
        this.fechaHoraModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idCatalogue.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCatalogue() {
        return idCatalogue;
    }

    /**
     * Define el valor de la propiedad idCatalogue.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCatalogue(Long value) {
        this.idCatalogue = value;
    }

    /**
     * Obtiene el valor de la propiedad typeCatalogue.
     * 
     */
    public long getTypeCatalogue() {
        return typeCatalogue;
    }

    /**
     * Define el valor de la propiedad typeCatalogue.
     * 
     */
    public void setTypeCatalogue(long value) {
        this.typeCatalogue = value;
    }

    /**
     * Obtiene el valor de la propiedad typeCatalogueId.
     * 
     * @return
     *     possible object is
     *     {@link TypeCatalogue }
     *     
     */
    public TypeCatalogue getTypeCatalogueId() {
        return typeCatalogueId;
    }

    /**
     * Define el valor de la propiedad typeCatalogueId.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCatalogue }
     *     
     */
    public void setTypeCatalogueId(TypeCatalogue value) {
        this.typeCatalogueId = value;
    }

}
