
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para newClientDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="newClientDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoriOcuId" type="{http://service.cbp.ws.cbp1.com/}categoriaOcupacional" minOccurs="0"/>
 *         &lt;element name="channelRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientBirthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientCellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientCivilStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientGender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientHomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientNationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientPreaprovedAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="clientProfession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoUsuarioCarga" type="{http://service.cbp.ws.cbp1.com/}usersFp" minOccurs="0"/>
 *         &lt;element name="comentariosPersonaExpuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idClient" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="paisId" type="{http://service.cbp.ws.cbp1.com/}pais" minOccurs="0"/>
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
@XmlType(name = "newClientDTO", propOrder = {
    "categoriOcuId",
    "channelRequest",
    "clientBirthday",
    "clientCellPhone",
    "clientCivilStatus",
    "clientDocumentId",
    "clientEmail",
    "clientFirstName",
    "clientGender",
    "clientHomePhone",
    "clientLastName",
    "clientNationality",
    "clientPreaprovedAmount",
    "clientProfession",
    "clientSurname",
    "clientTypeId",
    "codigoUsuarioCarga",
    "comentariosPersonaExpuesta",
    "idClient",
    "paisId",
    "personaExpuestaPoliticamente"
})
public class NewClientDTO {

    protected CategoriaOcupacional categoriOcuId;
    protected String channelRequest;
    protected String clientBirthday;
    protected String clientCellPhone;
    protected String clientCivilStatus;
    protected String clientDocumentId;
    protected String clientEmail;
    protected String clientFirstName;
    protected String clientGender;
    protected String clientHomePhone;
    protected String clientLastName;
    protected String clientNationality;
    protected Long clientPreaprovedAmount;
    protected String clientProfession;
    protected String clientSurname;
    protected String clientTypeId;
    protected UsersFp codigoUsuarioCarga;
    protected String comentariosPersonaExpuesta;
    protected long idClient;
    protected Pais paisId;
    protected String personaExpuestaPoliticamente;

    /**
     * Obtiene el valor de la propiedad categoriOcuId.
     * 
     * @return
     *     possible object is
     *     {@link CategoriaOcupacional }
     *     
     */
    public CategoriaOcupacional getCategoriOcuId() {
        return categoriOcuId;
    }

    /**
     * Define el valor de la propiedad categoriOcuId.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriaOcupacional }
     *     
     */
    public void setCategoriOcuId(CategoriaOcupacional value) {
        this.categoriOcuId = value;
    }

    /**
     * Obtiene el valor de la propiedad channelRequest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelRequest() {
        return channelRequest;
    }

    /**
     * Define el valor de la propiedad channelRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelRequest(String value) {
        this.channelRequest = value;
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
     * Obtiene el valor de la propiedad clientNationality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientNationality() {
        return clientNationality;
    }

    /**
     * Define el valor de la propiedad clientNationality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientNationality(String value) {
        this.clientNationality = value;
    }

    /**
     * Obtiene el valor de la propiedad clientPreaprovedAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientPreaprovedAmount() {
        return clientPreaprovedAmount;
    }

    /**
     * Define el valor de la propiedad clientPreaprovedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientPreaprovedAmount(Long value) {
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
     * Obtiene el valor de la propiedad codigoUsuarioCarga.
     * 
     * @return
     *     possible object is
     *     {@link UsersFp }
     *     
     */
    public UsersFp getCodigoUsuarioCarga() {
        return codigoUsuarioCarga;
    }

    /**
     * Define el valor de la propiedad codigoUsuarioCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link UsersFp }
     *     
     */
    public void setCodigoUsuarioCarga(UsersFp value) {
        this.codigoUsuarioCarga = value;
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
     * Obtiene el valor de la propiedad paisId.
     * 
     * @return
     *     possible object is
     *     {@link Pais }
     *     
     */
    public Pais getPaisId() {
        return paisId;
    }

    /**
     * Define el valor de la propiedad paisId.
     * 
     * @param value
     *     allowed object is
     *     {@link Pais }
     *     
     */
    public void setPaisId(Pais value) {
        this.paisId = value;
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
