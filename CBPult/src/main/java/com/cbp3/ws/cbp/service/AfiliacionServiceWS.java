
package com.cbp3.ws.cbp.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AfiliacionServiceWS", targetNamespace = "http://service.cbp.ws.cbp3.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AfiliacionServiceWS {


    /**
     * 
     * @return
     *     returns java.util.List<com.cbp3.ws.cbp.service.Solicitud>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listaSolicitudesWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListaSolicitudesWS")
    @ResponseWrapper(localName = "listaSolicitudesWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListaSolicitudesWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/listaSolicitudesWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/listaSolicitudesWSResponse")
    public List<Solicitud> listaSolicitudesWS();

    /**
     * 
     * @param identificacionContacto
     * @param telefonoCelular
     * @param segundoNombre
     * @param primerNombre
     * @param primerApellido
     * @param tipoIdentificacionId
     * @param cargoContacto
     * @param segundoApellido
     * @param emailContacto
     * @param telefonoLocal
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearContactoWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.CrearContactoWS")
    @ResponseWrapper(localName = "crearContactoWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.CrearContactoWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/crearContactoWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/crearContactoWSResponse")
    public RespuestaDTO crearContactoWS(
        @WebParam(name = "tipoIdentificacionId", targetNamespace = "")
        Tipoidentificacion tipoIdentificacionId,
        @WebParam(name = "identificacionContacto", targetNamespace = "")
        String identificacionContacto,
        @WebParam(name = "telefonoCelular", targetNamespace = "")
        String telefonoCelular,
        @WebParam(name = "primerNombre", targetNamespace = "")
        String primerNombre,
        @WebParam(name = "segundoNombre", targetNamespace = "")
        String segundoNombre,
        @WebParam(name = "primerApellido", targetNamespace = "")
        String primerApellido,
        @WebParam(name = "segundoApellido", targetNamespace = "")
        String segundoApellido,
        @WebParam(name = "cargoContacto", targetNamespace = "")
        String cargoContacto,
        @WebParam(name = "telefonoLocal", targetNamespace = "")
        String telefonoLocal,
        @WebParam(name = "emailContacto", targetNamespace = "")
        String emailContacto);

    /**
     * 
     * @param identificacionContacto
     * @param telefonoCelular
     * @param segundoNombre
     * @param primerNombre
     * @param primerApellido
     * @param cargoContacto
     * @param segundoApellido
     * @param emailContacto
     * @param telefonoLocal
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editarContactoWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.EditarContactoWS")
    @ResponseWrapper(localName = "editarContactoWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.EditarContactoWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/editarContactoWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/editarContactoWSResponse")
    public RespuestaDTO editarContactoWS(
        @WebParam(name = "identificacionContacto", targetNamespace = "")
        String identificacionContacto,
        @WebParam(name = "telefonoCelular", targetNamespace = "")
        String telefonoCelular,
        @WebParam(name = "primerNombre", targetNamespace = "")
        String primerNombre,
        @WebParam(name = "segundoNombre", targetNamespace = "")
        String segundoNombre,
        @WebParam(name = "primerApellido", targetNamespace = "")
        String primerApellido,
        @WebParam(name = "segundoApellido", targetNamespace = "")
        String segundoApellido,
        @WebParam(name = "cargoContacto", targetNamespace = "")
        String cargoContacto,
        @WebParam(name = "telefonoLocal", targetNamespace = "")
        String telefonoLocal,
        @WebParam(name = "emailContacto", targetNamespace = "")
        String emailContacto);

    /**
     * 
     * @param comercioId
     * @param contactoId
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "asociarComercioConContactoWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.AsociarComercioConContactoWS")
    @ResponseWrapper(localName = "asociarComercioConContactoWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.AsociarComercioConContactoWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/asociarComercioConContactoWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/asociarComercioConContactoWSResponse")
    public RespuestaDTO asociarComercioConContactoWS(
        @WebParam(name = "comercioId", targetNamespace = "")
        long comercioId,
        @WebParam(name = "contactoId", targetNamespace = "")
        long contactoId);

    /**
     * 
     * @param comercioId
     * @param contactoId
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editarAsociacionComercioConContactoWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.EditarAsociacionComercioConContactoWS")
    @ResponseWrapper(localName = "editarAsociacionComercioConContactoWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.EditarAsociacionComercioConContactoWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/editarAsociacionComercioConContactoWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/editarAsociacionComercioConContactoWSResponse")
    public RespuestaDTO editarAsociacionComercioConContactoWS(
        @WebParam(name = "comercioId", targetNamespace = "")
        long comercioId,
        @WebParam(name = "contactoId", targetNamespace = "")
        long contactoId);

    /**
     * 
     * @param identificacionContacto
     * @return
     *     returns com.cbp3.ws.cbp.service.Contacto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaContactoByIdentificacionContactoWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ConsultaContactoByIdentificacionContactoWS")
    @ResponseWrapper(localName = "consultaContactoByIdentificacionContactoWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ConsultaContactoByIdentificacionContactoWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/consultaContactoByIdentificacionContactoWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/consultaContactoByIdentificacionContactoWSResponse")
    public Contacto consultaContactoByIdentificacionContactoWS(
        @WebParam(name = "identificacionContacto", targetNamespace = "")
        String identificacionContacto);

    /**
     * 
     * @param comercioId
     * @param representanteId
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editarAsociacionComercioConRepresentanteLegalWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.EditarAsociacionComercioConRepresentanteLegalWS")
    @ResponseWrapper(localName = "editarAsociacionComercioConRepresentanteLegalWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.EditarAsociacionComercioConRepresentanteLegalWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/editarAsociacionComercioConRepresentanteLegalWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/editarAsociacionComercioConRepresentanteLegalWSResponse")
    public RespuestaDTO editarAsociacionComercioConRepresentanteLegalWS(
        @WebParam(name = "comercioId", targetNamespace = "")
        long comercioId,
        @WebParam(name = "representanteId", targetNamespace = "")
        long representanteId);

    /**
     * 
     * @param telefonoCelular
     * @param identificacionRepresentante
     * @param segundoNombre
     * @param emailRepresentante
     * @param primerNombre
     * @param primerApellido
     * @param segundoApellido
     * @param telefonoLocal
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editarRepresentanteLegalWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.EditarRepresentanteLegalWS")
    @ResponseWrapper(localName = "editarRepresentanteLegalWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.EditarRepresentanteLegalWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/editarRepresentanteLegalWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/editarRepresentanteLegalWSResponse")
    public RespuestaDTO editarRepresentanteLegalWS(
        @WebParam(name = "identificacionRepresentante", targetNamespace = "")
        String identificacionRepresentante,
        @WebParam(name = "primerNombre", targetNamespace = "")
        String primerNombre,
        @WebParam(name = "segundoNombre", targetNamespace = "")
        String segundoNombre,
        @WebParam(name = "primerApellido", targetNamespace = "")
        String primerApellido,
        @WebParam(name = "segundoApellido", targetNamespace = "")
        String segundoApellido,
        @WebParam(name = "telefonoLocal", targetNamespace = "")
        String telefonoLocal,
        @WebParam(name = "telefonoCelular", targetNamespace = "")
        String telefonoCelular,
        @WebParam(name = "emailRepresentante", targetNamespace = "")
        String emailRepresentante);

    /**
     * 
     * @return
     *     returns java.util.List<com.cbp3.ws.cbp.service.BancoAfiliacion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listaAsociacionBancoComercioWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListaAsociacionBancoComercioWS")
    @ResponseWrapper(localName = "listaAsociacionBancoComercioWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListaAsociacionBancoComercioWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/listaAsociacionBancoComercioWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/listaAsociacionBancoComercioWSResponse")
    public List<BancoAfiliacion> listaAsociacionBancoComercioWS();

    /**
     * 
     * @param codOperador
     * @param nombreOperador
     * @param operadortelfId
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarOperadorTelefonicoWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ModificarOperadorTelefonicoWS")
    @ResponseWrapper(localName = "modificarOperadorTelefonicoWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ModificarOperadorTelefonicoWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/modificarOperadorTelefonicoWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/modificarOperadorTelefonicoWSResponse")
    public RespuestaDTO modificarOperadorTelefonicoWS(
        @WebParam(name = "operadortelfId", targetNamespace = "")
        long operadortelfId,
        @WebParam(name = "nombreOperador", targetNamespace = "")
        String nombreOperador,
        @WebParam(name = "codOperador", targetNamespace = "")
        String codOperador);

    /**
     * 
     * @return
     *     returns java.util.List<com.cbp3.ws.cbp.service.Operadortelefonico>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listaOperadoresTelefonicosWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListaOperadoresTelefonicosWS")
    @ResponseWrapper(localName = "listaOperadoresTelefonicosWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListaOperadoresTelefonicosWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/listaOperadoresTelefonicosWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/listaOperadoresTelefonicosWSResponse")
    public List<Operadortelefonico> listaOperadoresTelefonicosWS();

    /**
     * 
     * @param identificacionRepresentante
     * @return
     *     returns com.cbp3.ws.cbp.service.RepresentanteLegal
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaRepresentanteLegalByIdentificacionRepresentanteWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ConsultaRepresentanteLegalByIdentificacionRepresentanteWS")
    @ResponseWrapper(localName = "consultaRepresentanteLegalByIdentificacionRepresentanteWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ConsultaRepresentanteLegalByIdentificacionRepresentanteWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/consultaRepresentanteLegalByIdentificacionRepresentanteWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/consultaRepresentanteLegalByIdentificacionRepresentanteWSResponse")
    public RepresentanteLegal consultaRepresentanteLegalByIdentificacionRepresentanteWS(
        @WebParam(name = "identificacionRepresentante", targetNamespace = "")
        String identificacionRepresentante);

    /**
     * 
     * @param telefonoCelular
     * @param statusRepresentante
     * @param identificacionRepresentante
     * @param segundoNombre
     * @param emailRepresentante
     * @param primerNombre
     * @param primerApellido
     * @param tipoIdentificacionId
     * @param segundoApellido
     * @param telefonoLocal
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearRepresentanteLegalWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.CrearRepresentanteLegalWS")
    @ResponseWrapper(localName = "crearRepresentanteLegalWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.CrearRepresentanteLegalWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/crearRepresentanteLegalWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/crearRepresentanteLegalWSResponse")
    public RespuestaDTO crearRepresentanteLegalWS(
        @WebParam(name = "tipoIdentificacionId", targetNamespace = "")
        Tipoidentificacion tipoIdentificacionId,
        @WebParam(name = "identificacionRepresentante", targetNamespace = "")
        String identificacionRepresentante,
        @WebParam(name = "primerNombre", targetNamespace = "")
        String primerNombre,
        @WebParam(name = "segundoNombre", targetNamespace = "")
        String segundoNombre,
        @WebParam(name = "primerApellido", targetNamespace = "")
        String primerApellido,
        @WebParam(name = "segundoApellido", targetNamespace = "")
        String segundoApellido,
        @WebParam(name = "telefonoLocal", targetNamespace = "")
        String telefonoLocal,
        @WebParam(name = "telefonoCelular", targetNamespace = "")
        String telefonoCelular,
        @WebParam(name = "emailRepresentante", targetNamespace = "")
        String emailRepresentante,
        @WebParam(name = "statusRepresentante", targetNamespace = "")
        String statusRepresentante);

    /**
     * 
     * @param numeroAfiliacion
     * @param numTerminalesComprar
     * @param idEntityBanck
     * @param idAsociacion
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editarAsociacionBancoComercioWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.EditarAsociacionBancoComercioWS")
    @ResponseWrapper(localName = "editarAsociacionBancoComercioWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.EditarAsociacionBancoComercioWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/editarAsociacionBancoComercioWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/editarAsociacionBancoComercioWSResponse")
    public RespuestaDTO editarAsociacionBancoComercioWS(
        @WebParam(name = "idAsociacion", targetNamespace = "")
        long idAsociacion,
        @WebParam(name = "idEntityBanck", targetNamespace = "")
        long idEntityBanck,
        @WebParam(name = "numeroAfiliacion", targetNamespace = "")
        String numeroAfiliacion,
        @WebParam(name = "numTerminalesComprar", targetNamespace = "")
        long numTerminalesComprar);

    /**
     * 
     * @param numeroAfiliacion
     * @param idComercio
     * @param numTerminalesComprar
     * @param idEntityBanck
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "asociarBancoComercioWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.AsociarBancoComercioWS")
    @ResponseWrapper(localName = "asociarBancoComercioWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.AsociarBancoComercioWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/asociarBancoComercioWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/asociarBancoComercioWSResponse")
    public RespuestaDTO asociarBancoComercioWS(
        @WebParam(name = "idEntityBanck", targetNamespace = "")
        long idEntityBanck,
        @WebParam(name = "idComercio", targetNamespace = "")
        long idComercio,
        @WebParam(name = "numeroAfiliacion", targetNamespace = "")
        String numeroAfiliacion,
        @WebParam(name = "numTerminalesComprar", targetNamespace = "")
        long numTerminalesComprar);

    /**
     * 
     * @param comercioId
     * @param representanteId
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "asociarComercioConRepresentanteLegalWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.AsociarComercioConRepresentanteLegalWS")
    @ResponseWrapper(localName = "asociarComercioConRepresentanteLegalWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.AsociarComercioConRepresentanteLegalWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/asociarComercioConRepresentanteLegalWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/asociarComercioConRepresentanteLegalWSResponse")
    public RespuestaDTO asociarComercioConRepresentanteLegalWS(
        @WebParam(name = "comercioId", targetNamespace = "")
        long comercioId,
        @WebParam(name = "representanteId", targetNamespace = "")
        long representanteId);

    /**
     * 
     * @param codOperador
     * @param nombreOperador
     * @param active
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearOperadorTelefonicoWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.CrearOperadorTelefonicoWS")
    @ResponseWrapper(localName = "crearOperadorTelefonicoWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.CrearOperadorTelefonicoWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/crearOperadorTelefonicoWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/crearOperadorTelefonicoWSResponse")
    public RespuestaDTO crearOperadorTelefonicoWS(
        @WebParam(name = "nombreOperador", targetNamespace = "")
        String nombreOperador,
        @WebParam(name = "codOperador", targetNamespace = "")
        String codOperador,
        @WebParam(name = "active", targetNamespace = "")
        Integer active);

    /**
     * 
     * @param idAsociacion
     * @return
     *     returns com.cbp3.ws.cbp.service.BancoAfiliacion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaBancoAfiliacionByIdWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ConsultaBancoAfiliacionByIdWS")
    @ResponseWrapper(localName = "consultaBancoAfiliacionByIdWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ConsultaBancoAfiliacionByIdWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/consultaBancoAfiliacionByIdWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/consultaBancoAfiliacionByIdWSResponse")
    public BancoAfiliacion consultaBancoAfiliacionByIdWS(
        @WebParam(name = "idAsociacion", targetNamespace = "")
        long idAsociacion);

    /**
     * 
     * @param active
     * @param operadortelfId
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "activeOrInactiveOperadoraTelefonicaWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ActiveOrInactiveOperadoraTelefonicaWS")
    @ResponseWrapper(localName = "activeOrInactiveOperadoraTelefonicaWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ActiveOrInactiveOperadoraTelefonicaWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/activeOrInactiveOperadoraTelefonicaWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/activeOrInactiveOperadoraTelefonicaWSResponse")
    public RespuestaDTO activeOrInactiveOperadoraTelefonicaWS(
        @WebParam(name = "operadortelfId", targetNamespace = "")
        long operadortelfId,
        @WebParam(name = "active", targetNamespace = "")
        Integer active);

    /**
     * 
     * @param horaFin
     * @param afiliadoOtroBanco
     * @param identificacionComercio
     * @param actividadComercial
     * @param nombreComercial
     * @param nombreEmpresarial
     * @param telefonoContacto
     * @param telefonoLocal
     * @param email
     * @param numCuentaAsociado
     * @param horaInicio
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modificarComercioWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ModificarComercioWS")
    @ResponseWrapper(localName = "modificarComercioWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ModificarComercioWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/modificarComercioWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/modificarComercioWSResponse")
    public RespuestaDTO modificarComercioWS(
        @WebParam(name = "identificacionComercio", targetNamespace = "")
        String identificacionComercio,
        @WebParam(name = "nombreEmpresarial", targetNamespace = "")
        String nombreEmpresarial,
        @WebParam(name = "nombreComercial", targetNamespace = "")
        String nombreComercial,
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "telefonoContacto", targetNamespace = "")
        String telefonoContacto,
        @WebParam(name = "telefonoLocal", targetNamespace = "")
        String telefonoLocal,
        @WebParam(name = "numCuentaAsociado", targetNamespace = "")
        String numCuentaAsociado,
        @WebParam(name = "afiliadoOtroBanco", targetNamespace = "")
        String afiliadoOtroBanco,
        @WebParam(name = "actividadComercial", targetNamespace = "")
        String actividadComercial,
        @WebParam(name = "horaInicio", targetNamespace = "")
        String horaInicio,
        @WebParam(name = "horaFin", targetNamespace = "")
        String horaFin);

    /**
     * 
     * @param comercioId
     * @return
     *     returns com.cbp3.ws.cbp.service.Comercio
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaComercioPorComercioIdWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ConsultaComercioPorComercioIdWS")
    @ResponseWrapper(localName = "consultaComercioPorComercioIdWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ConsultaComercioPorComercioIdWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/consultaComercioPorComercioIdWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/consultaComercioPorComercioIdWSResponse")
    public Comercio consultaComercioPorComercioIdWS(
        @WebParam(name = "comercioId", targetNamespace = "")
        String comercioId);

    /**
     * 
     * @param statusComecio
     * @param identificacionComercio
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizaStatusComercioWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ActualizaStatusComercioWS")
    @ResponseWrapper(localName = "actualizaStatusComercioWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ActualizaStatusComercioWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/actualizaStatusComercioWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/actualizaStatusComercioWSResponse")
    public RespuestaDTO actualizaStatusComercioWS(
        @WebParam(name = "identificacionComercio", targetNamespace = "")
        String identificacionComercio,
        @WebParam(name = "statusComecio", targetNamespace = "")
        String statusComecio);

    /**
     * 
     * @param afiliadoOtroBanco
     * @param nombreCanal
     * @param identificacionComercio
     * @param tipoIdentificacionId
     * @param actividadComercial
     * @param numCuentaAsociado
     * @param horaInicio
     * @param estadoComercioActivo
     * @param horaFin
     * @param idCanal
     * @param nombreComercial
     * @param nombreEmpresarial
     * @param telefonoContacto
     * @param telefonoLocal
     * @param email
     * @return
     *     returns com.cbp3.ws.cbp.service.RespuestaDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearComercioWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.CrearComercioWS")
    @ResponseWrapper(localName = "crearComercioWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.CrearComercioWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/crearComercioWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/crearComercioWSResponse")
    public RespuestaDTO crearComercioWS(
        @WebParam(name = "identificacionComercio", targetNamespace = "")
        String identificacionComercio,
        @WebParam(name = "nombreEmpresarial", targetNamespace = "")
        String nombreEmpresarial,
        @WebParam(name = "nombreComercial", targetNamespace = "")
        String nombreComercial,
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "telefonoContacto", targetNamespace = "")
        String telefonoContacto,
        @WebParam(name = "estadoComercioActivo", targetNamespace = "")
        String estadoComercioActivo,
        @WebParam(name = "telefonoLocal", targetNamespace = "")
        String telefonoLocal,
        @WebParam(name = "numCuentaAsociado", targetNamespace = "")
        String numCuentaAsociado,
        @WebParam(name = "afiliadoOtroBanco", targetNamespace = "")
        String afiliadoOtroBanco,
        @WebParam(name = "tipoIdentificacionId", targetNamespace = "")
        Tipoidentificacion tipoIdentificacionId,
        @WebParam(name = "actividadComercial", targetNamespace = "")
        String actividadComercial,
        @WebParam(name = "horaInicio", targetNamespace = "")
        String horaInicio,
        @WebParam(name = "horaFin", targetNamespace = "")
        String horaFin,
        @WebParam(name = "idCanal", targetNamespace = "")
        String idCanal,
        @WebParam(name = "nombreCanal", targetNamespace = "")
        String nombreCanal);

    /**
     * 
     * @param identificacionComercio
     * @return
     *     returns com.cbp3.ws.cbp.service.Comercio
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaComercioPorIdentificacionComercioWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ConsultaComercioPorIdentificacionComercioWS")
    @ResponseWrapper(localName = "consultaComercioPorIdentificacionComercioWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ConsultaComercioPorIdentificacionComercioWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/consultaComercioPorIdentificacionComercioWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/consultaComercioPorIdentificacionComercioWSResponse")
    public Comercio consultaComercioPorIdentificacionComercioWS(
        @WebParam(name = "identificacionComercio", targetNamespace = "")
        String identificacionComercio);

    /**
     * 
     * @return
     *     returns java.util.List<com.cbp3.ws.cbp.service.EntityBank>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listBanksWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListBanksWS")
    @ResponseWrapper(localName = "listBanksWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListBanksWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/listBanksWSRequest", output = "http://service.cbp.ws.cbp3.com/AfiliacionServiceWS/listBanksWSResponse")
    public List<EntityBank> listBanksWS();

}
