package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Response for revising a Selling Manager product.
 * <p/>
 * <p/>
 * <p>Java class for ReviseSellingManagerProductResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ReviseSellingManagerProductResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="SellingManagerProductDetails" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerProductDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviseSellingManagerProductResponseType", propOrder = {
        "sellingManagerProductDetails"
})
@XmlRootElement(name = "ReviseSellingManagerProductResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ReviseSellingManagerProductResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SellingManagerProductDetails")
    protected SellingManagerProductDetailsType sellingManagerProductDetails;

    /**
     * Gets the value of the sellingManagerProductDetails property.
     *
     * @return possible object is
     *         {@link SellingManagerProductDetailsType }
     */
    public SellingManagerProductDetailsType getSellingManagerProductDetails() {
        return sellingManagerProductDetails;
    }

    /**
     * Sets the value of the sellingManagerProductDetails property.
     *
     * @param value allowed object is
     *              {@link SellingManagerProductDetailsType }
     */
    public void setSellingManagerProductDetails(SellingManagerProductDetailsType value) {
        this.sellingManagerProductDetails = value;
    }

}
