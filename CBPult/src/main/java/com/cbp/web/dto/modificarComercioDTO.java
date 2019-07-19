package com.cbp.web.dto;

public class modificarComercioDTO {

	private String identificacionComercio;
	private String nombreEmpresarial;
	private String nombreComercial;
	private String email;
	private String telefonoContacto;
	private String telefonoLocal;
	private String numCuentaAsociado;
	private String afiliadoOtroBanco;
	private String actividadComercial;
	private String horaInicio;
	private String horaFin;
	
	public modificarComercioDTO() {
		super();
	}

	public String getIdentificacionComercio() {
		return identificacionComercio;
	}

	public void setIdentificacionComercio(String identificacionComercio) {
		this.identificacionComercio = identificacionComercio;
	}

	public String getNombreEmpresarial() {
		return nombreEmpresarial;
	}

	public void setNombreEmpresarial(String nombreEmpresarial) {
		this.nombreEmpresarial = nombreEmpresarial;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public String getTelefonoLocal() {
		return telefonoLocal;
	}

	public void setTelefonoLocal(String telefonoLocal) {
		this.telefonoLocal = telefonoLocal;
	}

	public String getNumCuentaAsociado() {
		return numCuentaAsociado;
	}

	public void setNumCuentaAsociado(String numCuentaAsociado) {
		this.numCuentaAsociado = numCuentaAsociado;
	}

	public String getAfiliadoOtroBanco() {
		return afiliadoOtroBanco;
	}

	public void setAfiliadoOtroBanco(String afiliadoOtroBanco) {
		this.afiliadoOtroBanco = afiliadoOtroBanco;
	}

	public String getActividadComercial() {
		return actividadComercial;
	}

	public void setActividadComercial(String actividadComercial) {
		this.actividadComercial = actividadComercial;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	@Override
	public String toString() {
		return "modificarComercioDTO [identificacionComercio=" + identificacionComercio + ", nombreEmpresarial="
				+ nombreEmpresarial + ", nombreComercial=" + nombreComercial + ", email=" + email
				+ ", telefonoContacto=" + telefonoContacto + ", telefonoLocal=" + telefonoLocal + ", numCuentaAsociado="
				+ numCuentaAsociado + ", afiliadoOtroBanco=" + afiliadoOtroBanco + ", actividadComercial="
				+ actividadComercial + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + "]";
	}
	
}
