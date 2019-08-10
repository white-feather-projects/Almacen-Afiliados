package com.cbp.web.dao;

import com.cbp.web.dto.ActiveOrInactiveOperadoraTelefonicaDTO;
import com.cbp.web.dto.AsociarBancoComercioDTO;
import com.cbp.web.dto.AsociarComercioConContactoDTO;
import com.cbp.web.dto.AsociarComercioConRepresentanteLegalDTO;
import com.cbp.web.dto.CodigoPostalDTO;
import com.cbp.web.dto.ConsultaAsociacionComercioContactoDTO;
import com.cbp.web.dto.ConsultaAsociacionComercioOtroBancoDTO;
import com.cbp.web.dto.ConsultaAsociacionComercioRepresentanteDTO;
import com.cbp.web.dto.ConsultaBancoAfiliacionIdDTO;
import com.cbp.web.dto.ConsultaContactoByIdentificacionContactoDTO;
import com.cbp.web.dto.ConsultaRepresentanteLegalByIdentificacionRepresentanteDTO;
import com.cbp.web.dto.CrearContactoDTO;
import com.cbp.web.dto.CrearOperadorTelefonicoDTO;
import com.cbp.web.dto.CrearRepresentanteLegalDTO;
import com.cbp.web.dto.EditarAsociacionBancoComercioDTO;
import com.cbp.web.dto.EditarAsociacionComercioConContactoDTO;
import com.cbp.web.dto.EditarAsociacionComercioConRepresentanteLegalDTO;
import com.cbp.web.dto.EditarContactoDTO;
import com.cbp.web.dto.EditarRepresentanteLegalDTO;
import com.cbp.web.dto.ModificarOperadorTelefonicoDTO;
import com.cbp.web.dto.actualizaStatusComercioDTO;
import com.cbp.web.dto.consultaComercioDTO;
import com.cbp.web.dto.crearComercioDTO;
import com.cbp.web.dto.modificarComercioDTO;
import com.cbp1.ws.cbp.service.ActualizaClienteConInformacionAdicionalWSResponse;
import com.cbp3.ws.cbp.service.ActiveOrInactiveOperadoraTelefonicaWSResponse;
import com.cbp3.ws.cbp.service.ActualizaStatusComercioWSResponse;
import com.cbp3.ws.cbp.service.AsociarBancoComercioWSResponse;
import com.cbp3.ws.cbp.service.AsociarComercioConContactoWSResponse;
import com.cbp3.ws.cbp.service.AsociarComercioConRepresentanteLegalWSResponse;
import com.cbp3.ws.cbp.service.AsociarComercioOtroBancoWS;
import com.cbp3.ws.cbp.service.AsociarComercioOtroBancoWSResponse;
import com.cbp3.ws.cbp.service.AsociarComercioRecaudoWS;
import com.cbp3.ws.cbp.service.AsociarComercioRecaudoWSResponse;
import com.cbp3.ws.cbp.service.BancoAfiliacion;
import com.cbp3.ws.cbp.service.Canton;
import com.cbp3.ws.cbp.service.CodigoPostalWSResponse;
import com.cbp3.ws.cbp.service.ConsultaAsociacionComercioContactoWSResponse;
import com.cbp3.ws.cbp.service.ConsultaAsociacionComercioOtroBancoWS;
import com.cbp3.ws.cbp.service.ConsultaAsociacionComercioOtroBancoWSResponse;
import com.cbp3.ws.cbp.service.ConsultaAsociacionComercioRepresentanteWSResponse;
import com.cbp3.ws.cbp.service.ConsultaBancoAfiliacionByIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaComercioPorComercioIdWS;
import com.cbp3.ws.cbp.service.ConsultaComercioPorComercioIdWSResponse;
import com.cbp3.ws.cbp.service.ConsultaComercioPorIdentificacionComercioWSResponse;
import com.cbp3.ws.cbp.service.ConsultaContactoByIdentificacionContactoWSResponse;
import com.cbp3.ws.cbp.service.ConsultaEntityBankByIdEntityBankWS;
import com.cbp3.ws.cbp.service.ConsultaEntityBankByIdEntityBankWSResponse;
import com.cbp3.ws.cbp.service.ConsultaPagoByNumComprobanteReciboWS;
import com.cbp3.ws.cbp.service.ConsultaPagoByNumComprobanteReciboWSResponse;
import com.cbp3.ws.cbp.service.ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse;
import com.cbp3.ws.cbp.service.ConsultaTipoRecaudoByIdTipoRecaudoWS;
import com.cbp3.ws.cbp.service.ConsultaTipoRecaudoByIdTipoRecaudoWSResponse;
import com.cbp3.ws.cbp.service.CrearComercioWSResponse;
import com.cbp3.ws.cbp.service.CrearContactoWSResponse;
import com.cbp3.ws.cbp.service.CrearEstablecimientoWS;
import com.cbp3.ws.cbp.service.CrearEstablecimientoWSResponse;
import com.cbp3.ws.cbp.service.CrearOperadorTelefonicoWSResponse;
import com.cbp3.ws.cbp.service.CrearPagoComercioWS;
import com.cbp3.ws.cbp.service.CrearPagoComercioWSResponse;
import com.cbp3.ws.cbp.service.CrearRepresentanteLegalWSResponse;
import com.cbp3.ws.cbp.service.Distrito;
import com.cbp3.ws.cbp.service.EditarAsociacionBancoComercioWSResponse;
import com.cbp3.ws.cbp.service.EditarAsociacionComercioConContactoWSResponse;
import com.cbp3.ws.cbp.service.EditarAsociacionComercioConRepresentanteLegalWSResponse;
import com.cbp3.ws.cbp.service.EditarContactoWSResponse;
import com.cbp3.ws.cbp.service.EditarRepresentanteLegalWSResponse;
import com.cbp3.ws.cbp.service.EntityBank;
import com.cbp3.ws.cbp.service.ListPagosByIdentificacionComercioWS;
import com.cbp3.ws.cbp.service.ListRecaudosByComercioWS;
import com.cbp3.ws.cbp.service.ListaSolicitudesWS;
import com.cbp3.ws.cbp.service.ListaSolicitudesWSResponse;
import com.cbp3.ws.cbp.service.ModificarAsociacionComercioOtroBancoWS;
import com.cbp3.ws.cbp.service.ModificarAsociacionComercioOtroBancoWSResponse;
import com.cbp3.ws.cbp.service.ModificarAsociarComercioRecaudoWS;
import com.cbp3.ws.cbp.service.ModificarAsociarComercioRecaudoWSResponse;
import com.cbp3.ws.cbp.service.ModificarComercioWSResponse;
import com.cbp3.ws.cbp.service.ModificarOperadorTelefonicoWSResponse;
import com.cbp3.ws.cbp.service.Operadortelefonico;
import com.cbp3.ws.cbp.service.Pago;
import com.cbp3.ws.cbp.service.Pais;
import com.cbp3.ws.cbp.service.Provincia;
import com.cbp3.ws.cbp.service.Recaudo;
import com.cbp3.ws.cbp.service.Solicitud;
import com.cbp3.ws.cbp.service.TipoRecaudo;

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
	
	public AsociarComercioConContactoWSResponse asociarComercioConContacto(AsociarComercioConContactoDTO AsociarComercioConContactoDTO);
	
	public AsociarComercioConRepresentanteLegalWSResponse asociarComercioConRepresentanteLegal(AsociarComercioConRepresentanteLegalDTO AsociarComercioConRepresentanteLegalDTO);
	
	public ConsultaContactoByIdentificacionContactoWSResponse consultaContactoByIdentificacionContacto(ConsultaContactoByIdentificacionContactoDTO ConsultaContactoByIdentificacionContactoDTO);
	
	public ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse consultaRepresentanteLegalByIdentificacionRepresentante(ConsultaRepresentanteLegalByIdentificacionRepresentanteDTO ConsultaRepresentanteLegalByIdentificacionRepresentanteDTO);
	
	public CrearContactoWSResponse crearContacto(CrearContactoDTO CrearContactoDTO);
	
	public CrearRepresentanteLegalWSResponse crearRepresentanteLegal(CrearRepresentanteLegalDTO CrearRepresentanteLegalDTO);
	
	public EditarAsociacionComercioConContactoWSResponse editarAsociacionComercioConContacto(EditarAsociacionComercioConContactoDTO EditarAsociacionComercioConContactoDTO);
	
	public EditarAsociacionComercioConRepresentanteLegalWSResponse editarAsociacionComercioConRepresentanteLegal(EditarAsociacionComercioConRepresentanteLegalDTO EditarAsociacionComercioConRepresentanteLegalDTO);
	
	public EditarContactoWSResponse editarContacto(EditarContactoDTO EditarContactoDTO);
	
	public EditarRepresentanteLegalWSResponse editarRepresentanteLegal(EditarRepresentanteLegalDTO EditarRepresentanteLegalDTO);
	
	public ConsultaAsociacionComercioContactoWSResponse consultaAsociacionComercioContacto(ConsultaAsociacionComercioContactoDTO ConsultaAsociacionComercioContactoDTO);
	
	public ConsultaAsociacionComercioRepresentanteWSResponse consultaAsociacionComercioRepresentante(ConsultaAsociacionComercioRepresentanteDTO ConsultaAsociacionComercioRepresentanteDTO);
	
	public AsociarComercioOtroBancoWSResponse asociarComercioOtroBanco(AsociarComercioOtroBancoWS AsociarComercioOtroBancoWS);
	
	public ConsultaAsociacionComercioOtroBancoWSResponse consultaAsociacionComercioOtroBanco(ConsultaAsociacionComercioOtroBancoWS ConsultaAsociacionComercioOtroBancoWS);
	
	public ModificarAsociacionComercioOtroBancoWSResponse modificarAsociacionComercioOtroBanco(ModificarAsociacionComercioOtroBancoWS ModificarAsociacionComercioOtroBancoWS);
	
	public AsociarComercioRecaudoWSResponse asociarComercioRecaudo(AsociarComercioRecaudoWS AsociarComercioRecaudoWS);
	
	public ConsultaComercioPorComercioIdWSResponse consultaComercioPorComercioId(ConsultaComercioPorComercioIdWS ConsultaComercioPorComercioIdWS);
	
	public ConsultaPagoByNumComprobanteReciboWSResponse consultaPagoByNumComprobanteRecibo(ConsultaPagoByNumComprobanteReciboWS ConsultaPagoByNumComprobanteReciboWS);
	
	public ConsultaTipoRecaudoByIdTipoRecaudoWSResponse consultaTipoRecaudoByIdTipoRecaudo(ConsultaTipoRecaudoByIdTipoRecaudoWS ConsultaTipoRecaudoByIdTipoRecaudoWS);
	
	public CrearPagoComercioWSResponse crearPagoComercio(CrearPagoComercioWS CrearPagoComercioWS);
	
	public ModificarAsociarComercioRecaudoWSResponse modificarAsociarComercioRecaudo(ModificarAsociarComercioRecaudoWS ModificarAsociarComercioRecaudoWS);
	
	public ConsultaEntityBankByIdEntityBankWSResponse consultaEntityBankByIdEntityBank(ConsultaEntityBankByIdEntityBankWS ConsultaEntityBankByIdEntityBankWS);
	
	public java.util.List<Solicitud> listaSolicitudes();
	
	public java.util.List<BancoAfiliacion> listaAsociacionBancoComercio();
	
	public java.util.List<Operadortelefonico> listaOperadoresTelefonicos();
	
	public java.util.List<EntityBank> listaBanks();
	
	public java.util.List<TipoRecaudo> listaTipoRecaudos();
	
	public java.util.List<Pago> listaPagosPorIdentificacionComercio(ListPagosByIdentificacionComercioWS ListPagosByIdentificacionComercioWS);
	
	public java.util.List<Recaudo> listaRecaudosByComercio(ListRecaudosByComercioWS ListRecaudosByComercioWS);
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public CodigoPostalWSResponse codigoPostal(CodigoPostalDTO CodigoPostalDTO);
	
	public java.util.List<Canton> listaCanton(Provincia Provincia);
	
	public java.util.List<Distrito> listaDistrito(Canton Canton);
	
	public java.util.List<Pais> listaPais();
	
	public java.util.List<Provincia> listaProvincias(Pais Pais);
}
