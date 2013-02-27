package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Retrieves a brief summary of the requester's status as an eBay seller.
 * <p/>
 * <p/>
 * <p>Java class for GetSellerDashboardRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetSellerDashboardRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellerDashboardRequestType")
@XmlRootElement(name = "GetSellerDashboardRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellerDashboardRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;

}
