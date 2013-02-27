package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Indicates the success or failure of the attempt to reply
 * to feedback that has been left for a user, or to post a
 * follow-up comment to a feedback comment a user has left
 * for someone else.
 * <p/>
 * <p/>
 * <p>Java class for RespondToFeedbackResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="RespondToFeedbackResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespondToFeedbackResponseType")
@XmlRootElement(name = "RespondToFeedbackResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class RespondToFeedbackResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;

}
