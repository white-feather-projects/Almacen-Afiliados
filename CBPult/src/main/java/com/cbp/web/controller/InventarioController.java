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
import com.cbp3.ws.cbp.service.Tercero;
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
	
	@RequestMapping(value = "/consultaAjusteReciboPorAjusteReciboId/{valor1}", produces = { "application/json" }) 
	public @ResponseBody ConsultaAjusteReciboPorAjusteReciboIdWSResponse consultaAjusteReciboPorAjusteReciboId(@PathVariable(value = "valor1") long ajusteReciboId) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaAjusteReciboPorAjusteReciboIdWSResponse respuesta = new ConsultaAjusteReciboPorAjusteReciboIdWSResponse();
		respuesta = inventarioDAO.consultaAjusteReciboPorAjusteReciboId(ajusteReciboId);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/consultaOrdenRelacionadaPorNumeroOrdenId/{valor1}", produces = { "application/json" }) 
	public @ResponseBody ConsultaOrdenRelacionadaPorNumeroOrdenIdWSResponse consultaOrdenRelacionadaPorNumeroOrdenId(@PathVariable(value = "valor1") String ordenRelacionadaNumber) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaOrdenRelacionadaPorNumeroOrdenIdWSResponse respuesta = new ConsultaOrdenRelacionadaPorNumeroOrdenIdWSResponse();
		respuesta = inventarioDAO.consultaOrdenRelacionadaPorNumeroOrdenId(ordenRelacionadaNumber);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/consultaOrdenRelacionadaPorOrdenRelacionadaId/{valor1}", produces = { "application/json" }) 
	public @ResponseBody ConsultaOrdenRelacionadaPorOrdenRelacionadaIdWSResponse consultaOrdenRelacionadaPorOrdenRelacionadaId(@PathVariable(value = "valor1") long ordenRelacionadaId) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaOrdenRelacionadaPorOrdenRelacionadaIdWSResponse respuesta = new ConsultaOrdenRelacionadaPorOrdenRelacionadaIdWSResponse();
		respuesta = inventarioDAO.consultaOrdenRelacionadaPorOrdenRelacionadaId(ordenRelacionadaId);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/consultaOrdenRelDetPorOrdenRelDetId/{valor1}", produces = { "application/json" }) 
	public @ResponseBody ConsultaOrdenRelDetPorOrdenRelDetIdWSResponse consultaOrdenRelDetPorOrdenRelDetId(@PathVariable(value = "valor1") long ordenRelDetId) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaOrdenRelDetPorOrdenRelDetIdWSResponse respuesta = new ConsultaOrdenRelDetPorOrdenRelDetIdWSResponse();
		respuesta = inventarioDAO.consultaOrdenRelDetPorOrdenRelDetId(ordenRelDetId);
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
	
	@RequestMapping(value = "/crearOrdenRelacionada", produces = { "application/json" }) 
	public @ResponseBody CrearOrdenRelacionadaWSResponse crearOrdenRelacionada(@RequestBody CrearOrdenRelacionadaWS CrearOrdenRelacionadaWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearOrdenRelacionadaWSResponse respuesta = new CrearOrdenRelacionadaWSResponse();
		respuesta = inventarioDAO.crearOrdenRelacionada(CrearOrdenRelacionadaWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/crearOrdenRelDetalle", produces = { "application/json" }) 
	public @ResponseBody CrearOrdenRelDetalleWSResponse crearOrdenRelDetalle(@RequestBody CrearOrdenRelDetalleWS CrearOrdenRelDetalleWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearOrdenRelDetalleWSResponse respuesta = new CrearOrdenRelDetalleWSResponse();
		respuesta = inventarioDAO.crearOrdenRelDetalle(CrearOrdenRelDetalleWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/crearAjusteInventario", produces = { "application/json" }) 
	public @ResponseBody CrearAjusteInventarioWSResponse crearAjusteInventario(@RequestBody CrearAjusteInventarioWS CrearAjusteInventarioWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearAjusteInventarioWSResponse respuesta = new CrearAjusteInventarioWSResponse();
		respuesta = inventarioDAO.crearAjusteInventario(CrearAjusteInventarioWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/crearAjusteRecibo", produces = { "application/json" }) 
	public @ResponseBody CrearAjusteReciboWSResponse crearAjusteRecibo(@RequestBody CrearAjusteReciboWS CrearAjusteReciboWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearAjusteReciboWSResponse respuesta = new CrearAjusteReciboWSResponse();
		respuesta = inventarioDAO.crearAjusteRecibo(CrearAjusteReciboWS);
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
	
	@RequestMapping(value = "/modificarAjusteInventario", produces = { "application/json" }) 
	public @ResponseBody ModificarAjusteInventarioWSResponse modificarAjusteInventario(@RequestBody ModificarAjusteInventarioWS ModificarAjusteInventarioWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ModificarAjusteInventarioWSResponse respuesta = new ModificarAjusteInventarioWSResponse();
		respuesta = inventarioDAO.modificarAjusteInventario(ModificarAjusteInventarioWS);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/modificarAjusteRecibo", produces = { "application/json" }) 
	public @ResponseBody ModificarAjusteReciboWSResponse modificarAjusteRecibo(@RequestBody ModificarAjusteReciboWS ModificarAjusteReciboWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ModificarAjusteReciboWSResponse respuesta = new ModificarAjusteReciboWSResponse();
		respuesta = inventarioDAO.modificarAjusteRecibo(ModificarAjusteReciboWS);
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
	
	@RequestMapping(value = "/listaProductoUbicacion", produces = { "application/json" }) 
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
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaAjusteInventario", produces = { "application/json" }) 
	public @ResponseBody java.util.List<AjusteInventario> listaAjusteInventario() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<AjusteInventario> respuesta = new ArrayList<>();
		respuesta = inventarioDAO.listaAjusteInventario();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaAjusteRecibo", produces = { "application/json" }) 
	public @ResponseBody java.util.List<AjusteRecibo> listaAjusteRecibo() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<AjusteRecibo> respuesta = new ArrayList<>();
		respuesta = inventarioDAO.listaAjusteRecibo();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaTercero", produces = { "application/json" }) 
	public @ResponseBody java.util.List<Tercero> listaTercero() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<Tercero> respuesta = new ArrayList<>();
		respuesta = inventarioDAO.listaTercero();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
}
