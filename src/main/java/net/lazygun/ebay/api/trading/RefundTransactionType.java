package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * A container consisting of details about the order line item against which the seller
 * issued a refund. If an order ID is present, it indicates that the refund was issued
 * against the entire order. If an item ID and transaction ID are present, that indicates
 * that the refund was issued against that particular order line item.
 * <p/>
 * <p/>
 * <p>Java class for RefundTransactionType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="RefundTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundLineArray" type="{urn:ebay:apis:eBLBaseComponents}RefundLineArrayType" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundTransactionType", propOrder = {
        "orderID",
        "itemID",
        "transactionID",
        "refundLineArray",
        "any"
})
public class RefundTransactionType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "OrderID")
    protected String orderID;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "RefundLineArray")
    protected RefundLineArrayType refundLineArray;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the itemID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the transactionID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the refundLineArray property.
     *
     * @return possible object is
     *         {@link RefundLineArrayType }
     */
    public RefundLineArrayType getRefundLineArray() {
        return refundLineArray;
    }

    /**
     * Sets the value of the refundLineArray property.
     *
     * @param value allowed object is
     *              {@link RefundLineArrayType }
     */
    public void setRefundLineArray(RefundLineArrayType value) {
        this.refundLineArray = value;
    }

    /**
     * @return array of
     *         {@link Object }
     *         {@link org.w3c.dom.Element }
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[0];
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()]));
    }

    /**
     * @return one of
     *         {@link Object }
     *         {@link org.w3c.dom.Element }
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return 0;
        }
        return this.any.size();
    }

    /**
     * @param values allowed objects are
     *               {@link Object }
     *               {@link org.w3c.dom.Element }
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i < len); i++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * @param value allowed object is
     *              {@link Object }
     *              {@link org.w3c.dom.Element }
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}
