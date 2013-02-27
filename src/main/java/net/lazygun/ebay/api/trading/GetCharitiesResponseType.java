package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * Contains information about charity nonprofit organizations that meet the
 * criteria specified in the request.
 * <p/>
 * <p/>
 * <p>Java class for GetCharitiesResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetCharitiesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Charity" type="{urn:ebay:apis:eBLBaseComponents}CharityInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCharitiesResponseType", propOrder = {
        "charity"
})
@XmlRootElement(name = "GetCharitiesResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCharitiesResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Charity")
    protected List<CharityInfoType> charity;

    /**
     * @return array of
     *         {@link CharityInfoType }
     */
    public CharityInfoType[] getCharity() {
        if (this.charity == null) {
            return new CharityInfoType[0];
        }
        return ((CharityInfoType[]) this.charity.toArray(new CharityInfoType[this.charity.size()]));
    }

    /**
     * @return one of
     *         {@link CharityInfoType }
     */
    public CharityInfoType getCharity(int idx) {
        if (this.charity == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.charity.get(idx);
    }

    public int getCharityLength() {
        if (this.charity == null) {
            return 0;
        }
        return this.charity.size();
    }

    /**
     * @param values allowed objects are
     *               {@link CharityInfoType }
     */
    public void setCharity(CharityInfoType[] values) {
        this._getCharity().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.charity.add(values[i]);
        }
    }

    protected List<CharityInfoType> _getCharity() {
        if (charity == null) {
            charity = new ArrayList<CharityInfoType>();
        }
        return charity;
    }

    /**
     * @param value allowed object is
     *              {@link CharityInfoType }
     */
    public CharityInfoType setCharity(int idx, CharityInfoType value) {
        return this.charity.set(idx, value);
    }

}
