package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Type defining the response of the <b>AddDispute</b> call. Upon a successful
 * call, the response contains a newly created DisputeID value, which confirms that the
 * the Unpaid Item or Mutually Canceled Transaction case was successfully created.
 * <p/>
 * <p/>
 * <p>Java class for AddDisputeResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="AddDisputeResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="DisputeID" type="{urn:ebay:apis:eBLBaseComponents}DisputeIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddDisputeResponseType", propOrder = {
        "disputeID"
})
@XmlRootElement(name = "AddDisputeResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddDisputeResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DisputeID")
    protected String disputeID;

    /**
     * Gets the value of the disputeID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDisputeID() {
        return disputeID;
    }

    /**
     * Sets the value of the disputeID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDisputeID(String value) {
        this.disputeID = value;
    }

}
