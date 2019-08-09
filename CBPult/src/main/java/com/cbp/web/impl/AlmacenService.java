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
import com.cbp3.ws.cbp.service.CrearAlmacenWS;
import com.cbp3.ws.cbp.service.CrearAlmacenWSResponse;
import com.cbp3.ws.cbp.service.CrearEstanteriaWS;
import com.cbp3.ws.cbp.service.CrearEstanteriaWSResponse;
import com.cbp3.ws.cbp.service.CrearListaZonaWizzardWS;
import com.cbp3.ws.cbp.service.CrearListaZonaWizzardWSResponse;
import com.cbp3.ws.cbp.service.ListaAlmacenesWSResponse;
import com.cbp3.ws.cbp.service.ModificarAlmacenWS;
import com.cbp3.ws.cbp.service.ModificarAlmacenWSResponse;
import com.cbp3.ws.cbp.service.SaveAditionaInformationAlmacenWSResponse;
import com.cbp3.ws.cbp.service.Solicitud;
import com.cbp3.ws.cbp.service.Warehouse;

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
	
}
