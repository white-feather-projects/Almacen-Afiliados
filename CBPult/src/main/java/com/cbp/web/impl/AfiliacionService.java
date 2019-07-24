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
import com.cbp.web.dto.ConsultaBancoAfiliacionIdDTO;
import com.cbp.web.dto.CrearOperadorTelefonicoDTO;
import com.cbp.web.dto.EditarAsociacionBancoComercioDTO;
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
import com.cbp3.ws.cbp.service.BancoAfiliacion;
import com.cbp3.ws.cbp.service.ConsultaBancoAfiliacionByIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaComercioPorIdentificacionComercioWSResponse;
import com.cbp3.ws.cbp.service.CrearComercioWSResponse;
import com.cbp3.ws.cbp.service.CrearOperadorTelefonicoWSResponse;
import com.cbp3.ws.cbp.service.EditarAsociacionBancoComercioWSResponse;
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
