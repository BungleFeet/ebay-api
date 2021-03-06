package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Retrieves a list of high bidders for the Dutch auction specified in the ItemId
 * property of the request. A seller specifies a unique item ID in this call to
 * determine which buyers are winning bidders and how many items each buyer can
 * purchase. Note that bidder information is anonymous to everyone except the bidder and
 * the seller during an active auction.
 * <p/>
 * <p/>
 * <p>Java class for GetHighBiddersRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetHighBiddersRequestType">
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
@XmlType(name = "GetHighBiddersRequestType", propOrder = {
        "itemID"
})
@XmlRootElement(name = "GetHighBiddersRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetHighBiddersRequestType
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
