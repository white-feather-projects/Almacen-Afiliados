
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Service1Soap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Service1Soap {


    /**
     * 
     * @param parsImpresoraIP
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Desbloquear_Impresora", action = "http://tempuri.org/Desbloquear_Impresora")
    @WebResult(name = "Desbloquear_ImpresoraResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Desbloquear_Impresora", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DesbloquearImpresora")
    @ResponseWrapper(localName = "Desbloquear_ImpresoraResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DesbloquearImpresoraResponse")
    public String desbloquearImpresora(
        @WebParam(name = "parsImpresoraIP", targetNamespace = "http://tempuri.org/")
        String parsImpresoraIP);

    /**
     * 
     * @param parsImpresoraIP
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Estado_Impresora", action = "http://tempuri.org/Estado_Impresora")
    @WebResult(name = "Estado_ImpresoraResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Estado_Impresora", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EstadoImpresora")
    @ResponseWrapper(localName = "Estado_ImpresoraResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EstadoImpresoraResponse")
    public String estadoImpresora(
        @WebParam(name = "parsImpresoraIP", targetNamespace = "http://tempuri.org/")
        String parsImpresoraIP);

    /**
     * 
     * @param parsClienteNom
     * @param parsImpresoraIP
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Emitir_Tarjeta", action = "http://tempuri.org/Emitir_Tarjeta")
    @WebResult(name = "Emitir_TarjetaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Emitir_Tarjeta", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EmitirTarjeta")
    @ResponseWrapper(localName = "Emitir_TarjetaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EmitirTarjetaResponse")
    public String emitirTarjeta(
        @WebParam(name = "parsImpresoraIP", targetNamespace = "http://tempuri.org/")
        String parsImpresoraIP,
        @WebParam(name = "parsClienteNom", targetNamespace = "http://tempuri.org/")
        String parsClienteNom);

    /**
     * 
     * @param parsClienteNom
     * @param parsTarjeta
     * @param parsImpresoraIP
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Emitir_Tarjeta_Verificada", action = "http://tempuri.org/Emitir_Tarjeta_Verificada")
    @WebResult(name = "Emitir_Tarjeta_VerificadaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Emitir_Tarjeta_Verificada", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EmitirTarjetaVerificada")
    @ResponseWrapper(localName = "Emitir_Tarjeta_VerificadaResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.EmitirTarjetaVerificadaResponse")
    public String emitirTarjetaVerificada(
        @WebParam(name = "parsImpresoraIP", targetNamespace = "http://tempuri.org/")
        String parsImpresoraIP,
        @WebParam(name = "parsClienteNom", targetNamespace = "http://tempuri.org/")
        String parsClienteNom,
        @WebParam(name = "parsTarjeta", targetNamespace = "http://tempuri.org/")
        String parsTarjeta);

}