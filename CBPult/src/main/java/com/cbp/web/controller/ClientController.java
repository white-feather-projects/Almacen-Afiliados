/**
 * 
 */
package com.cbp.web.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cbp.web.dao.AccountDAO;
import com.cbp.web.dao.CardDAO;
import com.cbp.web.dao.ClientDAO;
import com.cbp.web.dao.TdcRequestDAO;
import com.cbp.web.dto.AccountDTO;
import com.cbp.web.dto.AccountQueryAssignetTdcDTO;
import com.cbp.web.dto.AssignPlasticDTO;
import com.cbp.web.dto.CargaArchivosDTO;
import com.cbp.web.dto.ClientDTO;
import com.cbp.web.dto.NewClientDTOLocal;
import com.cbp.web.dto.PlasticDTO;
import com.cbp.web.dto.RespuestaDTO;
import com.cbp.web.enumerated.ChannelEnum;
import com.cbp.web.enumerated.StatusRequest;
import com.cbp.web.impl.AccountService;
import com.cbp.web.impl.ClientServices;
import com.cbp.web.impl.UploadFileServiceImpl;
import com.cbp.web.util.Util;
import com.cbp1.ws.cbp.service.Canton;
import com.cbp1.ws.cbp.service.CategoriaOcupacional;
import com.cbp1.ws.cbp.service.Client;
import com.cbp1.ws.cbp.service.CodigoPostal;
import com.cbp1.ws.cbp.service.Distrito;
import com.cbp1.ws.cbp.service.InformacionAdicionalClienteDTO;
import com.cbp1.ws.cbp.service.NewClientDTO;
import com.cbp1.ws.cbp.service.Pais;
import com.cbp1.ws.cbp.service.Provincia;
import com.cbp1.ws.cbp.service.TdcRequest;
import com.cbp1.ws.cbp.service.TdcRequestDTO;
import com.cbp1.ws.cbp.service.UsersFp;
import com.cbp1.ws.cbp.service.ValidaClientDTO;

/**
 * @author Equipo
 *
 */

@Controller
public class ClientController extends Util {

	
	Authentication auth = null;
	
	@Autowired
	private UploadFileServiceImpl upload;

	@Autowired
	ClientDAO clientDAO;

	@Autowired
	AccountDAO accountDAO;
	
	@Autowired
	AccountService acco;
	
	@Autowired
	ClientServices clienteSer;
	
	@Autowired
	TdcRequestDAO tdcRequestDAO;

	@Autowired
	CardDAO cardDAO;
	private final Logger log = LoggerFactory.getLogger(getClass());

	private Environment env;

	@RequestMapping(value = "/createClient", produces = { "application/json" })
	public @ResponseBody RespuestaDTO createClientWS(@RequestBody ClientDTO client) {
		System.out.println("Entro createCient: " + client.getClientFirstName());
		RespuestaDTO respuesta = new RespuestaDTO();
		respuesta = clientDAO.createClient(client);
		System.out.println("Entro createCient: " + respuesta.getDescripcion());
		return respuesta;
	}

	@GetMapping(value = "/consultClient/{clientId}", produces = { "application/json" })
	public @ResponseBody ClientDTO consultClientWS(@PathVariable(value = "clientId") String clientId) {
		ClientDTO client = new ClientDTO();
		client = clientDAO.consultClient(clientId);
		return client;
	}

	@RequestMapping(value = "/updateClient", produces = { "application/json" })
	public @ResponseBody RespuestaDTO updateClientWS(@RequestBody ClientDTO client) {
		System.out.println("monto " + client.getClientPreaprovedAmount());
		RespuestaDTO respuesta = new RespuestaDTO();
		respuesta = clientDAO.updateClient(client);
		return respuesta;
	}

	@GetMapping(value = "/listClientWS", produces = { "application/json" })
	public @ResponseBody List<ClientDTO> listClientWS() {
		List<ClientDTO> listClient = new ArrayList<>();
		listClient = clientDAO.listClent();
		return listClient;
	}

	/*
	 * @RequestMapping(value = "/saveDocumentClient", method = RequestMethod.POST)
	 * public RespuestaDTO saveDocumentClient(@RequestBody CargaArchivosDTO
	 * cargaArchivosDTO, @RequestParam("file") MultipartFile[] file, ModelMap
	 * modelMap,RedirectAttributes flash) { RespuestaDTO respuesta = new
	 * RespuestaDTO(); System.out.println("respuesta: "+respuesta);
	 * modelMap.addAttribute("file", file);
	 * 
	 * 
	 * //if (!file.isEmpty()) { String uniqueFilename = UUID.randomUUID().toString()
	 * + "_" + file.getOriginalFilename();
	 * System.out.println("uniqueFilename part1: "+uniqueFilename); // Path rootPath
	 * = // Paths.get("/var/lib/tomcat8/webapps/uploads/").resolve(uniqueFilename);
	 * Path rootPath =
	 * Paths.get(env.getProperty("spring.backend.address.upload.file")).resolve(
	 * uniqueFilename); System.out.println("rootPath: "+rootPath);
	 * //logger.info("PROPERTY: " +
	 * env.getProperty("spring.backend.address.upload.file")); // CAMBIAR RUTA Path
	 * rootAbsolutPath = rootPath.toAbsolutePath();
	 * System.out.println("rootAbosulutPath: "+rootAbsolutPath);
	 * //logger.info("rootPath: " + rootPath); //logger.info("rootAbsolutPath: " +
	 * rootAbsolutPath); try { System.out.println("try.....");
	 * Files.copy(file.getInputStream(), rootAbsolutPath);
	 * flash.addFlashAttribute("info", "Has subido correctamente '" + uniqueFilename
	 * + "'"); cargaArchivosDTO.setFileFinantialInformationName(uniqueFilename);
	 * cargaArchivosDTO.setFilePersonalInformationName(uniqueFilename); } catch
	 * (IOException e) { System.out.println("catch..."); e.printStackTrace(); }
	 * respuesta = clientDAO.procesarArchivosCliente(cargaArchivosDTO); //} return
	 * respuesta; }
	 */
	/*
	 * @RequestMapping(value = "/saveDocumentClient", method = RequestMethod.POST)
	 * public RespuestaDTO saveDocumentClient(@RequestBody CargaArchivosDTO
	 * cargaArchivosDTO,
	 * 
	 * @RequestParam("file") MultipartFile file, RedirectAttributes flash) {
	 * RespuestaDTO respuesta = new RespuestaDTO(); CargaArchivosDTO dto = new
	 * CargaArchivosDTO(); try { if (!file.isEmpty()) {
	 * 
	 * Path directorioRecursos =
	 * Paths.get("opt/bitnami/apache-tomcat/webapps/temp/archivos"); String rootPath
	 * = directorioRecursos.toFile().getAbsolutePath(); byte[] bytes =
	 * file.getBytes(); Path rutaCompleta = Paths.get(rootPath + "//" +
	 * file.getOriginalFilename()); Files.write(rutaCompleta, bytes);
	 * 
	 * cargaArchivosDTO.setFileFinantialInformationName(file.getOriginalFilename());
	 * } } catch (Exception e) { e.printStackTrace(); } dto =
	 * clientDAO.procesarArchivosCliente(cargaArchivosDTO); return respuesta; }
	 */
	@RequestMapping(value = "/createAccountClient", produces = { "application/json" })
	public @ResponseBody RespuestaDTO createAccountClientWS(@RequestBody AccountDTO accounDTO) {
		RespuestaDTO respuesta = new RespuestaDTO();
		respuesta = accountDAO.createAccountClient("1", accounDTO.getAccountType(), accounDTO.getClientDocumentId());
		System.out.println("ClientDocument " + accounDTO.getClientDocumentId() + " office: " + accounDTO.getOfficeId()
				+ " tipo: " + accounDTO.getAccountType());
		return respuesta;
	}
	/*
	 * @PostMapping(value="/uploadDocuments") public @ResponseBody String
	 * upload(MultipartHttpServletRequest request, HttpServletResponse response,
	 * HttpServletRequest reques) {
	 * 
	 * // file dinamico System.out.println("Entro1: " ); Integer validator = null;
	 * Iterator<String> itr = request.getFileNames(); MultipartFile mpf = null;
	 * List<String> num = new ArrayList<String>();
	 * 
	 * System.out.println("Files: "+itr);
	 * 
	 * while (itr.hasNext()) { mpf = request.getFile(itr.next());
	 * System.out.println(mpf.getOriginalFilename() + "--" + mpf.getName());
	 * num.add(mpf.getName());// se agregan en lista para validar caules fueron
	 * String uniqueFilename = UUID.randomUUID().toString() + "_" +
	 * mpf.getOriginalFilename(); Path rootPath =
	 * Paths.get("C:\\Temp\\archivos").resolve(uniqueFilename); // Path rootPath =
	 * Paths.get("c://sound").resolve(uniqueFilename); Path rootAbsolutPath =
	 * rootPath.toAbsolutePath();
	 * 
	 * System.out.println("rootPath: " + rootPath);
	 * System.out.println("rootAbsolutPath: " + rootAbsolutPath);
	 * 
	 * try { Files.copy(mpf.getInputStream(), rootAbsolutPath); // insertar los
	 * archivo en base de datos
	 * 
	 * } catch (IOException e) { e.printStackTrace(); }
	 * 
	 * }
	 * 
	 * return "ok";
	 * 
	 * }
	 */
	/*
	 * @RequestMapping(value = "/uploadClient") public @ResponseBody
	 * CargaArchivosDTO upload(MultipartHttpServletRequest
	 * request, @RequestParam("file") MultipartFile[] files) { CargaArchivosDTO
	 * cargaArchivosDTO = new CargaArchivosDTO(); RespuestaDTO respuesta = new
	 * RespuestaDTO(); String documentClient = ""; // valor dinamico Map<String,
	 * String[]> map = request.getParameterMap(); for (Map.Entry<String, String[]>
	 * entry : map.entrySet()) { String key = entry.getKey(); String[] value =
	 * entry.getValue();
	 * 
	 * if (key.equals("documento")) { documentClient = value[0].toString(); } }
	 * 
	 * // file dinamico Iterator itr = Arrays.asList(files).iterator();
	 * System.out.println("Part1"); Integer validator = null; // Iterator<String>
	 * itr = files.get; MultipartFile mpf = null; List<String> num = new
	 * ArrayList<String>(); String[] archivesNames = new String[3]; for (int i = 0;
	 * i < files.length; i++) { mpf = files[i]; String uniqueFile=""; try {
	 * 
	 * if(i==0) { //personales uniqueFile=upload.copy(mpf);
	 * cargaArchivosDTO.setFilePersonalInformationName(uniqueFile);
	 * 
	 * }else { uniqueFile=upload.copy(mpf);
	 * cargaArchivosDTO.setFileFinantialInformationName(uniqueFile); }
	 * 
	 * 
	 * 
	 * log.info("upload file= {}",respuesta.getDescripcion());
	 * 
	 * } catch (IOException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * } cargaArchivosDTO.setClientDocumentId(documentClient); respuesta=
	 * clientDAO.procesarArchivosCliente(cargaArchivosDTO);
	 * /*cargaArchivosDTO.setFileFinantialInformationName(archivesNames[0]);
	 * cargaArchivosDTO.setFilePersonalInformationName(archivesNames[1]);
	 * //cargaArchivosDTO.setClientDocumentId(documentClient);
	 * 
	 * 
	 * //cargaArchivosDTO = clientDAO.procesarArchivosCliente(cargaArchivosDTO); //
	 * } return cargaArchivosDTO; }
	 * 
	 */

	@RequestMapping(value = "/uploadDocuments", method = RequestMethod.POST, consumes = { "multipart/form-data" })
	public @ResponseBody RespuestaDTO guardar1(MultipartHttpServletRequest files , HttpServletResponse response,HttpServletRequest reques){
		
		
		CargaArchivosDTO car= new CargaArchivosDTO();
		Map<String, String[]> map = reques.getParameterMap();
		  for (Map.Entry<String,  String[]> entry : map.entrySet()) {
			    String key = entry.getKey();
			    String[] value = entry.getValue();
			    // ...
			    
			    if(key.equals("documento")){
			    	car.setClientDocumentId(value[0]);
			    }
			    
			    log.info("Varieables: {}","key:"+key+"="+value[0]);
			}
		  
			Iterator<String> itr =  files.getFileNames();
			MultipartFile mpf=null;
		  	String statusFile="";
		   while(itr.hasNext()) {	
			  mpf = files.getFile(itr.next());

			   log.info("files que llego: {}",mpf.getOriginalFilename());
			   log.info("filesInput que llego: {}",mpf.getName());
			
				try {
			
					if(mpf.getName().equals("file_financiera")){
						statusFile=upload.copy(mpf);
						car.setFileFinantialInformationName(statusFile);
						
					}else if(mpf.getName().equals("file_personal")){
						statusFile=upload.copy(mpf);
						car.setFilePersonalInformationName(statusFile);

					}
			
				} catch (IOException e) {
					e.printStackTrace();
				}
		  }
		   
		   RespuestaDTO res= new RespuestaDTO();
		  
		   if(statusFile.equals("")) {
			   //no se subio el archivo
			   res.setDescripcion("upload File fail");
		   }else {
			   
			   res=clienteSer.procesarArchivosCliente(car);
			   log.info("Carga de Datos: {}",car.toString());
			   log.info("Resultado de solicitud: {}",res.getDescripcion());
		   }
		   
	
		  
		return  res;
	}

/*	@GetMapping(value = "/consultAccountByClientWS/{clientDocumentId}", produces = { "application/json" })
	public @ResponseBody AccountDTO consultAccountByClient(
			@PathVariable(value = "clientDocumentId") String clientDocumentId) {
		AccountDTO dto = new AccountDTO();
		
		dto =acco.consultAccountClient(clientDocumentId);
		
		log.info("accoun client: {}", dto.toString());
		return dto;
	}*/
	
	@GetMapping(value = "/consultAccountByClientWS/{clientDocumentId}", produces = { "application/json" })
	public @ResponseBody AccountQueryAssignetTdcDTO consultAccountByClient(
			@PathVariable(value = "clientDocumentId") String clientDocumentId) {
		AccountQueryAssignetTdcDTO dto = new AccountQueryAssignetTdcDTO();
		
		dto =acco.consultAccountClient(clientDocumentId);
		
		log.info("accoun client: {}", dto.toString());
		return dto;
	}

	@GetMapping(value = "/consultPlasticByNumber/{plasticNumber}", produces = { "application/json" })
	public @ResponseBody PlasticDTO consultPlasticByNumber(
			@PathVariable(value = "plasticNumber") String plasticNumber) {
		PlasticDTO dto = new PlasticDTO();
		dto = cardDAO.consultPlastic(plasticNumber);
		return dto;
	}

	@RequestMapping(value = "/assignPlasticToClient", produces = { "application/json" })
	public @ResponseBody RespuestaDTO assignPlasticToClient(@RequestBody AssignPlasticDTO assignPlasticDTO) {
		RespuestaDTO respuesta = new RespuestaDTO();
		System.out.println("Entro al controlador");
		Date fecha = new Date();
		respuesta = cardDAO.assignCardToClient(assignPlasticDTO.getClientDTO(), assignPlasticDTO.getPlasticDTO(),
				formatearFecha(fecha, FORMATO_FECHA_SIMPLE), formatearFecha(fecha, FORMATO_FECHA_SIMPLE));
		return respuesta;
	}

	@GetMapping(value = "/listClientAndAccountWS", produces = { "application/json" })
	public @ResponseBody List<ClientDTO> listClientAndAccountWS() {
		List<ClientDTO> listClient = new ArrayList<>();
		listClient = accountDAO.listClientAndAccount();
		return listClient;
	}

	@RequestMapping(value = "/uploadDocumentsRiesgos", method = RequestMethod.POST, consumes = { "multipart/form-data" })
	public @ResponseBody RespuestaDTO guardar2(MultipartHttpServletRequest files , HttpServletResponse response,HttpServletRequest reques){
		   RespuestaDTO res= new RespuestaDTO();
		
		CargaArchivosDTO car= new CargaArchivosDTO();
		Map<String, String[]> map = reques.getParameterMap();
		  for (Map.Entry<String,  String[]> entry : map.entrySet()) {
			  
			    String key = entry.getKey();
			    String[] value = entry.getValue();
			    // ...
				    if(key.equals("documento")){
				    	car.setClientDocumentId(value[0]);
				    }
			    log.info("Varieables: {}","key:"+key+"="+value[0]);
			}
		  
		  
		  
		  
			Iterator<String> itr =  files.getFileNames();
			
			MultipartFile mpf=null;
		  	String statusFile="";
		   while(itr.hasNext()) {	
			  mpf = files.getFile(itr.next());//files
			 
			   log.info("files que llego: {}",mpf.getOriginalFilename());
			   log.info("filesInput que llego: {}",mpf.getName());
			
			  try {
				  if(mpf.getName().equals("buro")){
					statusFile=upload.copy(mpf);
					car.setFileBurotSuppor(statusFile);
				  }
					
			
				} catch (IOException e) {
					e.printStackTrace();
				}
		  }
		   
		   
		   
		   if(statusFile.equals("")) {
			   //no se subio el archivo
			   res.setDescripcion("upload File fail");
		   }else {
			   
			   log.info("Carga de Datos: {}",car.toString());
			   res=clienteSer.procesarArchivosAnalisis(car);			 
			   log.info("Resultado de solicitud: {}",res.getDescripcion());   
		   }
		   		  
		return  res;
	}

	@RequestMapping(value = "/updateStatusAccountClientWS", produces = { "application/json" })
	public @ResponseBody RespuestaDTO updateStatusAccountClientWS(@RequestBody AccountDTO dto) {
		RespuestaDTO respuesta = new RespuestaDTO();
		respuesta = accountDAO.updateAccountClient(dto.getClientDocumentId(), dto.getAccountStatus());
		return respuesta;
	}
	
	@GetMapping(value = "/listTdcRequest/{status}", produces = { "application/json" })
	public @ResponseBody List<com.cbp1.ws.cbp.service.TdcRequest> listarTdcRequest(@PathVariable(value = "status") String status) {
		List<com.cbp1.ws.cbp.service.TdcRequest> listTdc = new ArrayList<>();
		log.info("listTdc Status: {}",status);
		
		
		listTdc = tdcRequestDAO.listTdcRequest(status, ChannelEnum.PERSONA_NATURAL.getDescripcion());
		log.info("listTdc: {}",listTdc.toString());
		return listTdc;
	}
	
// simon13/06/19
	@GetMapping(value = "/listPaises", produces = { "application/json" })
	public @ResponseBody List<Pais> listarPaises() {
		
		return clientDAO.queryPais();
	}
	
	@GetMapping(value = "/listProvincia/{idPais}", produces = { "application/json" })
	public @ResponseBody List<Provincia> listarProvincias(@PathVariable(value = "idPais") Long idPais) {
		Pais pais= new Pais();
		pais.setIdPais(idPais);
		return clientDAO.queryProvincia(pais);
	}
	
	@GetMapping(value = "/listCanton/{idPro}", produces = { "application/json" })
	public @ResponseBody List<Canton> listarCanton(@PathVariable(value = "idPro") Long idPro) {
		Provincia pro= new Provincia();
		pro.setIdProvincia(idPro);
		return clientDAO.queryCanton(pro);
	}
	
	@GetMapping(value = "/listDistrito/{idCan}", produces = { "application/json" })
	public @ResponseBody List<Distrito> listarDis(@PathVariable(value = "idCan") Long idCan) {
		Canton can= new Canton();
		can.setIdCanton(idCan);
		return clientDAO.queryDis(can);
	}
	
	@GetMapping(value = "/codigoPostal/{idCod}", produces = { "application/json" })
	public @ResponseBody CodigoPostal codigoPostal(@PathVariable(value = "idCod") Long idCod) {
		Distrito dist= new Distrito();
        dist.setIdDistrito(idCod);
		return clientDAO.codigoPostal(dist);
	}
	
	@GetMapping(value = "/listCatOpaciobal", produces = { "application/json" })
	public @ResponseBody List<CategoriaOcupacional> listarCatOp() {
			
		log.info("categoria: {}",clientDAO.queryCatOcup().toArray());
		return clientDAO.queryCatOcup();
	}
	
	//consulta de cliente
	@GetMapping(value = "/validateIdent/{ident}", produces = { "application/json" })
	public @ResponseBody ValidaClientDTO validateClientId(@PathVariable(value = "ident") String ident) {
	

		return clientDAO.queryIdent(ident);
	}
	
	//consulta si hay solitu
	@RequestMapping(value = "/queryRequestClient", produces = { "application/json" })
	public @ResponseBody ValidaClientDTO queryRequestClient() {
		ValidaClientDTO cli = new ValidaClientDTO();
		
		auth = SecurityContextHolder.getContext().getAuthentication();
		log.info("clientLoggeado: {}", auth.getName());
		if(auth.getName()!=null){
			cli=clientDAO.queryIndetUser(auth.getName());
		}

		return cli;
	}
	

	@RequestMapping(value = "/createNewClient", produces = { "application/json" })
	public @ResponseBody com.cbp1.ws.cbp.service.RespuestaDTO  createNewClient(NewClientDTOLocal rc) {
	
		//log.info("client: {}", rc.toString());
		auth = SecurityContextHolder.getContext().getAuthentication();
		log.info("clientLoggeado: {}", auth.getName());
	
		CategoriaOcupacional cat= new CategoriaOcupacional();
		cat.setIdCatOcu(rc.getIdcategoriOcuId());
		Pais pa= new Pais();
		pa.setIdPais(rc.getPaisId());
		
		UsersFp userReg= new UsersFp();
		userReg.setUserFirstName(auth.getName());//usuario logeado
		NewClientDTO res = new NewClientDTO();
		res.setClientFirstName(rc.getClientFirstName());
		res.setClientLastName(rc.getClientLastName());
		res.setClientSurname(rc.getClientSurname());
		res.setClientTypeId(rc.getClientTypeId());
		res.setClientDocumentId(rc.getClientDocumentId());
		res.setClientGender(rc.getClientGender());
		res.setClientBirthday(rc.getClientBirthday());
		res.setClientCivilStatus(rc.getClientCivilStatus());
		res.setClientEmail(rc.getClientEmail());
		res.setClientNationality(rc.getClientNationality());
		res.setClientProfession(rc.getClientProfession());
		res.setClientPreaprovedAmount(rc.getClientPreaprovedAmount());
		res.setClientCellPhone(rc.getClientCellPhone());
		res.setClientHomePhone(rc.getClientHomePhone());
		res.setComentariosPersonaExpuesta(rc.getComentariosPersonaExpuesta());
		res.setCategoriOcuId(cat);
		res.setPaisId(pa);
		res.setCodigoUsuarioCarga(userReg);
		res.setChannelRequest(ChannelEnum.PERSONA_NATURAL.getDescripcion());
		if(rc.getComentariosPersonaExpuesta()==null || rc.getComentariosPersonaExpuesta().equals("")) {
			res.setPersonaExpuestaPoliticamente("No");
		}else {
			res.setPersonaExpuestaPoliticamente("Si");
		}
		log.info("info{}",rc.toString());
		com.cbp1.ws.cbp.service.RespuestaDTO  cli = new com.cbp1.ws.cbp.service.RespuestaDTO ();
		cli=clientDAO.createNewClient(res, auth.getName());
		log.info("client: {}", res.toString());
		log.info("client: {}", cli.getDescripcion());
		log.info("client: {}", cli.getIdClientCreado());
		log.info("client: {}", cli.getCodigo());
		
		return cli;
	}
	
	
	
	/**
	 * @param reques
	 * @return
	 */
	@RequestMapping(value = "/asoosiateNewClient", produces = { "application/json" })
	public @ResponseBody com.cbp1.ws.cbp.service.RespuestaDTO  createNewClientAsosiate( HttpServletRequest reques, MultipartHttpServletRequest files ) {
		InformacionAdicionalClienteDTO info= new InformacionAdicionalClienteDTO();
		Provincia proV= new Provincia();
		Canton canV= new Canton();
		Distrito desV=new Distrito();
		Client cli= new Client();
		
		com.cbp1.ws.cbp.service.RespuestaDTO res= new com.cbp1.ws.cbp.service.RespuestaDTO();
		
		//clienteId
		Long clienId=(long) 0;
		Map<String, String[]> map = reques.getParameterMap();
		  for (Map.Entry<String,  String[]> entry : map.entrySet()) {
			    String key = entry.getKey();
			    String[] value = entry.getValue();
			    // ...		    
			    log.info("Varieables: {}","key:"+key+"="+value[0]);
				    switch (entry.getKey()) {
			    case "tenenciaVivienda":
			     info.setTenenciaVivienda(value[0]);
			      break;
			    case "cuotaMensual":
			      info.setCuotaMensual(value[0]);
			      break;
			    case "provinciaVivienda":
			      proV.setIdProvincia(Long.parseLong(value[0]));
			      info.setProvinciaVivienda(proV);
			      break;
			    case "cantonVivienda":
			      canV.setIdCanton(Long.parseLong(value[0]));
			      info.setCantonVivienda(canV);
			      break;
			    case "distritoVivienda":
			    log.info("distroV:{}",Long.parseLong(value[0]) );
			     desV.setIdDistrito(Long.parseLong(value[0]));;
			     info.setDistritoVivienda(desV);
			      break;
			    case "ciudad":
			      info.setCiudad(value[0]);
			      break;
			    case "sector":
			      info.setSector(value[0]);
			      break;
			    case "ptoReferencia":
				 info.setPtoReferencia(value[0]);
				  break;
			    case "codPostal":
				  info.setCodPostal(value[0]);
				  break;
			    case "client":
			    String pp="950";
			    log.info("InformationclienIdLLef: {}",Long.parseLong(value[0]));
			  // cli.setIdClient(Long.parseLong(pp));
			 //  cli.setIdClient(Long.parseLong(value[0]));
			   // cli.getIdClient(value[0]);
			   clienId=Long.parseLong(value[0]);
				  break;
				case "nombreEmpresa":
				   info.setNombreEmpresa(value[0]);
				    break;
				 case "actividadEmpresa":
					info.setActividadEmpresa(value[0]);
					break;
				case "cargo":
				     info.setCargo(value[0]);
				     break;
				case "sueldoMensual":
				    info.setSueldoMensual(Long.parseLong(value[0]));
					break;
				case "provinciaTrabajo":
				   proV.setIdProvincia(Long.parseLong(value[0]));
				   info.setProvinciaTrabajo(proV);
				    break;
				 case "cantonTrabajo":
					canV.setIdCanton(Long.parseLong(value[0]));
					info.setCantonTrabajo(canV);
					break;
				case "distritoTrabajo":
				     //desV.setCantonId(Long.parseLong("1"));
				     desV.setIdDistrito(Long.parseLong("1"));
				     log.info("distroT:{}",Long.parseLong(value[0]) );
				     info.setDistritoTrabajo(desV);
				     break;
				case "telefonoEmpresa":
				    info.setTelefonoEmpresa(value[0]);
					break;
				case "email":
				  info.setEmail(value[0]);
				    break;
				case "nombreOtraEmpresa":
					info.setNombreOtraEmpresa(value[0]);;
					break;
				 case "antiguedad":
					info.setAntiguedad(value[0]);
					break;
				case "cargoOtraEmpresa":
				    info.setCargoOtraEmpresa(value[0]);
				     break;
				case "ultimoSueldo":
				    info.setUltimoSueldo(Long.parseLong(value[0]));
					break;
				case "primerNombre":
					info.setPrimerNombre(value[0]);
					break;
			     case "segundoNombre":
					info.setSegundoNombre(value[0]);
					break;
				case "apellidos":
					info.setApellidos(value[0]);
					 break;
				case "segundo_apellido":
					
					info.setApellidos(info.getApellidos()+"-"+value[0]);
					//log.info("pimer apellido {}", info.getApellidos());
					 break;
				case "tipoDocumento":
					 info.setTipoDocumento(value[0]);
					break;
				case "numeroDocumento":
					 info.setNumeroDocumento(value[0]);
					 break;
				case "genero":
					info.setGenero(value[0]);
					break;
				case "telefonoCelular":
					 info.setTelefonoCelular(value[0]);
					 break;
				case "telefonoFijo":
					 info.setTelefonoFijo(value[0]);
					break;
				case "emailReferencia":
					info.setEmailReferencia(value[0]);
					 break;
				case "banco":
					info.setBanco(value[0]);
					break;
				case "ctaAhorro":
					 info.setCtaAhorro(value[0]);
					 break;
				case "ctaCorriente":
					 info.setCtaCorriente(value[0]);
					break;
				case "TDC":
					info.setTDC(value[0]);
					break;
				case "bancoEmisor":
					info.setBancoEmisor(value[0]);
					break;
				
			  }
		
			}
		  //metodo del recibir archivos.
		  
		  Iterator<String> itr =  files.getFileNames();
			MultipartFile mpf=null;
		  	String fileSaved="";
		   while(itr.hasNext()) {	
			  mpf = files.getFile(itr.next());			
				try {
					if(mpf.getName().equals("fileFinantialInformationName")){
						fileSaved=upload.copy(mpf);
						info.setFileFinantialInformationName(fileSaved);	
					}else if(mpf.getName().equals("filePersonalInformationName")){
						fileSaved=upload.copy(mpf);
						info.setFilePersonalInformationName(fileSaved);
					}
			
				} catch (IOException e) {
					e.printStackTrace();
				}
		  }	  

		  
		  res=clientDAO.additionalInformation(info,clienId );
		  log.info("Resp de wl: {}",res.getDescripcion());
		  
		  log.info("information {}",info.toString());
		  
		  if(res.getDescripcion().equals("OK")) {
	
		  }else {
			  upload.delete(info.getFileFinantialInformationName());
			  upload.delete(info.getFilePersonalInformationName());
			  res.setDescripcion("Registro Fallido");
		  }
		  	  
		return res;
	}	
	
	
	
	@RequestMapping(value = "/updateNewClient", produces = { "application/json" })
	public @ResponseBody com.cbp1.ws.cbp.service.RespuestaDTO  updateNewClient(NewClientDTOLocal rc) {
	
		//log.info("client: {}", rc.toString());
		auth = SecurityContextHolder.getContext().getAuthentication();
		log.info("clientLoggeado: {}", auth.getName());
	
		CategoriaOcupacional cat= new CategoriaOcupacional();
		cat.setIdCatOcu(rc.getIdcategoriOcuId());
		Pais pa= new Pais();
		pa.setIdPais(rc.getPaisId());
		
		UsersFp userReg= new UsersFp();
		userReg.setUserFirstName(auth.getName());//usuario logeado
		NewClientDTO res = new NewClientDTO();
		res.setIdClient(rc.getIdClient());
		res.setClientFirstName(rc.getClientFirstName());
		res.setClientLastName(rc.getClientLastName());
		res.setClientSurname(rc.getClientSurname());
		res.setClientTypeId(rc.getClientTypeId());
		res.setClientDocumentId(rc.getClientDocumentId());
		res.setClientGender(rc.getClientGender());
		res.setClientBirthday(rc.getClientBirthday());
		res.setClientCivilStatus(rc.getClientCivilStatus());
		res.setClientEmail(rc.getClientEmail());
		res.setClientNationality(rc.getClientNationality());
		res.setClientProfession(rc.getClientProfession());
		res.setClientPreaprovedAmount(rc.getClientPreaprovedAmount());
		res.setClientCellPhone(rc.getClientCellPhone());
		res.setClientHomePhone(rc.getClientHomePhone());
		res.setComentariosPersonaExpuesta(rc.getComentariosPersonaExpuesta());
		res.setCategoriOcuId(cat);
		res.setPaisId(pa);
		res.setCodigoUsuarioCarga(userReg);
		res.setChannelRequest(ChannelEnum.PERSONA_NATURAL.getDescripcion());
		if(rc.getComentariosPersonaExpuesta()==null || rc.getComentariosPersonaExpuesta().equals("")) {
			res.setPersonaExpuestaPoliticamente("No");
		}else {
			res.setPersonaExpuestaPoliticamente("Si");
		}
	   
		com.cbp1.ws.cbp.service.RespuestaDTO  cli = new com.cbp1.ws.cbp.service.RespuestaDTO ();
		cli=clientDAO.updateClient(res);
		log.info("client: {}", res.toString());
		log.info("client: {}", cli.getDescripcion());
		log.info("client: {}", cli.getIdClientCreado());
		log.info("client: {}", cli.getCodigo());
		
		return cli;
	}
	
	
	@RequestMapping(value = "/querycustomerAnalysisTdc/{id}", produces = { "application/json" })
	public @ResponseBody InformacionAdicionalClienteDTO queryCustomerAnalysisTdc(@PathVariable(value = "id") Long id) {
		log.info("clientQuery: {}", clientDAO.queryClientComplet(id));
		
		return clientDAO.queryClientComplet(id);
	}
	
	
	@RequestMapping(value = "/viewFile/{url}", produces = "application/pdf")
    public ResponseEntity<byte[]> showPdf(@PathVariable(value="url") String url) {
    	System.out.print("intro");
    	File file = new File(upload.getPath(url).toString());
        Path path = upload.getPath(url);
        byte[] pdfContents = null;
        try {
            pdfContents = Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String fileName = file.getName();
        
        
        log.info("archivo en byte en la vista: {}",pdfContents);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/pdf"));
        headers.add("Content-Disposition", "inline;filename=" + fileName);
        ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(
                    pdfContents, headers, HttpStatus.OK);

        

        return response;
    }
    
    @RequestMapping(value = "/asoosiateClientAnaliteTdc", produces = { "application/json" })
	public @ResponseBody com.cbp1.ws.cbp.service.RespuestaDTO  updateNewClientAsosiate( HttpServletRequest reques, MultipartHttpServletRequest files ) {
		InformacionAdicionalClienteDTO info= new InformacionAdicionalClienteDTO();
		Provincia proV= new Provincia();
		Canton canV= new Canton();
		Distrito desV=new Distrito();
		Client cli= new Client();
		
		com.cbp1.ws.cbp.service.RespuestaDTO res= new com.cbp1.ws.cbp.service.RespuestaDTO();
		
		//clienteId
		Long clienId=(long) 0;
		Map<String, String[]> map = reques.getParameterMap();
		  for (Map.Entry<String,  String[]> entry : map.entrySet()) {
			    String key = entry.getKey();
			    String[] value = entry.getValue();
			    // ...		    
			    log.info("Varieables: {}","key:"+key+"="+value[0]);
				   switch (entry.getKey()) {
			    case "tenenciaVivienda":
			     info.setTenenciaVivienda(value[0]);
			      break;
			    case "cuotaMensual":
			      info.setCuotaMensual(value[0]);
			      break;
			    case "provinciaVivienda":
			      proV.setIdProvincia(Long.parseLong(value[0]));
			      info.setProvinciaVivienda(proV);
			      break;
			    case "cantonVivienda":
			      canV.setIdCanton(Long.parseLong(value[0]));
			      info.setCantonVivienda(canV);
			      break;
			    case "distritoVivienda":
			    log.info("distroV:{}",Long.parseLong(value[0]) );
			     desV.setIdDistrito(Long.parseLong(value[0]));;
			     info.setDistritoVivienda(desV);
			      break;
			    case "ciudad":
			      info.setCiudad(value[0]);
			      break;
			    case "sector":
			      info.setSector(value[0]);
			      break;
			    case "ptoReferencia":
				 info.setPtoReferencia(value[0]);
				  break;
			    case "codPostal":
				  info.setCodPostal(value[0]);
				  break;
			    case "client":
			    String pp="950";
			    log.info("InformationclienIdLLef: {}",Long.parseLong(value[0]));
			
			   clienId=Long.parseLong(value[0]);
				  break;
				case "nombreEmpresa":
				   info.setNombreEmpresa(value[0]);
				    break;
				 case "actividadEmpresa":
					info.setActividadEmpresa(value[0]);
					break;
				case "cargo":
				     info.setCargo(value[0]);
				     break;
				case "sueldoMensual":
				    info.setSueldoMensual(Long.parseLong(value[0]));
					break;
				case "provinciaTrabajo":
				   proV.setIdProvincia(Long.parseLong(value[0]));
				   info.setProvinciaTrabajo(proV);
				    break;
				 case "cantonTrabajo":
					canV.setIdCanton(Long.parseLong(value[0]));
					info.setCantonTrabajo(canV);
					break;
				case "distritoTrabajo":
				     //desV.setCantonId(Long.parseLong("1"));
				     desV.setIdDistrito(Long.parseLong("1"));
				     log.info("distroT:{}",Long.parseLong(value[0]) );
				     info.setDistritoTrabajo(desV);
				     break;
				case "telefonoEmpresa":
				    info.setTelefonoEmpresa(value[0]);
					break;
				case "email":
				  info.setEmail(value[0]);
				    break;
				 case "antiguedad":
					info.setAntiguedad(value[0]);
					break;
				case "cargoOtraEmpresa":
				    info.setCargoOtraEmpresa(value[0]);
				     break;
				case "ultimoSueldo":
				    info.setUltimoSueldo(Long.parseLong(value[0]));
					break;
				case "primerNombre":
					info.setPrimerNombre(value[0]);
					break;
			     case "segundoNombre":
					info.setSegundoNombre(value[0]);
					break;
				case "apellidos":
					info.setApellidos(value[0]);
					 break;
				case "tipoDocumento":
					 info.setTipoDocumento(value[0]);
					break;
				case "numeroDocumento":
					 info.setNumeroDocumento(value[0]);
					 break;
				case "genero":
					info.setGenero(value[0]);
					break;
				case "telefonoCelular":
					 info.setTelefonoCelular(value[0]);
					 break;
				case "telefonoFijo":
					 info.setTelefonoFijo(value[0]);
					break;
				case "emailReferencia":
					info.setEmailReferencia(value[0]);
					 break;
				case "banco":
					info.setBanco(value[0]);
					break;
				case "ctaAhorro":
					 info.setCtaAhorro(value[0]);
					 break;
				case "ctaCorriente":
					 info.setCtaCorriente(value[0]);
					break;
				case "TDC":
					info.setTDC(value[0]);
					break;
				case "nombreOtraEmpresa":
					info.setNombreOtraEmpresa(value[0]);;
					break;
					
			  }
	
			}
		  //metodo del recibir archivos.
		  
		  Iterator<String> itr =  files.getFileNames();
			MultipartFile mpf=null;
		  	String fileSaved="";
		   while(itr.hasNext()) {	
			  mpf = files.getFile(itr.next());			
				try {
					if(mpf.getName().equals("fileFinantialInformationName")){
						fileSaved=upload.copy(mpf);
						info.setFileFinantialInformationName(fileSaved);	
					}else if(mpf.getName().equals("filePersonalInformationName")){
						fileSaved=upload.copy(mpf);
						info.setFilePersonalInformationName(fileSaved);
					}
			
				} catch (IOException e) {
					e.printStackTrace();
				}
		  }	  

		  
		   res=clientDAO.updateClientaAanaliteComplet(info);
		  log.info("Resp de wl: {}",info.toString());
		  
		  
		  	  
		return res;
	}
}