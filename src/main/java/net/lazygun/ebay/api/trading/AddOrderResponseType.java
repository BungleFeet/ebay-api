package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Calendar;


/**
 * Returns a unique identifier for the order. A buyer may make a single
 * payment to purchase all of the order line items included
 * in the order.
 * <p/>
 * <p/>
 * <p>Java class for AddOrderResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="AddOrderResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{urn:ebay:apis:eBLBaseComponents}OrderIDType" minOccurs="0"/>
 *         &lt;element name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrderResponseType", propOrder = {
        "orderID",
        "createdTime"
})
@XmlRootElement(name = "AddOrderResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddOrderResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "OrderID")
    protected String orderID;
    @XmlElement(name = "CreatedTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar createdTime;

    /**
     * Gets the value of the orderID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the createdTime property.
     *
     * @return possible object is
     *         {@link String }
     */
    public Calendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Sets the value of the createdTime property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCreatedTime(Calendar value) {
        this.createdTime = value;
    }

}
