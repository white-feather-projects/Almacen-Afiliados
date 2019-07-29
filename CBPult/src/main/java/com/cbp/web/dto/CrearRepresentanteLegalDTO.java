package com.cbp.web.dto;

import com.cbp3.ws.cbp.service.Tipoidentificacion;

public class CrearRepresentanteLegalDTO {

	private Tipoidentificacion tipoIdentificacionId;
    private String identificacionRepresentante;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefonoLocal;
    private String telefonoCelular;
    private String emailRepresentante;
    private String statusRepresentante;
    
	public CrearRepresentanteLegalDTO() {
		super();
	}

	public Tipoidentificacion getTipoIdentificacionId() {
		return tipoIdentificacionId;
	}

	public void setTipoIdentificacionId(Tipoidentificacion tipoIdentificacionId) {
		this.tipoIdentificacionId = tipoIdentificacionId;
	}

	public String getIdentificacionRepresentante() {
		return identificacionRepresentante;
	}

	public void setIdentificacionRepresentante(String identificacionRepresentante) {
		this.identificacionRepresentante = identificacionRepresentante;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getTelefonoLocal() {
		return telefonoLocal;
	}

	public void setTelefonoLocal(String telefonoLocal) {
		this.telefonoLocal = telefonoLocal;
	}

	public String getTelefonoCelular() {
		return telefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}

	public String getEmailRepresentante() {
		return emailRepresentante;
	}

	public void setEmailRepresentante(String emailRepresentante) {
		this.emailRepresentante = emailRepresentante;
	}

	public String getStatusRepresentante() {
		return statusRepresentante;
	}

	public void setStatusRepresentante(String statusRepresentante) {
		this.statusRepresentante = statusRepresentante;
	}

	@Override
	public String toString() {
		return "CrearRepresentanteLegalDTO [tipoIdentificacionId=" + tipoIdentificacionId
				+ ", identificacionRepresentante=" + identificacionRepresentante + ", primerNombre=" + primerNombre
				+ ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", telefonoLocal=" + telefonoLocal + ", telefonoCelular=" + telefonoCelular
				+ ", emailRepresentante=" + emailRepresentante + ", statusRepresentante=" + statusRepresentante + "]";
	}
    
}
