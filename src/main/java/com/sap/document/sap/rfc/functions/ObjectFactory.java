
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sap.document.sap.rfc.functions package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ZBCEVENTRAISEException_QNAME = new QName("urn:sap-com:document:sap:rfc:functions", "ZBC_EVENT_RAISE.Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sap.document.sap.rfc.functions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ZBCEVENTRAISERfcException }
     * 
     */
    public ZBCEVENTRAISERfcException createZBCEVENTRAISERfcException() {
        return new ZBCEVENTRAISERfcException();
    }

    /**
     * Create an instance of {@link ZBCEVENTRAISEResponse }
     * 
     */
    public ZBCEVENTRAISEResponse createZBCEVENTRAISEResponse() {
        return new ZBCEVENTRAISEResponse();
    }

    /**
     * Create an instance of {@link ZBCEVENTRAISE }
     * 
     */
    public ZBCEVENTRAISE createZBCEVENTRAISE() {
        return new ZBCEVENTRAISE();
    }

    /**
     * Create an instance of {@link RfcExceptionMessage }
     * 
     */
    public RfcExceptionMessage createRfcExceptionMessage() {
        return new RfcExceptionMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZBCEVENTRAISERfcException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sap-com:document:sap:rfc:functions", name = "ZBC_EVENT_RAISE.Exception")
    public JAXBElement<ZBCEVENTRAISERfcException> createZBCEVENTRAISEException(ZBCEVENTRAISERfcException value) {
        return new JAXBElement<ZBCEVENTRAISERfcException>(_ZBCEVENTRAISEException_QNAME, ZBCEVENTRAISERfcException.class, null, value);
    }

}
