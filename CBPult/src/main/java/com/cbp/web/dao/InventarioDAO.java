package com.cbp.web.dao;

import com.cbp3.ws.cbp.service.ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse;
import com.cbp3.ws.cbp.service.ConsultaProveedorPorProveedorIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaTerceroPorTerceroIdWSResponse;
import com.cbp3.ws.cbp.service.CrearProductoUbicacionWS;
import com.cbp3.ws.cbp.service.CrearProductoUbicacionWSResponse;
import com.cbp3.ws.cbp.service.CrearTerceroWS;
import com.cbp3.ws.cbp.service.CrearTerceroWSResponse;
import com.cbp3.ws.cbp.service.GenerarMovimientoWS;
import com.cbp3.ws.cbp.service.GenerarMovimientoWSResponse;
import com.cbp3.ws.cbp.service.ModificarProductoUbicacionWS;
import com.cbp3.ws.cbp.service.ModificarProductoUbicacionWSResponse;
import com.cbp3.ws.cbp.service.ModificarTerceroWS;
import com.cbp3.ws.cbp.service.ModificarTerceroWSResponse;
import com.cbp3.ws.cbp.service.Movimiento;
import com.cbp3.ws.cbp.service.ProductoUbicacion;
import com.cbp3.ws.cbp.service.TipoMovimiento;

public interface InventarioDAO {
	
	public ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse consultaProductoUbicacionByIdProductoUbicacion(long productoUbicacionId);
	
	public ConsultaProveedorPorProveedorIdWSResponse consultaProveedorPorProveedorId(long idProvider);
	
	public ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse consultaPurchaseOrderPorPurchaseOrderId(long idOrder);
	
	public ConsultaTerceroPorTerceroIdWSResponse consultaTerceroPorTerceroId(long terceroId);
	
	public CrearProductoUbicacionWSResponse crearProductoUbicacion(CrearProductoUbicacionWS CrearProductoUbicacionWS);
	
	public CrearTerceroWSResponse crearTercero(CrearTerceroWS CrearTerceroWS);
	
	public GenerarMovimientoWSResponse generarMovimiento(GenerarMovimientoWS GenerarMovimientoWS);
	
	public ModificarProductoUbicacionWSResponse modificarProductoUbicacion(ModificarProductoUbicacionWS ModificarProductoUbicacionWS);
	
	public ModificarTerceroWSResponse modificarTercero(ModificarTerceroWS ModificarTerceroWS);
	
	public java.util.List<Movimiento> listaMovimientosByTipoMovimiento(long idTipoMovimiento);
	
	public java.util.List<ProductoUbicacion> listaProductoUbicacion();
	
	public java.util.List<TipoMovimiento> listaTipoMovimiento();

}
