package com.cbp.web.dao;

import java.util.List;

import com.cbp1.ws.cbp.service.TdcRequestDTO;

public interface TdcRequestDAO {
	
	public List<com.cbp1.ws.cbp.service.TdcRequest> listTdcRequest(String status, String canal);
}