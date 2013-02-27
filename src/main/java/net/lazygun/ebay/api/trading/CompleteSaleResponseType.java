package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Indicates the success or failure of the attempt to leave feedback for the buyer,
 * change the paid status in My eBay, and/or change the shipped status in My eBay.
 * <br><br>
 * Applies to half.com.
 * <br><br>
 * <br><br>
 * When CompleteSale is applied to a specified order (by specifying OrderID), it
 * also applies to the child transactions associated with the order. An OrderID
 * cannot be used with half.com items.
 * <p/>
 * <p/>
 * <p>Java class for CompleteSaleResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="CompleteSaleResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompleteSaleResponseType")
@XmlRootElement(name = "CompleteSaleResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class CompleteSaleResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;

}
