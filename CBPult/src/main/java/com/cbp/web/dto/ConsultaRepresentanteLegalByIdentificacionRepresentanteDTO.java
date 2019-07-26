package com.cbp.web.dto;

public class ConsultaRepresentanteLegalByIdentificacionRepresentanteDTO {

	private String identificacionRepresentante;

	public ConsultaRepresentanteLegalByIdentificacionRepresentanteDTO() {
		super();
	}

	public String getIdentificacionRepresentante() {
		return identificacionRepresentante;
	}

	public void setIdentificacionRepresentante(String identificacionRepresentante) {
		this.identificacionRepresentante = identificacionRepresentante;
	}

	@Override
	public String toString() {
		return "ConsultaRepresentanteLegalByIdentificacionRepresentanteDTO [identificacionRepresentante="
				+ identificacionRepresentante + "]";
	}
	
}
