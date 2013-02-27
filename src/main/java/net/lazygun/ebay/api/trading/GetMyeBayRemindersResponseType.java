package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Returns totals of various reminder types from the user's My eBay account.
 * <p/>
 * <p/>
 * <p>Java class for GetMyeBayRemindersResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetMyeBayRemindersResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="BuyingReminders" type="{urn:ebay:apis:eBLBaseComponents}RemindersType" minOccurs="0"/>
 *         &lt;element name="SellingReminders" type="{urn:ebay:apis:eBLBaseComponents}RemindersType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMyeBayRemindersResponseType", propOrder = {
        "buyingReminders",
        "sellingReminders"
})
@XmlRootElement(name = "GetMyeBayRemindersResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetMyeBayRemindersResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BuyingReminders")
    protected RemindersType buyingReminders;
    @XmlElement(name = "SellingReminders")
    protected RemindersType sellingReminders;

    /**
     * Gets the value of the buyingReminders property.
     *
     * @return possible object is
     *         {@link RemindersType }
     */
    public RemindersType getBuyingReminders() {
        return buyingReminders;
    }

    /**
     * Sets the value of the buyingReminders property.
     *
     * @param value allowed object is
     *              {@link RemindersType }
     */
    public void setBuyingReminders(RemindersType value) {
        this.buyingReminders = value;
    }

    /**
     * Gets the value of the sellingReminders property.
     *
     * @return possible object is
     *         {@link RemindersType }
     */
    public RemindersType getSellingReminders() {
        return sellingReminders;
    }

    /**
     * Sets the value of the sellingReminders property.
     *
     * @param value allowed object is
     *              {@link RemindersType }
     */
    public void setSellingReminders(RemindersType value) {
        this.sellingReminders = value;
    }

}
