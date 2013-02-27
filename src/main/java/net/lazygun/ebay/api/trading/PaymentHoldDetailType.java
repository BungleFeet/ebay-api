package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/**
 * This type defines the <b>PaymentHoldDetails</b> container, which consists of
 * information that can assist DE or AT sellers expedite the payout process for orders that
 * are subject to the new eBay payment process.
 * <p/>
 * <p/>
 * <p>Java class for PaymentHoldDetailType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="PaymentHoldDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExpectedReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RequiredSellerActionArray" type="{urn:ebay:apis:eBLBaseComponents}RequiredSellerActionArrayType" minOccurs="0"/>
 *         &lt;element name="NumOfReqSellerActions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentHoldDetailType", propOrder = {
        "expectedReleaseDate",
        "requiredSellerActionArray",
        "numOfReqSellerActions",
        "any"
})
public class PaymentHoldDetailType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ExpectedReleaseDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar expectedReleaseDate;
    @XmlElement(name = "RequiredSellerActionArray")
    protected RequiredSellerActionArrayType requiredSellerActionArray;
    @XmlElement(name = "NumOfReqSellerActions")
    protected Integer numOfReqSellerActions;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the expectedReleaseDate property.
     *
     * @return possible object is
     *         {@link String }
     */
    public Calendar getExpectedReleaseDate() {
        return expectedReleaseDate;
    }

    /**
     * Sets the value of the expectedReleaseDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExpectedReleaseDate(Calendar value) {
        this.expectedReleaseDate = value;
    }

    /**
     * Gets the value of the requiredSellerActionArray property.
     *
     * @return possible object is
     *         {@link RequiredSellerActionArrayType }
     */
    public RequiredSellerActionArrayType getRequiredSellerActionArray() {
        return requiredSellerActionArray;
    }

    /**
     * Sets the value of the requiredSellerActionArray property.
     *
     * @param value allowed object is
     *              {@link RequiredSellerActionArrayType }
     */
    public void setRequiredSellerActionArray(RequiredSellerActionArrayType value) {
        this.requiredSellerActionArray = value;
    }

    /**
     * Gets the value of the numOfReqSellerActions property.
     *
     * @return possible object is
     *         {@link Integer }
     */
    public Integer getNumOfReqSellerActions() {
        return numOfReqSellerActions;
    }

    /**
     * Sets the value of the numOfReqSellerActions property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setNumOfReqSellerActions(Integer value) {
        this.numOfReqSellerActions = value;
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
