package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerPIStatusCodeType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="SellerPIStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AcceptedUA"/>
 *     &lt;enumeration value="MustAcceptUA"/>
 *     &lt;enumeration value="PIEnabled"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "SellerPIStatusCodeType")
@XmlEnum
public enum SellerPIStatusCodeType {


    /**
     * This value indicates that the new DE or AT seller has accepted the user agreement
     * related to the new payment process, but the new payment process has yet to be
     * fully implemented on the seller's account. The new payment process for the DE and
     * AT sites is scheduled to be implemented in late August 2011.
     */
    @XmlEnumValue("AcceptedUA")
    ACCEPTED_UA("AcceptedUA"),

    /**
     * This value indicates that the new DE or AT seller has yet to accept the user
     * agreement related to the new payment process. This new seller will be blocked
     * from listing on the DE and AT sites until he accepts the user agreement.  The new
     * payment process for the DE and AT sites is scheduled to be implemented in late
     * August 2011.
     */
    @XmlEnumValue("MustAcceptUA")
    MUST_ACCEPT_UA("MustAcceptUA"),

    /**
     * This value indicates that the new DE or AT seller has accepted the user
     * agreement related to the new payment process and the new payment process is
     * fully implemented on the seller's account. The new payment process for the DE
     * and AT sites is scheduled to be implemented in late August 2011.
     */
    @XmlEnumValue("PIEnabled")
    PI_ENABLED("PIEnabled"),

    /**
     * Reserved for internal or future use
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellerPIStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellerPIStatusCodeType fromValue(String v) {
        for (SellerPIStatusCodeType c : SellerPIStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
