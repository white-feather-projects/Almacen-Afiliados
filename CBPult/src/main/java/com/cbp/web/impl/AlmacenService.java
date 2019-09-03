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
import com.cbp3.ws.cbp.service.CrearRelacionAlmacenesWS;
import com.cbp3.ws.cbp.service.CrearRelacionAlmacenesWSResponse;
import com.cbp3.ws.cbp.service.CrearRelacionZonasWS;
import com.cbp3.ws.cbp.service.CrearRelacionZonasWSResponse;
import com.cbp3.ws.cbp.service.Estanteria;
import com.cbp3.ws.cbp.service.ListaAlmacenesWSResponse;
import com.cbp3.ws.cbp.service.ModificarAlmacenWS;
import com.cbp3.ws.cbp.service.ModificarAlmacenWSResponse;
import com.cbp3.ws.cbp.service.ModificarEstanteriaWS;
import com.cbp3.ws.cbp.service.ModificarEstanteriaWSResponse;
import com.cbp3.ws.cbp.service.ModificarRelacionAlmacenesWS;
import com.cbp3.ws.cbp.service.ModificarRelacionAlmacenesWSResponse;
import com.cbp3.ws.cbp.service.ModificarRelacionZonasWS;
import com.cbp3.ws.cbp.service.ModificarRelacionZonasWSResponse;
import com.cbp3.ws.cbp.service.ModificarZonaWS;
import com.cbp3.ws.cbp.service.ModificarZonaWSResponse;
import com.cbp3.ws.cbp.service.RelacionAlmacenes;
import com.cbp3.ws.cbp.service.RelacionZonas;
import com.cbp3.ws.cbp.service.SaveAditionaInformationAlmacenWSResponse;
import com.cbp3.ws.cbp.service.Solicitud;
import com.cbp3.ws.cbp.service.TipoZona;
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
			respuestaModificarAlmacen.setReturn(WSmethod.modificarAlmacenWS(ModificarAlmacenDTO.getNumeroAlmacen(), ModificarAlmacenDTO.getNombreAlmacen(), ModificarAlmacenDTO.getIdentificacionOficina(), ModificarAlmacenDTO.getCodigoUsuarioModifica(), ModificarAlmacenDTO.getFechaHoraModifica(), ModificarAlmacenDTO.getTipoAlmacen(), ModificarAlmacenDTO.getDireccion(), ModificarAlmacenDTO.getGerenteSucursal()));	
			
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
			respuestaCrearEstanteria.setReturn(WSmethod.crearEstanteriaWS(CrearEstanteriaWS.getZonaId(), CrearEstanteriaWS.getModulos(), CrearEstanteriaWS.getNiveles()));	
			
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
	//Methodo para crear relacion Almacenes...
	public CrearRelacionAlmacenesWSResponse crearRelacionAlmacenes(CrearRelacionAlmacenesWS CrearRelacionAlmacenesWS) {
		
		//instanciar Objeto para retorno....
		CrearRelacionAlmacenesWSResponse respuestaCrearRelacionAlmacenes = new CrearRelacionAlmacenesWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaCrearRelacionAlmacenes.setReturn(WSmethod.crearRelacionAlmacenesWS(CrearRelacionAlmacenesWS.getAlmacenActualId(), CrearRelacionAlmacenesWS.getAlmacenDestinoId(), CrearRelacionAlmacenesWS.getComentarios(), CrearRelacionAlmacenesWS.getFechaCargaDatos()));	
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearRelacionAlmacenes;
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
	//Methodo para modificar zona...
	public ModificarZonaWSResponse modificarZona(ModificarZonaWS ModificarZonaWS) {
		
		//instanciar Objeto para retorno....
		ModificarZonaWSResponse respuestaModificarZona = new ModificarZonaWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaModificarZona.setReturn(WSmethod.modificarZonaWS(ModificarZonaWS.getZonaId(), ModificarZonaWS.getZonaNombre(), ModificarZonaWS.getDescripcion(), ModificarZonaWS.getEncargadoZona(), ModificarZonaWS.getTipoZonaId(), ModificarZonaWS.getIdWarehouse(), ModificarZonaWS.getCodigoUsuarioModifica(), ModificarZonaWS.getFechaHoraModifica()));	
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaModificarZona;
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
	

	////////////////////////////////////
	//Methodo para listar los Tipos Zonas...
	public java.util.List<TipoZona> listaTipoZonas() {
		
		//instanciar Objeto para retorno....
		java.util.List<TipoZona> respuestaTipoZonas= new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaTipoZonas = WSmethod.listTipoZonaWS();
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaTipoZonas;
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
			respuestaAlmacenes = WSmethod.listaAlmacenesWS();
		
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
			respuestaEstanteria = WSmethod.listaEstanteriasWS();
		
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
			respuestaRelacionZonas = WSmethod.listaRelacionZonasWS();
		
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
			respuestaZona = WSmethod.listaZonasWS();
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaZona;
	}
	
	////////////////////////////////////
	//Methodo para listar Almacenes Relacionados...
	public java.util.List<RelacionAlmacenes> listaAlmacenesRelacionados(long arg0) {
		
		//instanciar Objeto para retorno....
		java.util.List<RelacionAlmacenes> respuestaRelacionAlmacenes = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaRelacionAlmacenes = WSmethod.listaAlmacenesRelacionadosByAlmacenIdWS(arg0);
      
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaRelacionAlmacenes;
	}
	
	////////////////////////////////////
	//Methodo para listar ZOnas por Almacen Id...
	public java.util.List<Zona> listaZonasByIdAlmacen(long idAlmacen) {
		
		//instanciar Objeto para retorno....
		java.util.List<Zona> respuestaZona = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaZona = WSmethod.liistZonasByIdAlmacenWS(idAlmacen);
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaZona;
	}
	
	////////////////////////////////////
	//Methodo para listar Estanterias por Id ZOnas...
	public java.util.List<Estanteria> listaEstanteriasByIdZona(long idZona) {
		
		//instanciar Objeto para retorno....
		java.util.List<Estanteria> respuestaEstanteria = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaEstanteria = WSmethod.listEstanteriasByIdZonaWS(idZona);
		
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
	//Methodo para listar Zonas Relacionadas por ZOna Id...
	public java.util.List<RelacionZonas> listaZonasRelacionadasPorZonaIdActual(long zonaActualId) {
		
		//instanciar Objeto para retorno....
		java.util.List<RelacionZonas> respuestaRelacionZonas = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
		
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaRelacionZonas = WSmethod.listaZonasRelacionadasByZonaActualIdWS(zonaActualId);
		
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
	//Methodo para Modificar Relacion de Almacenes...
	public ModificarRelacionAlmacenesWSResponse modificarRelacionAlmacenes(ModificarRelacionAlmacenesWS modificarRelacionAlmacenesWS) {
	
		//instanciar Objeto para retorno....
		ModificarRelacionAlmacenesWSResponse respuestaModificacionRelacionesAlmacen = new ModificarRelacionAlmacenesWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			AlmacenServiceWS_Service ws = new AlmacenServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/AlmacenServiceWS?WSDL"));
			AlmacenServiceWS WSmethod = ws.getAlmacenServiceWSPort();
			
			//System.out.println("lista:-------"+WSmethod.listaSolicitudesWS().size());
			respuestaModificacionRelacionesAlmacen = WSmethod.modificarRelacionAlmacenesWS(modificarRelacionAlmacenesWS.getAlmacenActualId(), modificarRelacionAlmacenesWS.getAlmacenDestinoId(), modificarRelacionAlmacenesWS.getComentarios(), modificarRelacionAlmacenesWS.getCodigoUsuarioModifica(), modificarRelacionAlmacenesWS.getFechaHoraModifica());
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaModificacionRelacionesAlmacen;
	
	}
}
