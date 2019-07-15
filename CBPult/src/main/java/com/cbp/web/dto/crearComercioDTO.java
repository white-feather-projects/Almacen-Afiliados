package com.cbp.web.dto;

import com.cbp3.ws.cbp.service.Tipoidentificacion;

public class crearComercioDTO {

	private String identificacionComercio;
    private String nombreEmpresarial;
    private String nombreComercial;
    private String email;
    private String telefonoContacto;
    private String estadoComercioActivo;
    private String telefonoLocal;
    private String numCuentaAsociado;
    private String afiliadoOtroBanco;
    private Tipoidentificacion tipoIdentificacionId;
    private String actividadComercial;
    private String horarioComercial;
    
	public crearComercioDTO() {
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

	public String getEstadoComercioActivo() {
		return estadoComercioActivo;
	}

	public void setEstadoComercioActivo(String estadoComercioActivo) {
		this.estadoComercioActivo = estadoComercioActivo;
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

	public Tipoidentificacion getTipoIdentificacionId() {
		return tipoIdentificacionId;
	}

	public void setTipoIdentificacionId(Tipoidentificacion tipoIdentificacionId) {
		this.tipoIdentificacionId = tipoIdentificacionId;
	}

	public String getActividadComercial() {
		return actividadComercial;
	}

	public void setActividadComercial(String actividadComercial) {
		this.actividadComercial = actividadComercial;
	}

	public String getHorarioComercial() {
		return horarioComercial;
	}

	public void setHorarioComercial(String horarioComercial) {
		this.horarioComercial = horarioComercial;
	}

	@Override
	public String toString() {
		return "crearComercioDTO [identificacionComercio=" + identificacionComercio + ", nombreEmpresarial="
				+ nombreEmpresarial + ", nombreComercial=" + nombreComercial + ", email=" + email
				+ ", telefonoContacto=" + telefonoContacto + ", estadoComercioActivo=" + estadoComercioActivo
				+ ", telefonoLocal=" + telefonoLocal + ", numCuentaAsociado=" + numCuentaAsociado
				+ ", afiliadoOtroBanco=" + afiliadoOtroBanco + ", tipoIdentificacionId=" + tipoIdentificacionId
				+ ", actividadComercial=" + actividadComercial + ", horarioComercial=" + horarioComercial + "]";
	}
    
    
}
