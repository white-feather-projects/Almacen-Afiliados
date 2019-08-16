package com.cbp.web.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.cbp.web.dao.AfiliacionDAO;
import com.cbp.web.dto.ActiveOrInactiveOperadoraTelefonicaDTO;
import com.cbp.web.dto.AsociarBancoComercioDTO;
import com.cbp.web.dto.AsociarComercioConContactoDTO;
import com.cbp.web.dto.AsociarComercioConRepresentanteLegalDTO;
import com.cbp.web.dto.CargaArchivosDTO;
import com.cbp.web.dto.ClientDTO;
import com.cbp.web.dto.CodigoPostalDTO;
import com.cbp.web.dto.ConsultaAsociacionComercioContactoDTO;
import com.cbp.web.dto.ConsultaAsociacionComercioOtroBancoDTO;
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
import com.cbp.web.impl.UploadFileServiceImpl;
import com.cbp.web.impl.UploadFileServiceImplAfiliacion;
import com.cbp.web.util.Util;
import com.cbp3.ws.cbp.service.ActiveOrInactiveOperadoraTelefonicaWSResponse;
import com.cbp3.ws.cbp.service.ActualizaStatusComercioWSResponse;
import com.cbp3.ws.cbp.service.AfiliacionServiceWS;
import com.cbp3.ws.cbp.service.AfiliacionServiceWS_Service;
import com.cbp3.ws.cbp.service.AsociarBancoComercioWSResponse;
import com.cbp3.ws.cbp.service.AsociarComercioConContactoWSResponse;
import com.cbp3.ws.cbp.service.AsociarComercioConRepresentanteLegalWSResponse;
import com.cbp3.ws.cbp.service.AsociarComercioOtroBancoWS;
import com.cbp3.ws.cbp.service.AsociarComercioOtroBancoWSResponse;
import com.cbp3.ws.cbp.service.AsociarComercioRecaudoWS;
import com.cbp3.ws.cbp.service.AsociarComercioRecaudoWSResponse;
import com.cbp3.ws.cbp.service.BancoAfiliacion;
import com.cbp3.ws.cbp.service.Canton;
import com.cbp3.ws.cbp.service.CodigoPostalWSResponse;
import com.cbp3.ws.cbp.service.Comercio;
import com.cbp3.ws.cbp.service.ComercioEstabl;
import com.cbp3.ws.cbp.service.ConsultaAsociacionComercioContactoWSResponse;
import com.cbp3.ws.cbp.service.ConsultaAsociacionComercioOtroBancoWS;
import com.cbp3.ws.cbp.service.ConsultaAsociacionComercioOtroBancoWSResponse;
import com.cbp3.ws.cbp.service.ConsultaAsociacionComercioRepresentanteWSResponse;
import com.cbp3.ws.cbp.service.ConsultaBancoAfiliacionByIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaComercioPorComercioIdWS;
import com.cbp3.ws.cbp.service.ConsultaComercioPorComercioIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaComercioPorIdentificacionComercioWSResponse;
import com.cbp3.ws.cbp.service.ConsultaContactoByIdentificacionContactoWSResponse;
import com.cbp3.ws.cbp.service.ConsultaEntityBankByIdEntityBankWS;
import com.cbp3.ws.cbp.service.ConsultaEntityBankByIdEntityBankWSResponse;
import com.cbp3.ws.cbp.service.ConsultaPagoByNumComprobanteReciboWS;
import com.cbp3.ws.cbp.service.ConsultaPagoByNumComprobanteReciboWSResponse;
import com.cbp3.ws.cbp.service.ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse;
import com.cbp3.ws.cbp.service.ConsultaTipoRecaudoByIdTipoRecaudoWS;
import com.cbp3.ws.cbp.service.ConsultaTipoRecaudoByIdTipoRecaudoWSResponse;
import com.cbp3.ws.cbp.service.CrearComercioEstablecimientoWS;
import com.cbp3.ws.cbp.service.CrearComercioEstablecimientoWSResponse;
import com.cbp3.ws.cbp.service.CrearComercioWSResponse;
import com.cbp3.ws.cbp.service.CrearContactoWSResponse;
import com.cbp3.ws.cbp.service.CrearEstablecimientoWS;
import com.cbp3.ws.cbp.service.CrearEstablecimientoWSResponse;
import com.cbp3.ws.cbp.service.CrearOperadorTelefonicoWSResponse;
import com.cbp3.ws.cbp.service.CrearPagoComercioWS;
import com.cbp3.ws.cbp.service.CrearPagoComercioWSResponse;
import com.cbp3.ws.cbp.service.CrearRepresentanteLegalWSResponse;
import com.cbp3.ws.cbp.service.Distrito;
import com.cbp3.ws.cbp.service.EditarAsociacionBancoComercioWSResponse;
import com.cbp3.ws.cbp.service.EditarAsociacionComercioConContactoWSResponse;
import com.cbp3.ws.cbp.service.EditarAsociacionComercioConRepresentanteLegalWSResponse;
import com.cbp3.ws.cbp.service.EditarContactoWSResponse;
import com.cbp3.ws.cbp.service.EditarRepresentanteLegalWSResponse;
import com.cbp3.ws.cbp.service.EntityBank;
import com.cbp3.ws.cbp.service.Establecimiento;
import com.cbp3.ws.cbp.service.ListPagosByIdentificacionComercioWS;
import com.cbp3.ws.cbp.service.ListRecaudosByComercioWS;
import com.cbp3.ws.cbp.service.ListaSolicitudesWSResponse;
import com.cbp3.ws.cbp.service.ModificarAsociacionComercioOtroBancoWS;
import com.cbp3.ws.cbp.service.ModificarAsociacionComercioOtroBancoWSResponse;
import com.cbp3.ws.cbp.service.ModificarAsociarComercioRecaudoWS;
import com.cbp3.ws.cbp.service.ModificarAsociarComercioRecaudoWSResponse;
import com.cbp3.ws.cbp.service.ModificarComercioEstablecimientoWS;
import com.cbp3.ws.cbp.service.ModificarComercioEstablecimientoWSResponse;
import com.cbp3.ws.cbp.service.ModificarComercioWSResponse;
import com.cbp3.ws.cbp.service.ModificarOperadorTelefonicoWSResponse;
import com.cbp3.ws.cbp.service.Operadortelefonico;
import com.cbp3.ws.cbp.service.Pago;
import com.cbp3.ws.cbp.service.Pais;
import com.cbp3.ws.cbp.service.Provincia;
import com.cbp3.ws.cbp.service.Recaudo;
import com.cbp3.ws.cbp.service.Solicitud;
import com.cbp3.ws.cbp.service.TipoRecaudo;
import com.cbp3.ws.cbp.service.Tipoidentificacion;

import sun.rmi.runtime.Log;

@Controller
@RequestMapping("/Afiliacion")
public class AfiliacionController extends Util{
	
	private String name;
	private String link;
	Authentication auth = null;
	
	@Autowired
	private UploadFileServiceImplAfiliacion upload;	

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
	
	@GetMapping(value = "/consultaComercio/{identificacionComercio}", produces = { "application/json" })
	public @ResponseBody ConsultaComercioPorIdentificacionComercioWSResponse consultaComercio(@PathVariable(value = "identificacionComercio") String identificacionComercio) {
		ConsultaComercioPorIdentificacionComercioWSResponse respuesta = new ConsultaComercioPorIdentificacionComercioWSResponse();
		respuesta = afiliacionMethods.consultaComercio(identificacionComercio);
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
	
	@GetMapping(value = "/consultaBancoAfiliacionId/{idAsociacion}", produces = { "application/json" })
	public @ResponseBody ConsultaBancoAfiliacionByIdWSResponse consultaBancoAfiliacionId(@PathVariable(value = "idAsociacion") String idAsociacion) {
		ConsultaBancoAfiliacionByIdWSResponse respuesta = new ConsultaBancoAfiliacionByIdWSResponse();
		respuesta = afiliacionMethods.consultaBancoAfiliacionId(idAsociacion);
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
	
	@GetMapping(value = "/consultaContactoByIdentificacionContacto/{identificacionContacto}", produces = { "application/json" })
	public @ResponseBody ConsultaContactoByIdentificacionContactoWSResponse consultaContactoByIdentificacionContacto(@PathVariable(value = "identificacionContacto") String identificacionContacto) {
		ConsultaContactoByIdentificacionContactoWSResponse respuesta = new ConsultaContactoByIdentificacionContactoWSResponse();
		respuesta = afiliacionMethods.consultaContactoByIdentificacionContacto(identificacionContacto);
		return respuesta;
	}	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@GetMapping(value = "/consultaRepresentanteLegalByIdentificacionRepresentante/{identificacionRepresentante}", produces = { "application/json" })
	public @ResponseBody ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse consultaRepresentanteLegalByIdentificacionRepresentante(@PathVariable(value = "identificacionRepresentante") String identificacionRepresentante) {
		ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse respuesta = new ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse();
		respuesta = afiliacionMethods.consultaRepresentanteLegalByIdentificacionRepresentante(identificacionRepresentante);
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
	
	@GetMapping(value = "/consultaAsociacionComercioContacto/{comercioId}", produces = { "application/json" })
	public @ResponseBody ConsultaAsociacionComercioContactoWSResponse consultaAsociacionComercioContacto(@PathVariable(value = "comercioId") String comercioId) {
		ConsultaAsociacionComercioContactoWSResponse respuesta = new ConsultaAsociacionComercioContactoWSResponse();
		respuesta = afiliacionMethods.consultaAsociacionComercioContacto(comercioId);
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@GetMapping(value = "/consultaAsociacionComercioRepresentante/{comercioId}", produces = { "application/json" })
	public @ResponseBody ConsultaAsociacionComercioRepresentanteWSResponse consultaAsociacionComercioRepresentante(@PathVariable(value = "comercioId") String comercioId) {
		ConsultaAsociacionComercioRepresentanteWSResponse respuesta = new ConsultaAsociacionComercioRepresentanteWSResponse();
		respuesta = afiliacionMethods.consultaAsociacionComercioRepresentante(comercioId);
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/asociarComercioOtroBanco", produces = { "application/json" })
	public @ResponseBody AsociarComercioOtroBancoWSResponse asociarComercioOtroBanco(@RequestBody AsociarComercioOtroBancoWS AsociarComercioOtroBancoWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		AsociarComercioOtroBancoWSResponse respuesta = new AsociarComercioOtroBancoWSResponse();
		respuesta = afiliacionMethods.asociarComercioOtroBanco(AsociarComercioOtroBancoWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@GetMapping(value = "/consultaAsociacionComercioOtroBanco/{comercioId}", produces = { "application/json" })
	public @ResponseBody ConsultaAsociacionComercioOtroBancoWSResponse consultaAsociacionComercioOtroBanco(@PathVariable(value = "comercioId") String comercioId) {
		ConsultaAsociacionComercioOtroBancoWSResponse respuesta = new ConsultaAsociacionComercioOtroBancoWSResponse();
		respuesta = afiliacionMethods.consultaAsociacionComercioOtroBanco(comercioId);
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/modificarAsociacionComercioOtroBanco", produces = { "application/json" })
	public @ResponseBody ModificarAsociacionComercioOtroBancoWSResponse modificarAsociacionComercioOtroBanco(@RequestBody ModificarAsociacionComercioOtroBancoWS ModificarAsociacionComercioOtroBancoWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ModificarAsociacionComercioOtroBancoWSResponse respuesta = new ModificarAsociacionComercioOtroBancoWSResponse();
		respuesta = afiliacionMethods.modificarAsociacionComercioOtroBanco(ModificarAsociacionComercioOtroBancoWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/asociarComercioRecaudo", produces = { "application/json" })
	public @ResponseBody AsociarComercioRecaudoWSResponse asociarComercioRecaudo(@RequestBody AsociarComercioRecaudoWS AsociarComercioRecaudoWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		AsociarComercioRecaudoWSResponse respuesta = new AsociarComercioRecaudoWSResponse();
		respuesta = afiliacionMethods.asociarComercioRecaudo(AsociarComercioRecaudoWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@GetMapping(value = "/consultaComercioPorComercioId/{comercioId}", produces = { "application/json" })
	public @ResponseBody ConsultaComercioPorComercioIdWSResponse consultaComercioPorComercioId(@PathVariable(value = "comercioId") String comercioId) {
		ConsultaComercioPorComercioIdWSResponse respuesta = new ConsultaComercioPorComercioIdWSResponse();
		respuesta = afiliacionMethods.consultaComercioPorComercioId(comercioId);
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@GetMapping(value = "/consultaPagoByNumComprobanteRecibo/{numComprobanteRecibo}", produces = { "application/json" })
	public @ResponseBody ConsultaPagoByNumComprobanteReciboWSResponse consultaPagoByNumComprobanteRecibo(@PathVariable(value = "numComprobanteRecibo") String numComprobanteRecibo) {
		ConsultaPagoByNumComprobanteReciboWSResponse respuesta = new ConsultaPagoByNumComprobanteReciboWSResponse();
		respuesta = afiliacionMethods.consultaPagoByNumComprobanteRecibo(numComprobanteRecibo);
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@GetMapping(value = "/consultaTipoRecaudoByIdTipoRecaudo/{tipoRecaudoId}", produces = { "application/json" })
	public @ResponseBody ConsultaTipoRecaudoByIdTipoRecaudoWSResponse consultaTipoRecaudoByIdTipoRecaudo(@PathVariable(value = "tipoRecaudoId") String tipoRecaudoId) {
		ConsultaTipoRecaudoByIdTipoRecaudoWSResponse respuesta = new ConsultaTipoRecaudoByIdTipoRecaudoWSResponse();
		respuesta = afiliacionMethods.consultaTipoRecaudoByIdTipoRecaudo(tipoRecaudoId);
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/crearPagoComercio", produces = { "application/json" })
	public @ResponseBody CrearPagoComercioWSResponse crearPagoComercio(@RequestBody CrearPagoComercioWS CrearPagoComercioWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearPagoComercioWSResponse respuesta = new CrearPagoComercioWSResponse();
		respuesta = afiliacionMethods.crearPagoComercio(CrearPagoComercioWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/modificarAsociarComercioRecaudo", produces = { "application/json" })
	public @ResponseBody ModificarAsociarComercioRecaudoWSResponse modificarAsociarComercioRecaudo(@RequestBody ModificarAsociarComercioRecaudoWS ModificarAsociarComercioRecaudoWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ModificarAsociarComercioRecaudoWSResponse respuesta = new ModificarAsociarComercioRecaudoWSResponse();
		respuesta = afiliacionMethods.modificarAsociarComercioRecaudo(ModificarAsociarComercioRecaudoWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@GetMapping(value = "/consultaEntityBankByIdEntityBank/{entityBankId}", produces = { "application/json" })
	public @ResponseBody ConsultaEntityBankByIdEntityBankWSResponse consultaEntityBankByIdEntityBank(@PathVariable(value = "entityBankId") String entityBankId) {
		ConsultaEntityBankByIdEntityBankWSResponse respuesta = new ConsultaEntityBankByIdEntityBankWSResponse();
		respuesta = afiliacionMethods.consultaEntityBankByIdEntityBank(entityBankId);
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/crearEstablecimiento", produces = { "application/json" })
	public @ResponseBody CrearEstablecimientoWSResponse crearEstablecimiento(@RequestBody CrearEstablecimientoWS CrearEstablecimientoWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearEstablecimientoWSResponse respuesta = new CrearEstablecimientoWSResponse();
		respuesta = afiliacionMethods.crearEstablecimiento(CrearEstablecimientoWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/CrearComercioEstablecimiento", produces = { "application/json" })
	public @ResponseBody CrearComercioEstablecimientoWSResponse CrearComercioEstablecimiento(@RequestBody CrearComercioEstablecimientoWS CrearComercioEstablecimientoWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearComercioEstablecimientoWSResponse respuesta = new CrearComercioEstablecimientoWSResponse();
		respuesta = afiliacionMethods.CrearComercioEstablecimiento(CrearComercioEstablecimientoWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/modificarComercioEstablecimiento", produces = { "application/json" })
	public @ResponseBody ModificarComercioEstablecimientoWSResponse modificarComercioEstablecimiento(@RequestBody ModificarComercioEstablecimientoWS ModificarComercioEstablecimientoWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ModificarComercioEstablecimientoWSResponse respuesta = new ModificarComercioEstablecimientoWSResponse();
		respuesta = afiliacionMethods.modificarComercioEstablecimiento(ModificarComercioEstablecimientoWS);
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
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaTipoRecaudos", produces = { "application/json" })
	public @ResponseBody java.util.List<TipoRecaudo> listaTipoRecaudos() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<TipoRecaudo> respuesta = new ArrayList<>();
		respuesta = afiliacionMethods.listaTipoRecaudos();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaPagosPorIdentificacionComercio", produces = { "application/json" })
	public @ResponseBody java.util.List<Pago> listaPagosPorIdentificacionComercio(@RequestBody ListPagosByIdentificacionComercioWS ListPagosByIdentificacionComercioWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<Pago> respuesta = new ArrayList<>();
		respuesta = afiliacionMethods.listaPagosPorIdentificacionComercio(ListPagosByIdentificacionComercioWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaEstablecimientos", produces = { "application/json" })
	public @ResponseBody java.util.List<Establecimiento> listaEstablecimientos() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<Establecimiento> respuesta = new ArrayList<>();
		respuesta = afiliacionMethods.listaEstablecimientos();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaComercioEstablecimiento", produces = { "application/json" })
	public @ResponseBody java.util.List<ComercioEstabl> listaComercioEstablecimiento(@RequestBody com.cbp3.ws.cbp.service.ListaComercioEstablecimientosWS ListaComercioEstablecimientosWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<ComercioEstabl> respuesta = new ArrayList<>();
		respuesta = afiliacionMethods.listaComercioEstablecimiento(ListaComercioEstablecimientosWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaRecaudosByComercio", produces = { "application/json" })
	public @ResponseBody java.util.List<Recaudo> listaRecaudosByComercio(@RequestBody ListRecaudosByComercioWS ListRecaudosByComercioWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<Recaudo> respuesta = new ArrayList<>();
		respuesta = afiliacionMethods.listaRecaudosByComercio(ListRecaudosByComercioWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@RequestMapping(value = "/uploadDocuments", method = RequestMethod.POST, consumes = { "multipart/form-data" })
	public @ResponseBody AsociarComercioRecaudoWSResponse guardar(MultipartHttpServletRequest files , HttpServletResponse response, HttpServletRequest reques){
		
		AsociarComercioRecaudoWSResponse respuesta = new AsociarComercioRecaudoWSResponse();
		AsociarComercioRecaudoWS asociarComercioRecaudo = new AsociarComercioRecaudoWS();
		Map<String, String[]> map = reques.getParameterMap();
		//System.out.println("reques-- "+map);
		
		Comercio comercio = new Comercio();
		Tipoidentificacion tipo = new Tipoidentificacion();
		
		  for (Map.Entry<String,  String[]> entry : map.entrySet()) {
			  
			    String key = entry.getKey();
			    String[] value = entry.getValue();
			    // ...
			    
			    //System.out.println(key);
			    
			    if(key.equals("recaudoVerificado")){
			    	System.out.println("recaudoVerificado "+value[0]);
			    	asociarComercioRecaudo.setRecaudoVerificado(value[0]);
			    	
			    }else if(key.equals("fechaVigencia")) {
			    	System.out.println("fechaVigencia "+value[0]);
			    	asociarComercioRecaudo.setFechaVigencia(value[0]);
			    	
			    }else if(key.equals("actividadComercial")) {
			    	System.out.println("actividadComercial "+value[0]);
			    	comercio.setActividadComercial(value[0]);
			    	
			    }else if(key.equals("afiliadoOtroBanco")) {
			    	System.out.println("afiliadoOtroBanco "+value[0]);
			    	comercio.setAfiliadoOtroBanco(value[0]);
			    	
			    }else if(key.equals("codigoUsuarioCarga")) {
			    	System.out.println("codigoUsuarioCarga "+value[0]);
			    	comercio.setCodigoUsuarioCarga(Long.parseLong(value[0]));
			    	
			    }else if(key.equals("codigoUsuarioModifica")) {
			    	System.out.println("codigoUsuarioModifica "+value[0]);
			    	comercio.setCodigoUsuarioModifica(Long.parseLong(value[0]));
			    	
			    }else if(key.equals("comercioId")) {
			    	System.out.println("comercioId "+value[0]);
			    	comercio.setComercioId(Long.parseLong(value[0]));
			    	
			    }else if(key.equals("email")) {
			    	System.out.println("email "+value[0]);
			    	comercio.setEmail(value[0]);
			    	
			    }else if(key.equals("fechaCargaDatos")) {
			    	System.out.println("fechaCargaDatos "+value[0]);
			    	String valor = value[0];
			    	try {
						comercio.setFechaCargaDatos(formatStringToXmlGregorianCalendar(valor));
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	
			    }else if(key.equals("fechaHoraModificacion")) {
			    	System.out.println("fechaHoraModificacion "+value[0]);
			    	String valor = value[0];
			    	try {
						comercio.setFechaHoraModificacion(formatStringToXmlGregorianCalendar(valor));
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	
			    }else if(key.equals("horaFin")) {
			    	System.out.println("horaFin "+value[0]);
			    	comercio.setHoraFin(value[0]);
			    	
			    }else if(key.equals("horaInicio")) {
			    	System.out.println("horaInicio "+value[0]);
			    	comercio.setHoraInicio(value[0]);
			    	
			    }else if(key.equals("identificacionComercio")) {
			    	System.out.println("identificacionComercio "+value[0]);
			    	comercio.setIdentificacionComercio(value[0]);
			    	
			    }else if(key.equals("nombreComercial")) {
			    	System.out.println("nombreComercial "+value[0]);
			    	comercio.setNombreComercial(value[0]);
			    	
			    }else if(key.equals("nombreEmpresarial")) {
			    	System.out.println("nombreEmpresarial "+value[0]);
			    	comercio.setNombreEmpresarial(value[0]);
			    	
			    }else if(key.equals("numCuentaAsociado")) {
			    	System.out.println("numCuentaAsociado "+value[0]);
			    	comercio.setNumCuentaAsociado(value[0]);
			    	
			    }else if(key.equals("statusComercio")) {
			    	System.out.println("statusComercio "+value[0]);
			    	comercio.setStatusComercio(value[0]);
			    	
			    }else if(key.equals("telefonoAlternativo")) {
			    	System.out.println("telefonoAlternativo "+value[0]);
			    	comercio.setTelefonoAlternativo(value[0]);
			    	
			    }else if(key.equals("telefonoContacto")) {
			    	System.out.println("telefonoContacto "+value[0]);
			    	comercio.setTelefonoContacto(value[0]);
			    	
			    }else if(key.equals("telefonoLocal")) {
			    	System.out.println("telefonoLocal "+value[0]);
			    	comercio.setTelefonoLocal(value[0]);
			    	
			    }else if(key.equals("Tipoidentificacion_nombre")) {
			    	System.out.println("Tipoidentificacion_nombre "+value[0]);
			    	tipo.setNombre(value[0]);
			    	
			    }else if(key.equals("Tipoidentificacion_tipoIdentificacionId")) {
			    	System.out.println("Tipoidentificacion_tipoIdentificacionId "+value[0]);
			    	tipo.setTipoIdentificacionId(Long.parseLong(value[0]));
			    	
			    }
			    
			    //log.info("Varieables: {}","key:"+key+"="+value[0]);
			}
		  
		  comercio.setTipoIdentificacionId(tipo);
		  asociarComercioRecaudo.setComercioId(comercio);
		  
			Iterator<String> itr =  files.getFileNames();
			MultipartFile mpf=null;
		  	String statusFile="";
		  	
		   while(itr.hasNext()) {	
			  mpf = files.getFile(itr.next());
			  System.out.println("mpf "+mpf.getName());
			   //log.info("files que llego: {}",mpf.getOriginalFilename());
			   //log.info("filesInput que llego: {}",mpf.getName());
			
				try {
			
					if(mpf.getName().equals("fileCedulaRepresentanteInformationName")){
						statusFile=upload.copy(mpf);
						System.out.println(statusFile);
						asociarComercioRecaudo.setRecaudoNombre(statusFile);
						
						TipoRecaudo tipoRecaudo = new TipoRecaudo();
						tipoRecaudo.setTipoRecaudoId(Long.parseLong("1"));
						tipoRecaudo.setTipoRecaudoNombre("CEDULA REPRESENTANTE LEGAL");
						
						asociarComercioRecaudo.setTipoRecaudoId(tipoRecaudo);
						asociarComercioRecaudo.setUbicacion("C:\\pnp\\");
						
						respuesta = afiliacionMethods.asociarComercioRecaudo(asociarComercioRecaudo);
						
					}else if(mpf.getName().equals("fileCedulaContactoInformationName")){
						statusFile=upload.copy(mpf);
						System.out.println(statusFile);
						asociarComercioRecaudo.setRecaudoNombre(statusFile);
						
						TipoRecaudo tipoRecaudo = new TipoRecaudo();
						tipoRecaudo.setTipoRecaudoId(Long.parseLong("2"));
						tipoRecaudo.setTipoRecaudoNombre("CEDULA CONTACTO");
						
						asociarComercioRecaudo.setTipoRecaudoId(tipoRecaudo);
						asociarComercioRecaudo.setUbicacion("C:\\pnp\\");
						
						respuesta = afiliacionMethods.asociarComercioRecaudo(asociarComercioRecaudo);
						
					}else if(mpf.getName().equals("fileNegocioInformationName")){
						statusFile=upload.copy(mpf);
						System.out.println(statusFile);
						asociarComercioRecaudo.setRecaudoNombre(statusFile);
						
						TipoRecaudo tipoRecaudo = new TipoRecaudo();
						tipoRecaudo.setTipoRecaudoId(Long.parseLong("3"));
						tipoRecaudo.setTipoRecaudoNombre("FACHADA DEL NEGOCIO");
						
						asociarComercioRecaudo.setTipoRecaudoId(tipoRecaudo);
						asociarComercioRecaudo.setUbicacion("C:\\pnp\\");
						
						respuesta = afiliacionMethods.asociarComercioRecaudo(asociarComercioRecaudo);
						
					}
			
				} catch (IOException e) {
					e.printStackTrace();
				}
				
		  }
		   
		   
		   /*
		   RespuestaDTO res= new RespuestaDTO();
		  
		   if(statusFile.equals("")) {
			   //no se subio el archivo
			   res.setDescripcion("upload File fail");
		   }else {
			   
			   res=clienteSer.procesarArchivosCliente(car);
			   //log.info("Carga de Datos: {}",car.toString());
			   //log.info("Resultado de solicitud: {}",res.getDescripcion());
		   }
		   
	*/
		  
		return  respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@RequestMapping(value = "/modificarDocumentsRepresentante", method = RequestMethod.POST, consumes = { "multipart/form-data" })
	public @ResponseBody ModificarAsociarComercioRecaudoWSResponse modificarRepresentante(MultipartHttpServletRequest files , HttpServletResponse response, HttpServletRequest reques){
		
		ModificarAsociarComercioRecaudoWSResponse respuesta = new ModificarAsociarComercioRecaudoWSResponse();
		ModificarAsociarComercioRecaudoWS modificarComercioRecaudo = new ModificarAsociarComercioRecaudoWS();
		Map<String, String[]> map = reques.getParameterMap();
		
		TipoRecaudo tipoRecaudo = new TipoRecaudo();
		
		  for (Map.Entry<String,  String[]> entry : map.entrySet()) {
			  
			    String key = entry.getKey();
			    String[] value = entry.getValue();
			    // ...
			    
			    if(key.equals("tipoRecaudoId")){
			    	System.out.println("tipoRecaudoId "+value[0]);
			    	tipoRecaudo.setTipoRecaudoId(Long.parseLong(value[0]));
			    	
			    }else if(key.equals("tipoRecaudoNombre")) {
			    	System.out.println("tipoRecaudoNombre "+value[0]);
			    	tipoRecaudo.setTipoRecaudoNombre(value[0]);
			    	
			    }else if(key.equals("idRecaudo")) {
			    	System.out.println("idRecaudo "+value[0]);
			    	modificarComercioRecaudo.setIdRecaudo(Long.parseLong(value[0]));
			    	
			    }else if(key.equals("ubicacion")) {
			    	System.out.println("ubicacion "+value[0]);
			    	modificarComercioRecaudo.setUbicacion(value[0]);
			    	
			    }else if(key.equals("recaudoVerificado")) {
			    	System.out.println("recaudoVerificado "+value[0]);
			    	modificarComercioRecaudo.setRecaudoVerificado(value[0]);
			    	
			    }else if(key.equals("fechaVigencia")) {
			    	System.out.println("fechaVigencia "+value[0]);
			    	modificarComercioRecaudo.setFechaVigencia(value[0]);
			    	
			    }

			}

		  modificarComercioRecaudo.setTipoRecaudoId(tipoRecaudo);
		  
			Iterator<String> itr =  files.getFileNames();
			MultipartFile mpf=null;
		  	String statusFile="";
		  	
		   while(itr.hasNext()) {	
			  mpf = files.getFile(itr.next());
			  System.out.println("mpf "+mpf.getName());
			
				try {
			
					if(mpf.getName().equals("fileCedulaRepresentanteInformationName")){
						statusFile=upload.copy(mpf);
						System.out.println(statusFile);
						modificarComercioRecaudo.setRecaudoNombre(statusFile);
						
						respuesta = afiliacionMethods.modificarAsociarComercioRecaudo(modificarComercioRecaudo);
						
					}/*else if(mpf.getName().equals("fileCedulaContactoInformationName")){
						statusFile=upload.copy(mpf);
						System.out.println(statusFile);
						asociarComercioRecaudo.setRecaudoNombre(statusFile);
						
						TipoRecaudo tipoRecaudo = new TipoRecaudo();
						tipoRecaudo.setTipoRecaudoId(Long.parseLong("2"));
						tipoRecaudo.setTipoRecaudoNombre("CEDULA CONTACTO");
						
						asociarComercioRecaudo.setTipoRecaudoId(tipoRecaudo);
						asociarComercioRecaudo.setUbicacion("C:\\pnp\\");
						
						respuesta = afiliacionMethods.asociarComercioRecaudo(asociarComercioRecaudo);
						
					}else if(mpf.getName().equals("fileNegocioInformationName")){
						statusFile=upload.copy(mpf);
						System.out.println(statusFile);
						asociarComercioRecaudo.setRecaudoNombre(statusFile);
						
						TipoRecaudo tipoRecaudo = new TipoRecaudo();
						tipoRecaudo.setTipoRecaudoId(Long.parseLong("3"));
						tipoRecaudo.setTipoRecaudoNombre("FACHADA DEL NEGOCIO");
						
						asociarComercioRecaudo.setTipoRecaudoId(tipoRecaudo);
						asociarComercioRecaudo.setUbicacion("C:\\pnp\\");
						
						respuesta = afiliacionMethods.asociarComercioRecaudo(asociarComercioRecaudo);
						
					}*/
			
				} catch (IOException e) {
					e.printStackTrace();
				}
				
		  }
		  
		return  respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@RequestMapping(value = "/modificarDocumentsContacto", method = RequestMethod.POST, consumes = { "multipart/form-data" })
	public @ResponseBody ModificarAsociarComercioRecaudoWSResponse modificarContacto(MultipartHttpServletRequest files , HttpServletResponse response, HttpServletRequest reques){
		
		ModificarAsociarComercioRecaudoWSResponse respuesta = new ModificarAsociarComercioRecaudoWSResponse();
		ModificarAsociarComercioRecaudoWS modificarComercioRecaudo = new ModificarAsociarComercioRecaudoWS();
		Map<String, String[]> map = reques.getParameterMap();
		
		TipoRecaudo tipoRecaudo = new TipoRecaudo();
		
		  for (Map.Entry<String,  String[]> entry : map.entrySet()) {
			  
			    String key = entry.getKey();
			    String[] value = entry.getValue();
			    // ...
			    
			    if(key.equals("tipoRecaudoId")){
			    	System.out.println("tipoRecaudoId "+value[0]);
			    	tipoRecaudo.setTipoRecaudoId(Long.parseLong(value[0]));
			    	
			    }else if(key.equals("tipoRecaudoNombre")) {
			    	System.out.println("tipoRecaudoNombre "+value[0]);
			    	tipoRecaudo.setTipoRecaudoNombre(value[0]);
			    	
			    }else if(key.equals("idRecaudo")) {
			    	System.out.println("idRecaudo "+value[0]);
			    	modificarComercioRecaudo.setIdRecaudo(Long.parseLong(value[0]));
			    	
			    }else if(key.equals("ubicacion")) {
			    	System.out.println("ubicacion "+value[0]);
			    	modificarComercioRecaudo.setUbicacion(value[0]);
			    	
			    }else if(key.equals("recaudoVerificado")) {
			    	System.out.println("recaudoVerificado "+value[0]);
			    	modificarComercioRecaudo.setRecaudoVerificado(value[0]);
			    	
			    }else if(key.equals("fechaVigencia")) {
			    	System.out.println("fechaVigencia "+value[0]);
			    	modificarComercioRecaudo.setFechaVigencia(value[0]);
			    	
			    }

			}

		  modificarComercioRecaudo.setTipoRecaudoId(tipoRecaudo);
		  
			Iterator<String> itr =  files.getFileNames();
			MultipartFile mpf=null;
		  	String statusFile="";
		  	
		   while(itr.hasNext()) {	
			  mpf = files.getFile(itr.next());
			  System.out.println("mpf "+mpf.getName());
			
				try {
					/*
					if(mpf.getName().equals("fileCedulaRepresentanteInformationName")){
						statusFile=upload.copy(mpf);
						System.out.println(statusFile);
						modificarComercioRecaudo.setRecaudoNombre(statusFile);
						
						respuesta = afiliacionMethods.modificarAsociarComercioRecaudo(modificarComercioRecaudo);
						
					}*/
					if(mpf.getName().equals("fileCedulaContactoInformationName")){
						statusFile=upload.copy(mpf);
						System.out.println(statusFile);
						modificarComercioRecaudo.setRecaudoNombre(statusFile);
						
						respuesta = afiliacionMethods.modificarAsociarComercioRecaudo(modificarComercioRecaudo);
						
					}
					/*
					if(mpf.getName().equals("fileNegocioInformationName")){
						statusFile=upload.copy(mpf);
						System.out.println(statusFile);
						asociarComercioRecaudo.setRecaudoNombre(statusFile);
						
						TipoRecaudo tipoRecaudo = new TipoRecaudo();
						tipoRecaudo.setTipoRecaudoId(Long.parseLong("3"));
						tipoRecaudo.setTipoRecaudoNombre("FACHADA DEL NEGOCIO");
						
						asociarComercioRecaudo.setTipoRecaudoId(tipoRecaudo);
						asociarComercioRecaudo.setUbicacion("C:\\pnp\\");
						
						respuesta = afiliacionMethods.asociarComercioRecaudo(asociarComercioRecaudo);
						
					}*/
			
				} catch (IOException e) {
					e.printStackTrace();
				}
				
		  }
		  
		return  respuesta;
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@RequestMapping(value = "/modificarDocumentsFachada", method = RequestMethod.POST, consumes = { "multipart/form-data" })
	public @ResponseBody ModificarAsociarComercioRecaudoWSResponse modificarFachada(MultipartHttpServletRequest files , HttpServletResponse response, HttpServletRequest reques){
		
		ModificarAsociarComercioRecaudoWSResponse respuesta = new ModificarAsociarComercioRecaudoWSResponse();
		ModificarAsociarComercioRecaudoWS modificarComercioRecaudo = new ModificarAsociarComercioRecaudoWS();
		Map<String, String[]> map = reques.getParameterMap();
		
		TipoRecaudo tipoRecaudo = new TipoRecaudo();
		
		  for (Map.Entry<String,  String[]> entry : map.entrySet()) {
			  
			    String key = entry.getKey();
			    String[] value = entry.getValue();
			    // ...
			    
			    if(key.equals("tipoRecaudoId")){
			    	System.out.println("tipoRecaudoId "+value[0]);
			    	tipoRecaudo.setTipoRecaudoId(Long.parseLong(value[0]));
			    	
			    }else if(key.equals("tipoRecaudoNombre")) {
			    	System.out.println("tipoRecaudoNombre "+value[0]);
			    	tipoRecaudo.setTipoRecaudoNombre(value[0]);
			    	
			    }else if(key.equals("idRecaudo")) {
			    	System.out.println("idRecaudo "+value[0]);
			    	modificarComercioRecaudo.setIdRecaudo(Long.parseLong(value[0]));
			    	
			    }else if(key.equals("ubicacion")) {
			    	System.out.println("ubicacion "+value[0]);
			    	modificarComercioRecaudo.setUbicacion(value[0]);
			    	
			    }else if(key.equals("recaudoVerificado")) {
			    	System.out.println("recaudoVerificado "+value[0]);
			    	modificarComercioRecaudo.setRecaudoVerificado(value[0]);
			    	
			    }else if(key.equals("fechaVigencia")) {
			    	System.out.println("fechaVigencia "+value[0]);
			    	modificarComercioRecaudo.setFechaVigencia(value[0]);
			    	
			    }

			}

		  modificarComercioRecaudo.setTipoRecaudoId(tipoRecaudo);
		  
			Iterator<String> itr =  files.getFileNames();
			MultipartFile mpf=null;
		  	String statusFile="";
		  	
		   while(itr.hasNext()) {	
			  mpf = files.getFile(itr.next());
			  System.out.println("mpf "+mpf.getName());
			
				try {
					/*
					if(mpf.getName().equals("fileCedulaRepresentanteInformationName")){
						statusFile=upload.copy(mpf);
						System.out.println(statusFile);
						modificarComercioRecaudo.setRecaudoNombre(statusFile);
						
						respuesta = afiliacionMethods.modificarAsociarComercioRecaudo(modificarComercioRecaudo);
						
					}*/
					/*
					if(mpf.getName().equals("fileCedulaContactoInformationName")){
						statusFile=upload.copy(mpf);
						System.out.println(statusFile);
						modificarComercioRecaudo.setRecaudoNombre(statusFile);
						
						respuesta = afiliacionMethods.modificarAsociarComercioRecaudo(modificarComercioRecaudo);
						
					}
					*/
					
					if(mpf.getName().equals("fileNegocioInformationName")){
						statusFile=upload.copy(mpf);
						System.out.println(statusFile);
						modificarComercioRecaudo.setRecaudoNombre(statusFile);
						
						respuesta = afiliacionMethods.modificarAsociarComercioRecaudo(modificarComercioRecaudo);
						
					}
			
				} catch (IOException e) {
					e.printStackTrace();
				}
				
		  }
		  
		return  respuesta;
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
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaPais", produces = { "application/json" })
	public @ResponseBody java.util.List<Pais> listaPais() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<Pais> respuesta = new ArrayList<>();
		respuesta = afiliacionMethods.listaPais();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaProvincias", produces = { "application/json" })
	public @ResponseBody java.util.List<Provincia> listaProvincias(@RequestBody Pais Pais) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<Provincia> respuesta = new ArrayList<>();
		respuesta = afiliacionMethods.listaProvincias(Pais);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////Afiliacion, Almacen /////////////////////////////////////////////////////  
	///////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/menu_afiliacion_ejecutivo", method = RequestMethod.GET)
	public String menu_afiliacion_ejecutivo(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/menu_afiliacion_ejecutivo";
	}
	
	@RequestMapping(value = "/pre_carga_ejecutivo", method = RequestMethod.GET)
	public String pre_carga_ejecutivo(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/pre_carga_ejecutivo";
	}
	
	@RequestMapping(value = "/bandejas_ejecutivo", method = RequestMethod.GET)
	public String bandejas_ejecutivo(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/bandejas_ejecutivo";
	}
	
	@RequestMapping(value = "/confirm_pre_carga/{value1}&{value2}", method = RequestMethod.GET)
	public String confirm_pre_carga(@PathVariable("value1") String value, @PathVariable("value2") String value2, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/confirm_pre_carga_ejecutivo";
	}
	
	@RequestMapping(value = "/compra", method = RequestMethod.GET)
	public String compra(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/compra_ejecutivo";
	}
	
	@RequestMapping(value = "/datos_comercio", method = RequestMethod.GET)
	public String datos_comercio(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/datos_comercio";
	}
	
	@RequestMapping(value = "/representante_legal", method = RequestMethod.GET)
	public String representante_legal(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/representante_legal";
	}
	
	@RequestMapping(value = "/direccion_establecimiento", method = RequestMethod.GET)
	public String direccion_establecimiento(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/direccion_establecimiento";
	}
	
	@RequestMapping(value = "/datos_contacto", method = RequestMethod.GET)
	public String datos_contacto(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/datos_contacto";
	}
	
	@RequestMapping(value = "/informacion_bancos", method = RequestMethod.GET)
	public String informacion_bancos(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/informacion_bancos";
	}
	
	@RequestMapping(value = "/datos_pago", method = RequestMethod.GET)
	public String datos_pago(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/datos_pago";
	}
	
	@RequestMapping(value = "/carga_archivos_ejecutivo", method = RequestMethod.GET)
	public String carga_archivos_ejecutivo(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/carga_archivos_ejecutivo";
	}
	
	@RequestMapping(value = "/bandeja_administrativo", method = RequestMethod.GET)
	public String bandeja_administrativo(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/bandeja_administrativo";
	}
	
	@RequestMapping(value = "/visualizar_administrativo", method = RequestMethod.GET)
	public String visualizar_administrativo(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/visualizar_administrativo";
	}
	
	@RequestMapping(value = "/bandeja_comercial", method = RequestMethod.GET)
	public String bandeja_comercial(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/bandeja_comercial";
	}
	
	@RequestMapping(value = "/verificacion_pago", method = RequestMethod.GET)
	public String verificacion_pago(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/verificacion_datos_pago";
	}
	
	@RequestMapping(value = "/pre_carga_autogestion", method = RequestMethod.GET)
	public String pre_carga_autogestion(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/pre_carga_autogestion";
	}
	
	@RequestMapping(value = "/menu_operador", method = RequestMethod.GET)
	public String menu_operador(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/menu_operador";
	}
	
	@RequestMapping(value = "/pre_carga_operador", method = RequestMethod.GET)
	public String pre_carga_operador(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/pre_carga_operador";
	}
	
	@RequestMapping(value = "/menu_afiliacion", method = RequestMethod.GET)
	public String menu_afiliacion(Model model) {
		
		auth = SecurityContextHolder.getContext().getAuthentication();
		name=auth.getName();
		String roleUser = "";
		roleUser = auth.getAuthorities().iterator().next().getAuthority();
			
		if (auth.getName().equals("esteban")) {
			link="/CBPult/img/esteban.jpeg";
			
		} else if (auth.getName().equals("karla")) {
			link="/CBPult/img/karla.jpeg";
		} else if (auth.getName().equals("admin")) {
			link="/CBPult/img/logo_purple.png";

		} else if (auth.getName().equals("victor")) {
			link="/CBPult/img/logo_purple.png";
		}
		
		model.addAttribute("roleUser", roleUser);
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
		return "templates.afiliacion/menu_afiliacion";
	}
	
	
	
	/**
	 * Url Gestion de configuracion
	 */
	
	
	
	//////////////// Configuración Afiliados ///////////////
	@RequestMapping(value = "/configuration_afiliados", method = RequestMethod.GET)
    public String configuration_afiliados(Model model) {
		auth = SecurityContextHolder.getContext().getAuthentication();
		name=auth.getName();
		String roleUser = "";
		roleUser = auth.getAuthorities().iterator().next().getAuthority();
			
		if (auth.getName().equals("esteban")) {
			link="/CBPult/img/esteban.jpeg";
			
		} else if (auth.getName().equals("karla")) {
			link="/CBPult/img/karla.jpeg";
		} else if (auth.getName().equals("admin")) {
			link="/CBPult/img/logo_purple.png";

		} else if (auth.getName().equals("victor")) {
			link="/CBPult/img/logo_purple.png";
		}
		
		model.addAttribute("roleUser", roleUser);
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
     return "templates.configuration/configuration_afiliados";
	}
	
}
