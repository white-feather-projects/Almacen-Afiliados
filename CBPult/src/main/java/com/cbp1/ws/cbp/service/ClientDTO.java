
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para clientDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clientDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoriaOcupacional" type="{http://service.cbp.ws.cbp1.com/}categoriaOcupacional" minOccurs="0"/>
 *         &lt;element name="clientBirthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientCellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientCivilStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientGender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientHomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientPreaprovedAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="clientProfession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comentariosPersonaExpuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idClient" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreCanal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pais" type="{http://service.cbp.ws.cbp1.com/}pais" minOccurs="0"/>
 *         &lt;element name="personaExpuestaPoliticamente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientDTO", propOrder = {
    "accountStatus",
    "categoriaOcupacional",
    "clientBirthday",
    "clientCellPhone",
    "clientCivilStatus",
    "clientDocumentId",
    "clientEmail",
    "clientFirstName",
    "clientGender",
    "clientHomePhone",
    "clientLastName",
    "clientPreaprovedAmount",
    "clientProfession",
    "clientSurname",
    "clientTypeId",
    "comentariosPersonaExpuesta",
    "fechaCarga",
    "idClient",
    "nacionalidad",
    "nombreCanal",
    "pais",
    "personaExpuestaPoliticamente"
})
public class ClientDTO {

    protected String accountStatus;
    protected CategoriaOcupacional categoriaOcupacional;
    protected String clientBirthday;
    protected String clientCellPhone;
    protected String clientCivilStatus;
    protected String clientDocumentId;
    protected String clientEmail;
    protected String clientFirstName;
    protected String clientGender;
    protected String clientHomePhone;
    protected String clientLastName;
    protected long clientPreaprovedAmount;
    protected String clientProfession;
    protected String clientSurname;
    protected String clientTypeId;
    protected String comentariosPersonaExpuesta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCarga;
    protected long idClient;
    protected String nacionalidad;
    protected String nombreCanal;
    protected Pais pais;
    protected String personaExpuestaPoliticamente;

    /**
     * Obtiene el valor de la propiedad accountStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Define el valor de la propiedad accountStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad categoriaOcupacional.
     * 
     * @return
     *     possible object is
     *     {@link CategoriaOcupacional }
     *     
     */
    public CategoriaOcupacional getCategoriaOcupacional() {
        return categoriaOcupacional;
    }

    /**
     * Define el valor de la propiedad categoriaOcupacional.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriaOcupacional }
     *     
     */
    public void setCategoriaOcupacional(CategoriaOcupacional value) {
        this.categoriaOcupacional = value;
    }

    /**
     * Obtiene el valor de la propiedad clientBirthday.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientBirthday() {
        return clientBirthday;
    }

    /**
     * Define el valor de la propiedad clientBirthday.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientBirthday(String value) {
        this.clientBirthday = value;
    }

    /**
     * Obtiene el valor de la propiedad clientCellPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCellPhone() {
        return clientCellPhone;
    }

    /**
     * Define el valor de la propiedad clientCellPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCellPhone(String value) {
        this.clientCellPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad clientCivilStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCivilStatus() {
        return clientCivilStatus;
    }

    /**
     * Define el valor de la propiedad clientCivilStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCivilStatus(String value) {
        this.clientCivilStatus = value;
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
     * Obtiene el valor de la propiedad clientEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientEmail() {
        return clientEmail;
    }

    /**
     * Define el valor de la propiedad clientEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientEmail(String value) {
        this.clientEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad clientFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientFirstName() {
        return clientFirstName;
    }

    /**
     * Define el valor de la propiedad clientFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientFirstName(String value) {
        this.clientFirstName = value;
    }

    /**
     * Obtiene el valor de la propiedad clientGender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientGender() {
        return clientGender;
    }

    /**
     * Define el valor de la propiedad clientGender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientGender(String value) {
        this.clientGender = value;
    }

    /**
     * Obtiene el valor de la propiedad clientHomePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientHomePhone() {
        return clientHomePhone;
    }

    /**
     * Define el valor de la propiedad clientHomePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientHomePhone(String value) {
        this.clientHomePhone = value;
    }

    /**
     * Obtiene el valor de la propiedad clientLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientLastName() {
        return clientLastName;
    }

    /**
     * Define el valor de la propiedad clientLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientLastName(String value) {
        this.clientLastName = value;
    }

    /**
     * Obtiene el valor de la propiedad clientPreaprovedAmount.
     * 
     */
    public long getClientPreaprovedAmount() {
        return clientPreaprovedAmount;
    }

    /**
     * Define el valor de la propiedad clientPreaprovedAmount.
     * 
     */
    public void setClientPreaprovedAmount(long value) {
        this.clientPreaprovedAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad clientProfession.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientProfession() {
        return clientProfession;
    }

    /**
     * Define el valor de la propiedad clientProfession.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientProfession(String value) {
        this.clientProfession = value;
    }

    /**
     * Obtiene el valor de la propiedad clientSurname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSurname() {
        return clientSurname;
    }

    /**
     * Define el valor de la propiedad clientSurname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSurname(String value) {
        this.clientSurname = value;
    }

    /**
     * Obtiene el valor de la propiedad clientTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTypeId() {
        return clientTypeId;
    }

    /**
     * Define el valor de la propiedad clientTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTypeId(String value) {
        this.clientTypeId = value;
    }

    /**
     * Obtiene el valor de la propiedad comentariosPersonaExpuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentariosPersonaExpuesta() {
        return comentariosPersonaExpuesta;
    }

    /**
     * Define el valor de la propiedad comentariosPersonaExpuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentariosPersonaExpuesta(String value) {
        this.comentariosPersonaExpuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCarga.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCarga() {
        return fechaCarga;
    }

    /**
     * Define el valor de la propiedad fechaCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCarga(XMLGregorianCalendar value) {
        this.fechaCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad idClient.
     * 
     */
    public long getIdClient() {
        return idClient;
    }

    /**
     * Define el valor de la propiedad idClient.
     * 
     */
    public void setIdClient(long value) {
        this.idClient = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Define el valor de la propiedad nacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidad(String value) {
        this.nacionalidad = value;
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

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link Pais }
     *     
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link Pais }
     *     
     */
    public void setPais(Pais value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad personaExpuestaPoliticamente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonaExpuestaPoliticamente() {
        return personaExpuestaPoliticamente;
    }

    /**
     * Define el valor de la propiedad personaExpuestaPoliticamente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonaExpuestaPoliticamente(String value) {
        this.personaExpuestaPoliticamente = value;
    }

}
