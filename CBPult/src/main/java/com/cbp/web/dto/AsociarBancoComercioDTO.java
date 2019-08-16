package com.cbp.web.dto;

import com.cbp3.ws.cbp.service.Operadortelefonico;

public class AsociarBancoComercioDTO {

	private long idEntityBanck;
	private long idComercio;
	private String numeroAfiliacion;
	private long numTerminalesComprar;	
	private Operadortelefonico operadorTelefonicoId;
	private long cantidadLineasOperador;
	
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

	public Operadortelefonico getOperadorTelefonicoId() {
		return operadorTelefonicoId;
	}

	public void setOperadorTelefonicoId(Operadortelefonico operadorTelefonicoId) {
		this.operadorTelefonicoId = operadorTelefonicoId;
	}

	public long getCantidadLineasOperador() {
		return cantidadLineasOperador;
	}

	public void setCantidadLineasOperador(long cantidadLineasOperador) {
		this.cantidadLineasOperador = cantidadLineasOperador;
	}

	
    
}
