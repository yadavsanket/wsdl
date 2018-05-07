
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EV_SUCCESS" type="{urn:sap-com:document:sap:rfc:functions}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "evsuccess"
})
@XmlRootElement(name = "ZBC_EVENT_RAISEResponse")
public class ZBCEVENTRAISEResponse {

    @XmlElement(name = "EV_SUCCESS", required = true)
    protected String evsuccess;

    /**
     * Gets the value of the evsuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVSUCCESS() {
        return evsuccess;
    }

    /**
     * Sets the value of the evsuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVSUCCESS(String value) {
        this.evsuccess = value;
    }

}
