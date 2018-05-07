
package com.sap.document.sap.rfc.functions;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ZBC_EVENT_RAISE.Exception", targetNamespace = "urn:sap-com:document:sap:rfc:functions")
public class ZBCEVENTRAISEException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ZBCEVENTRAISERfcException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ZBCEVENTRAISEException(String message, ZBCEVENTRAISERfcException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ZBCEVENTRAISEException(String message, ZBCEVENTRAISERfcException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.sap.document.sap.rfc.functions.ZBCEVENTRAISERfcException
     */
    public ZBCEVENTRAISERfcException getFaultInfo() {
        return faultInfo;
    }

}