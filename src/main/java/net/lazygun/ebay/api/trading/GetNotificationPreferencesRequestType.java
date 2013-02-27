package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Retrieves the requesting application's notification preferences. Details are only returned for events for which a
 * preference has been set. For example, if you enabled notification for the EndOfAuction event and later disabled it,
 * the GetNotificationPreferences response would cite the EndOfAuction event preference as Disabled. Otherwise, no
 * details would be returned regarding EndOfAuction.
 * <p/>
 * <p/>
 * <p>Java class for GetNotificationPreferencesRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetNotificationPreferencesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="PreferenceLevel" type="{urn:ebay:apis:eBLBaseComponents}NotificationRoleCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNotificationPreferencesRequestType", propOrder = {
        "preferenceLevel"
})
@XmlRootElement(name = "GetNotificationPreferencesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetNotificationPreferencesRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PreferenceLevel")
    protected NotificationRoleCodeType preferenceLevel;

    /**
     * Gets the value of the preferenceLevel property.
     *
     * @return possible object is
     *         {@link NotificationRoleCodeType }
     */
    public NotificationRoleCodeType getPreferenceLevel() {
        return preferenceLevel;
    }

    /**
     * Sets the value of the preferenceLevel property.
     *
     * @param value allowed object is
     *              {@link NotificationRoleCodeType }
     */
    public void setPreferenceLevel(NotificationRoleCodeType value) {
        this.preferenceLevel = value;
    }

}
