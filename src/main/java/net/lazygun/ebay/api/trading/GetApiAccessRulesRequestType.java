package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * Reports how many calls your application has made and is allowed to make per hour or day.&nbsp;<b>Also for Half.com</b>.
 * <p/>
 * <p/>
 * <p>Java class for GetApiAccessRulesRequestType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetApiAccessRulesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetApiAccessRulesRequestType")
@XmlRootElement(name = "GetApiAccessRulesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetApiAccessRulesRequestType
        extends AbstractRequestType
        implements Serializable {

    private final static long serialVersionUID = 12343L;

}
