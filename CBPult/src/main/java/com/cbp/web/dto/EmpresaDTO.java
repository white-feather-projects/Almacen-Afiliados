package com.cbp.web.dto;

import com.cbp3.ws.cbp.service.Tipoidentificacion;

public class EmpresaDTO {

    private String actividadComercial;
    private String direccion;
    private String email;
    private long empresaId;
    private String horarioComercial;
    private String identificacionEmpresa;
    private String nombreEmpresarial;
    private String telefonoAlternativo;
    private String telefonoLocal;
    private TipoidentificacionDTO tipoIdentificacionId;
    
	public EmpresaDTO() {
		super();
	}

	public String getActividadComercial() {
		return actividadComercial;
	}

	public void setActividadComercial(String actividadComercial) {
		this.actividadComercial = actividadComercial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(long empresaId) {
		this.empresaId = empresaId;
	}

	public String getHorarioComercial() {
		return horarioComercial;
	}

	public void setHorarioComercial(String horarioComercial) {
		this.horarioComercial = horarioComercial;
	}

	public String getIdentificacionEmpresa() {
		return identificacionEmpresa;
	}

	public void setIdentificacionEmpresa(String identificacionEmpresa) {
		this.identificacionEmpresa = identificacionEmpresa;
	}

	public String getNombreEmpresarial() {
		return nombreEmpresarial;
	}

	public void setNombreEmpresarial(String nombreEmpresarial) {
		this.nombreEmpresarial = nombreEmpresarial;
	}

	public String getTelefonoAlternativo() {
		return telefonoAlternativo;
	}

	public void setTelefonoAlternativo(String telefonoAlternativo) {
		this.telefonoAlternativo = telefonoAlternativo;
	}

	public String getTelefonoLocal() {
		return telefonoLocal;
	}

	public void setTelefonoLocal(String telefonoLocal) {
		this.telefonoLocal = telefonoLocal;
	}

	public TipoidentificacionDTO getTipoIdentificacionId() {
		return tipoIdentificacionId;
	}

	public void setTipoIdentificacionId(TipoidentificacionDTO tipoIdentificacionId) {
		this.tipoIdentificacionId = tipoIdentificacionId;
	}

	@Override
	public String toString() {
		return "EmpresaDTO [actividadComercial=" + actividadComercial + ", direccion=" + direccion + ", email=" + email
				+ ", empresaId=" + empresaId + ", horarioComercial=" + horarioComercial + ", identificacionEmpresa="
				+ identificacionEmpresa + ", nombreEmpresarial=" + nombreEmpresarial + ", telefonoAlternativo="
				+ telefonoAlternativo + ", telefonoLocal=" + telefonoLocal + ", tipoIdentificacionId="
				+ tipoIdentificacionId + "]";
	}
	
}
