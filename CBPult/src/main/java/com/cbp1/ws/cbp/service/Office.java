
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para office complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="office">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="entityBankId" type="{http://service.cbp.ws.cbp1.com/}entityBank" minOccurs="0"/>
 *         &lt;element name="fechaHoraCarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idOffice" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="officeAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officeCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "office", propOrder = {
    "codigoUsuarioModifica",
    "entityBankId",
    "fechaHoraCarga",
    "fechaHoraModificacion",
    "idOffice",
    "officeAddress",
    "officeCod",
    "officeName",
    "officePhone"
})
public class Office {

    protected Long codigoUsuarioModifica;
    protected EntityBank entityBankId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraCarga;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraModificacion;
    protected Long idOffice;
    protected String officeAddress;
    protected String officeCod;
    protected String officeName;
    protected String officePhone;

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
     * Obtiene el valor de la propiedad entityBankId.
     * 
     * @return
     *     possible object is
     *     {@link EntityBank }
     *     
     */
    public EntityBank getEntityBankId() {
        return entityBankId;
    }

    /**
     * Define el valor de la propiedad entityBankId.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityBank }
     *     
     */
    public void setEntityBankId(EntityBank value) {
        this.entityBankId = value;
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
     * Obtiene el valor de la propiedad idOffice.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdOffice() {
        return idOffice;
    }

    /**
     * Define el valor de la propiedad idOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdOffice(Long value) {
        this.idOffice = value;
    }

    /**
     * Obtiene el valor de la propiedad officeAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeAddress() {
        return officeAddress;
    }

    /**
     * Define el valor de la propiedad officeAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeAddress(String value) {
        this.officeAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad officeCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeCod() {
        return officeCod;
    }

    /**
     * Define el valor de la propiedad officeCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeCod(String value) {
        this.officeCod = value;
    }

    /**
     * Obtiene el valor de la propiedad officeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * Define el valor de la propiedad officeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeName(String value) {
        this.officeName = value;
    }

    /**
     * Obtiene el valor de la propiedad officePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * Define el valor de la propiedad officePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhone(String value) {
        this.officePhone = value;
    }

}
