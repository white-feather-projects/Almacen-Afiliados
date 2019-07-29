package com.cbp.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cbp.web.dao.AfiliacionDAO;
import com.cbp.web.dto.ActiveOrInactiveOperadoraTelefonicaDTO;
import com.cbp.web.dto.AsociarBancoComercioDTO;
import com.cbp.web.dto.AsociarComercioConContactoDTO;
import com.cbp.web.dto.AsociarComercioConRepresentanteLegalDTO;
import com.cbp.web.dto.ClientDTO;
import com.cbp.web.dto.CodigoPostalDTO;
import com.cbp.web.dto.ConsultaAsociacionComercioContactoDTO;
import com.cbp.web.dto.ConsultaAsociacionComercioRepresentanteDTO;
import com.cbp.web.dto.ConsultaBancoAfiliacionIdDTO;
import com.cbp.web.dto.ConsultaContactoByIdentificacionContactoDTO;
import com.cbp.web.dto.ConsultaRepresentanteLegalByIdentificacionRepresentanteDTO;
import com.cbp.web.dto.CrearContactoDTO;
import com.cbp.web.dto.CrearOperadorTelefonicoDTO;
import com.cbp.web.dto.CrearRepresentanteLegalDTO;
import com.cbp.web.dto.EditarAsociacionBancoComercioDTO;
import com.cbp.web.dto.EditarAsociacionComercioConContactoDTO;
import com.cbp.web.dto.EditarAsociacionComercioConRepresentanteLegalDTO;
import com.cbp.web.dto.EditarContactoDTO;
import com.cbp.web.dto.EditarRepresentanteLegalDTO;
import com.cbp.web.dto.ModificarOperadorTelefonicoDTO;
import com.cbp.web.dto.RespuestaDTO;
import com.cbp.web.dto.actualizaStatusComercioDTO;
import com.cbp.web.dto.consultaComercioDTO;
import com.cbp.web.dto.crearComercioDTO;
import com.cbp.web.dto.modificarComercioDTO;
import com.cbp3.ws.cbp.service.ActiveOrInactiveOperadoraTelefonicaWSResponse;
import com.cbp3.ws.cbp.service.ActualizaStatusComercioWSResponse;
import com.cbp3.ws.cbp.service.AsociarBancoComercioWSResponse;
import com.cbp3.ws.cbp.service.AsociarComercioConContactoWSResponse;
import com.cbp3.ws.cbp.service.AsociarComercioConRepresentanteLegalWSResponse;
import com.cbp3.ws.cbp.service.BancoAfiliacion;
import com.cbp3.ws.cbp.service.Canton;
import com.cbp3.ws.cbp.service.CodigoPostalWSResponse;
import com.cbp3.ws.cbp.service.ConsultaAsociacionComercioContactoWSResponse;
import com.cbp3.ws.cbp.service.ConsultaAsociacionComercioRepresentanteWSResponse;
import com.cbp3.ws.cbp.service.ConsultaBancoAfiliacionByIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaComercioPorIdentificacionComercioWSResponse;
import com.cbp3.ws.cbp.service.ConsultaContactoByIdentificacionContactoWSResponse;
import com.cbp3.ws.cbp.service.ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse;
import com.cbp3.ws.cbp.service.CrearComercioWSResponse;
import com.cbp3.ws.cbp.service.CrearContactoWSResponse;
import com.cbp3.ws.cbp.service.CrearOperadorTelefonicoWSResponse;
import com.cbp3.ws.cbp.service.CrearRepresentanteLegalWSResponse;
import com.cbp3.ws.cbp.service.Distrito;
import com.cbp3.ws.cbp.service.EditarAsociacionBancoComercioWSResponse;
import com.cbp3.ws.cbp.service.EditarAsociacionComercioConContactoWSResponse;
import com.cbp3.ws.cbp.service.EditarAsociacionComercioConRepresentanteLegalWSResponse;
import com.cbp3.ws.cbp.service.EditarContactoWSResponse;
import com.cbp3.ws.cbp.service.EditarRepresentanteLegalWSResponse;
import com.cbp3.ws.cbp.service.EntityBank;
import com.cbp3.ws.cbp.service.ListaSolicitudesWSResponse;
import com.cbp3.ws.cbp.service.ModificarComercioWSResponse;
import com.cbp3.ws.cbp.service.ModificarOperadorTelefonicoWSResponse;
import com.cbp3.ws.cbp.service.Operadortelefonico;
import com.cbp3.ws.cbp.service.Provincia;
import com.cbp3.ws.cbp.service.Solicitud;

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
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/activeOrInactive", produces = { "application/json" })
	public @ResponseBody ActiveOrInactiveOperadoraTelefonicaWSResponse activeOrInactive(@RequestBody ActiveOrInactiveOperadoraTelefonicaDTO ActiveOrInactiveOperadoraTelefonicaDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ActiveOrInactiveOperadoraTelefonicaWSResponse respuesta = new ActiveOrInactiveOperadoraTelefonicaWSResponse();
		respuesta = afiliacionMethods.activeOrInactive(ActiveOrInactiveOperadoraTelefonicaDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/asociarBanco", produces = { "application/json" })
	public @ResponseBody AsociarBancoComercioWSResponse asociarBanco(@RequestBody AsociarBancoComercioDTO AsociarBancoComercioDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		AsociarBancoComercioWSResponse respuesta = new AsociarBancoComercioWSResponse();
		respuesta = afiliacionMethods.asociarBanco(AsociarBancoComercioDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/consultaBancoAfiliacionId", produces = { "application/json" })
	public @ResponseBody ConsultaBancoAfiliacionByIdWSResponse consultaBancoAfiliacionId(@RequestBody ConsultaBancoAfiliacionIdDTO ConsultaBancoAfiliacionIdDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaBancoAfiliacionByIdWSResponse respuesta = new ConsultaBancoAfiliacionByIdWSResponse();
		respuesta = afiliacionMethods.consultaBancoAfiliacionId(ConsultaBancoAfiliacionIdDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/crearOperadorTelefonico", produces = { "application/json" })
	public @ResponseBody CrearOperadorTelefonicoWSResponse crearOperadorTelefonico(@RequestBody CrearOperadorTelefonicoDTO CrearOperadorTelefonicoDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearOperadorTelefonicoWSResponse respuesta = new CrearOperadorTelefonicoWSResponse();
		respuesta = afiliacionMethods.crearOperadorTelefonico(CrearOperadorTelefonicoDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/editarAsociacionBancoComercio", produces = { "application/json" })
	public @ResponseBody EditarAsociacionBancoComercioWSResponse editarAsociacionBancoComercio(@RequestBody EditarAsociacionBancoComercioDTO EditarAsociacionBancoComercioDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		EditarAsociacionBancoComercioWSResponse respuesta = new EditarAsociacionBancoComercioWSResponse();
		respuesta = afiliacionMethods.editarAsociacionBancoComercio(EditarAsociacionBancoComercioDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/modificarOperadorTelefonico", produces = { "application/json" })
	public @ResponseBody ModificarOperadorTelefonicoWSResponse modificarOperadorTelefonico(@RequestBody ModificarOperadorTelefonicoDTO ModificarOperadorTelefonicoDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ModificarOperadorTelefonicoWSResponse respuesta = new ModificarOperadorTelefonicoWSResponse();
		respuesta = afiliacionMethods.modificarOperadorTelefonico(ModificarOperadorTelefonicoDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/asociarComercioConContacto", produces = { "application/json" })
	public @ResponseBody AsociarComercioConContactoWSResponse asociarComercioConContacto(@RequestBody AsociarComercioConContactoDTO AsociarComercioConContactoDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		AsociarComercioConContactoWSResponse respuesta = new AsociarComercioConContactoWSResponse();
		respuesta = afiliacionMethods.asociarComercioConContacto(AsociarComercioConContactoDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/asociarComercioConRepresentanteLegal", produces = { "application/json" })
	public @ResponseBody AsociarComercioConRepresentanteLegalWSResponse asociarComercioConRepresentanteLegal(@RequestBody AsociarComercioConRepresentanteLegalDTO AsociarComercioConRepresentanteLegalDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		AsociarComercioConRepresentanteLegalWSResponse respuesta = new AsociarComercioConRepresentanteLegalWSResponse();
		respuesta = afiliacionMethods.asociarComercioConRepresentanteLegal(AsociarComercioConRepresentanteLegalDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/consultaContactoByIdentificacionContacto", produces = { "application/json" })
	public @ResponseBody ConsultaContactoByIdentificacionContactoWSResponse consultaContactoByIdentificacionContacto(@RequestBody ConsultaContactoByIdentificacionContactoDTO ConsultaContactoByIdentificacionContactoDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaContactoByIdentificacionContactoWSResponse respuesta = new ConsultaContactoByIdentificacionContactoWSResponse();
		respuesta = afiliacionMethods.consultaContactoByIdentificacionContacto(ConsultaContactoByIdentificacionContactoDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/consultaRepresentanteLegalByIdentificacionRepresentante", produces = { "application/json" })
	public @ResponseBody ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse consultaRepresentanteLegalByIdentificacionRepresentante(@RequestBody ConsultaRepresentanteLegalByIdentificacionRepresentanteDTO ConsultaRepresentanteLegalByIdentificacionRepresentanteDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse respuesta = new ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse();
		respuesta = afiliacionMethods.consultaRepresentanteLegalByIdentificacionRepresentante(ConsultaRepresentanteLegalByIdentificacionRepresentanteDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/crearContacto", produces = { "application/json" })
	public @ResponseBody CrearContactoWSResponse crearContacto(@RequestBody CrearContactoDTO CrearContactoDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearContactoWSResponse respuesta = new CrearContactoWSResponse();
		respuesta = afiliacionMethods.crearContacto(CrearContactoDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/crearRepresentanteLegal", produces = { "application/json" })
	public @ResponseBody CrearRepresentanteLegalWSResponse crearRepresentanteLegal(@RequestBody CrearRepresentanteLegalDTO CrearRepresentanteLegalDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearRepresentanteLegalWSResponse respuesta = new CrearRepresentanteLegalWSResponse();
		respuesta = afiliacionMethods.crearRepresentanteLegal(CrearRepresentanteLegalDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/editarAsociacionComercioConContacto", produces = { "application/json" })
	public @ResponseBody EditarAsociacionComercioConContactoWSResponse editarAsociacionComercioConContacto(@RequestBody EditarAsociacionComercioConContactoDTO EditarAsociacionComercioConContactoDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		EditarAsociacionComercioConContactoWSResponse respuesta = new EditarAsociacionComercioConContactoWSResponse();
		respuesta = afiliacionMethods.editarAsociacionComercioConContacto(EditarAsociacionComercioConContactoDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/editarAsociacionComercioConRepresentanteLegal", produces = { "application/json" })
	public @ResponseBody EditarAsociacionComercioConRepresentanteLegalWSResponse editarAsociacionComercioConRepresentanteLegal(@RequestBody EditarAsociacionComercioConRepresentanteLegalDTO EditarAsociacionComercioConRepresentanteLegalDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		EditarAsociacionComercioConRepresentanteLegalWSResponse respuesta = new EditarAsociacionComercioConRepresentanteLegalWSResponse();
		respuesta = afiliacionMethods.editarAsociacionComercioConRepresentanteLegal(EditarAsociacionComercioConRepresentanteLegalDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/editarContacto", produces = { "application/json" })
	public @ResponseBody EditarContactoWSResponse editarContacto(@RequestBody EditarContactoDTO EditarContactoDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		EditarContactoWSResponse respuesta = new EditarContactoWSResponse();
		respuesta = afiliacionMethods.editarContacto(EditarContactoDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/editarRepresentanteLegal", produces = { "application/json" })
	public @ResponseBody EditarRepresentanteLegalWSResponse editarRepresentanteLegal(@RequestBody EditarRepresentanteLegalDTO EditarRepresentanteLegalDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		EditarRepresentanteLegalWSResponse respuesta = new EditarRepresentanteLegalWSResponse();
		respuesta = afiliacionMethods.editarRepresentanteLegal(EditarRepresentanteLegalDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/consultaAsociacionComercioContacto", produces = { "application/json" })
	public @ResponseBody ConsultaAsociacionComercioContactoWSResponse consultaAsociacionComercioContacto(@RequestBody ConsultaAsociacionComercioContactoDTO ConsultaAsociacionComercioContactoDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaAsociacionComercioContactoWSResponse respuesta = new ConsultaAsociacionComercioContactoWSResponse();
		respuesta = afiliacionMethods.consultaAsociacionComercioContacto(ConsultaAsociacionComercioContactoDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/consultaAsociacionComercioRepresentante", produces = { "application/json" })
	public @ResponseBody ConsultaAsociacionComercioRepresentanteWSResponse consultaAsociacionComercioRepresentante(@RequestBody ConsultaAsociacionComercioRepresentanteDTO ConsultaAsociacionComercioRepresentanteDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaAsociacionComercioRepresentanteWSResponse respuesta = new ConsultaAsociacionComercioRepresentanteWSResponse();
		respuesta = afiliacionMethods.consultaAsociacionComercioRepresentante(ConsultaAsociacionComercioRepresentanteDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaSolicitudes", produces = { "application/json" })
	public @ResponseBody java.util.List<Solicitud> listaSolicitudes() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<Solicitud> respuesta = new ArrayList<>();
		respuesta = afiliacionMethods.listaSolicitudes();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaAsociacionBancoComercio", produces = { "application/json" })
	public @ResponseBody java.util.List<BancoAfiliacion> listaAsociacionBancoComercio() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<BancoAfiliacion> respuesta = new ArrayList<>();
		respuesta = afiliacionMethods.listaAsociacionBancoComercio();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaOperadoresTelefonicos", produces = { "application/json" })
	public @ResponseBody java.util.List<Operadortelefonico> listaOperadoresTelefonicos() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<Operadortelefonico> respuesta = new ArrayList<>();
		respuesta = afiliacionMethods.listaOperadoresTelefonicos();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaBanks", produces = { "application/json" })
	public @ResponseBody java.util.List<EntityBank> listaBanks() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<EntityBank> respuesta = new ArrayList<>();
		respuesta = afiliacionMethods.listaBanks();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/codigoPosta", produces = { "application/json" })
	public @ResponseBody CodigoPostalWSResponse codigoPosta(@RequestBody CodigoPostalDTO CodigoPostalDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CodigoPostalWSResponse respuesta = new CodigoPostalWSResponse();
		respuesta = afiliacionMethods.codigoPostal(CodigoPostalDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaCanton", produces = { "application/json" })
	public @ResponseBody java.util.List<Canton> listaCanton(@RequestBody Provincia Provincia) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<Canton> respuesta = new ArrayList<>();
		respuesta = afiliacionMethods.listaCanton(Provincia);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaDistrito", produces = { "application/json" })
	public @ResponseBody java.util.List<Distrito> listaDistrito(@RequestBody Canton Canton) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<Distrito> respuesta = new ArrayList<>();
		respuesta = afiliacionMethods.listaDistrito(Canton);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
}
