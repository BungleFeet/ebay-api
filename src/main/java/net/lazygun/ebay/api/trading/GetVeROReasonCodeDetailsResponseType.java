package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Contains the reason codes for all sites.
 * <p/>
 * <p/>
 * <p>Java class for GetVeROReasonCodeDetailsResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetVeROReasonCodeDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="VeROReasonCodeDetails" type="{urn:ebay:apis:eBLBaseComponents}VeROReasonCodeDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetVeROReasonCodeDetailsResponseType", propOrder = {
        "veROReasonCodeDetails"
})
@XmlRootElement(name = "GetVeROReasonCodeDetailsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetVeROReasonCodeDetailsResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "VeROReasonCodeDetails")
    protected VeROReasonCodeDetailsType veROReasonCodeDetails;

    /**
     * Gets the value of the veROReasonCodeDetails property.
     *
     * @return possible object is
     *         {@link VeROReasonCodeDetailsType }
     */
    public VeROReasonCodeDetailsType getVeROReasonCodeDetails() {
        return veROReasonCodeDetails;
    }

    /**
     * Sets the value of the veROReasonCodeDetails property.
     *
     * @param value allowed object is
     *              {@link VeROReasonCodeDetailsType }
     */
    public void setVeROReasonCodeDetails(VeROReasonCodeDetailsType value) {
        this.veROReasonCodeDetails = value;
    }

}
