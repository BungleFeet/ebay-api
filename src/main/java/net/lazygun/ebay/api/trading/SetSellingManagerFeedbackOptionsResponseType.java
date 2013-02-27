package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Provides confirmation that feedback comments and (optionally) automated feedback
 * preferences were added successfully.
 * <p/>
 * <p/>
 * <p>Java class for SetSellingManagerFeedbackOptionsResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="SetSellingManagerFeedbackOptionsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetSellingManagerFeedbackOptionsResponseType")
@XmlRootElement(name = "SetSellingManagerFeedbackOptionsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetSellingManagerFeedbackOptionsResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;

}
