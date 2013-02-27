package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Calendar;


/**
 * Response to GetTaxTableRequest.
 * <p/>
 * <p/>
 * <p>Java class for GetTaxTableResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetTaxTableResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="LastUpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TaxTable" type="{urn:ebay:apis:eBLBaseComponents}TaxTableType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTaxTableResponseType", propOrder = {
        "lastUpdateTime",
        "taxTable"
})
@XmlRootElement(name = "GetTaxTableResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetTaxTableResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "LastUpdateTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastUpdateTime;
    @XmlElement(name = "TaxTable")
    protected TaxTableType taxTable;

    /**
     * Gets the value of the lastUpdateTime property.
     *
     * @return possible object is
     *         {@link String }
     */
    public Calendar getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastUpdateTime(Calendar value) {
        this.lastUpdateTime = value;
    }

    /**
     * Gets the value of the taxTable property.
     *
     * @return possible object is
     *         {@link TaxTableType }
     */
    public TaxTableType getTaxTable() {
        return taxTable;
    }

    /**
     * Sets the value of the taxTable property.
     *
     * @param value allowed object is
     *              {@link TaxTableType }
     */
    public void setTaxTable(TaxTableType value) {
        this.taxTable = value;
    }

}
