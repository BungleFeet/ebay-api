package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Contains a list of BestOffers that were either accepted or declined.
 * <p/>
 * <p/>
 * <p>Java class for RespondToBestOfferResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="RespondToBestOfferResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="RespondToBestOffer" type="{urn:ebay:apis:eBLBaseComponents}BestOfferArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespondToBestOfferResponseType", propOrder = {
        "respondToBestOffer"
})
@XmlRootElement(name = "RespondToBestOfferResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class RespondToBestOfferResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "RespondToBestOffer")
    protected BestOfferArrayType respondToBestOffer;

    /**
     * Gets the value of the respondToBestOffer property.
     *
     * @return possible object is
     *         {@link BestOfferArrayType }
     */
    public BestOfferArrayType getRespondToBestOffer() {
        return respondToBestOffer;
    }

    /**
     * Sets the value of the respondToBestOffer property.
     *
     * @param value allowed object is
     *              {@link BestOfferArrayType }
     */
    public void setRespondToBestOffer(BestOfferArrayType value) {
        this.respondToBestOffer = value;
    }

}
