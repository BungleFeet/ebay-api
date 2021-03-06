package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Response for deleting a Selling Manager product.
 * <p/>
 * <p/>
 * <p>Java class for DeleteSellingManagerProductResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="DeleteSellingManagerProductResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="DeletedSellingManagerProductDetails" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteSellingManagerProductResponseType", propOrder = {
        "deletedSellingManagerProductDetails"
})
@XmlRootElement(name = "DeleteSellingManagerProductResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class DeleteSellingManagerProductResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DeletedSellingManagerProductDetails")
    protected SellingManagerProductDetailsType deletedSellingManagerProductDetails;

    /**
     * Gets the value of the deletedSellingManagerProductDetails property.
     *
     * @return possible object is
     *         {@link SellingManagerProductDetailsType }
     */
    public SellingManagerProductDetailsType getDeletedSellingManagerProductDetails() {
        return deletedSellingManagerProductDetails;
    }

    /**
     * Sets the value of the deletedSellingManagerProductDetails property.
     *
     * @param value allowed object is
     *              {@link SellingManagerProductDetailsType }
     */
    public void setDeletedSellingManagerProductDetails(SellingManagerProductDetailsType value) {
        this.deletedSellingManagerProductDetails = value;
    }

}
