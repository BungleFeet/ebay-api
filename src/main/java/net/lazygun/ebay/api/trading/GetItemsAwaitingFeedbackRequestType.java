package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Returns orders in which the user was involved and for which feedback
 * is still needed from either the buyer or seller.
 * <p/>
 * <p/>
 * <p>Java class for GetItemsAwaitingFeedbackRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetItemsAwaitingFeedbackRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Sort" type="{urn:ebay:apis:eBLBaseComponents}ItemSortTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemsAwaitingFeedbackRequestType", propOrder = {
        "sort",
        "pagination"
})
@XmlRootElement(name = "GetItemsAwaitingFeedbackRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetItemsAwaitingFeedbackRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Sort")
    protected ItemSortTypeCodeType sort;
    @XmlElement(name = "Pagination")
    protected PaginationType pagination;

    /**
     * Gets the value of the sort property.
     *
     * @return possible object is
     *         {@link ItemSortTypeCodeType }
     */
    public ItemSortTypeCodeType getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     *
     * @param value allowed object is
     *              {@link ItemSortTypeCodeType }
     */
    public void setSort(ItemSortTypeCodeType value) {
        this.sort = value;
    }

    /**
     * Gets the value of the pagination property.
     *
     * @return possible object is
     *         {@link PaginationType }
     */
    public PaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     *
     * @param value allowed object is
     *              {@link PaginationType }
     */
    public void setPagination(PaginationType value) {
        this.pagination = value;
    }

}
