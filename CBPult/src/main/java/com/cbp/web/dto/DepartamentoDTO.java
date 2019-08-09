package com.cbp.web.dto;

import com.cbp3.ws.cbp.service.Empresa;

public class DepartamentoDTO {

    private Long dptoId;
    private String dptoNombre;
    private Empresa empresaId;
    
	public DepartamentoDTO() {
		super();
	}

	public Long getDptoId() {
		return dptoId;
	}

	public void setDptoId(Long dptoId) {
		this.dptoId = dptoId;
	}

	public String getDptoNombre() {
		return dptoNombre;
	}

	public void setDptoNombre(String dptoNombre) {
		this.dptoNombre = dptoNombre;
	}

	public Empresa getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Empresa empresaId) {
		this.empresaId = empresaId;
	}

	@Override
	public String toString() {
		return "DepartamentoDTO [dptoId=" + dptoId + ", dptoNombre=" + dptoNombre + ", empresaId=" + empresaId + "]";
	}
    
}
