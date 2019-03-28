
package com.mitocode.service.impl;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RolServiceImplService", targetNamespace = "http://impl.service.mitocode.com/", wsdlLocation = "http://localhost:8080/SOAPMiniBlog/RolServiceImpl?wsdl")
public class RolServiceImplService
    extends Service
{

    private final static URL ROLSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException ROLSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName ROLSERVICEIMPLSERVICE_QNAME = new QName("http://impl.service.mitocode.com/", "RolServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SOAPMiniBlog/RolServiceImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ROLSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        ROLSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public RolServiceImplService() {
        super(__getWsdlLocation(), ROLSERVICEIMPLSERVICE_QNAME);
    }

    public RolServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ROLSERVICEIMPLSERVICE_QNAME, features);
    }

    public RolServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, ROLSERVICEIMPLSERVICE_QNAME);
    }

    public RolServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ROLSERVICEIMPLSERVICE_QNAME, features);
    }

    public RolServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RolServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RolServiceImpl
     */
    @WebEndpoint(name = "RolServiceImplPort")
    public RolServiceImpl getRolServiceImplPort() {
        return super.getPort(new QName("http://impl.service.mitocode.com/", "RolServiceImplPort"), RolServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RolServiceImpl
     */
    @WebEndpoint(name = "RolServiceImplPort")
    public RolServiceImpl getRolServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.service.mitocode.com/", "RolServiceImplPort"), RolServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ROLSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw ROLSERVICEIMPLSERVICE_EXCEPTION;
        }
        return ROLSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
