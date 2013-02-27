package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Contains a response of the resulting status of ending each item.
 * <p/>
 * <p/>
 * <p>Java class for EndItemsResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="EndItemsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="EndItemResponseContainer" type="{urn:ebay:apis:eBLBaseComponents}EndItemResponseContainerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndItemsResponseType", propOrder = {
        "endItemResponseContainer"
})
@XmlRootElement(name = "EndItemsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class EndItemsResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EndItemResponseContainer")
    protected List<EndItemResponseContainerType> endItemResponseContainer;

    /**
     * @return array of
     *         {@link EndItemResponseContainerType }
     */
    public EndItemResponseContainerType[] getEndItemResponseContainer() {
        if (this.endItemResponseContainer == null) {
            return new EndItemResponseContainerType[0];
        }
        return ((EndItemResponseContainerType[]) this.endItemResponseContainer.toArray(new EndItemResponseContainerType[this.endItemResponseContainer.size()]));
    }

    /**
     * @return one of
     *         {@link EndItemResponseContainerType }
     */
    public EndItemResponseContainerType getEndItemResponseContainer(int idx) {
        if (this.endItemResponseContainer == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.endItemResponseContainer.get(idx);
    }

    public int getEndItemResponseContainerLength() {
        if (this.endItemResponseContainer == null) {
            return 0;
        }
        return this.endItemResponseContainer.size();
    }

    /**
     * @param values allowed objects are
     *               {@link EndItemResponseContainerType }
     */
    public void setEndItemResponseContainer(EndItemResponseContainerType[] values) {
        this._getEndItemResponseContainer().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.endItemResponseContainer.add(values[i]);
        }
    }

    protected List<EndItemResponseContainerType> _getEndItemResponseContainer() {
        if (endItemResponseContainer == null) {
            endItemResponseContainer = new ArrayList<EndItemResponseContainerType>();
        }
        return endItemResponseContainer;
    }

    /**
     * @param value allowed object is
     *              {@link EndItemResponseContainerType }
     */
    public EndItemResponseContainerType setEndItemResponseContainer(int idx, EndItemResponseContainerType value) {
        return this.endItemResponseContainer.set(idx, value);
    }

}
