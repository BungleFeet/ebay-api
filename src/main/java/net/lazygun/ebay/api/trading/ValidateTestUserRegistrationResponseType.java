package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Returned after calling ValidateTestUserRegistrationRequest; confirms a successful
 * call.
 * <p/>
 * <p/>
 * <p>Java class for ValidateTestUserRegistrationResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ValidateTestUserRegistrationResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateTestUserRegistrationResponseType")
@XmlRootElement(name = "ValidateTestUserRegistrationResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ValidateTestUserRegistrationResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;

}
