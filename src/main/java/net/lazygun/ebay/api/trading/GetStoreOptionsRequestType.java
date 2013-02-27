package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Retrieves the current list of eBay store configuration settings.
 * <p/>
 * <p/>
 * <p>Java class for GetStoreOptionsRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetStoreOptionsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStoreOptionsRequestType")
@XmlRootElement(name = "GetStoreOptionsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetStoreOptionsRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;

}
