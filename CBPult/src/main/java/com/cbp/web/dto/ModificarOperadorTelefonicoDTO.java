package com.cbp.web.dto;

public class ModificarOperadorTelefonicoDTO {

	private long operadortelfId;
	private String nombreOperador;
	private String codOperador;
	
	public ModificarOperadorTelefonicoDTO() {
		super();
	}

	public long getOperadortelfId() {
		return operadortelfId;
	}

	public void setOperadortelfId(long operadortelfId) {
		this.operadortelfId = operadortelfId;
	}

	public String getNombreOperador() {
		return nombreOperador;
	}

	public void setNombreOperador(String nombreOperador) {
		this.nombreOperador = nombreOperador;
	}

	public String getCodOperador() {
		return codOperador;
	}

	public void setCodOperador(String codOperador) {
		this.codOperador = codOperador;
	}

	@Override
	public String toString() {
		return "ModificarOperadorTelefonicoDTO [operadortelfId=" + operadortelfId + ", nombreOperador=" + nombreOperador
				+ ", codOperador=" + codOperador + "]";
	}
	
}
