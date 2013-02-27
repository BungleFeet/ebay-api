package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Retrieves the tax table for a user on a given site or retrieves the valid
 * jurisdictions (if any) for a given site.
 * <p/>
 * <p/>
 * <p>Java class for GetTaxTableRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetTaxTableRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTaxTableRequestType")
@XmlRootElement(name = "GetTaxTableRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetTaxTableRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;

}
