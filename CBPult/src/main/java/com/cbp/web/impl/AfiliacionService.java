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
import com.cbp3.ws.cbp.service.BancoAfiliacion;
import com.cbp3.ws.cbp.service.ConsultaBancoAfiliacionByIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaComercioPorIdentificacionComercioWSResponse;
import com.cbp3.ws.cbp.service.ConsultaContactoByIdentificacionContactoWSResponse;
import com.cbp3.ws.cbp.service.ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse;
import com.cbp3.ws.cbp.service.CrearComercioWSResponse;
import com.cbp3.ws.cbp.service.CrearContactoWSResponse;
import com.cbp3.ws.cbp.service.CrearOperadorTelefonicoWSResponse;
import com.cbp3.ws.cbp.service.CrearRepresentanteLegalWSResponse;
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
import com.cbp3.ws.cbp.service.Solicitud;

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
	
	////////////////////////////////////
	//Methodo para Actualizar el status del Comercio...
	public ActualizaStatusComercioWSResponse actualizarStatusComercio(actualizaStatusComercioDTO actualizaStatusComercioDTO) {
	
		//instanciar Objeto para retorno....
		ActualizaStatusComercioWSResponse respuestaActualizarStatusComercio = new ActualizaStatusComercioWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaAsociarBancoComercio.setReturn(WSmethod.asociarBancoComercioWS(AsociarBancoComercioDTO.getIdEntityBanck(), AsociarBancoComercioDTO.getIdComercio(), AsociarBancoComercioDTO.getNumeroAfiliacion(), AsociarBancoComercioDTO.getNumTerminalesComprar())); 
		
		
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
	public ConsultaBancoAfiliacionByIdWSResponse consultaBancoAfiliacionId(ConsultaBancoAfiliacionIdDTO ConsultaBancoAfiliacionIdDTO) {
	
		//instanciar Objeto para retorno....
		ConsultaBancoAfiliacionByIdWSResponse respuestaConsultaBancoAfiliacion = new ConsultaBancoAfiliacionByIdWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaConsultaBancoAfiliacion.setReturn(WSmethod.consultaBancoAfiliacionByIdWS(ConsultaBancoAfiliacionIdDTO.getIdAsociacion())); 
		
		
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaEditarAsociacionBancoComercio.setReturn(WSmethod.editarAsociacionBancoComercioWS(EditarAsociacionBancoComercioDTO.getIdAsociacion(), EditarAsociacionBancoComercioDTO.getIdEntityBanck(), EditarAsociacionBancoComercioDTO.getNumeroAfiliacion(), EditarAsociacionBancoComercioDTO.getNumTerminalesComprar())); 
		
		
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
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
	public ConsultaContactoByIdentificacionContactoWSResponse consultaContactoByIdentificacionContacto(ConsultaContactoByIdentificacionContactoDTO ConsultaContactoByIdentificacionContactoDTO) {
	
		//instanciar Objeto para retorno....
		ConsultaContactoByIdentificacionContactoWSResponse respuestaConsultaByIdentificacionContacto = new ConsultaContactoByIdentificacionContactoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaConsultaByIdentificacionContacto.setReturn(WSmethod.consultaContactoByIdentificacionContactoWS(ConsultaContactoByIdentificacionContactoDTO.getIdentificacionContacto()));
		
		
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
	public ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse consultaRepresentanteLegalByIdentificacionRepresentante(ConsultaRepresentanteLegalByIdentificacionRepresentanteDTO ConsultaRepresentanteLegalByIdentificacionRepresentanteDTO) {
	
		//instanciar Objeto para retorno....
		ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse respuestaConsultaRepresentanteLegalByIdentificacionRepresentante = new ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			respuestaConsultaRepresentanteLegalByIdentificacionRepresentante.setReturn(WSmethod.consultaRepresentanteLegalByIdentificacionRepresentanteWS(ConsultaRepresentanteLegalByIdentificacionRepresentanteDTO.getIdentificacionRepresentante()));
		
		
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
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
	//Methodo para listar los Comercios...
	public java.util.List<Solicitud> listaSolicitudes() {
		
		//instanciar Objeto para retorno....
		java.util.List<Solicitud> respuestaSolicitudes = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			for(int i = 0; i < WSmethod.listaSolicitudesWS().size(); i++) {
				
				Solicitud objetoSolicitud = new Solicitud();
				
				objetoSolicitud.setCodigoUsuarioModifica(WSmethod.listaSolicitudesWS().get(i).getCodigoUsuarioModifica());
				objetoSolicitud.setComercioId(WSmethod.listaSolicitudesWS().get(i).getComercioId());
				objetoSolicitud.setFechaCargaDatos(WSmethod.listaSolicitudesWS().get(i).getFechaCargaDatos());
				objetoSolicitud.setFechaHoraModificacion(WSmethod.listaSolicitudesWS().get(i).getFechaHoraModificacion());
				objetoSolicitud.setIdChannel(WSmethod.listaSolicitudesWS().get(i).getIdChannel());
				objetoSolicitud.setSolicitudId(WSmethod.listaSolicitudesWS().get(i).getSolicitudId());
				objetoSolicitud.setStatusSolicitud(WSmethod.listaSolicitudesWS().get(i).getStatusSolicitud());
				
				respuestaSolicitudes.add(objetoSolicitud);
			}
		
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			for(int i = 0; i < WSmethod.listaAsociacionBancoComercioWS().size(); i++) {
				
				BancoAfiliacion objetoBancoAfiliacion = new BancoAfiliacion();
				
				objetoBancoAfiliacion.setBancoId(WSmethod.listaAsociacionBancoComercioWS().get(i).getBancoId());
				objetoBancoAfiliacion.setCodigoUsuarioModifica(WSmethod.listaAsociacionBancoComercioWS().get(i).getCodigoUsuarioModifica());
				objetoBancoAfiliacion.setComercioId(WSmethod.listaAsociacionBancoComercioWS().get(i).getComercioId());
				objetoBancoAfiliacion.setFechaCargaDatos(WSmethod.listaAsociacionBancoComercioWS().get(i).getFechaCargaDatos());
				objetoBancoAfiliacion.setFechaHoraModificacion(WSmethod.listaAsociacionBancoComercioWS().get(i).getFechaHoraModificacion());
				objetoBancoAfiliacion.setIdEntityBank(WSmethod.listaAsociacionBancoComercioWS().get(i).getIdEntityBank());
				objetoBancoAfiliacion.setNumAfiliacionBanco(WSmethod.listaAsociacionBancoComercioWS().get(i).getNumAfiliacionBanco());
				objetoBancoAfiliacion.setNumTerminalesComprar(WSmethod.listaAsociacionBancoComercioWS().get(i).getNumTerminalesComprar());
				
				respuestaBancoAfiliacion.add(objetoBancoAfiliacion);
			}
		
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			for(int i = 0; i < WSmethod.listaOperadoresTelefonicosWS().size(); i++) {
				
				Operadortelefonico objetoOperadorTelefonico = new Operadortelefonico();
				
				objetoOperadorTelefonico.setActive(WSmethod.listaOperadoresTelefonicosWS().get(i).getActive());
				objetoOperadorTelefonico.setCodOperadora(WSmethod.listaOperadoresTelefonicosWS().get(i).getCodOperadora());
				objetoOperadorTelefonico.setOperadortelfId(WSmethod.listaOperadoresTelefonicosWS().get(i).getOperadortelfId());
				objetoOperadorTelefonico.setOperadortelfNombre(WSmethod.listaOperadoresTelefonicosWS().get(i).getOperadortelfNombre());
				
				
				respuestaOperadoresTelefonicos.add(objetoOperadorTelefonico);
			}
		
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
			AfiliacionServiceWS_Service ws = new AfiliacionServiceWS_Service(new URL("http://18.223.203.6:8080/CBP-3/AfiliacionServiceWS?WSDL"));
			AfiliacionServiceWS WSmethod = ws.getAfiliacionServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			for(int i = 0; i < WSmethod.listBanksWS().size(); i++) {
				
				EntityBank objetoBanks = new EntityBank();
				
				objetoBanks.setCodigoUsuarioModifica(WSmethod.listBanksWS().get(i).getCodigoUsuarioModifica());
				objetoBanks.setEntityBankCod(WSmethod.listBanksWS().get(i).getEntityBankCod());
				objetoBanks.setEntityBankName(WSmethod.listBanksWS().get(i).getEntityBankName());
				objetoBanks.setFechaHoraCarga(WSmethod.listBanksWS().get(i).getFechaHoraCarga());
				objetoBanks.setFechaHoraModificacion(WSmethod.listBanksWS().get(i).getFechaHoraModificacion());
				objetoBanks.setIdEntityBank(WSmethod.listBanksWS().get(i).getIdEntityBank());
				
				respuestaBancos.add(objetoBanks);
			}
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaBancos;
	}
}
