package com.cbp.web.dto;

public class actualizaStatusComercioDTO {

	private String identificacionComercio;
    private String statusComecio;
    
	public actualizaStatusComercioDTO() {
		super();
	}

	public String getIdentificacionComercio() {
		return identificacionComercio;
	}

	public void setIdentificacionComercio(String identificacionComercio) {
		this.identificacionComercio = identificacionComercio;
	}

	public String getStatusComecio() {
		return statusComecio;
	}

	public void setStatusComecio(String statusComecio) {
		this.statusComecio = statusComecio;
	}

	@Override
	public String toString() {
		return "actualizaStatusComercioDTO [identificacionComercio=" + identificacionComercio + ", statusComecio="
				+ statusComecio + "]";
	}
    
}
