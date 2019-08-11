package com.cbp.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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

@Controller
@RequestMapping("/Almacen")
public class AlmacenController {

	private String name;
	private String link;
	Authentication auth = null;
	
	@Autowired
	AlmacenDAO almacenMethods;
	
	@RequestMapping(value = "/consultarAlmacenPorAlmacenId", produces = { "application/json" })// No lo usaré y no se si es necesario
	public @ResponseBody ConsultaAlmacenPorAlmacenIdWSResponse consultaAlmacenPorAlmacenId(@RequestBody ConsultaAlmacenPorAlmacenIdDTO ConsultaAlmacenPorAlmacenIdDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaAlmacenPorAlmacenIdWSResponse respuesta = new ConsultaAlmacenPorAlmacenIdWSResponse();
		respuesta = almacenMethods.consultaAlmacenPorAlmacenId(ConsultaAlmacenPorAlmacenIdDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/consultaAlmacenPorNumeroAlmacen", produces = { "application/json" }) // Consulta Real por warehouseNumber
	public @ResponseBody ConsultaAlmacenPorNumeroAlmacenWSResponse consultaAlmacenPorNumeroAlmacen(@RequestBody ConsultaAlmacenPorNumeroAlmacenDTO ConsultaAlmacenPorNumeroAlmacenDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaAlmacenPorNumeroAlmacenWSResponse respuesta = new ConsultaAlmacenPorNumeroAlmacenWSResponse();
		respuesta = almacenMethods.consultaAlmacenPorNumeroAlmacen(ConsultaAlmacenPorNumeroAlmacenDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/saveAditionalInformationAlmacen", produces = { "application/json" }) // Crear Almacen Repetido
	public @ResponseBody SaveAditionaInformationAlmacenWSResponse saveAditionalInformationAlmacen(@RequestBody SaveAditionalInformationAlmacenDTO SaveAditionalInformationAlmacenDTO) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		SaveAditionaInformationAlmacenWSResponse respuesta = new SaveAditionaInformationAlmacenWSResponse();
		respuesta = almacenMethods.saveAditionalInformationAlmacen(SaveAditionalInformationAlmacenDTO);
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// identificacionProducto; // Debe ser eliminado este atrubuto
	// Solo se Cambian: Codigo, Tipo, Descripción, Encargado, Ubicación (el resto va quemado)
	
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
	
	// No hace falta un Id de Estanteria? o Es Autoincrementable en Base de Datos?
	
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
	
	// Las Zonas no deberían pedir un ID de Empleado en ves de el objeto entero?
	// Las Zonas no deberían pedir un ID de TipoZona en ves de el objeto entero?
	// la zona ya no tiene el campo de NombreZona, esto va en la misma descripción de la Zona
	
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
	
	// Las Estanterias se deberían consultar por medio de: IdAlmacen + IdZona + IdEstanteria (Las Estanterias Deberian tener una llave primaria compuesta por estos Atributos)
	
	@RequestMapping(value = "/consultaEstanteriaPorEstanteriaId", produces = { "application/json" })
	public @ResponseBody ConsultaEstanteriaPorEstanteriaIdWSResponse consultaEstanteriaPorEstanteriaId(@RequestBody ConsultaEstanteriaPorEstanteriaIdWS ConsultaEstanteriaPorEstanteriaIdWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaEstanteriaPorEstanteriaIdWSResponse respuesta = new ConsultaEstanteriaPorEstanteriaIdWSResponse();
		respuesta = almacenMethods.consultaEstanteriaPorEstanteriaId(ConsultaEstanteriaPorEstanteriaIdWS);
		//System.out.println(ModificarAlmacenDTO.toString());
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// una Zona única se debería consultar por medio de: IdAlmacen + IdZona (Las Zonas Deberian tener una llave primaria compuesta por estos Atributos)
	
	@RequestMapping(value = "/consultaZonaPorZonaId", produces = { "application/json" })
	public @ResponseBody ConsultaZonaPorZonaIdWSResponse consultaZonaPorZonaId(@RequestBody ConsultaZonaPorZonaIdWS ConsultaZonaPorZonaIdWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ConsultaZonaPorZonaIdWSResponse respuesta = new ConsultaZonaPorZonaIdWSResponse();
		respuesta = almacenMethods.consultaZonaPorZonaId(ConsultaZonaPorZonaIdWS);
		//System.out.println(ModificarAlmacenDTO.toString());
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// zonaActualId y zonaDestinoId Deberian ser tipo long no Zona puesto que son IDs de Zonas que ya están en la tabla de Zonas
	
	@RequestMapping(value = "/crearRelacionZonas", produces = { "application/json" })
	public @ResponseBody CrearRelacionZonasWSResponse crearRelacionZonas(@RequestBody CrearRelacionZonasWS CrearRelacionZonasWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		CrearRelacionZonasWSResponse respuesta = new CrearRelacionZonasWSResponse();
		respuesta = almacenMethods.crearRelacionZonas(CrearRelacionZonasWS);
		//System.out.println(ModificarAlmacenDTO.toString());
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// faltaria el IdAlmacen para ubicar exactamente la Estanteria a Modificar
	
	@RequestMapping(value = "/modificarEstanteria", produces = { "application/json" })
	public @ResponseBody ModificarEstanteriaWSResponse modificarEstanteria(@RequestBody ModificarEstanteriaWS ModificarEstanteriaWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ModificarEstanteriaWSResponse respuesta = new ModificarEstanteriaWSResponse();
		respuesta = almacenMethods.modificarEstanteria(ModificarEstanteriaWS);
		//System.out.println(ModificarAlmacenDTO.toString());
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Falta consula de una única Relacion
	
	@RequestMapping(value = "/modificarRelacionZonas", produces = { "application/json" })
	public @ResponseBody ModificarRelacionZonasWSResponse modificarRelacionZonas(@RequestBody ModificarRelacionZonasWS ModificarRelacionZonasWS) {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		ModificarRelacionZonasWSResponse respuesta = new ModificarRelacionZonasWSResponse();
		respuesta = almacenMethods.modificarRelacionZonas(ModificarRelacionZonasWS);
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
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// La consulta de la Lista de Estanterias de una Zona me debe pedir el Id de una Zona (para listar las Estanterias de esta especificamente)
	
	@RequestMapping(value = "/listaEstanterias", produces = { "application/json" }) 
	public @ResponseBody java.util.List<Estanteria> listaEstanterias() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<Estanteria> respuesta = new ArrayList<>();
		respuesta = almacenMethods.listaEstanterias();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// La consulta de la Lista de Relaciones de una Zona me debe pedir el Id de una Zona (para listar las Relaciones de esta especificamente)
	
	@RequestMapping(value = "/listaRelacionZonas", produces = { "application/json" }) 
	public @ResponseBody java.util.List<RelacionZonas> listaRelacionZonas() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<RelacionZonas> respuesta = new ArrayList<>();
		respuesta = almacenMethods.listaRelacionZonas();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// la consulta de la Lista de Zonas debe pedir un Id de Almacén (para listar las zonas de este especificamente)
	
	@RequestMapping(value = "/listaZonas", produces = { "application/json" }) 
	public @ResponseBody java.util.List<Zona> listaZonas() {
		//System.out.println("Entro createCient: " + client.getClientFirstName());
		java.util.List<Zona> respuesta = new ArrayList<>();
		respuesta = almacenMethods.listaZonas();
		//System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//+////////////// Configuración Almacen ///////////////
	@RequestMapping(value = "/configuration_almacen", method = RequestMethod.GET)
    public String configuration_almacen(Model model) {
		auth = SecurityContextHolder.getContext().getAuthentication();
		name=auth.getName();
		String roleUser = "";
		roleUser = auth.getAuthorities().iterator().next().getAuthority();
			
		if (auth.getName().equals("esteban")) {
			link="/CBPult/img/esteban.jpeg";
			
		} else if (auth.getName().equals("karla")) {
			link="/CBPult/img/karla.jpeg";
		} else if (auth.getName().equals("admin")) {
			link="/CBPult/img/logo_purple.png";

		} else if (auth.getName().equals("victor")) {
			link="/CBPult/img/logo_purple.png";
		}
		
		model.addAttribute("roleUser", roleUser);
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
		
		auth = SecurityContextHolder.getContext().getAuthentication();
		name=auth.getName();
		String roleUser = "";
		roleUser = auth.getAuthorities().iterator().next().getAuthority();
			
		if (auth.getName().equals("esteban")) {
			link="/CBPult/img/esteban.jpeg";
			
		} else if (auth.getName().equals("karla")) {
			link="/CBPult/img/karla.jpeg";
		} else if (auth.getName().equals("admin")) {
			link="/CBPult/img/logo_purple.png";

		} else if (auth.getName().equals("victor")) {
			link="/CBPult/img/logo_purple.png";
		}
		
		model.addAttribute("roleUser", roleUser);
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
