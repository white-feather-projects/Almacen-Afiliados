package com.cbp.web.dto;

public class EmpleadoDTO {

    private CargoDTO cargoId;
    private DepartamentoDTO dptoId;
    private String email;
    private Long empleadoId;
    private String identificacionEmpleado;
    private String nombreEmpleado;
    private String telefonoOficina;
    private TipoidentificacionDTO tipoIdentificacionId;
    
	public EmpleadoDTO() {
		super();
	}

	public CargoDTO getCargoId() {
		return cargoId;
	}


	public void setCargoId(CargoDTO cargoId) {
		this.cargoId = cargoId;
	}


	public DepartamentoDTO getDptoId() {
		return dptoId;
	}


	public void setDptoId(DepartamentoDTO dptoId) {
		this.dptoId = dptoId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getEmpleadoId() {
		return empleadoId;
	}


	public void setEmpleadoId(Long empleadoId) {
		this.empleadoId = empleadoId;
	}


	public String getIdentificacionEmpleado() {
		return identificacionEmpleado;
	}


	public void setIdentificacionEmpleado(String identificacionEmpleado) {
		this.identificacionEmpleado = identificacionEmpleado;
	}


	public String getNombreEmpleado() {
		return nombreEmpleado;
	}


	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}


	public String getTelefonoOficina() {
		return telefonoOficina;
	}


	public void setTelefonoOficina(String telefonoOficina) {
		this.telefonoOficina = telefonoOficina;
	}


	public TipoidentificacionDTO getTipoIdentificacionId() {
		return tipoIdentificacionId;
	}


	public void setTipoIdentificacionId(TipoidentificacionDTO tipoIdentificacionId) {
		this.tipoIdentificacionId = tipoIdentificacionId;
	}


	@Override
	public String toString() {
		return "EmpleadoDTO [cargoId=" + cargoId + ", dptoId=" + dptoId + ", email=" + email + ", empleadoId="
				+ empleadoId + ", identificacionEmpleado=" + identificacionEmpleado + ", nombreEmpleado="
				+ nombreEmpleado + ", telefonoOficina=" + telefonoOficina + ", tipoIdentificacionId="
				+ tipoIdentificacionId + "]";
	}
	
}
