package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * This restricted call gives approved sellers the ability to extend the default and
 * ongoing lifetime of pictures uploaded to eBay.
 * <p/>
 * <p/>
 * <p>Java class for ExtendSiteHostedPicturesRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ExtendSiteHostedPicturesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExtensionInDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendSiteHostedPicturesRequestType", propOrder = {
        "pictureURL",
        "extensionInDays"
})
@XmlRootElement(name = "ExtendSiteHostedPicturesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ExtendSiteHostedPicturesRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PictureURL")
    @XmlSchemaType(name = "anyURI")
    protected List<String> pictureURL;
    @XmlElement(name = "ExtensionInDays")
    protected Integer extensionInDays;

    /**
     * @return array of
     *         {@link String }
     */
    public String[] getPictureURL() {
        if (this.pictureURL == null) {
            return new String[0];
        }
        return ((String[]) this.pictureURL.toArray(new String[this.pictureURL.size()]));
    }

    /**
     * @return one of
     *         {@link String }
     */
    public String getPictureURL(int idx) {
        if (this.pictureURL == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.pictureURL.get(idx);
    }

    public int getPictureURLLength() {
        if (this.pictureURL == null) {
            return 0;
        }
        return this.pictureURL.size();
    }

    /**
     * @param values allowed objects are
     *               {@link String }
     */
    public void setPictureURL(String[] values) {
        this._getPictureURL().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.pictureURL.add(values[i]);
        }
    }

    protected List<String> _getPictureURL() {
        if (pictureURL == null) {
            pictureURL = new ArrayList<String>();
        }
        return pictureURL;
    }

    /**
     * @param value allowed object is
     *              {@link String }
     */
    public String setPictureURL(int idx, String value) {
        return this.pictureURL.set(idx, value);
    }

    /**
     * Gets the value of the extensionInDays property.
     *
     * @return possible object is
     *         {@link Integer }
     */
    public Integer getExtensionInDays() {
        return extensionInDays;
    }

    /**
     * Sets the value of the extensionInDays property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setExtensionInDays(Integer value) {
        this.extensionInDays = value;
    }

}
