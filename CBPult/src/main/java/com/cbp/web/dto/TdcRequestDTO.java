package com.cbp.web.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.cbp1.ws.cbp.service.Client;
import com.cbp1.ws.cbp.service.RespuestaDTO;
import com.cbp1.ws.cbp.service.TdcRequest;

public class TdcRequestDTO {

	protected Client clientId;
    protected String statusRequest;
    
	public Client getClientId() {
		return clientId;
	}
	public void setClientId(Client clientId) {
		this.clientId = clientId;
	}
	public String getStatusRequest() {
		return statusRequest;
	}
	public void setStatusRequest(String statusRequest) {
		this.statusRequest = statusRequest;
	}
	public TdcRequestDTO() {
		super();
	}
	@Override
	public String toString() {
		return "TdcRequestDTO [clientId=" + clientId + ", statusRequest=" + statusRequest + "]";
	}
    
    
    
    
}
