
package webservice;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Correo", targetNamespace = "http://WebService/", wsdlLocation = "http://localhost:8080/ServidorWebPractica/Correo?wsdl")
public class Correo_Service
    extends Service
{

    private final static URL CORREO_WSDL_LOCATION;
    private final static WebServiceException CORREO_EXCEPTION;
    private final static QName CORREO_QNAME = new QName("http://WebService/", "Correo");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServidorWebPractica/Correo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CORREO_WSDL_LOCATION = url;
        CORREO_EXCEPTION = e;
    }

    public Correo_Service() {
        super(__getWsdlLocation(), CORREO_QNAME);
    }

    public Correo_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CORREO_QNAME, features);
    }

    public Correo_Service(URL wsdlLocation) {
        super(wsdlLocation, CORREO_QNAME);
    }

    public Correo_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CORREO_QNAME, features);
    }

    public Correo_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Correo_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Correo
     */
    @WebEndpoint(name = "CorreoPort")
    public Correo getCorreoPort() {
        return super.getPort(new QName("http://WebService/", "CorreoPort"), Correo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Correo
     */
    @WebEndpoint(name = "CorreoPort")
    public Correo getCorreoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebService/", "CorreoPort"), Correo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CORREO_EXCEPTION!= null) {
            throw CORREO_EXCEPTION;
        }
        return CORREO_WSDL_LOCATION;
    }

}
