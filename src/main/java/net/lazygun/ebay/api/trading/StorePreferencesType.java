package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Store Preferences type.
 * <p/>
 * <p/>
 * <p>Java class for StorePreferencesType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="StorePreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VacationPreferences" type="{urn:ebay:apis:eBLBaseComponents}StoreVacationPreferencesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorePreferencesType", propOrder = {
        "vacationPreferences"
})
public class StorePreferencesType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "VacationPreferences")
    protected StoreVacationPreferencesType vacationPreferences;

    /**
     * Gets the value of the vacationPreferences property.
     *
     * @return possible object is
     *         {@link StoreVacationPreferencesType }
     */
    public StoreVacationPreferencesType getVacationPreferences() {
        return vacationPreferences;
    }

    /**
     * Sets the value of the vacationPreferences property.
     *
     * @param value allowed object is
     *              {@link StoreVacationPreferencesType }
     */
    public void setVacationPreferences(StoreVacationPreferencesType value) {
        this.vacationPreferences = value;
    }

}
