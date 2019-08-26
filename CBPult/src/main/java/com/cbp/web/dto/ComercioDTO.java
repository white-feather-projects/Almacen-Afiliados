package com.cbp.web.dto;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.cbp3.ws.cbp.service.Tipoidentificacion;

public class ComercioDTO {

    private String actividadComercial;
    private String afiliadoOtroBanco;
    private Long codigoUsuarioCarga;
    private Long codigoUsuarioModifica;
    private Long comercioId;
    private String email;
    private XMLGregorianCalendar fechaCargaDatos;
    private XMLGregorianCalendar fechaHoraModificacion;
    private String horaFin;
    private String horaInicio;
    private String identificacionComercio;
    private String nombreComercial;
    private String nombreEmpresarial;
    private String numCuentaAsociado;
    private String statusComercio;
    private String telefonoAlternativo;
    private String telefonoContacto;
    private String telefonoLocal;
    private Tipoidentificacion tipoIdentificacionId;
    
	public ComercioDTO() {
		super();
	}

	public String getActividadComercial() {
		return actividadComercial;
	}

	public void setActividadComercial(String actividadComercial) {
		this.actividadComercial = actividadComercial;
	}

	public String getAfiliadoOtroBanco() {
		return afiliadoOtroBanco;
	}

	public void setAfiliadoOtroBanco(String afiliadoOtroBanco) {
		this.afiliadoOtroBanco = afiliadoOtroBanco;
	}

	public Long getCodigoUsuarioCarga() {
		return codigoUsuarioCarga;
	}

	public void setCodigoUsuarioCarga(Long codigoUsuarioCarga) {
		this.codigoUsuarioCarga = codigoUsuarioCarga;
	}

	public Long getCodigoUsuarioModifica() {
		return codigoUsuarioModifica;
	}

	public void setCodigoUsuarioModifica(Long codigoUsuarioModifica) {
		this.codigoUsuarioModifica = codigoUsuarioModifica;
	}

	public Long getComercioId() {
		return comercioId;
	}

	public void setComercioId(Long comercioId) {
		this.comercioId = comercioId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public XMLGregorianCalendar getFechaCargaDatos() {
		return fechaCargaDatos;
	}

	public void setFechaCargaDatos(XMLGregorianCalendar fechaCargaDatos) {
		this.fechaCargaDatos = fechaCargaDatos;
	}

	public XMLGregorianCalendar getFechaHoraModificacion() {
		return fechaHoraModificacion;
	}

	public void setFechaHoraModificacion(XMLGregorianCalendar fechaHoraModificacion) {
		this.fechaHoraModificacion = fechaHoraModificacion;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getIdentificacionComercio() {
		return identificacionComercio;
	}

	public void setIdentificacionComercio(String identificacionComercio) {
		this.identificacionComercio = identificacionComercio;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getNombreEmpresarial() {
		return nombreEmpresarial;
	}

	public void setNombreEmpresarial(String nombreEmpresarial) {
		this.nombreEmpresarial = nombreEmpresarial;
	}

	public String getNumCuentaAsociado() {
		return numCuentaAsociado;
	}

	public void setNumCuentaAsociado(String numCuentaAsociado) {
		this.numCuentaAsociado = numCuentaAsociado;
	}

	public String getStatusComercio() {
		return statusComercio;
	}

	public void setStatusComercio(String statusComercio) {
		this.statusComercio = statusComercio;
	}

	public String getTelefonoAlternativo() {
		return telefonoAlternativo;
	}

	public void setTelefonoAlternativo(String telefonoAlternativo) {
		this.telefonoAlternativo = telefonoAlternativo;
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

	public Tipoidentificacion getTipoIdentificacionId() {
		return tipoIdentificacionId;
	}

	public void setTipoIdentificacionId(Tipoidentificacion tipoIdentificacionId) {
		this.tipoIdentificacionId = tipoIdentificacionId;
	}

	@Override
	public String toString() {
		return "ComercioDTO [actividadComercial=" + actividadComercial + ", afiliadoOtroBanco=" + afiliadoOtroBanco
				+ ", codigoUsuarioCarga=" + codigoUsuarioCarga + ", codigoUsuarioModifica=" + codigoUsuarioModifica
				+ ", comercioId=" + comercioId + ", email=" + email + ", fechaCargaDatos=" + fechaCargaDatos
				+ ", fechaHoraModificacion=" + fechaHoraModificacion + ", horaFin=" + horaFin + ", horaInicio="
				+ horaInicio + ", identificacionComercio=" + identificacionComercio + ", nombreComercial="
				+ nombreComercial + ", nombreEmpresarial=" + nombreEmpresarial + ", numCuentaAsociado="
				+ numCuentaAsociado + ", statusComercio=" + statusComercio + ", telefonoAlternativo="
				+ telefonoAlternativo + ", telefonoContacto=" + telefonoContacto + ", telefonoLocal=" + telefonoLocal
				+ ", tipoIdentificacionId=" + tipoIdentificacionId + "]";
	}
    
	
}
