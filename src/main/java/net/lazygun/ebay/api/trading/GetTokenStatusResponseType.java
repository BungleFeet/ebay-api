package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Returns token status.
 * <p/>
 * <p/>
 * <p>Java class for GetTokenStatusResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetTokenStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="TokenStatus" type="{urn:ebay:apis:eBLBaseComponents}TokenStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTokenStatusResponseType", propOrder = {
        "tokenStatus"
})
@XmlRootElement(name = "GetTokenStatusResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetTokenStatusResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TokenStatus")
    protected TokenStatusType tokenStatus;

    /**
     * Gets the value of the tokenStatus property.
     *
     * @return possible object is
     *         {@link TokenStatusType }
     */
    public TokenStatusType getTokenStatus() {
        return tokenStatus;
    }

    /**
     * Sets the value of the tokenStatus property.
     *
     * @param value allowed object is
     *              {@link TokenStatusType }
     */
    public void setTokenStatus(TokenStatusType value) {
        this.tokenStatus = value;
    }

}
