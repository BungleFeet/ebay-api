package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredSellerActionCodeType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="RequiredSellerActionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ResolveeBPCase"/>
 *     &lt;enumeration value="MarkAsShipped"/>
 *     &lt;enumeration value="ContacteBayCS"/>
 *     &lt;enumeration value="ResolvePPPIcase"/>
 *     &lt;enumeration value="SetupPayoutMethod"/>
 *     &lt;enumeration value="UpdatePayoutMethod"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RequiredSellerActionCodeType")
@XmlEnum
public enum RequiredSellerActionCodeType {


    /**
     * This value indicates that there is an open eBay Buyer Protection case involving
     * the DE/AT seller and the item. The seller must address and get the case resolved before
     * the funds can be scheduled for release to the seller's account.
     * See the <a href="http://developer.ebay.com/DevZone/resolution-case-management/Concepts/ResoCaseAPIGuide.html">Resolution Case Management API User Guide</a>
     * for information about retrieving and managing eBay Buyer Protection cases.
     */
    @XmlEnumValue("ResolveeBPCase")
    RESOLVEE_BP_CASE("ResolveeBPCase"),

    /**
     * This value indicates that the DE/AT seller must mark the order line item as shipped.
     * The seller can use the CompleteSale call to perform this action.
     */
    @XmlEnumValue("MarkAsShipped")
    MARK_AS_SHIPPED("MarkAsShipped"),

    /**
     * This value indicates that the DE/AT seller should contact eBay Customer Support to discover
     * the next required action.
     */
    @XmlEnumValue("ContacteBayCS")
    CONTACTE_BAY_CS("ContacteBayCS"),

    /**
     * This value indicates that the DE/AT seller must resolve PayPal Buyer Protection case.
     */
    @XmlEnumValue("ResolvePPPIcase")
    RESOLVE_PPP_ICASE("ResolvePPPIcase"),

    /**
     * This value indicates that the DE/AT seller must set up a valid payout account in order
     * to receive seller payouts.
     */
    @XmlEnumValue("SetupPayoutMethod")
    SETUP_PAYOUT_METHOD("SetupPayoutMethod"),

    /**
     * This value indicates that the DE/AT seller must update to a valid payout account in order
     * to receive seller payouts.
     */
    @XmlEnumValue("UpdatePayoutMethod")
    UPDATE_PAYOUT_METHOD("UpdatePayoutMethod"),

    /**
     * This value indicates that there is no action required from the DE/AT seller
     * to expedite seller payouts.
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * Reserved for internal or future use.
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    RequiredSellerActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequiredSellerActionCodeType fromValue(String v) {
        for (RequiredSellerActionCodeType c : RequiredSellerActionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
