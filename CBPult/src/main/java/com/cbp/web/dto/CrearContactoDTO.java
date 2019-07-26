package com.cbp.web.dto;

import com.cbp3.ws.cbp.service.Tipoidentificacion;

public class CrearContactoDTO {

	private Tipoidentificacion tipoIdentificacionId;
    private String identificacionContacto;
    private String telefonoCelular;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String cargoContacto;
    private String telefonoLocal;
    private String emailContacto;
    
	public CrearContactoDTO() {
		super();
	}

	public Tipoidentificacion getTipoIdentificacionId() {
		return tipoIdentificacionId;
	}

	public void setTipoIdentificacionId(Tipoidentificacion tipoIdentificacionId) {
		this.tipoIdentificacionId = tipoIdentificacionId;
	}

	public String getIdentificacionContacto() {
		return identificacionContacto;
	}

	public void setIdentificacionContacto(String identificacionContacto) {
		this.identificacionContacto = identificacionContacto;
	}

	public String getTelefonoCelular() {
		return telefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
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

	public String getCargoContacto() {
		return cargoContacto;
	}

	public void setCargoContacto(String cargoContacto) {
		this.cargoContacto = cargoContacto;
	}

	public String getTelefonoLocal() {
		return telefonoLocal;
	}

	public void setTelefonoLocal(String telefonoLocal) {
		this.telefonoLocal = telefonoLocal;
	}

	public String getEmailContacto() {
		return emailContacto;
	}

	public void setEmailContacto(String emailContacto) {
		this.emailContacto = emailContacto;
	}

	@Override
	public String toString() {
		return "CrearContactoDTO [tipoIdentificacionId=" + tipoIdentificacionId + ", identificacionContacto="
				+ identificacionContacto + ", telefonoCelular=" + telefonoCelular + ", primerNombre=" + primerNombre
				+ ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", cargoContacto=" + cargoContacto + ", telefonoLocal=" + telefonoLocal
				+ ", emailContacto=" + emailContacto + "]";
	}
    
}
