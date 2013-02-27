package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * No longer recommended.
 * <p/>
 * <p/>
 * <p>Java class for GetItemRecommendationsRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetItemRecommendationsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="GetRecommendationsRequestContainer" type="{urn:ebay:apis:eBLBaseComponents}GetRecommendationsRequestContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemRecommendationsRequestType", propOrder = {
        "getRecommendationsRequestContainer"
})
@XmlRootElement(name = "GetItemRecommendationsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetItemRecommendationsRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "GetRecommendationsRequestContainer")
    protected List<GetRecommendationsRequestContainerType> getRecommendationsRequestContainer;

    /**
     * @return array of
     *         {@link GetRecommendationsRequestContainerType }
     */
    public GetRecommendationsRequestContainerType[] getGetRecommendationsRequestContainer() {
        if (this.getRecommendationsRequestContainer == null) {
            return new GetRecommendationsRequestContainerType[0];
        }
        return ((GetRecommendationsRequestContainerType[]) this.getRecommendationsRequestContainer.toArray(new GetRecommendationsRequestContainerType[this.getRecommendationsRequestContainer.size()]));
    }

    /**
     * @return one of
     *         {@link GetRecommendationsRequestContainerType }
     */
    public GetRecommendationsRequestContainerType getGetRecommendationsRequestContainer(int idx) {
        if (this.getRecommendationsRequestContainer == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.getRecommendationsRequestContainer.get(idx);
    }

    public int getGetRecommendationsRequestContainerLength() {
        if (this.getRecommendationsRequestContainer == null) {
            return 0;
        }
        return this.getRecommendationsRequestContainer.size();
    }

    /**
     * @param values allowed objects are
     *               {@link GetRecommendationsRequestContainerType }
     */
    public void setGetRecommendationsRequestContainer(GetRecommendationsRequestContainerType[] values) {
        this._getGetRecommendationsRequestContainer().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.getRecommendationsRequestContainer.add(values[i]);
        }
    }

    protected List<GetRecommendationsRequestContainerType> _getGetRecommendationsRequestContainer() {
        if (getRecommendationsRequestContainer == null) {
            getRecommendationsRequestContainer = new ArrayList<GetRecommendationsRequestContainerType>();
        }
        return getRecommendationsRequestContainer;
    }

    /**
     * @param value allowed object is
     *              {@link GetRecommendationsRequestContainerType }
     */
    public GetRecommendationsRequestContainerType setGetRecommendationsRequestContainer(int idx, GetRecommendationsRequestContainerType value) {
        return this.getRecommendationsRequestContainer.set(idx, value);
    }

}
