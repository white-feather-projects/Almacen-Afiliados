package com.cbp.web.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Principal;
import java.util.Enumeration;
import java.util.Properties;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cbp.web.util.Util;


@Controller
public class LoginController{
	
	//private final Logger log = LoggerFactory.getLogger(getClass());

	private String name;
	private String link;
	Authentication auth = null;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String indice() {

		return "templates.login/index";
	}

	@GetMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error, Model model, Principal principal,
			RedirectAttributes flash) {
		if (principal != null) {
			// return "redirect:/";
		}
		//if (error != null) {
			//return LoginError();
		//} else {

			return "templates.login/login";
		//}

	}

	@RequestMapping(value = "/dashborad", method = RequestMethod.GET)
	public String LoginDashborad(Model model) {

		auth = SecurityContextHolder.getContext().getAuthentication();
		name=auth.getName();

		
		if (auth.getName().equals("esteban")) {
			link="../img/esteban.jpeg";
		} else if (auth.getName().equals("karla")) {
			link="../img/karla.jpeg";
		} else if (auth.getName().equals("admin")) {
			link="../img/logo_purple.png";

		} else if (auth.getName().equals("victor")) {
			link="../img/logo_purple.png";
		}
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.dashboard/menu_principal";
	}

	@GetMapping(value = "/errorlogin")
	public String LoginError() {

		return "templates.login/errorlogin";
	}
	
	@RequestMapping(value = "/managementpurchases", method = RequestMethod.GET)
	public String managementPurchases(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.purchaseOrder/managementpurchases";
	}
	
	

	
	@RequestMapping(value = "/viewgenerateorder", method = RequestMethod.GET)
    public String viewgenerateorder(Model model) {
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
     return "templates.purchaseOrder/view_generate_order";
	}
	
	@RequestMapping(value = "/listpurchaseorder", method = RequestMethod.GET)
	public String listPurchaseOrder(Model model) {
		
	
		String username = "";
		String roleUser = "";
	
		
	
		username = auth.getName();
		roleUser = auth.getAuthorities().iterator().next().getAuthority();
		
		
		model.addAttribute("roleUser", roleUser);
		model.addAttribute("username", username);
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.purchaseOrder/listgestionplasticos";
	}

	@RequestMapping(value = "/createpurchaseorder", method = RequestMethod.GET)
	public String createPurchaseOrder(Model model) {
		String valorMaximo = "";
		String valorMinimo = "";
		
		Properties prop = new Properties();
		InputStream is = null;
		
		try {
			//is = new FileInputStream("c:\\Configuracion\\configuracion.properties");
			is = new FileInputStream("/home/confPropertiesCBP/configuracion.properties");
			prop.load(is);
		} catch(IOException e) {
			System.out.println(e.toString());
		}
 
		// Acceder a las propiedades por su nombre
		System.out.println("Propiedades por nombre:");
		System.out.println("-----------------------");
		System.out.println(prop.getProperty("valor.maximo"));
		System.out.println(prop.getProperty("valor.minimo"));
	
		
		// Recorrer todas sin conocer los nombres de las propiedades
		System.out.println("Recorrer todas las propiedades:");
		System.out.println("-------------------------------");

		for (Enumeration e = prop.keys(); e.hasMoreElements() ; ) {
			// Obtenemos el objeto
			Object obj = e.nextElement();
			System.out.println(obj + ": " + prop.getProperty(obj.toString()));
		}
		
       valorMaximo = prop.getProperty("valor.maximo");
       valorMinimo = prop.getProperty("valor.minimo");
		
        model.addAttribute("valorMinimo", valorMinimo);
		model.addAttribute("valorMaximo", valorMaximo);
		model.addAttribute("name", name);
		model.addAttribute("link", link);

		return "templates.purchaseOrder/pedido_plasticos";
	}

	@RequestMapping(value = "/corfirmationcreatepurchaseorder", method = RequestMethod.GET)
	public String corfirmationCreatePurchaseOrder(Model model) {
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.purchaseOrder/pedido_plasticosconfirmacion";
	}

	@RequestMapping(value = "/generatedpurchaseorder/{idOrderRequest}", method = RequestMethod.GET)
	public String generatedPurchaseOrder(@PathVariable(value = "idOrderRequest") Long idOrderRequest, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.purchaseOrder/generated_pedido_plasticos";
	}
	
	@RequestMapping(value = "/generatedpurchaseorderconfirmacion/{idOrderRequest}", method = RequestMethod.GET)
    public String generatedPurchaseOrderConfirmacion(@PathVariable(value = "idOrderRequest") Long idOrderRequest,Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
	return"templates.purchaseOrder/generated_plasticosconfirmacion";
	}
	
	@RequestMapping(value = "/verpurchaseorder/{idOrderRequest}", method = RequestMethod.GET)
    public String verPurchaseOrder(@PathVariable(value = "idOrderRequest") Long idOrderRequest, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
	return"templates.purchaseOrder/ver_pedido_plasticos";
	}
	
	@RequestMapping(value = "/verDetalleCompra/{purchaseOrderNumber}", method = RequestMethod.GET)
    public String verDetalleCompra(@PathVariable(value = "purchaseOrderNumber") String purchaseOrderNumber, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
	return"templates.purchaseOrder/viewDetailPurchase";
	}
	
	@RequestMapping(value = "/editpurchaceorder/{idOrderRequest}", method = RequestMethod.GET)
    public String editPurchaceOrder(@PathVariable(value = "idOrderRequest") Long idOrderRequest, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
	return"templates.purchaseOrder/editpurchaceorder";
	}
	
	@RequestMapping(value = "/editpurchaceorderconfirmation/{idOrderRequest}", method = RequestMethod.GET)
    public String editPurchaceOrderConfirmation(@PathVariable(value = "idOrderRequest") Long idOrderRequest, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
	return"templates.purchaseOrder/editpurchaceorderconfirmation";
	}

	
	/**
	 * Url Gestion de configuracion
	 */
	
	@RequestMapping(value = "/configuration", method = RequestMethod.GET)
    public String configuration(Model model) {
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
     return "templates.configuration/configuration";
	}
    
    @RequestMapping(value = "/purchaseManagementConfiguration", method = RequestMethod.GET)
    public String purchaseManagementConfiguration(Model model) {
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
		
		
		
     return "templates.configuration/purchase_management_configuration";
	}
	

	/**
	 * Url Solicitudes Clientes
	 */
	
/**********************************************************************************************/
	
	@RequestMapping(value = "/analisis", method = RequestMethod.GET)
    public String analisis(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
	return"templates.gestion_cliente/analisis";
	}
	
	@RequestMapping(value = "/bandeja_riesgos", method = RequestMethod.GET)
    public String bandeja_riesgos(Model model) {
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
	return"templates.gestion_cliente/bandeja_riesgos";
	}
	
	@RequestMapping(value = "/bandeja_ventas", method = RequestMethod.GET)
    public String bandeja_ventas(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
	return"templates.gestion_cliente/bandeja_ventas";
	}
	
	@RequestMapping(value = "/carga_archivos", method = RequestMethod.GET)
    public String carga_archivos(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
	return"templates.gestion_cliente/carga_archivos";
	}
	
	@RequestMapping(value = "/carga_datos", method = RequestMethod.GET)
    public String carga_datos(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
	return"templates.gestion_cliente/carga_datos";
	}
	
	@RequestMapping(value = "/confirmacion", method = RequestMethod.GET)
    public String confirmacion(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
	return"templates.gestion_cliente/confirmacion";
	}
	/*
	@RequestMapping(value = "/confirmacion2", method = RequestMethod.GET)
    public String confirmacion2(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
	return"templates.gestion_cliente/confirmacion2";
	}
	*/
	@RequestMapping(value = "/confirmacion2/{clientDocumentId}", method = RequestMethod.GET)
	public String confirmacion2(@PathVariable(value = "clientDocumentId") Long idOrderRequest, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.gestion_cliente/confirmacion2";
	}
	/*
	@RequestMapping(value = "/documento/{documentName}", method = RequestMethod.GET)
	public String documentName(@PathVariable(value = "documentName") Long idOrderRequest, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.gestion_cliente/documento";
	}
	*/
	
	@RequestMapping(value = "/documento", method = RequestMethod.GET)
    public String documento(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
	return"templates.gestion_cliente/documento";
	}
	
	@RequestMapping(value = "/error404", method = RequestMethod.GET)
    public String error404() {
	return"templates.gestion_cliente/error404";
	}
	
	@RequestMapping(value = "/error405", method = RequestMethod.GET)
    public String error405() {
	return"templates.gestion_cliente/error405";
	}
	
	@RequestMapping(value = "/gestion_solicitudes", method = RequestMethod.GET)
    public String gestion_Solicitudes(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
	return"templates.gestion_cliente/gestion_solicitudes";
	}
	
	@RequestMapping(value = "/impresion_tarjetas", method = RequestMethod.GET)
    public String impresion_tarjetas(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
	return"templates.gestion_cliente/impresion_tarjetas";
	}
	
	@RequestMapping(value = "/listgestionplasticos", method = RequestMethod.GET)
    public String listGestionPlasticos(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
	return"templates.purchaseOrder/listgestionplasticos";
	}
	
	@RequestMapping(value = "/consulta/{clientId}", method = RequestMethod.GET)
	public String consulta(@PathVariable(value = "clientId") String clientId, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.gestion_cliente/consulta";
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////Afiliacion, Almacen /////////////////////////////////////////////////////  
	///////////////////////////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = "/menu_afiliacion_ejecutivo", method = RequestMethod.GET)
	public String menu_afiliacion_ejecutivo(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/menu_afiliacion_ejecutivo";
	}
	
	@RequestMapping(value = "/pre_carga_ejecutivo", method = RequestMethod.GET)
	public String pre_carga_ejecutivo(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/pre_carga_ejecutivo";
	}
	
	@RequestMapping(value = "/bandejas_ejecutivo", method = RequestMethod.GET)
	public String bandejas_ejecutivo(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/bandejas_ejecutivo";
	}
	
	@RequestMapping(value = "/confirm_pre_carga", method = RequestMethod.GET)
	public String confirm_pre_carga(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/confirm_pre_carga_ejecutivo";
	}
	
	@RequestMapping(value = "/compra", method = RequestMethod.GET)
	public String compra(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/compra_ejecutivo";
	}
	
	@RequestMapping(value = "/datos_comercio", method = RequestMethod.GET)
	public String datos_comercio(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/datos_comercio";
	}
	
	@RequestMapping(value = "/representante_legal", method = RequestMethod.GET)
	public String representante_legal(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/representante_legal";
	}
	
	@RequestMapping(value = "/direccion_establecimiento", method = RequestMethod.GET)
	public String direccion_establecimiento(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/direccion_establecimiento";
	}
	
	@RequestMapping(value = "/datos_contacto", method = RequestMethod.GET)
	public String datos_contacto(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/datos_contacto";
	}
	
	@RequestMapping(value = "/informacion_bancos", method = RequestMethod.GET)
	public String informacion_bancos(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/informacion_bancos";
	}
	
	@RequestMapping(value = "/datos_pago", method = RequestMethod.GET)
	public String datos_pago(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/datos_pago";
	}
	
	@RequestMapping(value = "/carga_archivos_ejecutivo", method = RequestMethod.GET)
	public String carga_archivos_ejecutivo(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/carga_archivos_ejecutivo";
	}
	
	@RequestMapping(value = "/bandeja_administrativo", method = RequestMethod.GET)
	public String bandeja_administrativo(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/bandeja_administrativo";
	}
	
	@RequestMapping(value = "/visualizar_administrativo", method = RequestMethod.GET)
	public String visualizar_administrativo(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/visualizar_administrativo";
	}
	
	@RequestMapping(value = "/bandeja_comercial", method = RequestMethod.GET)
	public String bandeja_comercial(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/bandeja_comercial";
	}
	
	@RequestMapping(value = "/verificacion_pago", method = RequestMethod.GET)
	public String verificacion_pago(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/verificacion_datos_pago";
	}
	
	@RequestMapping(value = "/pre_carga_autogestion", method = RequestMethod.GET)
	public String pre_carga_autogestion(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/pre_carga_autogestion";
	}
	
	@RequestMapping(value = "/menu_operador", method = RequestMethod.GET)
	public String menu_operador(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/menu_operador";
	}
	
	@RequestMapping(value = "/pre_carga_operador", method = RequestMethod.GET)
	public String pre_carga_operador(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/pre_carga_operador";
	}
	
	@RequestMapping(value = "/menu_afiliacion", method = RequestMethod.GET)
	public String menu_afiliacion(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.afiliacion/menu_afiliacion";
	}
	
	
	
	/**
	 * Url Gestion de configuracion
	 */
	
	
	
	//////////////// Configuración Afiliados ///////////////
	@RequestMapping(value = "/configuration_afiliados", method = RequestMethod.GET)
    public String configuration_afiliados(Model model) {
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
     return "templates.configuration/configuration_afiliados";
	}
	
	//////////////// Configuración Afiliados ///////////////
	
    
	
	
	
	//+////////////// Configuración Almacen ///////////////
	@RequestMapping(value = "/configuration_almacen", method = RequestMethod.GET)
    public String configuration_almacen(Model model) {
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
     return "templates.almacen/templates.configuracion/configuration_almacen";
	}
	
	//+////////////// Almacen ///////////////
	
		//+////////////// Nuevo/Editar Almacen ///////////////
		@RequestMapping(value = "/almacen_nuevo-editar", method = RequestMethod.GET)
	    public String almacen_nuevo_editar(Model model) {
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
		
		
	
		
		
	
		
		
		
		
		
		
	//////////////////////////////////////////////////
	////////Vielma///////////////////////////////////
	
	@RequestMapping(value = "/newClientTdc", method = RequestMethod.GET)
	public String newClientTdc(Model model) {
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
	return "templates.gestion_cliente/client";
	}
}
