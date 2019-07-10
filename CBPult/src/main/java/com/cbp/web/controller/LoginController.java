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

public class LoginController extends Util {
	
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
	
	
	@RequestMapping(value = "/newClientTdc", method = RequestMethod.GET)
	public String clienetCreateNew( Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.gestion_cliente/client";
	}

	
	@RequestMapping(value = "/viewgenerateorder", method = RequestMethod.GET)
    public String viewgenerateorder(Model model) {
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		
     return "templates.purchaseOrder/view_generate_order";
	}
	
	@RequestMapping(value = "/listpurchaseorder", method = RequestMethod.GET)
	public String listPurchaseOrder(Model model) {
		
	
		//String username = "";
		String roleUser = "";
	
		
	
		//username = auth.getName();
		roleUser = auth.getAuthorities().iterator().next().getAuthority();
		
		
		model.addAttribute("roleUser", roleUser);
		//model.addAttribute("username", username);
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.purchaseOrder/listgestionplasticos";
	}

	@RequestMapping(value = "/createpurchaseorder", method = RequestMethod.GET)
	public String createPurchaseOrder(Model model) throws IOException {
		

		
        model.addAttribute("valorMinimo", readProperties("VALOR.MINIMO"));
		model.addAttribute("valorMaximo", readProperties("VALOR.MAXIMO"));
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
	public String generatedPurchaseOrder(@PathVariable(value = "idOrderRequest") Long idOrderRequest, Model model) throws IOException {
		
		
		model.addAttribute("valorMinimo", readProperties("VALOR.MINIMO"));
		model.addAttribute("valorMaximo", readProperties("VALOR.MAXIMO"));
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
    public String editPurchaceOrder(@PathVariable(value = "idOrderRequest") Long idOrderRequest, Model model) throws IOException {
		
		
		
		model.addAttribute("valorMinimo", readProperties("VALOR.MINIMO"));
		model.addAttribute("valorMaximo", readProperties("VALOR.MAXIMO"));
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
	
    @RequestMapping(value = "/customerAnalysisTdc/{id}", method = RequestMethod.GET)
	public String analisisClient(Model model, @PathVariable(value = "id") Long id) {
		
		model.addAttribute("idClient", id);
		model.addAttribute("name", name);
		model.addAttribute("link", link);
		return "templates.gestion_cliente/client_editar";
	}
    
    
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
	
	@RequestMapping(value = "/client", method = RequestMethod.GET)
    public String client(Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("link", link);
	return"templates.gestion_cliente/client";
	}
	
	@RequestMapping(value = "/impresion_tarjetas/{docum}", method = RequestMethod.GET)
    public String impresion_tarjetas1(Model model, @PathVariable(value = "docum") String docum) {
		model.addAttribute("document", docum);
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

}
