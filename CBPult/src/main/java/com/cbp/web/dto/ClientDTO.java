/**
 * 
 */
package com.cbp.web.dto;

import java.io.Serializable;

import com.cbp1.ws.cbp.service.CategoriaOcupacional;
import com.cbp1.ws.cbp.service.Pais;

/**
 * @author Equipo
 *
 */
public class ClientDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String clientBirthday;
	private String clientCellPhone;
	private String clientCivilStatus;
	private String clientDocumentId;
	private String clientEconomicActivity;
	private String clientEmail;
	private String clientFirstName;
	private String clientGender;
	private String clientHomePhone;
	private String clientLaborRelationship;
	private String clientLastName;
	private String clientOcupation;
	private long clientPreaprovedAmount;
	private String clientProfession;
	private long clientSalary;
	private String clientSurname;
	private String clientTypeId;
	private long idClient;
	private String fileFinantial;
	private String filePersonal;
	private String AccountStatus;
	private String fileCredit;
	private String fileBurot;
	private String channelRequest;
	private Pais pais;
	private CategoriaOcupacional categoriOcuId;
	private String comentariosPersonaExpuesta;
	private String personaExpuestaPoliticamente;
	private String clientNationality;
	private String fechaCarga;
	private String nacionalidad;
	private CategoriaOcupacional categoriaOcupacional;
	private Long idPais;
    private String nombrePais;
    private String descripcion;
    private Long idCatOcu;
	private String antOtherCompany; 
	 
	public String getClientBirthday() {
		return clientBirthday;
	}

	public void setClientBirthday(String clientBirthday) {
		this.clientBirthday = clientBirthday;
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

	public String getClientEconomicActivity() {
		return clientEconomicActivity;
	}

	public void setClientEconomicActivity(String clientEconomicActivity) {
		this.clientEconomicActivity = clientEconomicActivity;
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

	public String getClientLaborRelationship() {
		return clientLaborRelationship;
	}

	public void setClientLaborRelationship(String clientLaborRelationship) {
		this.clientLaborRelationship = clientLaborRelationship;
	}

	public String getClientLastName() {
		return clientLastName;
	}

	public void setClientLastName(String clientLastName) {
		this.clientLastName = clientLastName;
	}

	public String getClientOcupation() {
		return clientOcupation;
	}

	public void setClientOcupation(String clientOcupation) {
		this.clientOcupation = clientOcupation;
	}

	public long getClientPreaprovedAmount() {
		return clientPreaprovedAmount;
	}

	public void setClientPreaprovedAmount(long clientPreaprovedAmount) {
		this.clientPreaprovedAmount = clientPreaprovedAmount;
	}

	public String getClientProfession() {
		return clientProfession;
	}

	public void setClientProfession(String clientProfession) {
		this.clientProfession = clientProfession;
	}

	public long getClientSalary() {
		return clientSalary;
	}

	public void setClientSalary(long clientSalary) {
		this.clientSalary = clientSalary;
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

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}

	public String getAccountStatus() {
		return AccountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		AccountStatus = accountStatus;
	}

	public String getFileFinantial() {
		return fileFinantial;
	}

	public void setFileFinantial(String fileFinantial) {
		this.fileFinantial = fileFinantial;
	}

	public String getFilePersonal() {
		return filePersonal;
	}

	public void setFilePersonal(String filePersonal) {
		this.filePersonal = filePersonal;
	}

	public String getFileCredit() {
		return fileCredit;
	}

	public void setFileCredit(String fileCredit) {
		this.fileCredit = fileCredit;
	}

	public String getFileBurot() {
		return fileBurot;
	}

	public void setFileBurot(String fileBurot) {
		this.fileBurot = fileBurot;
	}

	public String getClientCellPhone() {
		return clientCellPhone;
	}

	public void setClientCellPhone(String clientCellPhone) {
		this.clientCellPhone = clientCellPhone;
	}

	public String getClientHomePhone() {
		return clientHomePhone;
	}

	public void setClientHomePhone(String clientHomePhone) {
		this.clientHomePhone = clientHomePhone;
	}

	public String getChannelRequest() {
		return channelRequest;
	}

	public void setChannelRequest(String channelRequest) {
		this.channelRequest = channelRequest;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public CategoriaOcupacional getCategoriOcuId() {
		return categoriOcuId;
	}

	public void setCategoriOcuId(CategoriaOcupacional categoriOcuId) {
		this.categoriOcuId = categoriOcuId;
	}

	public String getComentariosPersonaExpuesta() {
		return comentariosPersonaExpuesta;
	}

	public void setComentariosPersonaExpuesta(String comentariosPersonaExpuesta) {
		this.comentariosPersonaExpuesta = comentariosPersonaExpuesta;
	}

	public String getPersonaExpuestaPoliticamente() {
		return personaExpuestaPoliticamente;
	}

	public void setPersonaExpuestaPoliticamente(String personaExpuestaPoliticamente) {
		this.personaExpuestaPoliticamente = personaExpuestaPoliticamente;
	}

	public String getClientNationality() {
		return clientNationality;
	}

	public void setClientNationality(String clientNationality) {
		this.clientNationality = clientNationality;
	}

	public String getFechaCarga() {
		return fechaCarga;
	}

	public void setFechaCarga(String fechaCarga) {
		this.fechaCarga = fechaCarga;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public CategoriaOcupacional getCategoriaOcupacional() {
		return categoriaOcupacional;
	}

	public void setCategoriaOcupacional(CategoriaOcupacional categoriaOcupacional) {
		this.categoriaOcupacional = categoriaOcupacional;
	}

	public Long getIdPais() {
		return idPais;
	}

	public void setIdPais(Long idPais) {
		this.idPais = idPais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getIdCatOcu() {
		return idCatOcu;
	}

	public void setIdCatOcu(Long idCatOcu) {
		this.idCatOcu = idCatOcu;
	}
	
	

	public String getAntOtherCompany() {
		return antOtherCompany;
	}

	public void setAntOtherCompany(String antOtherCompany) {
		this.antOtherCompany = antOtherCompany;
	}

	@Override
	public String toString() {
		return "ClientDTO [clientBirthday=" + clientBirthday + ", clientCellPhone=" + clientCellPhone
				+ ", clientCivilStatus=" + clientCivilStatus + ", clientDocumentId=" + clientDocumentId
				+ ", clientEconomicActivity=" + clientEconomicActivity + ", clientEmail=" + clientEmail
				+ ", clientFirstName=" + clientFirstName + ", clientGender=" + clientGender + ", clientHomePhone="
				+ clientHomePhone + ", clientLaborRelationship=" + clientLaborRelationship + ", clientLastName="
				+ clientLastName + ", clientOcupation=" + clientOcupation + ", clientPreaprovedAmount="
				+ clientPreaprovedAmount + ", clientProfession=" + clientProfession + ", clientSalary=" + clientSalary
				+ ", clientSurname=" + clientSurname + ", clientTypeId=" + clientTypeId + ", idClient=" + idClient
				+ ", fileFinantial=" + fileFinantial + ", filePersonal=" + filePersonal + ", AccountStatus="
				+ AccountStatus + ", fileCredit=" + fileCredit + ", fileBurot=" + fileBurot + ", channelRequest="
				+ channelRequest + ", pais=" + pais + ", categoriOcuId=" + categoriOcuId
				+ ", comentariosPersonaExpuesta=" + comentariosPersonaExpuesta + ", personaExpuestaPoliticamente="
				+ personaExpuestaPoliticamente + ", clientNationality=" + clientNationality + ", fechaCarga="
				+ fechaCarga + ", nacionalidad=" + nacionalidad + ", categoriaOcupacional=" + categoriaOcupacional
				+ ", idPais=" + idPais + ", nombrePais=" + nombrePais + ", descripcion=" + descripcion + ", idCatOcu="
				+ idCatOcu + ", antOtherCompany=" + antOtherCompany + "]";
	}




}
