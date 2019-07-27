
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
@WebService(name = "UbicacionGeograficaWS", targetNamespace = "http://service.cbp.ws.cbp3.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UbicacionGeograficaWS {


    /**
     * 
     * @param distrito
     * @return
     *     returns com.cbp3.ws.cbp.service.CodigoPostal
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "codigoPostalWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.CodigoPostalWS")
    @ResponseWrapper(localName = "codigoPostalWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.CodigoPostalWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/UbicacionGeograficaWS/codigoPostalWSRequest", output = "http://service.cbp.ws.cbp3.com/UbicacionGeograficaWS/codigoPostalWSResponse")
    public CodigoPostal codigoPostalWS(
        @WebParam(name = "distrito", targetNamespace = "")
        Distrito distrito);

    /**
     * 
     * @return
     *     returns java.util.List<com.cbp3.ws.cbp.service.Pais>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listPaisWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListPaisWS")
    @ResponseWrapper(localName = "listPaisWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListPaisWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/UbicacionGeograficaWS/listPaisWSRequest", output = "http://service.cbp.ws.cbp3.com/UbicacionGeograficaWS/listPaisWSResponse")
    public List<Pais> listPaisWS();

    /**
     * 
     * @param pais
     * @return
     *     returns java.util.List<com.cbp3.ws.cbp.service.Provincia>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listProvinciasWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListProvinciasWS")
    @ResponseWrapper(localName = "listProvinciasWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListProvinciasWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/UbicacionGeograficaWS/listProvinciasWSRequest", output = "http://service.cbp.ws.cbp3.com/UbicacionGeograficaWS/listProvinciasWSResponse")
    public List<Provincia> listProvinciasWS(
        @WebParam(name = "pais", targetNamespace = "")
        Pais pais);

    /**
     * 
     * @param provincia
     * @return
     *     returns java.util.List<com.cbp3.ws.cbp.service.Canton>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listCantonWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListCantonWS")
    @ResponseWrapper(localName = "listCantonWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListCantonWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/UbicacionGeograficaWS/listCantonWSRequest", output = "http://service.cbp.ws.cbp3.com/UbicacionGeograficaWS/listCantonWSResponse")
    public List<Canton> listCantonWS(
        @WebParam(name = "provincia", targetNamespace = "")
        Provincia provincia);

    /**
     * 
     * @param canton
     * @return
     *     returns java.util.List<com.cbp3.ws.cbp.service.Distrito>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listDistritoWS", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListDistritoWS")
    @ResponseWrapper(localName = "listDistritoWSResponse", targetNamespace = "http://service.cbp.ws.cbp3.com/", className = "com.cbp3.ws.cbp.service.ListDistritoWSResponse")
    @Action(input = "http://service.cbp.ws.cbp3.com/UbicacionGeograficaWS/listDistritoWSRequest", output = "http://service.cbp.ws.cbp3.com/UbicacionGeograficaWS/listDistritoWSResponse")
    public List<Distrito> listDistritoWS(
        @WebParam(name = "canton", targetNamespace = "")
        Canton canton);

}