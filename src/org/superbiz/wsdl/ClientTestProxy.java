package org.superbiz.wsdl;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.frontend.ClientProxyFactoryBean;



import javax.xml.namespace.QName;

public class ClientTestProxy {

	private static final QName SERVICE_NAME = new QName("http://ratingfacade.v1.swidCCH.ubs.com", "RatingEngineWebserviceSFService");

    private ClientTestProxy() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        //URL wsdlURL = RatingEngineWebserviceSFService.WSDL_LOCATION;
    	URL wsdlURL = CalculatorService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        //RatingEngineWebserviceSFService ss = new RatingEngineWebserviceSFService(wsdlURL, SERVICE_NAME);
        
        ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
        factory.setServiceClass(CalculatorWs.class);
       
        
        
        HashMap p = new HashMap();
        p.put("set-jaxb-validation-event-handler", new String("false"));
        factory.setProperties(p);
        
        //factory.getBus().setProperty("set-jaxb-validation-event-handler", "false");
        
        factory.setAddress("http://localhost:9080/RouterWebProject/CalculatorService");
        CalculatorWs client = (CalculatorWs) factory.create();
        
        System.out.println(" ========== SERVICE ========= 1 " + client.multiply(33, 33));
        
        
        //CalculateCPRatingsInWSDTO inDTO = new CalculateCPRatingsInWSDTO();
        
        System.out.println(" ========== SERVICE ========= 2");
      //  System.out.println(" ========== SERVICE ========= 3 " + (CalculateCPRatingsOutWSDTO)client.calculateCPRatings(inDTO));       
        
       
 }
}