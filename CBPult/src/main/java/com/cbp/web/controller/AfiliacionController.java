package com.cbp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cbp.web.dao.AfiliacionDAO;
import com.cbp.web.dto.ClientDTO;
import com.cbp.web.dto.RespuestaDTO;
import com.cbp.web.dto.actualizaStatusComercioDTO;
import com.cbp.web.dto.consultaComercioDTO;
import com.cbp.web.dto.crearComercioDTO;
import com.cbp.web.dto.modificarComercioDTO;
import com.cbp3.ws.cbp.service.ActualizaStatusComercioWSResponse;
import com.cbp3.ws.cbp.service.ConsultaComercioPorIdentificacionComercioWSResponse;
import com.cbp3.ws.cbp.service.CrearComercioWSResponse;
import com.cbp3.ws.cbp.service.ModificarComercioWSResponse;

@Controller
public class AfiliacionController {

	@Autowired
	AfiliacionDAO afiliacionMethods;
	
	@RequestMapping(value = "/crearClienteComercio", produces = { "application/json" })
	public @ResponseBody CrearComercioWSResponse crearClienteComercio(@RequestBody crearComercioDTO crearComercio) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearComercioWSResponse respuesta = new CrearComercioWSResponse();
		respuesta = afiliacionMethods.crearClienteComercio(crearComercio);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/consultaComercio", produces = { "application/json" })
	public @ResponseBody ConsultaComercioPorIdentificacionComercioWSResponse consultaComercio(@RequestBody consultaComercioDTO consultaComercio) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaComercioPorIdentificacionComercioWSResponse respuesta = new ConsultaComercioPorIdentificacionComercioWSResponse();
		respuesta = afiliacionMethods.consultaComercio(consultaComercio);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/actualizarStatusComercio", produces = { "application/json" })
	public @ResponseBody ActualizaStatusComercioWSResponse actualizarStatusComercio(@RequestBody actualizaStatusComercioDTO actualizaStatusComercioDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ActualizaStatusComercioWSResponse respuesta = new ActualizaStatusComercioWSResponse();
		respuesta = afiliacionMethods.actualizarStatusComercio(actualizaStatusComercioDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/modificarComercio", produces = { "application/json" })
	public @ResponseBody ModificarComercioWSResponse modificarComercio(@RequestBody modificarComercioDTO modificarComercioDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ModificarComercioWSResponse respuesta = new ModificarComercioWSResponse();
		respuesta = afiliacionMethods.modificarComercio(modificarComercioDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
}
