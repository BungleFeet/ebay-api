package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Defines and lists a new fixed-price listing (not auction-style listings).
 * The main difference between AddFixedPriceItem and AddItem is that
 * AddFixedPriceItem supports the creation of fixed-price listings only,
 * whereas AddItem supports all listing formats.<br>
 * <br>
 * Also, only AddFixedPriceItem supports multi-variation listings
 * and tracking inventory by SKU. AddItem does not support
 * Variations or InventoryTrackingMethod.<br>
 * <br>
 * See the AddFixedPriceItem documentation for additional information.
 * <p/>
 * <p/>
 * <p>Java class for AddFixedPriceItemRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="AddFixedPriceItemRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddFixedPriceItemRequestType", propOrder = {
        "item"
})
@XmlRootElement(name = "AddFixedPriceItemRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddFixedPriceItemRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Item")
    protected ItemType item;

    /**
     * Gets the value of the item property.
     *
     * @return possible object is
     *         {@link ItemType }
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     *
     * @param value allowed object is
     *              {@link ItemType }
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

}
