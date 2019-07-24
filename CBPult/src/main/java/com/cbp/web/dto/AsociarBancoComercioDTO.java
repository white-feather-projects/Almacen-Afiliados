package com.cbp.web.dto;

public class AsociarBancoComercioDTO {

	private long idEntityBanck;
	private long idComercio;
	private String numeroAfiliacion;
	private long numTerminalesComprar;
	
	public AsociarBancoComercioDTO() {
		super();
	}

	public long getIdEntityBanck() {
		return idEntityBanck;
	}

	public void setIdEntityBanck(long idEntityBanck) {
		this.idEntityBanck = idEntityBanck;
	}

	public long getIdComercio() {
		return idComercio;
	}

	public void setIdComercio(long idComercio) {
		this.idComercio = idComercio;
	}

	public String getNumeroAfiliacion() {
		return numeroAfiliacion;
	}

	public void setNumeroAfiliacion(String numeroAfiliacion) {
		this.numeroAfiliacion = numeroAfiliacion;
	}

	public long getNumTerminalesComprar() {
		return numTerminalesComprar;
	}

	public void setNumTerminalesComprar(long numTerminalesComprar) {
		this.numTerminalesComprar = numTerminalesComprar;
	}

	@Override
	public String toString() {
		return "AsociarBancoComercioDTO [idEntityBanck=" + idEntityBanck + ", idComercio=" + idComercio
				+ ", numeroAfiliacion=" + numeroAfiliacion + ", numTerminalesComprar=" + numTerminalesComprar + "]";
	}
    
}
