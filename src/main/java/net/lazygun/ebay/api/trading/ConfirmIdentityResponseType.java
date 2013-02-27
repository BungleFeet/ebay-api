package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Confirms the identity of the user by returning the UserID and the EIASToken belonging to
 * the user.
 * <p/>
 * <p/>
 * <p>Java class for ConfirmIdentityResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ConfirmIdentityResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmIdentityResponseType", propOrder = {
        "userID"
})
@XmlRootElement(name = "ConfirmIdentityResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ConfirmIdentityResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "UserID")
    protected String userID;

    /**
     * Gets the value of the userID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUserID(String value) {
        this.userID = value;
    }

}
