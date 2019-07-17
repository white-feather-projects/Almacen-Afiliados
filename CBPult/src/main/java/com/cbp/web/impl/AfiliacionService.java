package com.cbp.web.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.cbp.web.dao.AfiliacionDAO;
import com.cbp.web.dto.consultaComercioDTO;
import com.cbp.web.dto.crearComercioDTO;
import com.cbp.web.util.Util;
import com.cbp3.ws.cbp.service.AfiliacionServiceWS;
import com.cbp3.ws.cbp.service.AfiliacionServiceWS_Service;
import com.cbp3.ws.cbp.service.ConsultaComercioPorIdentificacionComercioWSResponse;
import com.cbp3.ws.cbp.service.CrearComercioWSResponse;

@Service
public class AfiliacionService extends Util implements AfiliacionDAO{
	////////////////////////////////
	//Methodo para Crear Comercio...
	public CrearComercioWSResponse crearClienteComercio(crearComercioDTO crearComercio) {
		
		//instanciar Objeto para retorno....
		CrearComercioWSResponse respuestaCrearComercio = new CrearComercioWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHora_inicio(), crearComercio.getHora_finalizacion()));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearComercio;
	}
	
	////////////////////////////////////
	//Methodo para Consultar Comercio...
	public ConsultaComercioPorIdentificacionComercioWSResponse consultaComercio(consultaComercioDTO consultaComercio) {
		
		//instanciar Objeto para retorno....
		ConsultaComercioPorIdentificacionComercioWSResponse respuestaConsultaComercio = new ConsultaComercioPorIdentificacionComercioWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
			
			respuestaConsultaComercio.setReturn(WSmethod.consultaComercioPorIdentificacionComercioWS(consultaComercio.getIdentificacionComercio())); 
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaComercio;
	}
	
}
