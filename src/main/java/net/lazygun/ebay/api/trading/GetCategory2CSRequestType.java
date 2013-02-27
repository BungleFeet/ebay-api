package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * No longer recommended. This supports an older ID-based format for
 * describing item specifics and product details.
 * Most eBay categories no longer support ID-based attributes.
 * The remaining categories (e.g., US eBay Motors) will drop support
 * for ID-based attributes by May 2012.
 * New applications should not use ID-based attributes.
 * Existing applications should be updated to remove all dependencies
 * on ID-based attributes now. Instead, use GetCategoryFeatures for the
 * newer Custom Item Specifics model, and use FindProducts in
 * eBay's Shopping API to search for product details.<br>
 * <br>
 * Retrieves mappings between categories and characteristic sets
 * that are available for an eBay site.
 * <p/>
 * <p/>
 * <p>Java class for GetCategory2CSRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetCategory2CSRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeSystemVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategory2CSRequestType", propOrder = {
        "categoryID",
        "attributeSystemVersion"
})
@XmlRootElement(name = "GetCategory2CSRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetCategory2CSRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "AttributeSystemVersion")
    protected String attributeSystemVersion;

    /**
     * Gets the value of the categoryID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the attributeSystemVersion property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getAttributeSystemVersion() {
        return attributeSystemVersion;
    }

    /**
     * Sets the value of the attributeSystemVersion property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttributeSystemVersion(String value) {
        this.attributeSystemVersion = value;
    }

}
