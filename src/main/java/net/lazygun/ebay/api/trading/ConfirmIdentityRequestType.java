package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Returns the ID of a user who has gone through an application's consent flow
 * process for obtaining an authorization token.
 * <p/>
 * <p/>
 * <p>Java class for ConfirmIdentityRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ConfirmIdentityRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmIdentityRequestType", propOrder = {
        "sessionID"
})
@XmlRootElement(name = "ConfirmIdentityRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ConfirmIdentityRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SessionID")
    protected String sessionID;

    /**
     * Gets the value of the sessionID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

}
