package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * Basic type for specifying measures and the system of measurement.
 * A decimal value (e.g., 10.25) is meaningful
 * as a measure when accompanied by a definition of the unit of measure (e.g., Pounds),
 * in which case the value specifies the quantity of that unit.
 * A MeasureType expresses both the value (a decimal) and, optionally, the unit and
 * the system of measurement.
 * Details such as shipping weights are specified as measure types.
 * <p/>
 * <p/>
 * <p>Java class for MeasureType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="MeasureType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="measurementSystem" type="{urn:ebay:apis:eBLBaseComponents}MeasurementSystemCodeType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType", propOrder = {
        "value"
})
public class MeasureType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlValue
    protected BigDecimal value;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String unit;
    @XmlAttribute
    protected MeasurementSystemCodeType measurementSystem;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     *         {@link java.math.BigDecimal }
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link java.math.BigDecimal }
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the unit property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the measurementSystem property.
     *
     * @return possible object is
     *         {@link MeasurementSystemCodeType }
     */
    public MeasurementSystemCodeType getMeasurementSystem() {
        return measurementSystem;
    }

    /**
     * Sets the value of the measurementSystem property.
     *
     * @param value allowed object is
     *              {@link MeasurementSystemCodeType }
     */
    public void setMeasurementSystem(MeasurementSystemCodeType value) {
        this.measurementSystem = value;
    }

}
