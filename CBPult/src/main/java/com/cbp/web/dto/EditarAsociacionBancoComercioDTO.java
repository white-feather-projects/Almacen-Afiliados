package com.cbp.web.dto;

import com.cbp3.ws.cbp.service.Operadortelefonico;

public class EditarAsociacionBancoComercioDTO {

	private long idAsociacion;
    private long idEntityBanck;
    private String numeroAfiliacion;
    private long numTerminalesComprar;
    private Operadortelefonico operadorTelefonicoId;
    
	public EditarAsociacionBancoComercioDTO() {
		super();
	}

	public long getIdAsociacion() {
		return idAsociacion;
	}

	public void setIdAsociacion(long idAsociacion) {
		this.idAsociacion = idAsociacion;
	}

	public long getIdEntityBanck() {
		return idEntityBanck;
	}

	public void setIdEntityBanck(long idEntityBanck) {
		this.idEntityBanck = idEntityBanck;
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

	@Override
	public String toString() {
		return "EditarAsociacionBancoComercioDTO [idAsociacion=" + idAsociacion + ", idEntityBanck=" + idEntityBanck
				+ ", numeroAfiliacion=" + numeroAfiliacion + ", numTerminalesComprar=" + numTerminalesComprar
				+ ", operadorTelefonicoId=" + operadorTelefonicoId + "]";
	}

	
    
}
