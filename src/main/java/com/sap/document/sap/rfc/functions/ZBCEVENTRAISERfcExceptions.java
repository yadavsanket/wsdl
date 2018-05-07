
package com.sap.document.sap.rfc.functions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZBC_EVENT_RAISE.RfcExceptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ZBC_EVENT_RAISE.RfcExceptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BAD_EVENTID"/>
 *     &lt;enumeration value="EVENTID_DOES_NOT_EXIST"/>
 *     &lt;enumeration value="EVENTID_MISSING"/>
 *     &lt;enumeration value="RAISE_FAILED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ZBC_EVENT_RAISE.RfcExceptions")
@XmlEnum
public enum ZBCEVENTRAISERfcExceptions {

    BAD_EVENTID,
    EVENTID_DOES_NOT_EXIST,
    EVENTID_MISSING,
    RAISE_FAILED;

    public String value() {
        return name();
    }

    public static ZBCEVENTRAISERfcExceptions fromValue(String v) {
        return valueOf(v);
    }

}
