package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Indicates the success or failure of the attempt to add text to the end of the
 * description section of an item listing.
 * <p/>
 * <p/>
 * <p>Java class for AddToItemDescriptionResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="AddToItemDescriptionResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddToItemDescriptionResponseType")
@XmlRootElement(name = "AddToItemDescriptionResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddToItemDescriptionResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;

}
