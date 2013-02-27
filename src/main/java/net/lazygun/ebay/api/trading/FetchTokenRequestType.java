package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Retrieves an authentication token for a user.&nbsp;<b>Also for Half.com</b>.
 * <p/>
 * <p/>
 * <p>Java class for FetchTokenRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="FetchTokenRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="SecretID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FetchTokenRequestType", propOrder = {
        "secretID",
        "sessionID"
})
@XmlRootElement(name = "FetchTokenRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class FetchTokenRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "SecretID")
    protected String secretID;
    @XmlElement(name = "SessionID")
    protected String sessionID;

    /**
     * Gets the value of the secretID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getSecretID() {
        return secretID;
    }

    /**
     * Sets the value of the secretID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSecretID(String value) {
        this.secretID = value;
    }

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
