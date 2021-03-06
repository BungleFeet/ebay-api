package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Retrieves a map of old category IDs and corresponding active
 * category IDs defined for the site to which the request is sent.
 * <p/>
 * <p/>
 * <p>Java class for GetCategoryMappingsRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetCategoryMappingsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="CategoryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategoryMappingsRequestType", propOrder = {
        "categoryVersion"
})
@XmlRootElement(name = "GetCategoryMappingsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCategoryMappingsRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CategoryVersion")
    protected String categoryVersion;

    /**
     * Gets the value of the categoryVersion property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCategoryVersion() {
        return categoryVersion;
    }

    /**
     * Sets the value of the categoryVersion property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCategoryVersion(String value) {
        this.categoryVersion = value;
    }

}
