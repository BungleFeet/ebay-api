package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Retrieves a token required for the GetUserAlerts call in the Client Alerts API.
 * <p/>
 * <p/>
 * <p>Java class for GetClientAlertsAuthTokenRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetClientAlertsAuthTokenRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientAlertsAuthTokenRequestType")
@XmlRootElement(name = "GetClientAlertsAuthTokenRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetClientAlertsAuthTokenRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;

}
