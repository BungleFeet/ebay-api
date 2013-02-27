package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Returns the status of save to template operation.
 * <p/>
 * <p/>
 * <p>Java class for SaveItemToSellingManagerTemplateResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="SaveItemToSellingManagerTemplateResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="TemplateID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveItemToSellingManagerTemplateResponseType", propOrder = {
        "templateID"
})
@XmlRootElement(name = "SaveItemToSellingManagerTemplateResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SaveItemToSellingManagerTemplateResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "TemplateID")
    protected Long templateID;

    /**
     * Gets the value of the templateID property.
     *
     * @return possible object is
     *         {@link Long }
     */
    public Long getTemplateID() {
        return templateID;
    }

    /**
     * Sets the value of the templateID property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setTemplateID(Long value) {
        this.templateID = value;
    }

}
