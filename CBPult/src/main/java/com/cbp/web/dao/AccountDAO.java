package com.cbp.web.dao;

import java.util.List;

import com.cbp.web.dto.AccountDTO;
import com.cbp.web.dto.AccountQueryAssignetTdcDTO;
import com.cbp.web.dto.ClientDTO;
import com.cbp.web.dto.RespuestaDTO;

public interface AccountDAO {

	public RespuestaDTO createAccountClient(String OfficeId, String accountType, String clientDocumentId);

	/*public AccountDTO consultAccountClient(String clientDocumentId);*/
	
	
	
	
 public AccountQueryAssignetTdcDTO consultAccountClient(String clientDocumentId);

	/**
	 * Retorna la lista de clientes con cuentas asociadas
	 * 
	 * @return
	 */
	public List<ClientDTO> listClientAndAccount();

	/**
	 * Asigna el estatus de la cuenta
	 * 
	 * @param documentClientId
	 * @param statusAccount
	 * @return
	 */
	public RespuestaDTO updateAccountClient(String documentClientId, String statusAccount);
}
