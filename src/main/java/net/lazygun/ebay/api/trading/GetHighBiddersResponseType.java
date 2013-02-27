package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Returns a list of high bidders for the Dutch auction specified in the
 * ItemId property of the request.
 * <p/>
 * <p/>
 * <p>Java class for GetHighBiddersResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetHighBiddersResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="BidArray" type="{urn:ebay:apis:eBLBaseComponents}OfferArrayType" minOccurs="0"/>
 *         &lt;element name="ListingStatus" type="{urn:ebay:apis:eBLBaseComponents}ListingStatusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHighBiddersResponseType", propOrder = {
        "bidArray",
        "listingStatus"
})
@XmlRootElement(name = "GetHighBiddersResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetHighBiddersResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "BidArray")
    protected OfferArrayType bidArray;
    @XmlElement(name = "ListingStatus")
    protected ListingStatusCodeType listingStatus;

    /**
     * Gets the value of the bidArray property.
     *
     * @return possible object is
     *         {@link OfferArrayType }
     */
    public OfferArrayType getBidArray() {
        return bidArray;
    }

    /**
     * Sets the value of the bidArray property.
     *
     * @param value allowed object is
     *              {@link OfferArrayType }
     */
    public void setBidArray(OfferArrayType value) {
        this.bidArray = value;
    }

    /**
     * Gets the value of the listingStatus property.
     *
     * @return possible object is
     *         {@link ListingStatusCodeType }
     */
    public ListingStatusCodeType getListingStatus() {
        return listingStatus;
    }

    /**
     * Sets the value of the listingStatus property.
     *
     * @param value allowed object is
     *              {@link ListingStatusCodeType }
     */
    public void setListingStatus(ListingStatusCodeType value) {
        this.listingStatus = value;
    }

}
