
package com.bank.client;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WebServerService", targetNamespace = "http://ws.bank.com/", wsdlLocation = "http://localhost:9000/BankWebService?wsdl")
public class WebServerService
    extends Service
{

    private final static URL WEBSERVERSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBSERVERSERVICE_EXCEPTION;
    private final static QName WEBSERVERSERVICE_QNAME = new QName("http://ws.bank.com/", "WebServerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9000/BankWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVERSERVICE_WSDL_LOCATION = url;
        WEBSERVERSERVICE_EXCEPTION = e;
    }

    public WebServerService() {
        super(__getWsdlLocation(), WEBSERVERSERVICE_QNAME);
    }

    public WebServerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVERSERVICE_QNAME, features);
    }

    public WebServerService(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVERSERVICE_QNAME);
    }

    public WebServerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVERSERVICE_QNAME, features);
    }

    public WebServerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServerInterface
     */
    @WebEndpoint(name = "WebServerPort")
    public WebServerInterface getWebServerPort() {
        return super.getPort(new QName("http://ws.bank.com/", "WebServerPort"), WebServerInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServerInterface
     */
    @WebEndpoint(name = "WebServerPort")
    public WebServerInterface getWebServerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.bank.com/", "WebServerPort"), WebServerInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVERSERVICE_EXCEPTION!= null) {
            throw WEBSERVERSERVICE_EXCEPTION;
        }
        return WEBSERVERSERVICE_WSDL_LOCATION;
    }

}
