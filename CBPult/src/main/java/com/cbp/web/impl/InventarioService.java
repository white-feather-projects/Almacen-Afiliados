package com.cbp.web.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cbp.web.dao.InventarioDAO;
import com.cbp.web.util.Util;
import com.cbp3.ws.cbp.service.ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse;
import com.cbp3.ws.cbp.service.ConsultaProveedorPorProveedorIdWS;
import com.cbp3.ws.cbp.service.ConsultaProveedorPorProveedorIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaTerceroPorTerceroIdWSResponse;
import com.cbp3.ws.cbp.service.CrearProductoUbicacionWS;
import com.cbp3.ws.cbp.service.CrearProductoUbicacionWSResponse;
import com.cbp3.ws.cbp.service.CrearTerceroWS;
import com.cbp3.ws.cbp.service.CrearTerceroWSResponse;
import com.cbp3.ws.cbp.service.GenerarMovimientoWS;
import com.cbp3.ws.cbp.service.GenerarMovimientoWSResponse;
import com.cbp3.ws.cbp.service.InventarioServiceWS;
import com.cbp3.ws.cbp.service.InventarioServiceWS_Service;
import com.cbp3.ws.cbp.service.ModificarProductoUbicacionWS;
import com.cbp3.ws.cbp.service.ModificarProductoUbicacionWSResponse;
import com.cbp3.ws.cbp.service.ModificarTerceroWS;
import com.cbp3.ws.cbp.service.ModificarTerceroWSResponse;
import com.cbp3.ws.cbp.service.Movimiento;
import com.cbp3.ws.cbp.service.ProductoUbicacion;
import com.cbp3.ws.cbp.service.RelacionAlmacenes;
import com.cbp3.ws.cbp.service.TipoMovimiento;

@Service
public class InventarioService extends Util implements InventarioDAO{
	
	////////////////////////////////
	//Methodo para Consultar la Ubicacion de un producto por IdProductoUbicacion...
	public ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse consultaProductoUbicacionByIdProductoUbicacion(long productoUbicacionId) {
		
		//instanciar Objeto para retorno....
		ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse respuestaConsultaProductoUbicacionsByIdProductoUbicacion = new ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaConsultaProductoUbicacionsByIdProductoUbicacion.setReturn(WSmethod.consultaProductoUbicacionsByIdProductoUbicacionWS(productoUbicacionId));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaProductoUbicacionsByIdProductoUbicacion;
	}
	
	////////////////////////////////
	//Methodo para Consultar la Proveedor por Proveedor Id...
	public ConsultaProveedorPorProveedorIdWSResponse consultaProveedorPorProveedorId(long idProvider) {
		
		//instanciar Objeto para retorno....
		ConsultaProveedorPorProveedorIdWSResponse respuestaConsultaProveedorPorProveedorId = new ConsultaProveedorPorProveedorIdWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaConsultaProveedorPorProveedorId.setReturn(WSmethod.consultaProveedorPorProveedorIdWS(idProvider));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaProveedorPorProveedorId;
	}
	
	////////////////////////////////
	//Methodo para Consultar Purchase Order por PurchaseOrderId...
	public ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse consultaPurchaseOrderPorPurchaseOrderId(long idOrder) {
		
		//instanciar Objeto para retorno....
		ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse respuestaConsultaPurchaseOrderPorPurchaseOrderId = new ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaConsultaPurchaseOrderPorPurchaseOrderId.setReturn(WSmethod.consultaPurchaseOrderPorPurchaseOrderIdWS(idOrder));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaPurchaseOrderPorPurchaseOrderId;
	}
	
	////////////////////////////////
	//Methodo para Consultar Tercero por TerceroId...
	public ConsultaTerceroPorTerceroIdWSResponse consultaTerceroPorTerceroId(long terceroId) {
		
		//instanciar Objeto para retorno....
		ConsultaTerceroPorTerceroIdWSResponse respuestaConsultaTerceroPorTerceroId = new ConsultaTerceroPorTerceroIdWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaConsultaTerceroPorTerceroId.setReturn(WSmethod.consultaTerceroPorTerceroIdWS(terceroId));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaTerceroPorTerceroId;
	}
	
	////////////////////////////////
	//Methodo para Crear Producto Ubicacion...
	public CrearProductoUbicacionWSResponse crearProductoUbicacion(CrearProductoUbicacionWS CrearProductoUbicacionWS) {
		
		//instanciar Objeto para retorno....
		CrearProductoUbicacionWSResponse respuestaCrearProductoUbicacion = new CrearProductoUbicacionWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaCrearProductoUbicacion.setReturn(WSmethod.crearProductoUbicacionWS(CrearProductoUbicacionWS.getIdProduct(), CrearProductoUbicacionWS.getIdWarehouse(), CrearProductoUbicacionWS.getZonaId(), CrearProductoUbicacionWS.getEstanteriaId(), CrearProductoUbicacionWS.getComentario()));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearProductoUbicacion;
	}
	
	////////////////////////////////
	//Methodo para Crear Tercero...
	public CrearTerceroWSResponse crearTercero(CrearTerceroWS CrearTerceroWS) {
		
		//instanciar Objeto para retorno....
		CrearTerceroWSResponse respuestaCrearTercero = new CrearTerceroWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaCrearTercero.setReturn(WSmethod.crearTerceroWS(CrearTerceroWS.getTipoIdentificacionId(), CrearTerceroWS.getIdentificacionTercero(), CrearTerceroWS.getNombre(), CrearTerceroWS.getEmail(), CrearTerceroWS.getTelefonoLocal()));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearTercero;
	}
	
	////////////////////////////////
	//Methodo para Generar Movimiento...
	public GenerarMovimientoWSResponse generarMovimiento(GenerarMovimientoWS GenerarMovimientoWS) {
		
		//instanciar Objeto para retorno....
		GenerarMovimientoWSResponse respuestaGenerarMovimiento = new GenerarMovimientoWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaGenerarMovimiento.setReturn(WSmethod.generarMovimientoWS(GenerarMovimientoWS.getFechaMovimiento(), GenerarMovimientoWS.getEncargadoMovimiento(), GenerarMovimientoWS.getIdWarehouse(), GenerarMovimientoWS.getTipoMovimientoId(), GenerarMovimientoWS.getComentarios(), GenerarMovimientoWS.getIdOrder(), GenerarMovimientoWS.getZona(), GenerarMovimientoWS.getZonaActualId(), GenerarMovimientoWS.getZonaDestinoId(), GenerarMovimientoWS.getComercioDespachar(), GenerarMovimientoWS.getTerceroId(), GenerarMovimientoWS.getCantidadDetalle(), GenerarMovimientoWS.getDescripcionDetalle(), GenerarMovimientoWS.getIdProductDetalle()));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaGenerarMovimiento;
	}
	
	////////////////////////////////
	//Methodo para Modificar Producto Ubicacion...
	public ModificarProductoUbicacionWSResponse modificarProductoUbicacion(ModificarProductoUbicacionWS ModificarProductoUbicacionWS) {
		
		//instanciar Objeto para retorno....
		ModificarProductoUbicacionWSResponse respuestaModificarProductoUbicacion = new ModificarProductoUbicacionWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaModificarProductoUbicacion.setReturn(WSmethod.modificarProductoUbicacionWS(ModificarProductoUbicacionWS.getProductoUbicacionId(), ModificarProductoUbicacionWS.getIdProduct(), ModificarProductoUbicacionWS.getIdWarehouse(), ModificarProductoUbicacionWS.getZonaId(), ModificarProductoUbicacionWS.getEstanteriaId(), ModificarProductoUbicacionWS.getComentario()));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaModificarProductoUbicacion;
	}
	
	////////////////////////////////
	//Methodo para Modificar Tercero...
	public ModificarTerceroWSResponse modificarTercero(ModificarTerceroWS ModificarTerceroWS) {
		
		//instanciar Objeto para retorno....
		ModificarTerceroWSResponse respuestaModificarTercero = new ModificarTerceroWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaModificarTercero.setReturn(WSmethod.modificarTerceroWS(ModificarTerceroWS.getTerceroId(), ModificarTerceroWS.getTipoIdentificacionId(), ModificarTerceroWS.getIdentificacionTercero(), ModificarTerceroWS.getNombre(), ModificarTerceroWS.getEmail(), ModificarTerceroWS.getTelefonoLocal()));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaModificarTercero;
	}
	
	////////////////////////////////
	//Methodo para listar Movimientos por Tipo de Movimiento...
	public java.util.List<Movimiento> listaMovimientosByTipoMovimiento(long idTipoMovimiento) {
		
		//instanciar Objeto para retorno....
		java.util.List<Movimiento> respuestaMovimiento = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaMovimiento = WSmethod.listMovimientosByTipoMovimientoWS(idTipoMovimiento);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaMovimiento;
	}
	
	////////////////////////////////
	//Methodo para listar Ubicacion de Productos...
	public java.util.List<ProductoUbicacion> listaProductoUbicacion() {
		
		//instanciar Objeto para retorno....
		java.util.List<ProductoUbicacion> respuestaProductoUbicacion = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaProductoUbicacion = WSmethod.listProductoUbicacionWS();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaProductoUbicacion;
	}
	
	////////////////////////////////
	//Methodo para listar Tipo de Movimientos...
	public java.util.List<TipoMovimiento> listaTipoMovimiento() {
		
		//instanciar Objeto para retorno....
		java.util.List<TipoMovimiento> respuestaTipoMovimiento = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaTipoMovimiento = WSmethod.listTipoMovimientoWS();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaTipoMovimiento;
	}

}
