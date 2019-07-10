
package com.cbp1.ws.cbp.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para informacionAdicionalClienteDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="informacionAdicionalClienteDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actividadEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="antiguedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="banco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bancoEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantonTrabajo" type="{http://service.cbp.ws.cbp1.com/}canton" minOccurs="0"/>
 *         &lt;element name="cantonVivienda" type="{http://service.cbp.ws.cbp1.com/}canton" minOccurs="0"/>
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cargoOtraEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoriOcuId" type="{http://service.cbp.ws.cbp1.com/}categoriaOcupacional" minOccurs="0"/>
 *         &lt;element name="channelRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="codPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comentariosPersonaExpuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctaAhorro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctaCorriente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuotaMensual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distritoTrabajo" type="{http://service.cbp.ws.cbp1.com/}distrito" minOccurs="0"/>
 *         &lt;element name="distritoVivienda" type="{http://service.cbp.ws.cbp1.com/}distrito" minOccurs="0"/>
 *         &lt;element name="documentsBurotSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentsCreditSupport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileFinantialInformationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filePersonalInformationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idClient" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idDocument" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idReferencia" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idTrabajo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idVivienda" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nombreEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreOtraEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreUsuarioModifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisId" type="{http://service.cbp.ws.cbp1.com/}pais" minOccurs="0"/>
 *         &lt;element name="personaExpuestaPoliticamente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provinciaTrabajo" type="{http://service.cbp.ws.cbp1.com/}provincia" minOccurs="0"/>
 *         &lt;element name="provinciaVivienda" type="{http://service.cbp.ws.cbp1.com/}provincia" minOccurs="0"/>
 *         &lt;element name="ptoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sueldoMensual" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoFijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenenciaVivienda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ultimoSueldo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informacionAdicionalClienteDTO", propOrder = {
    "actividadEmpresa",
    "antiguedad",
    "apellidos",
    "banco",
    "bancoEmisor",
    "cantonTrabajo",
    "cantonVivienda",
    "cargo",
    "cargoOtraEmpresa",
    "categoriOcuId",
    "channelRequest",
    "ciudad",
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
    "codPostal",
    "comentariosPersonaExpuesta",
    "ctaAhorro",
    "ctaCorriente",
    "cuotaMensual",
    "distritoTrabajo",
    "distritoVivienda",
    "documentsBurotSupport",
    "documentsCreditSupport",
    "email",
    "emailReferencia",
    "fileFinantialInformationName",
    "filePersonalInformationName",
    "genero",
    "idClient",
    "idDocument",
    "idReferencia",
    "idTrabajo",
    "idVivienda",
    "nombreEmpresa",
    "nombreOtraEmpresa",
    "nombreUsuarioModifica",
    "numeroDocumento",
    "paisId",
    "personaExpuestaPoliticamente",
    "primerNombre",
    "provinciaTrabajo",
    "provinciaVivienda",
    "ptoReferencia",
    "sector",
    "segundoNombre",
    "sueldoMensual",
    "tdc",
    "telefonoCelular",
    "telefonoEmpresa",
    "telefonoFijo",
    "tenenciaVivienda",
    "tipoDocumento",
    "ultimoSueldo"
})
public class InformacionAdicionalClienteDTO {

    protected String actividadEmpresa;
    protected String antiguedad;
    protected String apellidos;
    protected String banco;
    protected String bancoEmisor;
    protected Canton cantonTrabajo;
    protected Canton cantonVivienda;
    protected String cargo;
    protected String cargoOtraEmpresa;
    protected CategoriaOcupacional categoriOcuId;
    protected String channelRequest;
    protected String ciudad;
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
    protected String codPostal;
    protected String comentariosPersonaExpuesta;
    protected String ctaAhorro;
    protected String ctaCorriente;
    protected String cuotaMensual;
    protected Distrito distritoTrabajo;
    protected Distrito distritoVivienda;
    protected String documentsBurotSupport;
    protected String documentsCreditSupport;
    protected String email;
    protected String emailReferencia;
    protected String fileFinantialInformationName;
    protected String filePersonalInformationName;
    protected String genero;
    protected long idClient;
    protected long idDocument;
    protected long idReferencia;
    protected long idTrabajo;
    protected long idVivienda;
    protected String nombreEmpresa;
    protected String nombreOtraEmpresa;
    protected String nombreUsuarioModifica;
    protected String numeroDocumento;
    protected Pais paisId;
    protected String personaExpuestaPoliticamente;
    protected String primerNombre;
    protected Provincia provinciaTrabajo;
    protected Provincia provinciaVivienda;
    protected String ptoReferencia;
    protected String sector;
    protected String segundoNombre;
    protected long sueldoMensual;
    @XmlElement(name = "TDC")
    protected String tdc;
    protected String telefonoCelular;
    protected String telefonoEmpresa;
    protected String telefonoFijo;
    protected String tenenciaVivienda;
    protected String tipoDocumento;
    protected long ultimoSueldo;

    /**
     * Obtiene el valor de la propiedad actividadEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActividadEmpresa() {
        return actividadEmpresa;
    }

    /**
     * Define el valor de la propiedad actividadEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActividadEmpresa(String value) {
        this.actividadEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad antiguedad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiguedad() {
        return antiguedad;
    }

    /**
     * Define el valor de la propiedad antiguedad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiguedad(String value) {
        this.antiguedad = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Define el valor de la propiedad apellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Obtiene el valor de la propiedad banco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanco() {
        return banco;
    }

    /**
     * Define el valor de la propiedad banco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanco(String value) {
        this.banco = value;
    }

    /**
     * Obtiene el valor de la propiedad bancoEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBancoEmisor() {
        return bancoEmisor;
    }

    /**
     * Define el valor de la propiedad bancoEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBancoEmisor(String value) {
        this.bancoEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad cantonTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link Canton }
     *     
     */
    public Canton getCantonTrabajo() {
        return cantonTrabajo;
    }

    /**
     * Define el valor de la propiedad cantonTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link Canton }
     *     
     */
    public void setCantonTrabajo(Canton value) {
        this.cantonTrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad cantonVivienda.
     * 
     * @return
     *     possible object is
     *     {@link Canton }
     *     
     */
    public Canton getCantonVivienda() {
        return cantonVivienda;
    }

    /**
     * Define el valor de la propiedad cantonVivienda.
     * 
     * @param value
     *     allowed object is
     *     {@link Canton }
     *     
     */
    public void setCantonVivienda(Canton value) {
        this.cantonVivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad cargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define el valor de la propiedad cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoOtraEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoOtraEmpresa() {
        return cargoOtraEmpresa;
    }

    /**
     * Define el valor de la propiedad cargoOtraEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoOtraEmpresa(String value) {
        this.cargoOtraEmpresa = value;
    }

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
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
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
     * Obtiene el valor de la propiedad codPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPostal() {
        return codPostal;
    }

    /**
     * Define el valor de la propiedad codPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPostal(String value) {
        this.codPostal = value;
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
     * Obtiene el valor de la propiedad ctaAhorro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtaAhorro() {
        return ctaAhorro;
    }

    /**
     * Define el valor de la propiedad ctaAhorro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtaAhorro(String value) {
        this.ctaAhorro = value;
    }

    /**
     * Obtiene el valor de la propiedad ctaCorriente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtaCorriente() {
        return ctaCorriente;
    }

    /**
     * Define el valor de la propiedad ctaCorriente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtaCorriente(String value) {
        this.ctaCorriente = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaMensual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaMensual() {
        return cuotaMensual;
    }

    /**
     * Define el valor de la propiedad cuotaMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaMensual(String value) {
        this.cuotaMensual = value;
    }

    /**
     * Obtiene el valor de la propiedad distritoTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link Distrito }
     *     
     */
    public Distrito getDistritoTrabajo() {
        return distritoTrabajo;
    }

    /**
     * Define el valor de la propiedad distritoTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link Distrito }
     *     
     */
    public void setDistritoTrabajo(Distrito value) {
        this.distritoTrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad distritoVivienda.
     * 
     * @return
     *     possible object is
     *     {@link Distrito }
     *     
     */
    public Distrito getDistritoVivienda() {
        return distritoVivienda;
    }

    /**
     * Define el valor de la propiedad distritoVivienda.
     * 
     * @param value
     *     allowed object is
     *     {@link Distrito }
     *     
     */
    public void setDistritoVivienda(Distrito value) {
        this.distritoVivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad documentsBurotSupport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsBurotSupport() {
        return documentsBurotSupport;
    }

    /**
     * Define el valor de la propiedad documentsBurotSupport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsBurotSupport(String value) {
        this.documentsBurotSupport = value;
    }

    /**
     * Obtiene el valor de la propiedad documentsCreditSupport.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentsCreditSupport() {
        return documentsCreditSupport;
    }

    /**
     * Define el valor de la propiedad documentsCreditSupport.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentsCreditSupport(String value) {
        this.documentsCreditSupport = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad emailReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailReferencia() {
        return emailReferencia;
    }

    /**
     * Define el valor de la propiedad emailReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailReferencia(String value) {
        this.emailReferencia = value;
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
     * Obtiene el valor de la propiedad genero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define el valor de la propiedad genero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
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
     * Obtiene el valor de la propiedad idDocument.
     * 
     */
    public long getIdDocument() {
        return idDocument;
    }

    /**
     * Define el valor de la propiedad idDocument.
     * 
     */
    public void setIdDocument(long value) {
        this.idDocument = value;
    }

    /**
     * Obtiene el valor de la propiedad idReferencia.
     * 
     */
    public long getIdReferencia() {
        return idReferencia;
    }

    /**
     * Define el valor de la propiedad idReferencia.
     * 
     */
    public void setIdReferencia(long value) {
        this.idReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad idTrabajo.
     * 
     */
    public long getIdTrabajo() {
        return idTrabajo;
    }

    /**
     * Define el valor de la propiedad idTrabajo.
     * 
     */
    public void setIdTrabajo(long value) {
        this.idTrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad idVivienda.
     * 
     */
    public long getIdVivienda() {
        return idVivienda;
    }

    /**
     * Define el valor de la propiedad idVivienda.
     * 
     */
    public void setIdVivienda(long value) {
        this.idVivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * Define el valor de la propiedad nombreEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmpresa(String value) {
        this.nombreEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreOtraEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreOtraEmpresa() {
        return nombreOtraEmpresa;
    }

    /**
     * Define el valor de la propiedad nombreOtraEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreOtraEmpresa(String value) {
        this.nombreOtraEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreUsuarioModifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUsuarioModifica() {
        return nombreUsuarioModifica;
    }

    /**
     * Define el valor de la propiedad nombreUsuarioModifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUsuarioModifica(String value) {
        this.nombreUsuarioModifica = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
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

    /**
     * Obtiene el valor de la propiedad primerNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Define el valor de la propiedad primerNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombre(String value) {
        this.primerNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link Provincia }
     *     
     */
    public Provincia getProvinciaTrabajo() {
        return provinciaTrabajo;
    }

    /**
     * Define el valor de la propiedad provinciaTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link Provincia }
     *     
     */
    public void setProvinciaTrabajo(Provincia value) {
        this.provinciaTrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaVivienda.
     * 
     * @return
     *     possible object is
     *     {@link Provincia }
     *     
     */
    public Provincia getProvinciaVivienda() {
        return provinciaVivienda;
    }

    /**
     * Define el valor de la propiedad provinciaVivienda.
     * 
     * @param value
     *     allowed object is
     *     {@link Provincia }
     *     
     */
    public void setProvinciaVivienda(Provincia value) {
        this.provinciaVivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad ptoReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtoReferencia() {
        return ptoReferencia;
    }

    /**
     * Define el valor de la propiedad ptoReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtoReferencia(String value) {
        this.ptoReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad sector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSector() {
        return sector;
    }

    /**
     * Define el valor de la propiedad sector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSector(String value) {
        this.sector = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Define el valor de la propiedad segundoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombre(String value) {
        this.segundoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad sueldoMensual.
     * 
     */
    public long getSueldoMensual() {
        return sueldoMensual;
    }

    /**
     * Define el valor de la propiedad sueldoMensual.
     * 
     */
    public void setSueldoMensual(long value) {
        this.sueldoMensual = value;
    }

    /**
     * Obtiene el valor de la propiedad tdc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDC() {
        return tdc;
    }

    /**
     * Define el valor de la propiedad tdc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDC(String value) {
        this.tdc = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoCelular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    /**
     * Define el valor de la propiedad telefonoCelular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoCelular(String value) {
        this.telefonoCelular = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    /**
     * Define el valor de la propiedad telefonoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoEmpresa(String value) {
        this.telefonoEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoFijo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    /**
     * Define el valor de la propiedad telefonoFijo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoFijo(String value) {
        this.telefonoFijo = value;
    }

    /**
     * Obtiene el valor de la propiedad tenenciaVivienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenenciaVivienda() {
        return tenenciaVivienda;
    }

    /**
     * Define el valor de la propiedad tenenciaVivienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenenciaVivienda(String value) {
        this.tenenciaVivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimoSueldo.
     * 
     */
    public long getUltimoSueldo() {
        return ultimoSueldo;
    }

    /**
     * Define el valor de la propiedad ultimoSueldo.
     * 
     */
    public void setUltimoSueldo(long value) {
        this.ultimoSueldo = value;
    }

	@Override
	public String toString() {
		return "InformacionAdicionalClienteDTO [actividadEmpresa=" + actividadEmpresa + ", antiguedad=" + antiguedad
				+ ", apellidos=" + apellidos + ", banco=" + banco + ", bancoEmisor=" + bancoEmisor + ", cantonTrabajo="
				+ cantonTrabajo + ", cantonVivienda=" + cantonVivienda + ", cargo=" + cargo + ", cargoOtraEmpresa="
				+ cargoOtraEmpresa + ", categoriOcuId=" + categoriOcuId + ", channelRequest=" + channelRequest
				+ ", ciudad=" + ciudad + ", clientBirthday=" + clientBirthday + ", clientCellPhone=" + clientCellPhone
				+ ", clientCivilStatus=" + clientCivilStatus + ", clientDocumentId=" + clientDocumentId
				+ ", clientEmail=" + clientEmail + ", clientFirstName=" + clientFirstName + ", clientGender="
				+ clientGender + ", clientHomePhone=" + clientHomePhone + ", clientLastName=" + clientLastName
				+ ", clientNationality=" + clientNationality + ", clientPreaprovedAmount=" + clientPreaprovedAmount
				+ ", clientProfession=" + clientProfession + ", clientSurname=" + clientSurname + ", clientTypeId="
				+ clientTypeId + ", codPostal=" + codPostal + ", comentariosPersonaExpuesta="
				+ comentariosPersonaExpuesta + ", ctaAhorro=" + ctaAhorro + ", ctaCorriente=" + ctaCorriente
				+ ", cuotaMensual=" + cuotaMensual + ", distritoTrabajo=" + distritoTrabajo + ", distritoVivienda="
				+ distritoVivienda + ", documentsBurotSupport=" + documentsBurotSupport + ", documentsCreditSupport="
				+ documentsCreditSupport + ", email=" + email + ", emailReferencia=" + emailReferencia
				+ ", fileFinantialInformationName=" + fileFinantialInformationName + ", filePersonalInformationName="
				+ filePersonalInformationName + ", genero=" + genero + ", idClient=" + idClient + ", idDocument="
				+ idDocument + ", idReferencia=" + idReferencia + ", idTrabajo=" + idTrabajo + ", idVivienda="
				+ idVivienda + ", nombreEmpresa=" + nombreEmpresa + ", nombreOtraEmpresa=" + nombreOtraEmpresa
				+ ", nombreUsuarioModifica=" + nombreUsuarioModifica + ", numeroDocumento=" + numeroDocumento
				+ ", paisId=" + paisId + ", personaExpuestaPoliticamente=" + personaExpuestaPoliticamente
				+ ", primerNombre=" + primerNombre + ", provinciaTrabajo=" + provinciaTrabajo + ", provinciaVivienda="
				+ provinciaVivienda + ", ptoReferencia=" + ptoReferencia + ", sector=" + sector + ", segundoNombre="
				+ segundoNombre + ", sueldoMensual=" + sueldoMensual + ", tdc=" + tdc + ", telefonoCelular="
				+ telefonoCelular + ", telefonoEmpresa=" + telefonoEmpresa + ", telefonoFijo=" + telefonoFijo
				+ ", tenenciaVivienda=" + tenenciaVivienda + ", tipoDocumento=" + tipoDocumento + ", ultimoSueldo="
				+ ultimoSueldo + "]";
	}

	
    
    

}
