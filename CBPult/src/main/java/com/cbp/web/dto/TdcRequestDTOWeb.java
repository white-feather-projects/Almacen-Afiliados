package com.cbp.web.dto;

import com.cbp1.ws.cbp.service.Client;

public class TdcRequestDTOWeb {
	private Client cliente;
	private String status;
	private String canal;
	
	public Client getCliente() {
		return cliente;
	}
	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public TdcRequestDTOWeb() {
		super();
	}
	@Override
	public String toString() {
		return "tdcRequest [cliente=" + cliente + ", status=" + status + ", canal=" + canal + "]";
	}
	
	
}
