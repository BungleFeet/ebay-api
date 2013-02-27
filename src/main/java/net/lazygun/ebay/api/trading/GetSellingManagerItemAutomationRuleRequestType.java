package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Retrieves the set of Selling Manager automation rules
 * associated with an item.
 * This call is subject to change without notice; the
 * deprecation process is inapplicable to this call.
 * <p/>
 * <p/>
 * <p>Java class for GetSellingManagerItemAutomationRuleRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetSellingManagerItemAutomationRuleRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerItemAutomationRuleRequestType", propOrder = {
        "itemID"
})
@XmlRootElement(name = "GetSellingManagerItemAutomationRuleRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerItemAutomationRuleRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemID")
    protected String itemID;

    /**
     * Gets the value of the itemID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

}
