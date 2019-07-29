package com.cbp.web.dto;

import com.cbp3.ws.cbp.service.Distrito;

public class CodigoPostalDTO {

	private Distrito distrito;

	public CodigoPostalDTO() {
		super();
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	@Override
	public String toString() {
		return "CodigoPostalDTO [distrito=" + distrito + "]";
	}
	
}
