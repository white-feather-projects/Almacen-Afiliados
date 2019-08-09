package com.cbp.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cbp.web.dao.AlmacenDAO;
import com.cbp.web.dto.ConsultaAlmacenPorAlmacenIdDTO;
import com.cbp.web.dto.ConsultaAlmacenPorNumeroAlmacenDTO;
import com.cbp.web.dto.SaveAditionalInformationAlmacenDTO;
import com.cbp3.ws.cbp.service.ConsultaAlmacenPorAlmacenIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaAlmacenPorNumeroAlmacenWSResponse;
import com.cbp3.ws.cbp.service.CrearAlmacenWS;
import com.cbp3.ws.cbp.service.CrearAlmacenWSResponse;
import com.cbp3.ws.cbp.service.CrearEstanteriaWS;
import com.cbp3.ws.cbp.service.CrearEstanteriaWSResponse;
import com.cbp3.ws.cbp.service.CrearListaZonaWizzardWS;
import com.cbp3.ws.cbp.service.CrearListaZonaWizzardWSResponse;
import com.cbp3.ws.cbp.service.ModificarAlmacenWS;
import com.cbp3.ws.cbp.service.ModificarAlmacenWSResponse;
import com.cbp3.ws.cbp.service.SaveAditionaInformationAlmacenWSResponse;
import com.cbp3.ws.cbp.service.Solicitud;
import com.cbp3.ws.cbp.service.Warehouse;

@Controller
@RequestMapping("/Almacen")
public class AlmacenController {

	private String name;
	private String link;
	Authentication auth = null;
	
	@Autowired
	AlmacenDAO almacenMethods;
	
	@RequestMapping(value = "/consultarAlmacenPorAlmacenId", produces = { "application/json" })
	public @ResponseBody ConsultaAlmacenPorAlmacenIdWSResponse consultaAlmacenPorAlmacenId(@RequestBody ConsultaAlmacenPorAlmacenIdDTO ConsultaAlmacenPorAlmacenIdDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaAlmacenPorAlmacenIdWSResponse respuesta = new ConsultaAlmacenPorAlmacenIdWSResponse();
		respuesta = almacenMethods.consultaAlmacenPorAlmacenId(ConsultaAlmacenPorAlmacenIdDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/consultaAlmacenPorNumeroAlmacen", produces = { "application/json" })
	public @ResponseBody ConsultaAlmacenPorNumeroAlmacenWSResponse consultaAlmacenPorNumeroAlmacen(@RequestBody ConsultaAlmacenPorNumeroAlmacenDTO ConsultaAlmacenPorNumeroAlmacenDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaAlmacenPorNumeroAlmacenWSResponse respuesta = new ConsultaAlmacenPorNumeroAlmacenWSResponse();
		respuesta = almacenMethods.consultaAlmacenPorNumeroAlmacen(ConsultaAlmacenPorNumeroAlmacenDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/saveAditionalInformationAlmacen", produces = { "application/json" })
	public @ResponseBody SaveAditionaInformationAlmacenWSResponse saveAditionalInformationAlmacen(@RequestBody SaveAditionalInformationAlmacenDTO SaveAditionalInformationAlmacenDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		SaveAditionaInformationAlmacenWSResponse respuesta = new SaveAditionaInformationAlmacenWSResponse();
		respuesta = almacenMethods.saveAditionalInformationAlmacen(SaveAditionalInformationAlmacenDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/modificarAlmacen", produces = { "application/json" })
	public @ResponseBody ModificarAlmacenWSResponse modificarAlmacen(@RequestBody ModificarAlmacenWS ModificarAlmacenDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ModificarAlmacenWSResponse respuesta = new ModificarAlmacenWSResponse();
		respuesta = almacenMethods.modificarAlmacen(ModificarAlmacenDTO);
		//System.out.println(ModificarAlmacenDTO.toString());
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/crearAlmacen", produces = { "application/json" })
	public @ResponseBody CrearAlmacenWSResponse crearAlmacen(@RequestBody CrearAlmacenWS CrearAlmacenWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearAlmacenWSResponse respuesta = new CrearAlmacenWSResponse();
		respuesta = almacenMethods.crearAlmacen(CrearAlmacenWS);
		//System.out.println(ModificarAlmacenDTO.toString());
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/crearEstanteria", produces = { "application/json" })
	public @ResponseBody CrearEstanteriaWSResponse crearEstanteria(@RequestBody CrearEstanteriaWS CrearEstanteriaWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearEstanteriaWSResponse respuesta = new CrearEstanteriaWSResponse();
		respuesta = almacenMethods.crearEstanteria(CrearEstanteriaWS);
		//System.out.println(ModificarAlmacenDTO.toString());
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/crearListaZonaWizzard", produces = { "application/json" })
	public @ResponseBody CrearListaZonaWizzardWSResponse crearListaZonaWizzard(@RequestBody CrearListaZonaWizzardWS CrearListaZonaWizzardWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearListaZonaWizzardWSResponse respuesta = new CrearListaZonaWizzardWSResponse();
		respuesta = almacenMethods.crearListaZonaWizzard(CrearListaZonaWizzardWS);
		//System.out.println(ModificarAlmacenDTO.toString());
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/listaAlmacenes", produces = { "application/json" })
	public @ResponseBody java.util.List<Warehouse> listaAlmacenes() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<Warehouse> respuesta = new ArrayList<>();
		respuesta = almacenMethods.listaAlmacenes();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//+////////////// Configuración Almacen ///////////////
	@RequestMapping(value = "/configuration_almacen", method = RequestMethod.GET)
    public String configuration_almacen(Model model) {
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
     return "templates.almacen/templates.configuracion/configuration_almacen";
	}
	
	
	//+////////////// Almacen ///////////////
		
		//+////////////// Nuevo Almacen Wizzard ///////////////
		@RequestMapping(value = "/almacen_nuevo-wizzard", method = RequestMethod.GET)
	    public String almacen_nuevo_wizzard(Model model) {
			model.addAttribute("name", name);
			model.addAttribute("link", link);
			
	     return "templates.almacen/templates.configuracion/almacen_nuevo-wizzard";
		}
		//-////////////// Nuevo Almacen Wizzard///////////////
		
		//+////////////// Nuevo/Editar Almacen ///////////////
	
		@RequestMapping(value = "/almacen_nuevo-editar/{idWarehouse}", method = RequestMethod.GET)
	    public String verPurchaseOrder(@PathVariable(value = "idWarehouse") Long idWarehouse, Model model) {
			model.addAttribute("name", name);
			model.addAttribute("link", link);
			
			 return "templates.almacen/templates.configuracion/almacen_nuevo-editar";
		}
		//-////////////// Nuevo/Editar Almacen ///////////////
		
		//+////////////// Nuevo/Editar Relacion Almacen ///////////////
		@RequestMapping(value = "/relacion-almacen_nuevo-editar", method = RequestMethod.GET)
		public String relacion_almacen_nuevo_editar(Model model) {
			model.addAttribute("name", name);
			model.addAttribute("link", link);
			
		return "templates.almacen/templates.configuracion/relacion-almacen_nuevo-editar";
		}
		//-////////////// Nuevo/Editar Relacion Almacen ///////////////
				
	//-////////////// Almacen ///////////////
		
	//+////////////// Zona ///////////////
	
		//+////////////// Nuevo/Editar Zona ///////////////
		@RequestMapping(value = "/zona_nuevo-editar", method = RequestMethod.GET)
		public String zona_nuevo_editar(Model model) {
			model.addAttribute("name", name);
			model.addAttribute("link", link);
			
		return "templates.almacen/templates.configuracion/zona_nuevo-editar";
		}
		//-////////////// Nuevo/Editar Almacen ///////////////
		
		//+////////////// Nuevo/Editar Relacion Almacen ///////////////
		@RequestMapping(value = "/relacion-zona_nuevo-editar", method = RequestMethod.GET)
		public String relacion_zona_nuevo_editar(Model model) {
			model.addAttribute("name", name);
			model.addAttribute("link", link);
			
		return "templates.almacen/templates.configuracion/relacion-zona_nuevo-editar";
		}
		//-////////////// Nuevo/Editar Relacion Almacen ///////////////
		
				
	//-////////////// Zona ///////////////
		
	//+////////////// Estanteria ///////////////
	
		//+////////////// Nuevo/Editar Estanteria ///////////////
		@RequestMapping(value = "/estanteria_nuevo-editar", method = RequestMethod.GET)
		public String estanteria_nuevo_editar(Model model) {
			model.addAttribute("name", name);
			model.addAttribute("link", link);
			
		return "templates.almacen/templates.configuracion/estanteria_nuevo-editar";
		}
		//-////////////// Nuevo/Editar Estanteria ///////////////		
				
	//-////////////// Estanteria ///////////////
		
		
	
	//-////////////// Configuración Almacen ///////////////
		
		
		
		
	//+////////////// Movimiento de Mercancia ///////////////
	
	//+////////////// Menu Movimiento de Mercancia ///////////////
	@RequestMapping(value = "/menu_movimiento-mercancia", method = RequestMethod.GET)
	public String menu_movimiento_mercancia(Model model) {
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
	return "templates.almacen/templates.movimiento-mercancia/menu_movimiento-mercancia";
	}
	//-////////////// Menu Movimiento de Mercancia ///////////////
		
		//+////////////// Inventario Almacen ///////////////
		@RequestMapping(value = "/inventario_almacen", method = RequestMethod.GET)
		public String inventario_almacen(Model model) {
			model.addAttribute("name", name);
			model.addAttribute("link", link);
			
		return "templates.almacen/templates.movimiento-mercancia/inventario-almacen_movimiento-mercancia";
		}
		//-////////////// Inventario Almacen ///////////////
		
		//+////////////// Inventario General ///////////////
		@RequestMapping(value = "/inventario_general", method = RequestMethod.GET)
		public String inventario_general(Model model) {
			model.addAttribute("name", name);
			model.addAttribute("link", link);
			
		return "templates.almacen/templates.movimiento-mercancia/inventario-general_movimiento-mercancia";
		}
		//-////////////// Inventario General ///////////////
		
		//+////////////// Inventario Zona ///////////////
		@RequestMapping(value = "/inventario_zona", method = RequestMethod.GET)
		public String inventario_zona(Model model) {
			model.addAttribute("name", name);
			model.addAttribute("link", link);
			
		return "templates.almacen/templates.movimiento-mercancia/inventario-zona_movimiento-mercancia";
		}
		//-////////////// Inventario Zona ///////////////
		
		//+////////////// Inventario Movimiento ///////////////
		@RequestMapping(value = "/inventario_movimiento", method = RequestMethod.GET)
		public String inventario_movimiento(Model model) {
			model.addAttribute("name", name);
			model.addAttribute("link", link);
			
		return "templates.almacen/templates.movimiento-mercancia/movimiento-nuevo_movimiento-mercancia";
		}
		//-////////////// Inventario Movimiento ///////////////
	
	//+////////////// Movimiento de Mercancia ///////////////
}
