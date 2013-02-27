package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecondChanceOfferDurationCodeType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="SecondChanceOfferDurationCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Days_1"/>
 *     &lt;enumeration value="Days_3"/>
 *     &lt;enumeration value="Days_5"/>
 *     &lt;enumeration value="Days_7"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SecondChanceOfferDurationCodeType")
@XmlEnum
public enum SecondChanceOfferDurationCodeType {


    /**
     * (in) 1 Day.
     */
    @XmlEnumValue("Days_1")
    DAYS_1("Days_1"),

    /**
     * (in) 3 Days.
     */
    @XmlEnumValue("Days_3")
    DAYS_3("Days_3"),

    /**
     * (in) 5 Days.
     */
    @XmlEnumValue("Days_5")
    DAYS_5("Days_5"),

    /**
     * (in) 7 Days.
     */
    @XmlEnumValue("Days_7")
    DAYS_7("Days_7"),

    /**
     * (out) Reserved for internal or future use.
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SecondChanceOfferDurationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecondChanceOfferDurationCodeType fromValue(String v) {
        for (SecondChanceOfferDurationCodeType c : SecondChanceOfferDurationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}