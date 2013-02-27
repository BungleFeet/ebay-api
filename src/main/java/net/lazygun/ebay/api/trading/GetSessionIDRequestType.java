package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Retrieves a session ID that identifies a user and your application when you make a
 * FetchToken request.
 * <p/>
 * <p/>
 * <p>Java class for GetSessionIDRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetSessionIDRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="RuName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSessionIDRequestType", propOrder = {
        "ruName"
})
@XmlRootElement(name = "GetSessionIDRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSessionIDRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "RuName")
    protected String ruName;

    /**
     * Gets the value of the ruName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getRuName() {
        return ruName;
    }

    /**
     * Sets the value of the ruName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRuName(String value) {
        this.ruName = value;
    }

}
