package com.cbp.web.dto;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.cbp1.ws.cbp.service.CategoriaOcupacional;
import com.cbp1.ws.cbp.service.Pais;
import com.cbp1.ws.cbp.service.UsersFp;

public class NewClientDTOLocal {
	protected long idClient;
    public long getIdClient() {
		return idClient;
	}
	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
	protected Long idcategoriOcuId;
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
    protected Long paisId;
    protected String personaExpuestaPoliticamente;
	public Long getIdcategoriOcuId() {
		return idcategoriOcuId;
	}
	public void setIdcategoriOcuId(Long idcategoriOcuId) {
		this.idcategoriOcuId = idcategoriOcuId;
	}
	public String getChannelRequest() {
		return channelRequest;
	}
	public void setChannelRequest(String channelRequest) {
		this.channelRequest = channelRequest;
	}
	public String getClientBirthday() {
		return clientBirthday;
	}
	public void setClientBirthday(String clientBirthday) {
		this.clientBirthday = clientBirthday;
	}
	public String getClientCellPhone() {
		return clientCellPhone;
	}
	public void setClientCellPhone(String clientCellPhone) {
		this.clientCellPhone = clientCellPhone;
	}
	public String getClientCivilStatus() {
		return clientCivilStatus;
	}
	public void setClientCivilStatus(String clientCivilStatus) {
		this.clientCivilStatus = clientCivilStatus;
	}
	public String getClientDocumentId() {
		return clientDocumentId;
	}
	public void setClientDocumentId(String clientDocumentId) {
		this.clientDocumentId = clientDocumentId;
	}
	public String getClientEmail() {
		return clientEmail;
	}
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
	public String getClientFirstName() {
		return clientFirstName;
	}
	public void setClientFirstName(String clientFirstName) {
		this.clientFirstName = clientFirstName;
	}
	public String getClientGender() {
		return clientGender;
	}
	public void setClientGender(String clientGender) {
		this.clientGender = clientGender;
	}
	public String getClientHomePhone() {
		return clientHomePhone;
	}
	public void setClientHomePhone(String clientHomePhone) {
		this.clientHomePhone = clientHomePhone;
	}
	public String getClientLastName() {
		return clientLastName;
	}
	public void setClientLastName(String clientLastName) {
		this.clientLastName = clientLastName;
	}
	public String getClientNationality() {
		return clientNationality;
	}
	public void setClientNationality(String clientNationality) {
		this.clientNationality = clientNationality;
	}
	public Long getClientPreaprovedAmount() {
		return clientPreaprovedAmount;
	}
	public void setClientPreaprovedAmount(Long clientPreaprovedAmount) {
		this.clientPreaprovedAmount = clientPreaprovedAmount;
	}
	public String getClientProfession() {
		return clientProfession;
	}
	public void setClientProfession(String clientProfession) {
		this.clientProfession = clientProfession;
	}
	public String getClientSurname() {
		return clientSurname;
	}
	public void setClientSurname(String clientSurname) {
		this.clientSurname = clientSurname;
	}
	public String getClientTypeId() {
		return clientTypeId;
	}
	public void setClientTypeId(String clientTypeId) {
		this.clientTypeId = clientTypeId;
	}
	public UsersFp getCodigoUsuarioCarga() {
		return codigoUsuarioCarga;
	}
	public void setCodigoUsuarioCarga(UsersFp codigoUsuarioCarga) {
		this.codigoUsuarioCarga = codigoUsuarioCarga;
	}
	public String getComentariosPersonaExpuesta() {
		return comentariosPersonaExpuesta;
	}
	public void setComentariosPersonaExpuesta(String comentariosPersonaExpuesta) {
		this.comentariosPersonaExpuesta = comentariosPersonaExpuesta;
	}
	public Long getPaisId() {
		return paisId;
	}
	public void setPaisId(Long paisId) {
		this.paisId = paisId;
	}
	public String getPersonaExpuestaPoliticamente() {
		return personaExpuestaPoliticamente;
	}
	public void setPersonaExpuestaPoliticamente(String personaExpuestaPoliticamente) {
		this.personaExpuestaPoliticamente = personaExpuestaPoliticamente;
	}
	public NewClientDTOLocal() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "NewClientDTOLocal [idClient=" + idClient + ", idcategoriOcuId=" + idcategoriOcuId + ", channelRequest="
				+ channelRequest + ", clientBirthday=" + clientBirthday + ", clientCellPhone=" + clientCellPhone
				+ ", clientCivilStatus=" + clientCivilStatus + ", clientDocumentId=" + clientDocumentId
				+ ", clientEmail=" + clientEmail + ", clientFirstName=" + clientFirstName + ", clientGender="
				+ clientGender + ", clientHomePhone=" + clientHomePhone + ", clientLastName=" + clientLastName
				+ ", clientNationality=" + clientNationality + ", clientPreaprovedAmount=" + clientPreaprovedAmount
				+ ", clientProfession=" + clientProfession + ", clientSurname=" + clientSurname + ", clientTypeId="
				+ clientTypeId + ", codigoUsuarioCarga=" + codigoUsuarioCarga + ", comentariosPersonaExpuesta="
				+ comentariosPersonaExpuesta + ", paisId=" + paisId + ", personaExpuestaPoliticamente="
				+ personaExpuestaPoliticamente + "]";
	}
	
    
	
	
}