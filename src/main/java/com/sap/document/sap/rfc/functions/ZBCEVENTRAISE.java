
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
 *         &lt;element name="EVENTID" type="{urn:sap-com:document:sap:rfc:functions}char32"/>
 *         &lt;element name="EVENTPARM" type="{urn:sap-com:document:sap:rfc:functions}char64" minOccurs="0"/>
 *         &lt;element name="TARGET_INSTANCE" type="{urn:sap-com:document:sap:rfc:functions}char40" minOccurs="0"/>
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
    "eventid",
    "eventparm",
    "targetinstance"
})
@XmlRootElement(name = "ZBC_EVENT_RAISE")
public class ZBCEVENTRAISE {

    @XmlElement(name = "EVENTID", required = true)
    protected String eventid;
    @XmlElement(name = "EVENTPARM")
    protected String eventparm;
    @XmlElement(name = "TARGET_INSTANCE")
    protected String targetinstance;

    /**
     * Gets the value of the eventid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENTID() {
        return eventid;
    }

    /**
     * Sets the value of the eventid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENTID(String value) {
        this.eventid = value;
    }

    /**
     * Gets the value of the eventparm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENTPARM() {
        return eventparm;
    }

    /**
     * Sets the value of the eventparm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENTPARM(String value) {
        this.eventparm = value;
    }

    /**
     * Gets the value of the targetinstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTARGETINSTANCE() {
        return targetinstance;
    }

    /**
     * Sets the value of the targetinstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTARGETINSTANCE(String value) {
        this.targetinstance = value;
    }

}
