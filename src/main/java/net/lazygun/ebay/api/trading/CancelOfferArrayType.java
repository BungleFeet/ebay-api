package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Container for a list of offers. May contain zero, one, or multiple
 * OfferType objects, each of which represents one offer extended by
 * a user on a listing.
 * <p/>
 * <p/>
 * <p>Java class for CancelOfferArrayType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="CancelOfferArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelOffer" type="{urn:ebay:apis:eBLBaseComponents}CancelOfferType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelOfferArrayType", propOrder = {
        "cancelOffer",
        "any"
})
public class CancelOfferArrayType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CancelOffer")
    protected List<CancelOfferType> cancelOffer;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * @return array of
     *         {@link CancelOfferType }
     */
    public CancelOfferType[] getCancelOffer() {
        if (this.cancelOffer == null) {
            return new CancelOfferType[0];
        }
        return ((CancelOfferType[]) this.cancelOffer.toArray(new CancelOfferType[this.cancelOffer.size()]));
    }

    /**
     * @return one of
     *         {@link CancelOfferType }
     */
    public CancelOfferType getCancelOffer(int idx) {
        if (this.cancelOffer == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.cancelOffer.get(idx);
    }

    public int getCancelOfferLength() {
        if (this.cancelOffer == null) {
            return 0;
        }
        return this.cancelOffer.size();
    }

    /**
     * @param values allowed objects are
     *               {@link CancelOfferType }
     */
    public void setCancelOffer(CancelOfferType[] values) {
        this._getCancelOffer().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.cancelOffer.add(values[i]);
        }
    }

    protected List<CancelOfferType> _getCancelOffer() {
        if (cancelOffer == null) {
            cancelOffer = new ArrayList<CancelOfferType>();
        }
        return cancelOffer;
    }

    /**
     * @param value allowed object is
     *              {@link CancelOfferType }
     */
    public CancelOfferType setCancelOffer(int idx, CancelOfferType value) {
        return this.cancelOffer.set(idx, value);
    }

    /**
     * @return array of
     *         {@link Object }
     *         {@link org.w3c.dom.Element }
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[0];
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()]));
    }

    /**
     * @return one of
     *         {@link Object }
     *         {@link org.w3c.dom.Element }
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return 0;
        }
        return this.any.size();
    }

    /**
     * @param values allowed objects are
     *               {@link Object }
     *               {@link org.w3c.dom.Element }
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * @param value allowed object is
     *              {@link Object }
     *              {@link org.w3c.dom.Element }
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}
