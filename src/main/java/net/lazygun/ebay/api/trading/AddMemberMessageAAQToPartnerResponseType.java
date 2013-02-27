package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Response to AddMemberMessageAAQToPartner request.
 * <p/>
 * <p/>
 * <p>Java class for AddMemberMessageAAQToPartnerResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="AddMemberMessageAAQToPartnerResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddMemberMessageAAQToPartnerResponseType")
@XmlRootElement(name = "AddMemberMessageAAQToPartnerResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddMemberMessageAAQToPartnerResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;

}
