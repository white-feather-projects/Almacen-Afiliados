package com.cbp.web.dao;

import java.util.List;

import com.cbp3.ws.cbp.service.AjusteInventario;
import com.cbp3.ws.cbp.service.AjusteRecibo;
import com.cbp3.ws.cbp.service.ConsultaAjusteReciboPorAjusteReciboIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaOrdenRelDetPorOrdenRelDetIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaOrdenRelacionadaPorNumeroOrdenIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaOrdenRelacionadaPorOrdenRelacionadaIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse;
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
import com.cbp3.ws.cbp.service.Tercero;
import com.cbp3.ws.cbp.service.TipoMovimiento;

public interface InventarioDAO {
	
	public ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse consultaProductoUbicacionByIdProductoUbicacion(long productoUbicacionId);
	
	public ConsultaProveedorPorProveedorIdWSResponse consultaProveedorPorProveedorId(long idProvider);
	
	public ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse consultaPurchaseOrderPorPurchaseOrderId(long idOrder);
	
	public ConsultaTerceroPorTerceroIdWSResponse consultaTerceroPorTerceroId(long terceroId);
	
	public ConsultaAjusteReciboPorAjusteReciboIdWSResponse consultaAjusteReciboPorAjusteReciboId(long ajusteReciboId);
	
	public ConsultaOrdenRelacionadaPorNumeroOrdenIdWSResponse consultaOrdenRelacionadaPorNumeroOrdenId(String ordenRelacionadaNumber);
	
	public ConsultaOrdenRelacionadaPorOrdenRelacionadaIdWSResponse consultaOrdenRelacionadaPorOrdenRelacionadaId(long ordenRelacionadaId);
	
	public ConsultaOrdenRelDetPorOrdenRelDetIdWSResponse consultaOrdenRelDetPorOrdenRelDetId(long ordenRelDetId);
	
	public CrearProductoUbicacionWSResponse crearProductoUbicacion(CrearProductoUbicacionWS CrearProductoUbicacionWS);
	
	public CrearTerceroWSResponse crearTercero(CrearTerceroWS CrearTerceroWS);
	
	public CrearOrdenRelacionadaWSResponse crearOrdenRelacionada(CrearOrdenRelacionadaWS CrearOrdenRelacionadaWS);
	
	public CrearOrdenRelDetalleWSResponse crearOrdenRelDetalle(CrearOrdenRelDetalleWS CrearOrdenRelDetalleWS);
	
	public CrearAjusteInventarioWSResponse crearAjusteInventario(CrearAjusteInventarioWS CrearAjusteInventarioWS);
	
	public CrearAjusteReciboWSResponse crearAjusteRecibo(CrearAjusteReciboWS CrearAjusteReciboWS);
	
	public GenerarMovimientoWSResponse generarMovimiento(GenerarMovimientoWS GenerarMovimientoWS);
	
	public ModificarProductoUbicacionWSResponse modificarProductoUbicacion(ModificarProductoUbicacionWS ModificarProductoUbicacionWS);
	
	public ModificarTerceroWSResponse modificarTercero(ModificarTerceroWS ModificarTerceroWS);
	
	public ModificarAjusteInventarioWSResponse modificarAjusteInventario(ModificarAjusteInventarioWS ModificarAjusteInventarioWS);
	
	public ModificarAjusteReciboWSResponse modificarAjusteRecibo(ModificarAjusteReciboWS ModificarAjusteReciboWS);
	
	
	
	
	public java.util.List<PurchaseOrder> listaPruchaseOrderPorEstatus();
	
	//
	
	public java.util.List<Movimiento> listaMovimientosByTipoMovimiento(long idTipoMovimiento);
	
	public java.util.List<ProductoUbicacion> listaProductoUbicacion();
	
	public java.util.List<TipoMovimiento> listaTipoMovimiento();
	
	public java.util.List<AjusteInventario> listaAjusteInventario();
	
	public java.util.List<AjusteRecibo> listaAjusteRecibo();
	
	public java.util.List<Tercero> listaTercero();

	

	
	
}
