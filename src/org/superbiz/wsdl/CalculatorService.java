package org.superbiz.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.13
 * 2014-04-28T10:02:35.710+02:00
 * Generated source version: 2.6.13
 * 
 */
@WebServiceClient(name = "CalculatorService", 
                  wsdlLocation = "http://localhost:9080/RouterWebProject/CalculatorService/CalculatorService.wsdl",
                  targetNamespace = "http://superbiz.org/wsdl") 
public class CalculatorService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://superbiz.org/wsdl", "CalculatorService");
    public final static QName CalculatorPort = new QName("http://superbiz.org/wsdl", "CalculatorPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:9080/RouterWebProject/CalculatorService/CalculatorService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CalculatorService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:9080/RouterWebProject/CalculatorService/CalculatorService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CalculatorService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CalculatorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculatorService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns CalculatorWs
     */
    @WebEndpoint(name = "CalculatorPort")
    public CalculatorWs getCalculatorPort() {
        return super.getPort(CalculatorPort, CalculatorWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorWs
     */
    @WebEndpoint(name = "CalculatorPort")
    public CalculatorWs getCalculatorPort(WebServiceFeature... features) {
        return super.getPort(CalculatorPort, CalculatorWs.class, features);
    }

}
