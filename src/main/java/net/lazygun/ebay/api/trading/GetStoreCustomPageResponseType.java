package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Contains the custom page or pages for the user's Store.
 * <p/>
 * <p/>
 * <p>Java class for GetStoreCustomPageResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetStoreCustomPageResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CustomPageArray" type="{urn:ebay:apis:eBLBaseComponents}StoreCustomPageArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStoreCustomPageResponseType", propOrder = {
        "customPageArray"
})
@XmlRootElement(name = "GetStoreCustomPageResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetStoreCustomPageResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CustomPageArray")
    protected StoreCustomPageArrayType customPageArray;

    /**
     * Gets the value of the customPageArray property.
     *
     * @return possible object is
     *         {@link StoreCustomPageArrayType }
     */
    public StoreCustomPageArrayType getCustomPageArray() {
        return customPageArray;
    }

    /**
     * Sets the value of the customPageArray property.
     *
     * @param value allowed object is
     *              {@link StoreCustomPageArrayType }
     */
    public void setCustomPageArray(StoreCustomPageArrayType value) {
        this.customPageArray = value;
    }

}
