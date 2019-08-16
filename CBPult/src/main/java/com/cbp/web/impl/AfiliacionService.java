package com.cbp.web.impl;

import java.awt.List;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cbp.web.dao.AfiliacionDAO;
import com.cbp.web.dto.ActiveOrInactiveOperadoraTelefonicaDTO;
import com.cbp.web.dto.AsociarBancoComercioDTO;
import com.cbp.web.dto.AsociarComercioConContactoDTO;
import com.cbp.web.dto.AsociarComercioConRepresentanteLegalDTO;
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
import com.cbp.web.dto.actualizaStatusComercioDTO;
import com.cbp.web.dto.consultaComercioDTO;
import com.cbp.web.dto.crearComercioDTO;
import com.cbp.web.dto.modificarComercioDTO;
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
import com.cbp3.ws.cbp.service.ModificarEstablecimientoWS;
import com.cbp3.ws.cbp.service.ModificarEstablecimientoWSResponse;
import com.cbp3.ws.cbp.service.ModificarOperadorTelefonicoWSResponse;
import com.cbp3.ws.cbp.service.Operadortelefonico;
import com.cbp3.ws.cbp.service.Pago;
import com.cbp3.ws.cbp.service.Pais;
import com.cbp3.ws.cbp.service.Provincia;
import com.cbp3.ws.cbp.service.Recaudo;
import com.cbp3.ws.cbp.service.Solicitud;
import com.cbp3.ws.cbp.service.TipoRecaudo;
import com.cbp3.ws.cbp.service.Tipoidentificacion;
import com.cbp3.ws.cbp.service.UbicacionGeograficaWS;
import com.cbp3.ws.cbp.service.UbicacionGeograficaWS_Service;

@Service
public class AfiliacionService extends Util implements AfiliacionDAO{
	////////////////////////////////
	//Methodo para Crear Comercio...
	public CrearComercioWSResponse crearClienteComercio(crearComercioDTO crearComercio) {
		
		//instanciar Objeto para retorno....
		CrearComercioWSResponse respuestaCrearComercio = new CrearComercioWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHora_inicio(), crearComercio.getHora_finalizacion(), crearComercio.getIdCanal(), crearComercio.getNombreCanal()));			
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
	public ConsultaComercioPorIdentificacionComercioWSResponse consultaComercio(String identificacionComercio) {
		
		//instanciar Objeto para retorno....
		ConsultaComercioPorIdentificacionComercioWSResponse respuestaConsultaComercio = new ConsultaComercioPorIdentificacionComercioWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
			
			respuestaConsultaComercio.setReturn(WSmethod.consultaComercioPorIdentificacionComercioWS(identificacionComercio)); 
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaComercio;
	}
	
	////////////////////////////////////
	//Methodo para Actualizar el status del Comercio...
	public ActualizaStatusComercioWSResponse actualizarStatusComercio(actualizaStatusComercioDTO actualizaStatusComercioDTO) {
	
		//instanciar Objeto para retorno....
		ActualizaStatusComercioWSResponse respuestaActualizarStatusComercio = new ActualizaStatusComercioWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaActualizarStatusComercio.setReturn(WSmethod.actualizaStatusComercioWS(actualizaStatusComercioDTO.getIdentificacionComercio(), actualizaStatusComercioDTO.getStatusComecio())); 
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaActualizarStatusComercio;
	}
	
	////////////////////////////////////
	//Methodo para Modificar el Comercio...
	public ModificarComercioWSResponse modificarComercio(modificarComercioDTO modificarComercioDTO) {
	
		//instanciar Objeto para retorno....
		ModificarComercioWSResponse respuestaModificarComercio = new ModificarComercioWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaModificarComercio.setReturn(WSmethod.modificarComercioWS(modificarComercioDTO.getIdentificacionComercio(), modificarComercioDTO.getNombreEmpresarial(), modificarComercioDTO.getNombreComercial(), modificarComercioDTO.getEmail(), modificarComercioDTO.getTelefonoContacto(), modificarComercioDTO.getTelefonoLocal(), modificarComercioDTO.getNumCuentaAsociado(), modificarComercioDTO.getAfiliadoOtroBanco(), modificarComercioDTO.getActividadComercial(), modificarComercioDTO.getHoraInicio(), modificarComercioDTO.getHoraFin())); 
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaModificarComercio;
	}
	
	////////////////////////////////////
	//Methodo para activar o deshabilitar Operadora Telefonica...
	public ActiveOrInactiveOperadoraTelefonicaWSResponse activeOrInactive(ActiveOrInactiveOperadoraTelefonicaDTO ActiveOrInactiveOperadoraTelefonicaDTO) {
	
		//instanciar Objeto para retorno....
		ActiveOrInactiveOperadoraTelefonicaWSResponse respuestaActiveOrNativeOperadoraTelefonica = new ActiveOrInactiveOperadoraTelefonicaWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaActiveOrNativeOperadoraTelefonica.setReturn(WSmethod.activeOrInactiveOperadoraTelefonicaWS(ActiveOrInactiveOperadoraTelefonicaDTO.getOperadortelfId(), ActiveOrInactiveOperadoraTelefonicaDTO.getActive())); 
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaActiveOrNativeOperadoraTelefonica;
	}
	
	////////////////////////////////////
	//Methodo para asociar banco a un comercio...
	public AsociarBancoComercioWSResponse asociarBanco(AsociarBancoComercioDTO AsociarBancoComercioDTO) {
	
		//instanciar Objeto para retorno....
		AsociarBancoComercioWSResponse respuestaAsociarBancoComercio = new AsociarBancoComercioWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaAsociarBancoComercio.setReturn(WSmethod.asociarBancoComercioWS(AsociarBancoComercioDTO.getIdEntityBanck(), AsociarBancoComercioDTO.getIdComercio(), AsociarBancoComercioDTO.getNumeroAfiliacion(), AsociarBancoComercioDTO.getNumTerminalesComprar(), AsociarBancoComercioDTO.getOperadorTelefonicoId(), AsociarBancoComercioDTO.getCantidadLineasOperador())); 
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaAsociarBancoComercio;
	}
	
	////////////////////////////////////
	//Methodo para consultar banco afiliado...
	public ConsultaBancoAfiliacionByIdWSResponse consultaBancoAfiliacionId(String idAsociacion) {
	
		//instanciar Objeto para retorno....
		ConsultaBancoAfiliacionByIdWSResponse respuestaConsultaBancoAfiliacion = new ConsultaBancoAfiliacionByIdWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaConsultaBancoAfiliacion.setReturn(WSmethod.consultaBancoAfiliacionByIdWS(Long.parseLong(idAsociacion))); 
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaBancoAfiliacion;
	}
	
	////////////////////////////////////
	//Methodo para crear operador Telefonico...
	public CrearOperadorTelefonicoWSResponse crearOperadorTelefonico(CrearOperadorTelefonicoDTO CrearOperadorTelefonicoDTO) {
	
		//instanciar Objeto para retorno....
		CrearOperadorTelefonicoWSResponse respuestaCrearOperadorTelefonico = new CrearOperadorTelefonicoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaCrearOperadorTelefonico.setReturn(WSmethod.crearOperadorTelefonicoWS(CrearOperadorTelefonicoDTO.getNombreOperador(), CrearOperadorTelefonicoDTO.getCodOperador(), CrearOperadorTelefonicoDTO.getActive())); 
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearOperadorTelefonico;
	}
	
	////////////////////////////////////
	//Methodo para editar Asociacion Banco del Comercio...
	public EditarAsociacionBancoComercioWSResponse editarAsociacionBancoComercio(EditarAsociacionBancoComercioDTO EditarAsociacionBancoComercioDTO) {
	
		//instanciar Objeto para retorno....
		EditarAsociacionBancoComercioWSResponse respuestaEditarAsociacionBancoComercio = new EditarAsociacionBancoComercioWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaEditarAsociacionBancoComercio.setReturn(WSmethod.editarAsociacionBancoComercioWS(EditarAsociacionBancoComercioDTO.getIdAsociacion(), EditarAsociacionBancoComercioDTO.getIdEntityBanck(), EditarAsociacionBancoComercioDTO.getNumeroAfiliacion(), EditarAsociacionBancoComercioDTO.getNumTerminalesComprar(), EditarAsociacionBancoComercioDTO.getOperadorTelefonicoId(), EditarAsociacionBancoComercioDTO.getCantidadLineasOperador())); 
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaEditarAsociacionBancoComercio;
	}
	
	////////////////////////////////////
	//Methodo para modificar operadores telefonicos...
	public ModificarOperadorTelefonicoWSResponse modificarOperadorTelefonico(ModificarOperadorTelefonicoDTO ModificarOperadorTelefonicoDTO) {
	
		//instanciar Objeto para retorno....
		ModificarOperadorTelefonicoWSResponse respuestaModificarOperadorTelefonico = new ModificarOperadorTelefonicoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaModificarOperadorTelefonico.setReturn(WSmethod.modificarOperadorTelefonicoWS(ModificarOperadorTelefonicoDTO.getOperadortelfId(), ModificarOperadorTelefonicoDTO.getNombreOperador(), ModificarOperadorTelefonicoDTO.getCodOperador()));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaModificarOperadorTelefonico;
	}
	
	////////////////////////////////////
	//Methodo para Asociar comercio con Contacto...
	public AsociarComercioConContactoWSResponse asociarComercioConContacto(AsociarComercioConContactoDTO AsociarComercioConContactoDTO) {
	
		//instanciar Objeto para retorno....
		AsociarComercioConContactoWSResponse respuestaAsociarComercioConContacto = new AsociarComercioConContactoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaAsociarComercioConContacto.setReturn(WSmethod.asociarComercioConContactoWS(AsociarComercioConContactoDTO.getComercioId(), AsociarComercioConContactoDTO.getContactoId()));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaAsociarComercioConContacto;
	}
	
	////////////////////////////////////
	//Methodo para Asociar comercio con Representante legal...
	public AsociarComercioConRepresentanteLegalWSResponse asociarComercioConRepresentanteLegal(AsociarComercioConRepresentanteLegalDTO AsociarComercioConRepresentanteLegalDTO) {
	
		//instanciar Objeto para retorno....
		AsociarComercioConRepresentanteLegalWSResponse respuestaAsociarComercioConRepresentanteLegal = new AsociarComercioConRepresentanteLegalWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaAsociarComercioConRepresentanteLegal.setReturn(WSmethod.asociarComercioConRepresentanteLegalWS(AsociarComercioConRepresentanteLegalDTO.getComercioId(), AsociarComercioConRepresentanteLegalDTO.getRepresentanteId()));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaAsociarComercioConRepresentanteLegal;
	}
	
	////////////////////////////////////
	//Methodo para consultar Contacto por Identificacion...
	public ConsultaContactoByIdentificacionContactoWSResponse consultaContactoByIdentificacionContacto(String identificacionContacto) {
	
		//instanciar Objeto para retorno....
		ConsultaContactoByIdentificacionContactoWSResponse respuestaConsultaByIdentificacionContacto = new ConsultaContactoByIdentificacionContactoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaConsultaByIdentificacionContacto.setReturn(WSmethod.consultaContactoByIdentificacionContactoWS(identificacionContacto));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaByIdentificacionContacto;
	}
	
	////////////////////////////////////
	//Methodo para consultar Representante legal por Identificacion...
	public ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse consultaRepresentanteLegalByIdentificacionRepresentante(String identificacionRepresentante) {
	
		//instanciar Objeto para retorno....
		ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse respuestaConsultaRepresentanteLegalByIdentificacionRepresentante = new ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaConsultaRepresentanteLegalByIdentificacionRepresentante.setReturn(WSmethod.consultaRepresentanteLegalByIdentificacionRepresentanteWS(identificacionRepresentante));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaRepresentanteLegalByIdentificacionRepresentante;
	}
	
	////////////////////////////////////
	//Methodo para Crear Contacto...
	public CrearContactoWSResponse crearContacto(CrearContactoDTO CrearContactoDTO) {
	
		//instanciar Objeto para retorno....
		CrearContactoWSResponse respuestaCrearContacto = new CrearContactoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaCrearContacto.setReturn(WSmethod.crearContactoWS(CrearContactoDTO.getTipoIdentificacionId(), CrearContactoDTO.getIdentificacionContacto(), CrearContactoDTO.getTelefonoCelular(), CrearContactoDTO.getPrimerNombre(), CrearContactoDTO.getSegundoNombre(), CrearContactoDTO.getPrimerApellido(), CrearContactoDTO.getSegundoApellido(), CrearContactoDTO.getCargoContacto(), CrearContactoDTO.getTelefonoLocal(), CrearContactoDTO.getEmailContacto()));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearContacto;
	}
	
	////////////////////////////////////
	//Methodo para Crear Representante Legal...
	public CrearRepresentanteLegalWSResponse crearRepresentanteLegal(CrearRepresentanteLegalDTO CrearRepresentanteLegalDTO) {
	
		//instanciar Objeto para retorno....
		CrearRepresentanteLegalWSResponse respuestaCrearRepresentanteLegal = new CrearRepresentanteLegalWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaCrearRepresentanteLegal.setReturn(WSmethod.crearRepresentanteLegalWS(CrearRepresentanteLegalDTO.getTipoIdentificacionId(), CrearRepresentanteLegalDTO.getIdentificacionRepresentante(), CrearRepresentanteLegalDTO.getPrimerNombre(), CrearRepresentanteLegalDTO.getSegundoNombre(), CrearRepresentanteLegalDTO.getPrimerApellido(), CrearRepresentanteLegalDTO.getSegundoApellido(), CrearRepresentanteLegalDTO.getTelefonoLocal(), CrearRepresentanteLegalDTO.getTelefonoCelular(), CrearRepresentanteLegalDTO.getEmailRepresentante(), CrearRepresentanteLegalDTO.getStatusRepresentante()));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearRepresentanteLegal;
	}
	
	////////////////////////////////////
	//Methodo para Editar Asociacion Comercio con Contacto...
	public EditarAsociacionComercioConContactoWSResponse editarAsociacionComercioConContacto(EditarAsociacionComercioConContactoDTO EditarAsociacionComercioConContactoDTO) {
	
		//instanciar Objeto para retorno....
		EditarAsociacionComercioConContactoWSResponse respuestaEditarAsociacionComercioConContacto = new EditarAsociacionComercioConContactoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaEditarAsociacionComercioConContacto.setReturn(WSmethod.editarAsociacionComercioConContactoWS(EditarAsociacionComercioConContactoDTO.getComercioId(), EditarAsociacionComercioConContactoDTO.getContactoId()));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaEditarAsociacionComercioConContacto;
	}
	
	////////////////////////////////////
	//Methodo para Editar Asociacion Comercio con Representante Legal...
	public EditarAsociacionComercioConRepresentanteLegalWSResponse editarAsociacionComercioConRepresentanteLegal(EditarAsociacionComercioConRepresentanteLegalDTO EditarAsociacionComercioConRepresentanteLegalDTO) {
	
		//instanciar Objeto para retorno....
		EditarAsociacionComercioConRepresentanteLegalWSResponse respuestaEditarAsociacionComercioConRepresentanteLegal = new EditarAsociacionComercioConRepresentanteLegalWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaEditarAsociacionComercioConRepresentanteLegal.setReturn(WSmethod.editarAsociacionComercioConRepresentanteLegalWS(EditarAsociacionComercioConRepresentanteLegalDTO.getComercioId(), EditarAsociacionComercioConRepresentanteLegalDTO.getRepresentanteId()));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaEditarAsociacionComercioConRepresentanteLegal;
	}
	
	////////////////////////////////////
	//Methodo para Editar Contacto...
	public EditarContactoWSResponse editarContacto(EditarContactoDTO EditarContactoDTO) {
	
		//instanciar Objeto para retorno....
		EditarContactoWSResponse respuestaEditarContacto = new EditarContactoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaEditarContacto.setReturn(WSmethod.editarContactoWS(EditarContactoDTO.getIdentificacionContacto(), EditarContactoDTO.getTelefonoCelular(), EditarContactoDTO.getPrimerNombre(), EditarContactoDTO.getSegundoNombre(), EditarContactoDTO.getPrimerApellido(), EditarContactoDTO.getSegundoApellido(), EditarContactoDTO.getCargoContacto(), EditarContactoDTO.getTelefonoLocal(), EditarContactoDTO.getEmailContacto()));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaEditarContacto;
	}
	
	////////////////////////////////////
	//Methodo para Editar Representante Legal...
	public EditarRepresentanteLegalWSResponse editarRepresentanteLegal(EditarRepresentanteLegalDTO EditarRepresentanteLegalDTO) {
	
		//instanciar Objeto para retorno....
		EditarRepresentanteLegalWSResponse respuestaEditarRepresentanteLegal = new EditarRepresentanteLegalWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaEditarRepresentanteLegal.setReturn(WSmethod.editarRepresentanteLegalWS(EditarRepresentanteLegalDTO.getIdentificacionRepresentante(), EditarRepresentanteLegalDTO.getIdentificacionRepresentante(), EditarRepresentanteLegalDTO.getSegundoNombre(), EditarRepresentanteLegalDTO.getPrimerApellido(), EditarRepresentanteLegalDTO.getSegundoApellido(), EditarRepresentanteLegalDTO.getTelefonoLocal(), EditarRepresentanteLegalDTO.getTelefonoCelular(), EditarRepresentanteLegalDTO.getEmailRepresentante()));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaEditarRepresentanteLegal;
	}
	
	////////////////////////////////////
	//Methodo para Consultar Asociacion COmercio COntacto...
	public ConsultaAsociacionComercioContactoWSResponse consultaAsociacionComercioContacto(String comercioId) {
	
		//instanciar Objeto para retorno....
		ConsultaAsociacionComercioContactoWSResponse respuestaConsultaAsociacionComercioContacto = new ConsultaAsociacionComercioContactoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaConsultaAsociacionComercioContacto.setReturn(WSmethod.consultaAsociacionComercioContactoWS(Long.parseLong(comercioId)));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaAsociacionComercioContacto;
	}
	
	////////////////////////////////////
	//Methodo para Consultar Asociacion COmercio Representante...
	public ConsultaAsociacionComercioRepresentanteWSResponse consultaAsociacionComercioRepresentante(String comercioId) {
	
		//instanciar Objeto para retorno....
		ConsultaAsociacionComercioRepresentanteWSResponse respuestaConsultaAsociacionComercioRepresentante = new ConsultaAsociacionComercioRepresentanteWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaConsultaAsociacionComercioRepresentante.setReturn(WSmethod.consultaAsociacionComercioRepresentanteWS(Long.parseLong(comercioId)));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaAsociacionComercioRepresentante;
	}
	
	////////////////////////////////////
	//Methodo para Asociar un Comercio con Otro Banco...
	public AsociarComercioOtroBancoWSResponse asociarComercioOtroBanco(AsociarComercioOtroBancoWS AsociarComercioOtroBancoWS) {
	
		//instanciar Objeto para retorno....
		AsociarComercioOtroBancoWSResponse respuestaAsociarComercioOtroBanco = new AsociarComercioOtroBancoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaAsociarComercioOtroBanco.setReturn(WSmethod.asociarComercioOtroBancoWS(AsociarComercioOtroBancoWS.getNombreBanco(), AsociarComercioOtroBancoWS.getTipoPos(), AsociarComercioOtroBancoWS.getCantidadPos(), AsociarComercioOtroBancoWS.getComercioId()));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaAsociarComercioOtroBanco;
	}
	
	////////////////////////////////////
	//Methodo para Consultar Asociacion Comercio con Otro Banco...
	public ConsultaAsociacionComercioOtroBancoWSResponse consultaAsociacionComercioOtroBanco(String comercioId) {
	
		//instanciar Objeto para retorno....
		ConsultaAsociacionComercioOtroBancoWSResponse respuestaConsultaAsociacionComercioOtroBanco = new ConsultaAsociacionComercioOtroBancoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaConsultaAsociacionComercioOtroBanco.setReturn(WSmethod.consultaAsociacionComercioOtroBancoWS(Long.parseLong(comercioId)));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaAsociacionComercioOtroBanco;
	}
	
	////////////////////////////////////
	//Methodo para Modificar Asociacion Comercio con Otro Banco...
	public ModificarAsociacionComercioOtroBancoWSResponse modificarAsociacionComercioOtroBanco(ModificarAsociacionComercioOtroBancoWS ModificarAsociacionComercioOtroBancoWS) {
	
		//instanciar Objeto para retorno....
		ModificarAsociacionComercioOtroBancoWSResponse respuestaModificarAsociacionComercioOtroBanco = new ModificarAsociacionComercioOtroBancoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaModificarAsociacionComercioOtroBanco.setReturn(WSmethod.modificarAsociacionComercioOtroBancoWS(ModificarAsociacionComercioOtroBancoWS.getNombreBanco(), ModificarAsociacionComercioOtroBancoWS.getTipoPos(), ModificarAsociacionComercioOtroBancoWS.getCantidadPos(), ModificarAsociacionComercioOtroBancoWS.getComercioId()));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaModificarAsociacionComercioOtroBanco;
	}
	
	////////////////////////////////////
	//Methodo para Asociar Comercio Recaudo...
	public AsociarComercioRecaudoWSResponse asociarComercioRecaudo(AsociarComercioRecaudoWS AsociarComercioRecaudoWS) {
	
		//instanciar Objeto para retorno....
		AsociarComercioRecaudoWSResponse respuestaAsociarComercioRecaudo = new AsociarComercioRecaudoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaAsociarComercioRecaudo.setReturn(WSmethod.asociarComercioRecaudoWS(AsociarComercioRecaudoWS.getRecaudoNombre(), AsociarComercioRecaudoWS.getUbicacion(), AsociarComercioRecaudoWS.getRecaudoVerificado(), AsociarComercioRecaudoWS.getFechaVigencia(), AsociarComercioRecaudoWS.getComercioId(), AsociarComercioRecaudoWS.getTipoRecaudoId()));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaAsociarComercioRecaudo;
	}
	
	////////////////////////////////////
	//Methodo para Consultar Comercio por ComercioId...
	public ConsultaComercioPorComercioIdWSResponse consultaComercioPorComercioId(String comercioId) {
	
		//instanciar Objeto para retorno....
		ConsultaComercioPorComercioIdWSResponse respuestaConsultaComercioPorComercioId = new ConsultaComercioPorComercioIdWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaConsultaComercioPorComercioId.setReturn(WSmethod.consultaComercioPorComercioIdWS(comercioId));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaComercioPorComercioId;
	}
	
	////////////////////////////////////
	//Methodo para Consultar Pago por Numero Comprobante Recibo...
	public ConsultaPagoByNumComprobanteReciboWSResponse consultaPagoByNumComprobanteRecibo(String numComprobanteRecibo) {
	
		//instanciar Objeto para retorno....
		ConsultaPagoByNumComprobanteReciboWSResponse respuestaConsultaPagoByNumComprobanteRecibo = new ConsultaPagoByNumComprobanteReciboWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaConsultaPagoByNumComprobanteRecibo.setReturn(WSmethod.consultaPagoByNumComprobanteReciboWS(numComprobanteRecibo));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaPagoByNumComprobanteRecibo;
	}
	
	////////////////////////////////////
	//Methodo para Consultar Tipo Recaudo por Id Tipo Recaudo...
	public ConsultaTipoRecaudoByIdTipoRecaudoWSResponse consultaTipoRecaudoByIdTipoRecaudo(String tipoRecaudoId) {
	
		//instanciar Objeto para retorno....
		ConsultaTipoRecaudoByIdTipoRecaudoWSResponse respuestaConsultaTipoRecaudoByIdTipoRecaudo = new ConsultaTipoRecaudoByIdTipoRecaudoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaConsultaTipoRecaudoByIdTipoRecaudo.setReturn(WSmethod.consultaTipoRecaudoByIdTipoRecaudoWS(Long.parseLong(tipoRecaudoId)));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaTipoRecaudoByIdTipoRecaudo;
	}
	
	////////////////////////////////////
	//Methodo para Crear Pago del Comercio...
	public CrearPagoComercioWSResponse crearPagoComercio(CrearPagoComercioWS CrearPagoComercioWS) {
	
		//instanciar Objeto para retorno....
		CrearPagoComercioWSResponse respuestaCrearPagoComercio = new CrearPagoComercioWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaCrearPagoComercio.setReturn(WSmethod.crearPagoComercioWS(CrearPagoComercioWS.getModoPago(), CrearPagoComercioWS.getNumComprobanteRecibo(), CrearPagoComercioWS.getPagoStatus(), CrearPagoComercioWS.getComercioId(), CrearPagoComercioWS.getEntityBankName()));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearPagoComercio;
	}
	
	////////////////////////////////////
	//Methodo para Modificar Asocicion Comercio con Recaudo...
	public ModificarAsociarComercioRecaudoWSResponse modificarAsociarComercioRecaudo(ModificarAsociarComercioRecaudoWS ModificarAsociarComercioRecaudoWS) {
	
		//instanciar Objeto para retorno....
		ModificarAsociarComercioRecaudoWSResponse respuestaModificarAsociarComercioRecaudo = new ModificarAsociarComercioRecaudoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaModificarAsociarComercioRecaudo.setReturn(WSmethod.modificarAsociarComercioRecaudoWS(ModificarAsociarComercioRecaudoWS.getIdRecaudo(), ModificarAsociarComercioRecaudoWS.getRecaudoNombre(), ModificarAsociarComercioRecaudoWS.getUbicacion(), ModificarAsociarComercioRecaudoWS.getRecaudoVerificado(), ModificarAsociarComercioRecaudoWS.getFechaVigencia(), ModificarAsociarComercioRecaudoWS.getTipoRecaudoId()));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaModificarAsociarComercioRecaudo;
	}
	
	////////////////////////////////////
	//Methodo para Consultar Banco por IdBank...
	public ConsultaEntityBankByIdEntityBankWSResponse consultaEntityBankByIdEntityBank(String entityBankId) {
	
		//instanciar Objeto para retorno....
		ConsultaEntityBankByIdEntityBankWSResponse respuestaConsultaEntityBankByIdEntityBank = new ConsultaEntityBankByIdEntityBankWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaConsultaEntityBankByIdEntityBank.setReturn(WSmethod.consultaEntityBankByIdEntityBankWS(Long.parseLong(entityBankId)));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaEntityBankByIdEntityBank;
	}
	
	////////////////////////////////////
	//Methodo para Crear Establecimiento...
	public CrearEstablecimientoWSResponse crearEstablecimiento(CrearEstablecimientoWS CrearEstablecimientoWS) {
	
		//instanciar Objeto para retorno....
		CrearEstablecimientoWSResponse respuestaCrearEstablecimiento = new CrearEstablecimientoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaCrearEstablecimiento.setReturn(WSmethod.crearEstablecimientoWS(CrearEstablecimientoWS.getIdPais(), CrearEstablecimientoWS.getIdProvincia(), CrearEstablecimientoWS.getIdCanton(), CrearEstablecimientoWS.getIdDistrito(), CrearEstablecimientoWS.getCiudad(), CrearEstablecimientoWS.getSectorUrbanizacion(), CrearEstablecimientoWS.getAvenidaCalle(), CrearEstablecimientoWS.getCodigoPostal(), CrearEstablecimientoWS.getLocalidad(), CrearEstablecimientoWS.getNombreInmueble(), CrearEstablecimientoWS.getPuntoReferencia(), CrearEstablecimientoWS.getGeoLocalizacion()));
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearEstablecimiento;
	}
	
	////////////////////////////////////
	//Methodo para Crear Comercio Establecimiento...
	public CrearComercioEstablecimientoWSResponse CrearComercioEstablecimiento(CrearComercioEstablecimientoWS CrearComercioEstablecimientoWS) {
	
		//instanciar Objeto para retorno....
		CrearComercioEstablecimientoWSResponse respuestaCrearComercioEstablecimiento = new CrearComercioEstablecimientoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaCrearComercioEstablecimiento.setReturn(WSmethod.crearComercioEstablecimientoWS(CrearComercioEstablecimientoWS.getComercioId(), CrearComercioEstablecimientoWS.getEstablecimientoId()));
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearComercioEstablecimiento;
	}
	
	////////////////////////////////////
	//Methodo para Modificar Comercio Establecimiento...
	public ModificarComercioEstablecimientoWSResponse modificarComercioEstablecimiento(ModificarComercioEstablecimientoWS ModificarComercioEstablecimientoWS) {
	
		//instanciar Objeto para retorno....
		ModificarComercioEstablecimientoWSResponse respuestaModificarComercioEstablecimiento = new ModificarComercioEstablecimientoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaModificarComercioEstablecimiento.setReturn(WSmethod.modificarComercioEstablecimientoWS(ModificarComercioEstablecimientoWS.getComercioEstablId(), ModificarComercioEstablecimientoWS.getComercioId(), ModificarComercioEstablecimientoWS.getEstablecimientoId()));
			//respuestaModificarComercioEstablecimiento = ModificarComercioEstablecimientoWS;
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaModificarComercioEstablecimiento;
	}
	
	////////////////////////////////////
	//Methodo para Modificar Establecimiento...
	public ModificarEstablecimientoWSResponse modificarEstablecimiento(ModificarEstablecimientoWS ModificarEstablecimientoWS) {
	
		//instanciar Objeto para retorno....
		ModificarEstablecimientoWSResponse respuestaModificarEstablecimientoWSResponse = new ModificarEstablecimientoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaModificarEstablecimientoWSResponse.setReturn(WSmethod.modificarEstablecimientoWS(ModificarEstablecimientoWS.getEstablecimientoId(), ModificarEstablecimientoWS.getIdPais(), ModificarEstablecimientoWS.getIdProvincia(), ModificarEstablecimientoWS.getIdCanton(), ModificarEstablecimientoWS.getIdDistrito(), ModificarEstablecimientoWS.getCiudad(), ModificarEstablecimientoWS.getSectorUrbanizacion(), ModificarEstablecimientoWS.getAvenidaCalle(), ModificarEstablecimientoWS.getCodigoPostal(), ModificarEstablecimientoWS.getLocalidad(), ModificarEstablecimientoWS.getNombreInmueble(), ModificarEstablecimientoWS.getPuntoReferencia(), ModificarEstablecimientoWS.getGeoLocalizacion()));
			//respuestaModificarComercioEstablecimiento = ModificarComercioEstablecimientoWS;
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaModificarEstablecimientoWSResponse;
	}

	////////////////////////////////////
	//Methodo para listar los Comercios...
	public java.util.List<Solicitud> listaSolicitudes() {
		
		//instanciar Objeto para retorno....
		java.util.List<Solicitud> respuestaSolicitudes = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaSolicitudes = WSmethod.listaSolicitudesWS();
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaSolicitudes;
	}
		
	//////////////////////////////////////////////////////
	//Methodo para listar Asociacion Banco de Comercios...
	public java.util.List<BancoAfiliacion> listaAsociacionBancoComercio() {
		
		//instanciar Objeto para retorno....
		java.util.List<BancoAfiliacion> respuestaBancoAfiliacion = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaBancoAfiliacion = WSmethod.listaAsociacionBancoComercioWS();
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaBancoAfiliacion;
	}
	
	//////////////////////////////////////////////////////
	//Methodo para listar Operadores Telefonicos...
	public java.util.List<Operadortelefonico> listaOperadoresTelefonicos() {
		
		//instanciar Objeto para retorno....
		java.util.List<Operadortelefonico> respuestaOperadoresTelefonicos = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaOperadoresTelefonicos = WSmethod.listaOperadoresTelefonicosWS();
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaOperadoresTelefonicos;
	}
	
	//////////////////////////////////////////////////////
	//Methodo para listar Bancos...
	public java.util.List<EntityBank> listaBanks() {
		
		//instanciar Objeto para retorno....
		java.util.List<EntityBank> respuestaBancos = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaBancos = WSmethod.listBanksWS();
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaBancos;
	}
	
	//////////////////////////////////////////////////////
	//Methodo para listar Tipo Recaudos...
	public java.util.List<TipoRecaudo> listaTipoRecaudos() {
		
		//instanciar Objeto para retorno....
		java.util.List<TipoRecaudo> respuestaRecaudos = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaRecaudos = WSmethod.listaTipoRecaudosWS();
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaRecaudos;
	}
	
	//////////////////////////////////////////////////////
	//Methodo para listar Pagos Por Identifiacion del Comercio...
	public java.util.List<Pago> listaPagosPorIdentificacionComercio(ListPagosByIdentificacionComercioWS ListPagosByIdentificacionComercioWS) {
		
		//instanciar Objeto para retorno....
		java.util.List<Pago> respuestaPago = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaPago = WSmethod.listPagosByIdentificacionComercioWS(ListPagosByIdentificacionComercioWS.getIdentificacionComercio());
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaPago;
	}
	
	//////////////////////////////////////////////////////
	//Methodo para listar Comercio Establecimiento...
	public java.util.List<ComercioEstabl> listaComercioEstablecimiento(com.cbp3.ws.cbp.service.ListaComercioEstablecimientosWS ListaComercioEstablecimientosWS) {
		
		//instanciar Objeto para retorno....
		java.util.List<ComercioEstabl> respuestaComercioEstabl = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaComercioEstabl = WSmethod.listaComercioEstablecimientosWS(ListaComercioEstablecimientosWS.getIdComercio());
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaComercioEstabl;
	}
	
	//////////////////////////////////////////////////////
	//Methodo para listar Establecimientos...
	public java.util.List<Establecimiento> listaEstablecimientos() {
		
		//instanciar Objeto para retorno....
		java.util.List<Establecimiento> respuestaEstablecimiento = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaEstablecimiento = WSmethod.listaEstablecimientosWS();
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaEstablecimiento;
	}
	
	//////////////////////////////////////////////////////
	//Methodo para listar Recaudos por Comercio...
	public java.util.List<Recaudo> listaRecaudosByComercio(ListRecaudosByComercioWS ListRecaudosByComercioWS) {
		
		//instanciar Objeto para retorno....
		java.util.List<Recaudo> respuestaRecaudos = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaRecaudos = WSmethod.listRecaudosByComercioWS(ListRecaudosByComercioWS.getComercioId());
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaRecaudos;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	////////////////////////////////////
	//Methodo para Codigo Postal...
	public CodigoPostalWSResponse codigoPostal(CodigoPostalDTO CodigoPostalDTO) {
	
		//instanciar Objeto para retorno....
		CodigoPostalWSResponse respuestaCodigoPostal = new CodigoPostalWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			UbicacionGeograficaWS_Service ws = new UbicacionGeograficaWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/UbicacionGeograficaWS?WSDL"));
			UbicacionGeograficaWS WSmethod = ws.getUbicacionGeograficaWSPort();
		
			respuestaCodigoPostal.setReturn(WSmethod.codigoPostalWS(CodigoPostalDTO.getDistrito()));
		
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCodigoPostal;
	}
	
	//////////////////////////////////////////////////////
	//Methodo para listar Cantones...
	public java.util.List<Canton> listaCanton(Provincia Provincia) {
		
		//instanciar Objeto para retorno....
		java.util.List<Canton> respuestaCanton = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			UbicacionGeograficaWS_Service ws = new UbicacionGeograficaWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/UbicacionGeograficaWS?WSDL"));
			UbicacionGeograficaWS WSmethod = ws.getUbicacionGeograficaWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaCanton = WSmethod.listCantonWS(Provincia);
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCanton;
	}
	
	//////////////////////////////////////////////////////
	//Methodo para listar Distritos...
	public java.util.List<Distrito> listaDistrito(Canton Canton) {
		
		//instanciar Objeto para retorno....
		java.util.List<Distrito> respuestaDistrito = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			UbicacionGeograficaWS_Service ws = new UbicacionGeograficaWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/UbicacionGeograficaWS?WSDL"));
			UbicacionGeograficaWS WSmethod = ws.getUbicacionGeograficaWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaDistrito = WSmethod.listDistritoWS(Canton);
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaDistrito;
	}
	
	//////////////////////////////////////////////////////
	//Methodo para listar Paises...
	public java.util.List<Pais> listaPais() {
		
		//instanciar Objeto para retorno....
		java.util.List<Pais> respuestaPais = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			UbicacionGeograficaWS_Service ws = new UbicacionGeograficaWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/UbicacionGeograficaWS?WSDL"));
			UbicacionGeograficaWS WSmethod = ws.getUbicacionGeograficaWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaPais = WSmethod.listPaisWS();
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaPais;
	}
	
	//////////////////////////////////////////////////////
	//Methodo para listar Provincias...
	public java.util.List<Provincia> listaProvincias(Pais Pais) {
		
		//instanciar Objeto para retorno....
		java.util.List<Provincia> respuestaProvincia = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			UbicacionGeograficaWS_Service ws = new UbicacionGeograficaWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/UbicacionGeograficaWS?WSDL"));
			UbicacionGeograficaWS WSmethod = ws.getUbicacionGeograficaWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaProvincia = WSmethod.listProvinciasWS(Pais);
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaProvincia;
	}
}
