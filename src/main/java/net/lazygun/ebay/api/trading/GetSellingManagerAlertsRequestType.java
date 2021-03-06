package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Retrieves Selling Manager alerts.
 * This call is subject to change without notice; the deprecation process is
 * inapplicable to this call.
 * <p/>
 * <p/>
 * <p>Java class for GetSellingManagerAlertsRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetSellingManagerAlertsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerAlertsRequestType")
@XmlRootElement(name = "GetSellingManagerAlertsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerAlertsRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;

}
