package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Sets the preferences for a user's eBay Store.
 * <p/>
 * <p/>
 * <p>Java class for SetStorePreferencesRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="SetStorePreferencesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="StorePreferences" type="{urn:ebay:apis:eBLBaseComponents}StorePreferencesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetStorePreferencesRequestType", propOrder = {
        "storePreferences"
})
@XmlRootElement(name = "SetStorePreferencesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetStorePreferencesRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "StorePreferences")
    protected StorePreferencesType storePreferences;

    /**
     * Gets the value of the storePreferences property.
     *
     * @return possible object is
     *         {@link StorePreferencesType }
     */
    public StorePreferencesType getStorePreferences() {
        return storePreferences;
    }

    /**
     * Sets the value of the storePreferences property.
     *
     * @param value allowed object is
     *              {@link StorePreferencesType }
     */
    public void setStorePreferences(StorePreferencesType value) {
        this.storePreferences = value;
    }

}
