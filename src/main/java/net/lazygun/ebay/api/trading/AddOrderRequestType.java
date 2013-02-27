package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Combines two or more order line items into a single order, enabling a buyer to pay for all of those order line items with a single payment (and, if so arranged, ship all of the items together).
 * <p/>
 * <p/>
 * <p>Java class for AddOrderRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="AddOrderRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Order" type="{urn:ebay:apis:eBLBaseComponents}OrderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrderRequestType", propOrder = {
        "order"
})
@XmlRootElement(name = "AddOrderRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddOrderRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Order")
    protected OrderType order;

    /**
     * Gets the value of the order property.
     *
     * @return possible object is
     *         {@link OrderType }
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     *
     * @param value allowed object is
     *              {@link OrderType }
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

}
