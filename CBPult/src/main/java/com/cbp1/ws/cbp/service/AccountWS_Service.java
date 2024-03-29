
package com.cbp1.ws.cbp.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AccountWS", targetNamespace = "http://service.cbp.ws.cbp1.com/", wsdlLocation = "http://18.222.73.208:8080/CBP-1/AccountWS?wsdl")
public class AccountWS_Service
    extends Service
{

    private final static URL ACCOUNTWS_WSDL_LOCATION;
    private final static WebServiceException ACCOUNTWS_EXCEPTION;
    private final static QName ACCOUNTWS_QNAME = new QName("http://service.cbp.ws.cbp1.com/", "AccountWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://18.222.73.208:8080/CBP-1/AccountWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ACCOUNTWS_WSDL_LOCATION = url;
        ACCOUNTWS_EXCEPTION = e;
    }

    public AccountWS_Service() {
        super(__getWsdlLocation(), ACCOUNTWS_QNAME);
    }

    public AccountWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ACCOUNTWS_QNAME, features);
    }

    public AccountWS_Service(URL wsdlLocation) {
        super(wsdlLocation, ACCOUNTWS_QNAME);
    }

    public AccountWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ACCOUNTWS_QNAME, features);
    }

    public AccountWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccountWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AccountWS
     */
    @WebEndpoint(name = "AccountWSPort")
    public AccountWS getAccountWSPort() {
        return super.getPort(new QName("http://service.cbp.ws.cbp1.com/", "AccountWSPort"), AccountWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccountWS
     */
    @WebEndpoint(name = "AccountWSPort")
    public AccountWS getAccountWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.cbp.ws.cbp1.com/", "AccountWSPort"), AccountWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACCOUNTWS_EXCEPTION!= null) {
            throw ACCOUNTWS_EXCEPTION;
        }
        return ACCOUNTWS_WSDL_LOCATION;
    }

}
