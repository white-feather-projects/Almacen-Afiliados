package com.cbp.web.dto;

public class CargaArchivosDTO {
	
	private String filePersonalInformationName;
	private String fileFinantialInformationName;
	private String fileBurotSuppor;
    private String fileCreditSupport;
	private String clientDocumentId;
	private RespuestaDTO respuesta;
	
	
	public String getFilePersonalInformationName() {
		return filePersonalInformationName;
	}
	public void setFilePersonalInformationName(String filePersonalInformationName) {
		this.filePersonalInformationName = filePersonalInformationName;
	}
	public String getFileFinantialInformationName() {
		return fileFinantialInformationName;
	}
	public void setFileFinantialInformationName(String fileFinantialInformationName) {
		this.fileFinantialInformationName = fileFinantialInformationName;
	}
	public String getClientDocumentId() {
		return clientDocumentId;
	}
	public void setClientDocumentId(String clientDocumentId) {
		this.clientDocumentId = clientDocumentId;
	}
	public String getFileBurotSuppor() {
		return fileBurotSuppor;
	}
	public void setFileBurotSuppor(String fileBurotSuppor) {
		this.fileBurotSuppor = fileBurotSuppor;
	}
	public String getFileCreditSupport() {
		return fileCreditSupport;
	}
	public void setFileCreditSupport(String fileCreditSupport) {
		this.fileCreditSupport = fileCreditSupport;
	}
	public RespuestaDTO getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(RespuestaDTO respuesta) {
		this.respuesta = respuesta;
	}
	@Override
	public String toString() {
		return "CargaArchivosDTO [filePersonalInformationName=" + filePersonalInformationName
				+ ", fileFinantialInformationName=" + fileFinantialInformationName + ", fileBurotSuppor="
				+ fileBurotSuppor + ", fileCreditSupport=" + fileCreditSupport + ", clientDocumentId="
				+ clientDocumentId + ", respuesta=" + respuesta + "]";
	}
	
	

}
