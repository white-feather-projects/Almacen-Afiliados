package com.cbp.web.dao;

import com.cbp.web.dto.ActiveOrInactiveOperadoraTelefonicaDTO;
import com.cbp.web.dto.AsociarBancoComercioDTO;
import com.cbp.web.dto.ConsultaBancoAfiliacionIdDTO;
import com.cbp.web.dto.CrearOperadorTelefonicoDTO;
import com.cbp.web.dto.EditarAsociacionBancoComercioDTO;
import com.cbp.web.dto.ModificarOperadorTelefonicoDTO;
import com.cbp.web.dto.actualizaStatusComercioDTO;
import com.cbp.web.dto.consultaComercioDTO;
import com.cbp.web.dto.crearComercioDTO;
import com.cbp.web.dto.modificarComercioDTO;
import com.cbp1.ws.cbp.service.ActualizaClienteConInformacionAdicionalWSResponse;
import com.cbp3.ws.cbp.service.ActiveOrInactiveOperadoraTelefonicaWSResponse;
import com.cbp3.ws.cbp.service.ActualizaStatusComercioWSResponse;
import com.cbp3.ws.cbp.service.AsociarBancoComercioWSResponse;
import com.cbp3.ws.cbp.service.BancoAfiliacion;
import com.cbp3.ws.cbp.service.ConsultaBancoAfiliacionByIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaComercioPorIdentificacionComercioWSResponse;
import com.cbp3.ws.cbp.service.CrearComercioWSResponse;
import com.cbp3.ws.cbp.service.CrearOperadorTelefonicoWSResponse;
import com.cbp3.ws.cbp.service.EditarAsociacionBancoComercioWSResponse;
import com.cbp3.ws.cbp.service.EntityBank;
import com.cbp3.ws.cbp.service.ListaSolicitudesWS;
import com.cbp3.ws.cbp.service.ListaSolicitudesWSResponse;
import com.cbp3.ws.cbp.service.ModificarComercioWSResponse;
import com.cbp3.ws.cbp.service.ModificarOperadorTelefonicoWSResponse;
import com.cbp3.ws.cbp.service.Operadortelefonico;
import com.cbp3.ws.cbp.service.Solicitud;

public interface AfiliacionDAO {

	public CrearComercioWSResponse crearClienteComercio(crearComercioDTO crearComercio);
	
	public ConsultaComercioPorIdentificacionComercioWSResponse consultaComercio(consultaComercioDTO consultaComercio);
	
	public ActualizaStatusComercioWSResponse actualizarStatusComercio(actualizaStatusComercioDTO actualizaStatusComercioDTO);
	
	public ModificarComercioWSResponse modificarComercio(modificarComercioDTO modificarComercioDTO);
	
	public ActiveOrInactiveOperadoraTelefonicaWSResponse activeOrInactive(ActiveOrInactiveOperadoraTelefonicaDTO ActiveOrInactiveOperadoraTelefonicaDTO);
	
	public AsociarBancoComercioWSResponse asociarBanco(AsociarBancoComercioDTO AsociarBancoComercioDTO);
	
	public ConsultaBancoAfiliacionByIdWSResponse consultaBancoAfiliacionId(ConsultaBancoAfiliacionIdDTO ConsultaBancoAfiliacionIdDTO);
	
	public CrearOperadorTelefonicoWSResponse crearOperadorTelefonico(CrearOperadorTelefonicoDTO CrearOperadorTelefonicoDTO);
	
	public EditarAsociacionBancoComercioWSResponse editarAsociacionBancoComercio(EditarAsociacionBancoComercioDTO EditarAsociacionBancoComercioDTO);
	
	public ModificarOperadorTelefonicoWSResponse modificarOperadorTelefonico(ModificarOperadorTelefonicoDTO ModificarOperadorTelefonicoDTO);
	
	public java.util.List<Solicitud> listaSolicitudes();
	
	public java.util.List<BancoAfiliacion> listaAsociacionBancoComercio();
	
	public java.util.List<Operadortelefonico> listaOperadoresTelefonicos();
	
	public java.util.List<EntityBank> listaBanks();
}
