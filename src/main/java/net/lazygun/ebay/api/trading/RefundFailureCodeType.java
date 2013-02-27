package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundFailureCodeType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="RefundFailureCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PaypalBillingAgreementCanceled"/>
 *     &lt;enumeration value="PaypalRiskDeclinesTransaction"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "RefundFailureCodeType")
@XmlEnum
public enum RefundFailureCodeType {


    /**
     * The seller's billing agreement with PayPal has been cancelled. <br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> RefundFailureCode values are returned
     * (for GetOrders and other order retrieval calls) for DE/AT orders subject to the new
     * eBay payment process.
     * </span>
     */
    @XmlEnumValue("PaypalBillingAgreementCanceled")
    PAYPAL_BILLING_AGREEMENT_CANCELED("PaypalBillingAgreementCanceled"),

    /**
     * Please log in to your PayPal account to proceed with the refund request. <br/><br/>
     * <span class="tablenote">
     * <strong>Note:</strong> RefundFailureCode values are returned
     * (for GetOrders and other order retrieval calls) for DE/AT orders subject to the new
     * eBay payment process.
     * </span>
     */
    @XmlEnumValue("PaypalRiskDeclinesTransaction")
    PAYPAL_RISK_DECLINES_TRANSACTION("PaypalRiskDeclinesTransaction"),

    /**
     * (out) Reserved for internal or future use.
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    RefundFailureCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundFailureCodeType fromValue(String v) {
        for (RefundFailureCodeType c : RefundFailureCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
