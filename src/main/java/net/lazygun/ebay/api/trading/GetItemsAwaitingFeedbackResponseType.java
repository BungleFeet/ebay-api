package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Response to GetItemsAwaitingFeedback.
 * <p/>
 * <p/>
 * <p>Java class for GetItemsAwaitingFeedbackResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetItemsAwaitingFeedbackResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ItemsAwaitingFeedback" type="{urn:ebay:apis:eBLBaseComponents}PaginatedTransactionArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemsAwaitingFeedbackResponseType", propOrder = {
        "itemsAwaitingFeedback"
})
@XmlRootElement(name = "GetItemsAwaitingFeedbackResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetItemsAwaitingFeedbackResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ItemsAwaitingFeedback")
    protected PaginatedTransactionArrayType itemsAwaitingFeedback;

    /**
     * Gets the value of the itemsAwaitingFeedback property.
     *
     * @return possible object is
     *         {@link PaginatedTransactionArrayType }
     */
    public PaginatedTransactionArrayType getItemsAwaitingFeedback() {
        return itemsAwaitingFeedback;
    }

    /**
     * Sets the value of the itemsAwaitingFeedback property.
     *
     * @param value allowed object is
     *              {@link PaginatedTransactionArrayType }
     */
    public void setItemsAwaitingFeedback(PaginatedTransactionArrayType value) {
        this.itemsAwaitingFeedback = value;
    }

}
