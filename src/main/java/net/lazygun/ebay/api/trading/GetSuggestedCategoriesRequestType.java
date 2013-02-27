package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Returns a list of up to 10 categories that have the highest percentage of listings
 * whose titles or descriptions contain the keywords you specify.
 * <p/>
 * <p/>
 * <p>Java class for GetSuggestedCategoriesRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetSuggestedCategoriesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSuggestedCategoriesRequestType", propOrder = {
        "query"
})
@XmlRootElement(name = "GetSuggestedCategoriesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSuggestedCategoriesRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Query")
    protected String query;

    /**
     * Gets the value of the query property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setQuery(String value) {
        this.query = value;
    }

}
