package com.cbp.web.impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cbp.web.dao.TdcRequestDAO;
import com.cbp.web.dto.ClientDTO;
import com.cbp.web.dto.TdcRequestDTOWeb;
import com.cbp.web.enumerated.ChannelEnum;
import com.cbp.web.util.Util;
import com.cbp1.ws.cbp.service.Client;
import com.cbp1.ws.cbp.service.ClientWS;
import com.cbp1.ws.cbp.service.ClientsWs;
import com.cbp1.ws.cbp.service.TdcRequest;
import com.cbp1.ws.cbp.service.TdcRequestDTO;
import com.cbp1.ws.cbp.service.TdcRequestWS;
import com.cbp1.ws.cbp.service.TdcRequestWS_Service;

@Service
public class tdcServices extends Util implements TdcRequestDAO{
	
	@Override
	public List<com.cbp1.ws.cbp.service.TdcRequest> listTdcRequest(String status, String canal) {
			
		com.cbp.web.dto.TdcRequestDTO tdcRequestDTO = null; 
		List<com.cbp1.ws.cbp.service.TdcRequest> list= new ArrayList<>();
		try {
			// invocacion del WS y salida del WS
			TdcRequestWS_Service ws = new TdcRequestWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-1/TdcRequestWS?wsdl"));
			TdcRequestWS wl = ws.getTdcRequestWSPort();
			list = wl.listTdcRequestByStatusWS(status, canal);

		} catch (Exception e) {
			
		}
		return list;
	}
	
}