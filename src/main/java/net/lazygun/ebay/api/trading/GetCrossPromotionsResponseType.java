package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * eBay Store Cross Promotions are no longer supported in the Trading API, so the
 * <b>CrossPromotion</b> container will either not be returned, or, if it is
 * returned, the data in the container may not be accurate. Returns a list of either upsell or cross-sell items for a given item ID.
 * The list can be filtered by the viewer's role, either buyer or seller.
 * <p/>
 * <p/>
 * <p>Java class for GetCrossPromotionsResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetCrossPromotionsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CrossPromotion" type="{urn:ebay:apis:eBLBaseComponents}CrossPromotionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCrossPromotionsResponseType", propOrder = {
        "crossPromotion"
})
@XmlRootElement(name = "GetCrossPromotionsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCrossPromotionsResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CrossPromotion")
    protected CrossPromotionsType crossPromotion;

    /**
     * Gets the value of the crossPromotion property.
     *
     * @return possible object is
     *         {@link CrossPromotionsType }
     */
    public CrossPromotionsType getCrossPromotion() {
        return crossPromotion;
    }

    /**
     * Sets the value of the crossPromotion property.
     *
     * @param value allowed object is
     *              {@link CrossPromotionsType }
     */
    public void setCrossPromotion(CrossPromotionsType value) {
        this.crossPromotion = value;
    }

}
