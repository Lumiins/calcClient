package org.superbiz.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.13
 * 2014-04-28T10:02:35.698+02:00
 * Generated source version: 2.6.13
 * 
 */
@WebService(targetNamespace = "http://superbiz.org/wsdl", name = "CalculatorWs")
@XmlSeeAlso({ObjectFactory.class})
public interface CalculatorWs {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sum", targetNamespace = "http://superbiz.org/wsdl", className = "org.superbiz.wsdl.Sum")
    @WebMethod
    @ResponseWrapper(localName = "sumResponse", targetNamespace = "http://superbiz.org/wsdl", className = "org.superbiz.wsdl.SumResponse")
    public int sum(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://superbiz.org/wsdl", className = "org.superbiz.wsdl.Multiply")
    @WebMethod
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://superbiz.org/wsdl", className = "org.superbiz.wsdl.MultiplyResponse")
    public int multiply(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );
}
