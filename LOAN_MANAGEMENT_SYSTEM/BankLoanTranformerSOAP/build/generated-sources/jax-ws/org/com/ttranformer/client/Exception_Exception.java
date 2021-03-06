
package org.com.ttranformer.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://jws.union.com.org/")
public class Exception_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private org.com.ttranformer.client.Exception faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Exception_Exception(String message, org.com.ttranformer.client.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public Exception_Exception(String message, org.com.ttranformer.client.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.com.ttranformer.client.Exception
     */
    public org.com.ttranformer.client.Exception getFaultInfo() {
        return faultInfo;
    }

}
