package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Retrieves data for a specific, active Want It Now post identified by a post ID.
 * The response includes the following fields: CategoryID, Description, PostID,
 * Site, StartTime, ResponseCount, and Title. Although GetWantItNowSearchResults
 * returns most of this information, only GetWantItNowPost returns Description for
 * a post.
 * <p/>
 * <p/>
 * <p>Java class for GetWantItNowPostRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetWantItNowPostRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="PostID" type="{urn:ebay:apis:eBLBaseComponents}ItemIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWantItNowPostRequestType", propOrder = {
        "postID"
})
@XmlRootElement(name = "GetWantItNowPostRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetWantItNowPostRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "PostID")
    protected String postID;

    /**
     * Gets the value of the postID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getPostID() {
        return postID;
    }

    /**
     * Sets the value of the postID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPostID(String value) {
        this.postID = value;
    }

}
