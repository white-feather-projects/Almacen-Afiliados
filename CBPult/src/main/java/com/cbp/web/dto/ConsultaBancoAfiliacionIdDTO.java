package com.cbp.web.dto;

public class ConsultaBancoAfiliacionIdDTO {

	private long idAsociacion;

	public ConsultaBancoAfiliacionIdDTO() {
		super();
	}

	public long getIdAsociacion() {
		return idAsociacion;
	}

	public void setIdAsociacion(long idAsociacion) {
		this.idAsociacion = idAsociacion;
	}

	@Override
	public String toString() {
		return "ConsultaBancoAfiliacionIdDTO [idAsociacion=" + idAsociacion + "]";
	}
	
}
