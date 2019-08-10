package com.cbp.web.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cbp.web.dao.AlmacenDAO;
import com.cbp.web.dto.ConsultaAlmacenPorAlmacenIdDTO;
import com.cbp.web.dto.ConsultaAlmacenPorNumeroAlmacenDTO;
import com.cbp.web.dto.ModificarAlmacenDTO;
import com.cbp.web.dto.SaveAditionalInformationAlmacenDTO;
import com.cbp.web.util.Util;
import com.cbp3.ws.cbp.service.AfiliacionServiceWS;
import com.cbp3.ws.cbp.service.AfiliacionServiceWS_Service;
import com.cbp3.ws.cbp.service.AlmacenServiceWS;
import com.cbp3.ws.cbp.service.AlmacenServiceWS_Service;
import com.cbp3.ws.cbp.service.ConsultaAlmacenPorAlmacenIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaAlmacenPorNumeroAlmacenWSResponse;
import com.cbp3.ws.cbp.service.ConsultaEstanteriaPorEstanteriaIdWS;
import com.cbp3.ws.cbp.service.ConsultaEstanteriaPorEstanteriaIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaZonaPorZonaIdWS;
import com.cbp3.ws.cbp.service.ConsultaZonaPorZonaIdWSResponse;
import com.cbp3.ws.cbp.service.CrearAlmacenWS;
import com.cbp3.ws.cbp.service.CrearAlmacenWSResponse;
import com.cbp3.ws.cbp.service.CrearEstanteriaWS;
import com.cbp3.ws.cbp.service.CrearEstanteriaWSResponse;
import com.cbp3.ws.cbp.service.CrearListaZonaWizzardWS;
import com.cbp3.ws.cbp.service.CrearListaZonaWizzardWSResponse;
import com.cbp3.ws.cbp.service.CrearRelacionZonasWS;
import com.cbp3.ws.cbp.service.CrearRelacionZonasWSResponse;
import com.cbp3.ws.cbp.service.Estanteria;
import com.cbp3.ws.cbp.service.ListaAlmacenesWSResponse;
import com.cbp3.ws.cbp.service.ModificarAlmacenWS;
import com.cbp3.ws.cbp.service.ModificarAlmacenWSResponse;
import com.cbp3.ws.cbp.service.ModificarEstanteriaWS;
import com.cbp3.ws.cbp.service.ModificarEstanteriaWSResponse;
import com.cbp3.ws.cbp.service.ModificarRelacionZonasWS;
import com.cbp3.ws.cbp.service.ModificarRelacionZonasWSResponse;
import com.cbp3.ws.cbp.service.RelacionZonas;
import com.cbp3.ws.cbp.service.SaveAditionaInformationAlmacenWSResponse;
import com.cbp3.ws.cbp.service.Solicitud;
import com.cbp3.ws.cbp.service.Warehouse;
import com.cbp3.ws.cbp.service.Zona;

@Service
public class AlmacenService extends Util implements AlmacenDAO{

	////////////////////////////////
	//Methodo para Consultar Almacen por Id de Almacen...
	public ConsultaAlmacenPorAlmacenIdWSResponse consultaAlmacenPorAlmacenId(ConsultaAlmacenPorAlmacenIdDTO ConsultaAlmacenPorAlmacenIdDTO) {
		
		//instanciar Objeto para retorno....
		ConsultaAlmacenPorAlmacenIdWSResponse respuestaConsultaAlmacenPorAlmacenId = new ConsultaAlmacenPorAlmacenIdWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaConsultaAlmacenPorAlmacenId.setReturn(WSmethod.consultaAlmacenPorAlmacenIdWS(ConsultaAlmacenPorAlmacenIdDTO.getIdAlmacen()));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaAlmacenPorAlmacenId;
	}
	
	////////////////////////////////
	//Methodo para Consultar Almacen por Numero de Almacen...
	public ConsultaAlmacenPorNumeroAlmacenWSResponse consultaAlmacenPorNumeroAlmacen(ConsultaAlmacenPorNumeroAlmacenDTO ConsultaAlmacenPorNumeroAlmacenDTO) {
		
		//instanciar Objeto para retorno....
		ConsultaAlmacenPorNumeroAlmacenWSResponse respuestaConsultaAlmacenPorNumeroAlmacen = new ConsultaAlmacenPorNumeroAlmacenWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaConsultaAlmacenPorNumeroAlmacen.setReturn(WSmethod.consultaAlmacenPorNumeroAlmacenWS(ConsultaAlmacenPorNumeroAlmacenDTO.getNumeroAlmacen()));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaAlmacenPorNumeroAlmacen;
	}
	
	////////////////////////////////
	//Methodo para Salvar Informacion Adicional de un Almacen...
	public SaveAditionaInformationAlmacenWSResponse saveAditionalInformationAlmacen(SaveAditionalInformationAlmacenDTO SaveAditionalInformationAlmacenDTO) {
		
		//instanciar Objeto para retorno....
		SaveAditionaInformationAlmacenWSResponse respuestaSaveAditionaInformationAlmacen = new SaveAditionaInformationAlmacenWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaSaveAditionaInformationAlmacen.setReturn(WSmethod.saveAditionaInformationAlmacenWS(SaveAditionalInformationAlmacenDTO.getDto()));	
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaSaveAditionaInformationAlmacen;
	}
	
	////////////////////////////////
	//Methodo para Modificar Almacen...
	public ModificarAlmacenWSResponse modificarAlmacen(ModificarAlmacenWS ModificarAlmacenDTO) {
		
		//instanciar Objeto para retorno....
		ModificarAlmacenWSResponse respuestaModificarAlmacen = new ModificarAlmacenWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaModificarAlmacen.setReturn(WSmethod.modificarAlmacenWS(ModificarAlmacenDTO.getNumeroAlmacen(), ModificarAlmacenDTO.getNombreAlmacen(), ModificarAlmacenDTO.getIdentificacionOficina(), ModificarAlmacenDTO.getIdentificacionProducto(), ModificarAlmacenDTO.getCodigoUsuarioModifica(), ModificarAlmacenDTO.getFechaHoraModifica(), ModificarAlmacenDTO.getTipoAlmacen(), ModificarAlmacenDTO.getDireccion(), ModificarAlmacenDTO.getGerenteSucursal()));	
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaModificarAlmacen;
	}
	
	////////////////////////////////
	//Methodo para Crear Almacen...
	public CrearAlmacenWSResponse crearAlmacen(CrearAlmacenWS CrearAlmacenWS) {
		
		//instanciar Objeto para retorno....
		CrearAlmacenWSResponse respuestaCrearAlmacen = new CrearAlmacenWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaCrearAlmacen.setReturn(WSmethod.crearAlmacenWS(CrearAlmacenWS.getDto()));	
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearAlmacen;
	}
	
	////////////////////////////////
	//Methodo para Crear Estanterias...
	public CrearEstanteriaWSResponse crearEstanteria(CrearEstanteriaWS CrearEstanteriaWS) {
		
		//instanciar Objeto para retorno....
		CrearEstanteriaWSResponse respuestaCrearEstanteria = new CrearEstanteriaWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaCrearEstanteria.setReturn(WSmethod.crearEstanteriaWS(CrearEstanteriaWS.getDescripcion(), CrearEstanteriaWS.getZonaId(), CrearEstanteriaWS.getModulos(), CrearEstanteriaWS.getNiveles()));	
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearEstanteria;
	}
	
	////////////////////////////////
	//Methodo para consultar estanteria por estanteria id...
	public ConsultaEstanteriaPorEstanteriaIdWSResponse consultaEstanteriaPorEstanteriaId(ConsultaEstanteriaPorEstanteriaIdWS ConsultaEstanteriaPorEstanteriaIdWS) {
		
		//instanciar Objeto para retorno....
		ConsultaEstanteriaPorEstanteriaIdWSResponse respuestaConsultaEstanteriaPorEstanteriaId = new ConsultaEstanteriaPorEstanteriaIdWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaConsultaEstanteriaPorEstanteriaId.setReturn(WSmethod.consultaEstanteriaPorEstanteriaIdWS(ConsultaEstanteriaPorEstanteriaIdWS.getEstanteriaId()));	
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaEstanteriaPorEstanteriaId;
	}
	
	////////////////////////////////
	//Methodo para consultar zona por zona id...
	public ConsultaZonaPorZonaIdWSResponse consultaZonaPorZonaId(ConsultaZonaPorZonaIdWS ConsultaZonaPorZonaIdWS) {
		
		//instanciar Objeto para retorno....
		ConsultaZonaPorZonaIdWSResponse respuestaConsultaZonaPorZonaId = new ConsultaZonaPorZonaIdWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaConsultaZonaPorZonaId.setReturn(WSmethod.consultaZonaPorZonaIdWS(ConsultaZonaPorZonaIdWS.getZonaId()));	
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaZonaPorZonaId;
	}
	
	////////////////////////////////
	//Methodo para crear relacion Zonas...
	public CrearRelacionZonasWSResponse crearRelacionZonas(CrearRelacionZonasWS CrearRelacionZonasWS) {
		
		//instanciar Objeto para retorno....
		CrearRelacionZonasWSResponse respuestaCrearRelacionZonas = new CrearRelacionZonasWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaCrearRelacionZonas.setReturn(WSmethod.crearRelacionZonasWS(CrearRelacionZonasWS.getZonaActualId(), CrearRelacionZonasWS.getZonaDestinoId(), CrearRelacionZonasWS.getComentarios(), CrearRelacionZonasWS.getFechaCargaDatos()));	
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearRelacionZonas;
	}
	
	////////////////////////////////
	//Methodo para modificar estanteria...
	public ModificarEstanteriaWSResponse modificarEstanteria(ModificarEstanteriaWS ModificarEstanteriaWS) {
		
		//instanciar Objeto para retorno....
		ModificarEstanteriaWSResponse respuestaModificarEstanteria = new ModificarEstanteriaWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaModificarEstanteria.setReturn(WSmethod.modificarEstanteriaWS(ModificarEstanteriaWS.getEstanteriaId(), ModificarEstanteriaWS.getDescripcion(), ModificarEstanteriaWS.getZonaId(), ModificarEstanteriaWS.getModulos(), ModificarEstanteriaWS.getNiveles(), ModificarEstanteriaWS.getCodigoUsuarioModifica(), ModificarEstanteriaWS.getFechaHoraModificacion()));	
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaModificarEstanteria;
	}
	
	////////////////////////////////
	//Methodo para modificar relacion zonas...
	public ModificarRelacionZonasWSResponse modificarRelacionZonas(ModificarRelacionZonasWS ModificarRelacionZonasWS) {
		
		//instanciar Objeto para retorno....
		ModificarRelacionZonasWSResponse respuestaModificarRelacionZonas = new ModificarRelacionZonasWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaModificarRelacionZonas.setReturn(WSmethod.modificarRelacionZonasWS(ModificarRelacionZonasWS.getZonaActualId(), ModificarRelacionZonasWS.getZonaDestinoId(), ModificarRelacionZonasWS.getComentarios(), ModificarRelacionZonasWS.getCodigoUsuarioModifica(), ModificarRelacionZonasWS.getFechaHoraModifica()));	
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaModificarRelacionZonas;
	}
	
	////////////////////////////////
	//Methodo para Crear Lista de Zonas Wizzard...
	public CrearListaZonaWizzardWSResponse crearListaZonaWizzard(CrearListaZonaWizzardWS CrearListaZonaWizzardWS) {
		
		//instanciar Objeto para retorno....
		CrearListaZonaWizzardWSResponse respuestaCrearListaZonaWizzard = new CrearListaZonaWizzardWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaCrearListaZonaWizzard.setReturn(WSmethod.crearListaZonaWizzardWS(CrearListaZonaWizzardWS.getListZonaDTO()));	
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearListaZonaWizzard;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	////////////////////////////////////
	//Methodo para listar los Almacenes...
	public java.util.List<Warehouse> listaAlmacenes() {
		
		//instanciar Objeto para retorno....
		java.util.List<Warehouse> respuestaAlmacenes = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			for(int i = 0; i < WSmethod.listaAlmacenesWS().size(); i++) {
				
				Warehouse objetoWarehouse = new Warehouse();
				
				objetoWarehouse.setCodigoUsuarioModifica(WSmethod.listaAlmacenesWS().get(i).getCodigoUsuarioModifica());
				objetoWarehouse.setDireccion(WSmethod.listaAlmacenesWS().get(i).getDireccion());
				objetoWarehouse.setFechaHoraCarga(WSmethod.listaAlmacenesWS().get(i).getFechaHoraCarga());
				objetoWarehouse.setFechaHoraModificacion(WSmethod.listaAlmacenesWS().get(i).getFechaHoraModificacion());
				objetoWarehouse.setGerenteSucursal(WSmethod.listaAlmacenesWS().get(i).getGerenteSucursal());
				objetoWarehouse.setIdWarehouse(WSmethod.listaAlmacenesWS().get(i).getIdWarehouse());
				objetoWarehouse.setOfficeId(WSmethod.listaAlmacenesWS().get(i).getOfficeId());
				objetoWarehouse.setProductId(WSmethod.listaAlmacenesWS().get(i).getProductId());
				objetoWarehouse.setTipoAlmacenId(WSmethod.listaAlmacenesWS().get(i).getTipoAlmacenId());
				objetoWarehouse.setWarehouseName(WSmethod.listaAlmacenesWS().get(i).getWarehouseName());
				objetoWarehouse.setWarehouseNumber(WSmethod.listaAlmacenesWS().get(i).getWarehouseNumber());
				
				respuestaAlmacenes.add(objetoWarehouse);
			}
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaAlmacenes;
	}

	////////////////////////////////////
	//Methodo para listar Estanterias...
	public java.util.List<Estanteria> listaEstanterias() {
		
		//instanciar Objeto para retorno....
		java.util.List<Estanteria> respuestaEstanteria = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			for(int i = 0; i < WSmethod.listaEstanteriasWS().size(); i++) {
				
				Estanteria objetoEstanteria = new Estanteria();
				
				objetoEstanteria.setCodigoUsuarioModifica(WSmethod.listaEstanteriasWS().get(i).getCodigoUsuarioModifica());
				objetoEstanteria.setDescripcion(WSmethod.listaEstanteriasWS().get(i).getDescripcion());
				objetoEstanteria.setEstanteriaId(WSmethod.listaEstanteriasWS().get(i).getEstanteriaId());
				objetoEstanteria.setFechaCargaDatos(WSmethod.listaEstanteriasWS().get(i).getFechaCargaDatos());
				objetoEstanteria.setFechaHoraModificacion(WSmethod.listaEstanteriasWS().get(i).getFechaHoraModificacion());
				objetoEstanteria.setModulos(WSmethod.listaEstanteriasWS().get(i).getModulos());
				objetoEstanteria.setNiveles(WSmethod.listaEstanteriasWS().get(i).getNiveles());
				objetoEstanteria.setZonaId(WSmethod.listaEstanteriasWS().get(i).getZonaId());
				
				respuestaEstanteria.add(objetoEstanteria);
			}
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaEstanteria;
	}
	
	////////////////////////////////////
	//Methodo para listar Relacion Zonas...
	public java.util.List<RelacionZonas> listaRelacionZonas() {
		
		//instanciar Objeto para retorno....
		java.util.List<RelacionZonas> respuestaRelacionZonas = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			for(int i = 0; i < WSmethod.listaRelacionZonasWS().size(); i++) {
				
				RelacionZonas objetoRelacionZonas = new RelacionZonas();
				
				objetoRelacionZonas.setCodigoUsuarioModifica(WSmethod.listaRelacionZonasWS().get(i).getCodigoUsuarioModifica());
				objetoRelacionZonas.setComentarios(WSmethod.listaRelacionZonasWS().get(i).getComentarios());
				objetoRelacionZonas.setFechaCargaDatos(WSmethod.listaRelacionZonasWS().get(i).getFechaCargaDatos());
				objetoRelacionZonas.setFechaHoraModificacion(WSmethod.listaRelacionZonasWS().get(i).getFechaHoraModificacion());
				objetoRelacionZonas.setRelacionZonasId(WSmethod.listaRelacionZonasWS().get(i).getRelacionZonasId());
				objetoRelacionZonas.setZonaActualId(WSmethod.listaRelacionZonasWS().get(i).getZonaActualId());
				objetoRelacionZonas.setZonaDestinoId(WSmethod.listaRelacionZonasWS().get(i).getZonaDestinoId());
				
				respuestaRelacionZonas.add(objetoRelacionZonas);
			}
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaRelacionZonas;
	}
	
	////////////////////////////////////
	//Methodo para listar Zonas...
	public java.util.List<Zona> listaZonas() {
		
		//instanciar Objeto para retorno....
		java.util.List<Zona> respuestaZona = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			for(int i = 0; i < WSmethod.listaZonasWS().size(); i++) {
				
				Zona objetoZona = new Zona();
				
				objetoZona.setCodigoUsuarioModifica(WSmethod.listaZonasWS().get(i).getCodigoUsuarioModifica());
				objetoZona.setDescripcion(WSmethod.listaZonasWS().get(i).getDescripcion());
				objetoZona.setEncargadoZona(WSmethod.listaZonasWS().get(i).getEncargadoZona());
				objetoZona.setFechaCargaDatos(WSmethod.listaZonasWS().get(i).getFechaCargaDatos());
				objetoZona.setFechaHoraModificacion(WSmethod.listaZonasWS().get(i).getFechaHoraModificacion());
				objetoZona.setIdWarehouse(WSmethod.listaZonasWS().get(i).getIdWarehouse());
				objetoZona.setTipoZonaId(WSmethod.listaZonasWS().get(i).getTipoZonaId());
				objetoZona.setZonaId(WSmethod.listaZonasWS().get(i).getZonaId());
				objetoZona.setZonaNombre(WSmethod.listaZonasWS().get(i).getZonaNombre());
				
				respuestaZona.add(objetoZona);
			}
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaZona;
	}
	
}
