package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Returns the shipping discount profiles defined by the user, along with other combined
 * payment-related details such as packaging and handling costs.
 * <p/>
 * <p/>
 * <p>Java class for GetShippingDiscountProfilesRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetShippingDiscountProfilesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetShippingDiscountProfilesRequestType")
@XmlRootElement(name = "GetShippingDiscountProfilesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetShippingDiscountProfilesRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;

}
