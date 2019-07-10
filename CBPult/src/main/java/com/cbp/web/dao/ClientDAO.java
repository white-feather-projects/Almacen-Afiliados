/**
 * 
 */
package com.cbp.web.dao;

import java.util.List;

import com.cbp.web.dto.CargaArchivosDTO;
import com.cbp.web.dto.ClientDTO;
import com.cbp.web.dto.PurchaseOrderRequestDTO;
import com.cbp.web.dto.RespuestaDTO;
import com.cbp.web.dto.TdcRequestDTOWeb;
import com.cbp1.ws.cbp.service.Canton;
import com.cbp1.ws.cbp.service.CategoriaOcupacional;
import com.cbp1.ws.cbp.service.Client;
import com.cbp1.ws.cbp.service.CodigoPostal;
import com.cbp1.ws.cbp.service.Distrito;
import com.cbp1.ws.cbp.service.InformacionAdicionalClienteDTO;
import com.cbp1.ws.cbp.service.NewClientDTO;
import com.cbp1.ws.cbp.service.Pais;
import com.cbp1.ws.cbp.service.Provincia;
import com.cbp1.ws.cbp.service.ValidaClientDTO;

/**
 * @author Equipo
 *
 */
public interface ClientDAO {
	
	public com.cbp1.ws.cbp.service.RespuestaDTO  updateClientaAanaliteComplet(InformacionAdicionalClienteDTO info);
	
	public RespuestaDTO createClient(ClientDTO client);
	
	public ClientDTO consultClient(String clientId);
	
	public RespuestaDTO updateClient(ClientDTO clientDTO);
	
	public List<ClientDTO> listClent();
	
	public RespuestaDTO  procesarArchivosCliente(CargaArchivosDTO cargaArchivosDTO);
	
	public RespuestaDTO procesarArchivosAnalisis(CargaArchivosDTO cargaArchivosDTO);
	
	public RespuestaDTO updateArchivosCliente(CargaArchivosDTO cargaArchivosDTO);
	
	//
	public List<Pais>queryPais();
	
	public List<Provincia>queryProvincia(Pais pais);
	
	public List<Canton>queryCanton(Provincia Provincia);
	
	public List<Distrito>queryDis(Canton canton);
	
	public CodigoPostal codigoPostal(Distrito distrito);
	
	public List<CategoriaOcupacional>queryCatOcup();
	
    public com.cbp1.ws.cbp.service.RespuestaDTO createNewClient(NewClientDTO client, String userLogger);
    
    public 	com.cbp1.ws.cbp.service.RespuestaDTO additionalInformation(InformacionAdicionalClienteDTO info, Long idclient);
    
    public ValidaClientDTO queryIdent(String ident);
    
    public ValidaClientDTO queryIndetUser(String user);
    
    public com.cbp1.ws.cbp.service.RespuestaDTO  updateClient(NewClientDTO client);
    
    public InformacionAdicionalClienteDTO queryClientComplet(Long id);
    
    
    
 
    
	
    
	
}