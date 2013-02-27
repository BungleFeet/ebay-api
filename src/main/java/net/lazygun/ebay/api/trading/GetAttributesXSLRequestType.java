package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * No longer recommended. This supports an older format for describing
 * item specifics using an ID-based model.
 * Most eBay categories no longer support ID-based attributes.
 * The remaining categories (e.g., US eBay Motors) will drop support
 * for ID-based attributes by May 2012.
 * New applications should not use ID-based attributes.
 * Existing applications should be updated to remove all dependencies
 * on ID-based attributes now. Instead, use GetCategorySpecifics for the
 * newer Custom Item Specifics model.<br>
 * <br>
 * Retrieves the Item Specifics SYI XSL stylesheet. Apply the stylesheet to the
 * XML returned from a call to GetAttributesCS or GetProductSellingPages to
 * render a form like the Item Specifics portion of eBay's Title and Description page.
 * See the eBay Web Services Guide for an overview of Item Specifics and information
 * on working with the XSL.
 * <p/>
 * <p/>
 * <p>Java class for GetAttributesXSLRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetAttributesXSLRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAttributesXSLRequestType", propOrder = {
        "fileName",
        "fileVersion"
})
@XmlRootElement(name = "GetAttributesXSLRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetAttributesXSLRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "FileVersion")
    protected String fileVersion;

    /**
     * Gets the value of the fileName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileVersion property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getFileVersion() {
        return fileVersion;
    }

    /**
     * Sets the value of the fileVersion property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFileVersion(String value) {
        this.fileVersion = value;
    }

}
