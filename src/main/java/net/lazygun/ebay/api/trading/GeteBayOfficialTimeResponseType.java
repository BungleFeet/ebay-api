package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * The Timestamp field indicates the official eBay system time in GMT.
 * For information about converting between GMT and other time zones,
 * see "Time Values" in the Data Types appendix in the eBay Web Services guide.
 * <p/>
 * <p/>
 * <p>Java class for GeteBayOfficialTimeResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GeteBayOfficialTimeResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeteBayOfficialTimeResponseType")
@XmlRootElement(name = "GeteBayOfficialTimeResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GeteBayOfficialTimeResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;

}
