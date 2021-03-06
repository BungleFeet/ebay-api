package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Returns XML that describes how to present Item Specifics to a seller
 * and how to validate selected eBay attributes on the client before including
 * them in an AddItem call or related calls.
 * See the Developer's Guide for an overview of Item Specifics and details about
 * the eBay attribute model. Also returns the current version of the meta-data system.
 * <p/>
 * <p/>
 * <p>Java class for GetAttributesCSResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetAttributesCSResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="AttributeSystemVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttributeData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAttributesCSResponseType", propOrder = {
        "attributeSystemVersion",
        "attributeData"
})
@XmlRootElement(name = "GetAttributesCSResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetAttributesCSResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "AttributeSystemVersion")
    protected String attributeSystemVersion;
    @XmlElement(name = "AttributeData")
    protected String attributeData;

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

    /**
     * Gets the value of the attributeData property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getAttributeData() {
        return attributeData;
    }

    /**
     * Sets the value of the attributeData property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttributeData(String value) {
        this.attributeData = value;
    }

}
