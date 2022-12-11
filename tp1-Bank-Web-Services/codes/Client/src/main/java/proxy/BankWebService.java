
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "BankWebService", targetNamespace = "http://tp1/", wsdlLocation = "http://localhost:9191/BankWebService?wsdl")
public class BankWebService
    extends Service
{

    private final static URL BANKWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException BANKWEBSERVICE_EXCEPTION;
    private final static QName BANKWEBSERVICE_QNAME = new QName("http://tp1/", "BankWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9191/BankWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKWEBSERVICE_WSDL_LOCATION = url;
        BANKWEBSERVICE_EXCEPTION = e;
    }

    public BankWebService() {
        super(__getWsdlLocation(), BANKWEBSERVICE_QNAME);
    }

    public BankWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKWEBSERVICE_QNAME, features);
    }

    public BankWebService(URL wsdlLocation) {
        super(wsdlLocation, BANKWEBSERVICE_QNAME);
    }

    public BankWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKWEBSERVICE_QNAME, features);
    }

    public BankWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BankService
     */
    @WebEndpoint(name = "BankServicePort")
    public BankService getBankServicePort() {
        return super.getPort(new QName("http://tp1/", "BankServicePort"), BankService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankService
     */
    @WebEndpoint(name = "BankServicePort")
    public BankService getBankServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://tp1/", "BankServicePort"), BankService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKWEBSERVICE_EXCEPTION!= null) {
            throw BANKWEBSERVICE_EXCEPTION;
        }
        return BANKWEBSERVICE_WSDL_LOCATION;
    }

}