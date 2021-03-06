package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogoTypeCodeType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="LogoTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="WinningBidderNotice"/>
 *     &lt;enumeration value="Store"/>
 *     &lt;enumeration value="Custom"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "LogoTypeCodeType")
@XmlEnum
public enum LogoTypeCodeType {


    /**
     * The PayPal Winning Bidder Notice logo.
     */
    @XmlEnumValue("WinningBidderNotice")
    WINNING_BIDDER_NOTICE("WinningBidderNotice"),

    /**
     * The seller's eBay Store logo.
     */
    @XmlEnumValue("Store")
    STORE("Store"),

    /**
     * A custom logo specified in LogoURL.
     */
    @XmlEnumValue("Custom")
    CUSTOM("Custom"),

    /**
     * Reserved for internal or future use.
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    LogoTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogoTypeCodeType fromValue(String v) {
        for (LogoTypeCodeType c : LogoTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
