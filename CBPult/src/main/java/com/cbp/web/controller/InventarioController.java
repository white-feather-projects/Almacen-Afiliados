package com.cbp.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cbp.web.dao.InventarioDAO;
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

@Controller
@RequestMapping("/Inventario")
public class InventarioController {

	private String name;
	private String link;
	Authentication auth = null;
	
	@Autowired
	InventarioDAO inventarioDAO;
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/consultaProductoUbicacionByIdProductoUbicacion/{IdProductoUbicacion}", produces = { "application/json" }) 
	public @ResponseBody ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse consultaProductoUbicacionByIdProductoUbicacion(@PathVariable(value = "IdProductoUbicacion") long productoUbicacionId) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse respuesta = new ConsultaProductoUbicacionsByIdProductoUbicacionWSResponse();
		respuesta = inventarioDAO.consultaProductoUbicacionByIdProductoUbicacion(productoUbicacionId);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/consultaProveedorPorProveedorId/{idProvider}", produces = { "application/json" }) 
	public @ResponseBody ConsultaProveedorPorProveedorIdWSResponse consultaProveedorPorProveedorId(@PathVariable(value = "idProvider") long idProvider) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaProveedorPorProveedorIdWSResponse respuesta = new ConsultaProveedorPorProveedorIdWSResponse();
		respuesta = inventarioDAO.consultaProveedorPorProveedorId(idProvider);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/consultaPurchaseOrderPorPurchaseOrderId/{idOrder}", produces = { "application/json" }) 
	public @ResponseBody ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse consultaPurchaseOrderPorPurchaseOrderId(@PathVariable(value = "idOrder") long idOrder) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse respuesta = new ConsultaPurchaseOrderPorPurchaseOrderIdWSResponse();
		respuesta = inventarioDAO.consultaPurchaseOrderPorPurchaseOrderId(idOrder);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/consultaTerceroPorTerceroId/{terceroId}", produces = { "application/json" }) 
	public @ResponseBody ConsultaTerceroPorTerceroIdWSResponse consultaTerceroPorTerceroId(@PathVariable(value = "terceroId") long terceroId) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaTerceroPorTerceroIdWSResponse respuesta = new ConsultaTerceroPorTerceroIdWSResponse();
		respuesta = inventarioDAO.consultaTerceroPorTerceroId(terceroId);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/crearProductoUbicacion", produces = { "application/json" }) 
	public @ResponseBody CrearProductoUbicacionWSResponse crearProductoUbicacion(@RequestBody CrearProductoUbicacionWS CrearProductoUbicacionWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearProductoUbicacionWSResponse respuesta = new CrearProductoUbicacionWSResponse();
		respuesta = inventarioDAO.crearProductoUbicacion(CrearProductoUbicacionWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/crearTercero", produces = { "application/json" }) 
	public @ResponseBody CrearTerceroWSResponse crearTercero(@RequestBody CrearTerceroWS CrearTerceroWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearTerceroWSResponse respuesta = new CrearTerceroWSResponse();
		respuesta = inventarioDAO.crearTercero(CrearTerceroWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/generarMovimiento", produces = { "application/json" }) 
	public @ResponseBody GenerarMovimientoWSResponse generarMovimiento(@RequestBody GenerarMovimientoWS GenerarMovimientoWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		GenerarMovimientoWSResponse respuesta = new GenerarMovimientoWSResponse();
		respuesta = inventarioDAO.generarMovimiento(GenerarMovimientoWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/modificarProductoUbicacion", produces = { "application/json" }) 
	public @ResponseBody ModificarProductoUbicacionWSResponse modificarProductoUbicacion(@RequestBody ModificarProductoUbicacionWS ModificarProductoUbicacionWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ModificarProductoUbicacionWSResponse respuesta = new ModificarProductoUbicacionWSResponse();
		respuesta = inventarioDAO.modificarProductoUbicacion(ModificarProductoUbicacionWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/modificarTercero", produces = { "application/json" }) 
	public @ResponseBody ModificarTerceroWSResponse modificarTercero(@RequestBody ModificarTerceroWS ModificarTerceroWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ModificarTerceroWSResponse respuesta = new ModificarTerceroWSResponse();
		respuesta = inventarioDAO.modificarTercero(ModificarTerceroWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaMovimientosByTipoMovimiento/{idTipoMovimiento}", produces = { "application/json" }) 
	public @ResponseBody java.util.List<Movimiento> listaMovimientosByTipoMovimiento(@PathVariable(value = "idTipoMovimiento") long idTipoMovimiento) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<Movimiento> respuesta = new ArrayList<>();
		respuesta = inventarioDAO.listaMovimientosByTipoMovimiento(idTipoMovimiento);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaMovimientosByTipoMovimiento", produces = { "application/json" }) 
	public @ResponseBody java.util.List<ProductoUbicacion> listaProductoUbicacion() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<ProductoUbicacion> respuesta = new ArrayList<>();
		respuesta = inventarioDAO.listaProductoUbicacion();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaTipoMovimiento", produces = { "application/json" }) 
	public @ResponseBody java.util.List<TipoMovimiento> listaTipoMovimiento() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<TipoMovimiento> respuesta = new ArrayList<>();
		respuesta = inventarioDAO.listaTipoMovimiento();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
}
