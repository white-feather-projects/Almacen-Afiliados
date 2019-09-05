package com.cbp.web.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cbp.web.dao.InventarioDAO;
import com.cbp.web.util.Util;
import com.cbp3.ws.cbp.service.AjusteInventario;
import com.cbp3.ws.cbp.service.AjusteRecibo;
import com.cbp3.ws.cbp.service.ConsultaAjusteReciboPorAjusteReciboIdWS;
import com.cbp3.ws.cbp.service.ConsultaAjusteReciboPorAjusteReciboIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaOrdenRelDetPorOrdenRelDetIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaOrdenRelacionadaPorNumeroOrdenIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaOrdenRelacionadaPorOrdenRelacionadaIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse;
import com.cbp3.ws.cbp.service.ConsultaProveedorPorProveedorIdWS;
import com.cbp3.ws.cbp.service.ConsultaProveedorPorProveedorIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaTerceroPorTerceroIdWSResponse;
import com.cbp3.ws.cbp.service.CrearAjusteInventarioWS;
import com.cbp3.ws.cbp.service.CrearAjusteInventarioWSResponse;
import com.cbp3.ws.cbp.service.CrearAjusteReciboWS;
import com.cbp3.ws.cbp.service.CrearAjusteReciboWSResponse;
import com.cbp3.ws.cbp.service.CrearOrdenRelDetalleWS;
import com.cbp3.ws.cbp.service.CrearOrdenRelDetalleWSResponse;
import com.cbp3.ws.cbp.service.CrearOrdenRelacionadaWS;
import com.cbp3.ws.cbp.service.CrearOrdenRelacionadaWSResponse;
import com.cbp3.ws.cbp.service.CrearProductoUbicacionWS;
import com.cbp3.ws.cbp.service.CrearProductoUbicacionWSResponse;
import com.cbp3.ws.cbp.service.CrearTerceroWS;
import com.cbp3.ws.cbp.service.CrearTerceroWSResponse;
import com.cbp3.ws.cbp.service.GenerarMovimientoWS;
import com.cbp3.ws.cbp.service.GenerarMovimientoWSResponse;
import com.cbp3.ws.cbp.service.InventarioServiceWS;
import com.cbp3.ws.cbp.service.InventarioServiceWS_Service;
import com.cbp3.ws.cbp.service.ListPurchaseOrderPorEstatusWS;
import com.cbp3.ws.cbp.service.ListPurchaseOrderPorEstatusWSResponse;
import com.cbp3.ws.cbp.service.ModificarAjusteInventarioWS;
import com.cbp3.ws.cbp.service.ModificarAjusteInventarioWSResponse;
import com.cbp3.ws.cbp.service.ModificarAjusteReciboWS;
import com.cbp3.ws.cbp.service.ModificarAjusteReciboWSResponse;
import com.cbp3.ws.cbp.service.ModificarProductoUbicacionWS;
import com.cbp3.ws.cbp.service.ModificarProductoUbicacionWSResponse;
import com.cbp3.ws.cbp.service.ModificarTerceroWS;
import com.cbp3.ws.cbp.service.ModificarTerceroWSResponse;
import com.cbp3.ws.cbp.service.Movimiento;
import com.cbp3.ws.cbp.service.ProductoUbicacion;
import com.cbp3.ws.cbp.service.PurchaseOrder;
import com.cbp3.ws.cbp.service.RelacionAlmacenes;
import com.cbp3.ws.cbp.service.Tercero;
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
	//Methodo para Consultar Ajuste Recibo por Ajuste Recibo ID...
	public ConsultaAjusteReciboPorAjusteReciboIdWSResponse consultaAjusteReciboPorAjusteReciboId(long ajusteReciboId) {
		
		//instanciar Objeto para retorno....
		ConsultaAjusteReciboPorAjusteReciboIdWSResponse respuestaConsultaAjusteReciboPorAjusteReciboId = new ConsultaAjusteReciboPorAjusteReciboIdWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaConsultaAjusteReciboPorAjusteReciboId.setReturn(WSmethod.consultaAjusteReciboPorAjusteReciboIdWS(ajusteReciboId));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaAjusteReciboPorAjusteReciboId;
	}
	
	////////////////////////////////
	//Methodo para Consultar Orden Relacionada por Numero ID...
	public ConsultaOrdenRelacionadaPorNumeroOrdenIdWSResponse consultaOrdenRelacionadaPorNumeroOrdenId(String ordenRelacionadaNumber) {
		
		//instanciar Objeto para retorno....
		ConsultaOrdenRelacionadaPorNumeroOrdenIdWSResponse respuestaConsultaOrdenRelacionadaPorNumeroOrdenId = new ConsultaOrdenRelacionadaPorNumeroOrdenIdWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaConsultaOrdenRelacionadaPorNumeroOrdenId.setReturn(WSmethod.consultaOrdenRelacionadaPorNumeroOrdenIdWS(ordenRelacionadaNumber));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaOrdenRelacionadaPorNumeroOrdenId;
	}
	
	////////////////////////////////
	//Methodo para Consultar Orden Relacionada por Orden Relacionada ID...
	public ConsultaOrdenRelacionadaPorOrdenRelacionadaIdWSResponse consultaOrdenRelacionadaPorOrdenRelacionadaId(long ordenRelacionadaId) {
		
		//instanciar Objeto para retorno....
		ConsultaOrdenRelacionadaPorOrdenRelacionadaIdWSResponse respuestaConsultaOrdenRelacionadaPorOrdenRelacionadaId = new ConsultaOrdenRelacionadaPorOrdenRelacionadaIdWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaConsultaOrdenRelacionadaPorOrdenRelacionadaId.setReturn(WSmethod.consultaOrdenRelacionadaPorOrdenRelacionadaIdWS(ordenRelacionadaId));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaOrdenRelacionadaPorOrdenRelacionadaId;
	}
	
	////////////////////////////////
	//Methodo para Consultar Orden Relacionada Detalle por Orden Relacionada Detalle ID...
	public ConsultaOrdenRelDetPorOrdenRelDetIdWSResponse consultaOrdenRelDetPorOrdenRelDetId(long ordenRelDetId) {
		
		//instanciar Objeto para retorno....
		ConsultaOrdenRelDetPorOrdenRelDetIdWSResponse respuestaConsultaOrdenRelDetPorOrdenRelDetId = new ConsultaOrdenRelDetPorOrdenRelDetIdWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaConsultaOrdenRelDetPorOrdenRelDetId.setReturn(WSmethod.consultaOrdenRelDetPorOrdenRelDetIdWS(ordenRelDetId));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaConsultaOrdenRelDetPorOrdenRelDetId;
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
	//Methodo para Crear Orden Relacionada...
	public CrearOrdenRelacionadaWSResponse crearOrdenRelacionada(CrearOrdenRelacionadaWS CrearOrdenRelacionadaWS) {
		
		//instanciar Objeto para retorno....
		CrearOrdenRelacionadaWSResponse respuestaCrearOrdenRelacionada = new CrearOrdenRelacionadaWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaCrearOrdenRelacionada.setReturn(WSmethod.crearOrdenRelacionadaWS(CrearOrdenRelacionadaWS.getOrdenRelacionadaNumber(), CrearOrdenRelacionadaWS.getTipoOrdenId(), CrearOrdenRelacionadaWS.getDescripcion(), CrearOrdenRelacionadaWS.getIdProduct(), CrearOrdenRelacionadaWS.getCantidad(), CrearOrdenRelacionadaWS.getAlmacenOrigen(), CrearOrdenRelacionadaWS.getAlmacenDestino(), CrearOrdenRelacionadaWS.getIdTercero(), CrearOrdenRelacionadaWS.getIdComercio()));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearOrdenRelacionada;
	}
	
	////////////////////////////////
	//Methodo para Crear Orden Relacionada Detalle...
	public CrearOrdenRelDetalleWSResponse crearOrdenRelDetalle(CrearOrdenRelDetalleWS CrearOrdenRelDetalleWS) {
		
		//instanciar Objeto para retorno....
		CrearOrdenRelDetalleWSResponse respuestaCrearOrdenRelDetalle = new CrearOrdenRelDetalleWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaCrearOrdenRelDetalle.setReturn(WSmethod.crearOrdenRelDetalleWS(CrearOrdenRelDetalleWS.getOrdenRelacionadaId(), CrearOrdenRelDetalleWS.getIdProduct(), CrearOrdenRelDetalleWS.getCantidad(), CrearOrdenRelDetalleWS.getFechaCargaDatos()));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearOrdenRelDetalle;
	}
	
	////////////////////////////////
	//Methodo para Crear Ajuste Inventario...
	public CrearAjusteInventarioWSResponse crearAjusteInventario(CrearAjusteInventarioWS CrearAjusteInventarioWS) {
		
		//instanciar Objeto para retorno....
		CrearAjusteInventarioWSResponse respuestaCrearAjusteInventario = new CrearAjusteInventarioWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaCrearAjusteInventario.setReturn(WSmethod.crearAjusteInventarioWS(CrearAjusteInventarioWS.getFechaAjusteInventario(), CrearAjusteInventarioWS.getMovimientoId(), CrearAjusteInventarioWS.getTipoAjuste(), CrearAjusteInventarioWS.getIdProduct(), CrearAjusteInventarioWS.getCantidad(), CrearAjusteInventarioWS.getComentarios(), CrearAjusteInventarioWS.getFechaCargaDatos()));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearAjusteInventario;
	}
	
	////////////////////////////////
	//Methodo para Crear Ajuste Recibo...
	public CrearAjusteReciboWSResponse crearAjusteRecibo(CrearAjusteReciboWS CrearAjusteReciboWS) {
		
		//instanciar Objeto para retorno....
		CrearAjusteReciboWSResponse respuestaCrearAjusteRecibo = new CrearAjusteReciboWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaCrearAjusteRecibo.setReturn(WSmethod.crearAjusteReciboWS(CrearAjusteReciboWS.getFechaAjusteRecibo(), CrearAjusteReciboWS.getMovimientoId(), CrearAjusteReciboWS.getIdProduct(), CrearAjusteReciboWS.getCantidad(), CrearAjusteReciboWS.getComentarios(), CrearAjusteReciboWS.getFechaCargaDatos()));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaCrearAjusteRecibo;
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
	//Methodo para Modificar Ajuste Inventario...
	public ModificarAjusteInventarioWSResponse modificarAjusteInventario(ModificarAjusteInventarioWS ModificarAjusteInventarioWS) {
		
		//instanciar Objeto para retorno....
		ModificarAjusteInventarioWSResponse respuestaModificarAjusteInventario = new ModificarAjusteInventarioWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaModificarAjusteInventario.setReturn(WSmethod.modificarAjusteInventarioWS(ModificarAjusteInventarioWS.getAjusteInventarioId(), ModificarAjusteInventarioWS.getFechaAjusteInventario(), ModificarAjusteInventarioWS.getMovimientoId(), ModificarAjusteInventarioWS.getTipoAjuste(), ModificarAjusteInventarioWS.getIdProduct(), ModificarAjusteInventarioWS.getCantidad(), ModificarAjusteInventarioWS.getComentarios(), ModificarAjusteInventarioWS.getCodigoUsuarioModifica(), ModificarAjusteInventarioWS.getFechaHoraModificacion()));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaModificarAjusteInventario;
	}
	
	////////////////////////////////
	//Methodo para Modificar Ajuste Recibo...
	public ModificarAjusteReciboWSResponse modificarAjusteRecibo(ModificarAjusteReciboWS ModificarAjusteReciboWS) {
		
		//instanciar Objeto para retorno....
		ModificarAjusteReciboWSResponse respuestaModificarAjusteRecibo = new ModificarAjusteReciboWSResponse();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaModificarAjusteRecibo.setReturn(WSmethod.modificarAjusteReciboWS(ModificarAjusteReciboWS.getAjusteReciboId(), ModificarAjusteReciboWS.getMovimientoId(), ModificarAjusteReciboWS.getIdProduct(), ModificarAjusteReciboWS.getCantidad(), ModificarAjusteReciboWS.getComentarios(), ModificarAjusteReciboWS.getCodigoUsuarioModifica(), ModificarAjusteReciboWS.getFechaHoraModificacion()));			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaModificarAjusteRecibo;
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
	
	////////////////////////////////
	//Methodo para listar Ajuste Inventario...
	public java.util.List<AjusteInventario> listaAjusteInventario() {
		
		//instanciar Objeto para retorno....
		java.util.List<AjusteInventario> respuestaAjusteInventario = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaAjusteInventario = WSmethod.listAjusteInventarioWS();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaAjusteInventario;
	}
	
	////////////////////////////////
	//Methodo para listar Ajuste Recibo...
	public java.util.List<AjusteRecibo> listaAjusteRecibo() {
		
		//instanciar Objeto para retorno....
		java.util.List<AjusteRecibo> respuestaAjusteRecibo = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaAjusteRecibo = WSmethod.listAjusteReciboWS();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaAjusteRecibo;
	}
	
	////////////////////////////////
	//Methodo para listar Tercero...
	public java.util.List<Tercero> listaTercero() {
		
		//instanciar Objeto para retorno....
		java.util.List<Tercero> respuestaTercero = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuestaTercero = WSmethod.listTerceroWS();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuestaTercero;
	}
	
	
	
	////////////////////////////////
	//Methodo para listar Tercero...
	public java.util.List<PurchaseOrder> listaPruchaseOrderPorEstatus() {
	
		//instanciar Objeto para retorno....
		java.util.List<PurchaseOrder> respuesta = new ArrayList<>();
		
		try {
			//Conectar Servicio para mandar datos y recoger respuesta...
			InventarioServiceWS_Service ws = new InventarioServiceWS_Service(new URL(readProperties("IP.AMBIENTE")+"/CBP-3/InventarioServiceWS?WSDL"));
			InventarioServiceWS WSmethod = ws.getInventarioServiceWSPort();
			
			//respuestaCrearComercio.setReturn(WSmethod.crearComercioWS(crearComercio.getIdentificacionComercio(), crearComercio.getNombreEmpresarial(), crearComercio.getNombreComercial(), crearComercio.getEmail(), crearComercio.getTelefonoContacto(), crearComercio.getEstadoComercioActivo(), crearComercio.getTelefonoLocal(), crearComercio.getNumCuentaAsociado(), crearComercio.getAfiliadoOtroBanco(), crearComercio.getTipoIdentificacionId(), crearComercio.getActividadComercial(), crearComercio.getHorarioComercial()));
			respuesta = WSmethod.listPurchaseOrderPorEstatusWS();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return respuesta;
	}

}
