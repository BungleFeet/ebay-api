package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Response to GetChallengeToken request.
 * <p/>
 * <p/>
 * <p>Java class for GetChallengeTokenResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetChallengeTokenResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ChallengeToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageChallengeURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AudioChallengeURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetChallengeTokenResponseType", propOrder = {
        "challengeToken",
        "imageChallengeURL",
        "audioChallengeURL"
})
@XmlRootElement(name = "GetChallengeTokenResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetChallengeTokenResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ChallengeToken")
    protected String challengeToken;
    @XmlElement(name = "ImageChallengeURL")
    protected String imageChallengeURL;
    @XmlElement(name = "AudioChallengeURL")
    protected String audioChallengeURL;

    /**
     * Gets the value of the challengeToken property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getChallengeToken() {
        return challengeToken;
    }

    /**
     * Sets the value of the challengeToken property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setChallengeToken(String value) {
        this.challengeToken = value;
    }

    /**
     * Gets the value of the imageChallengeURL property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getImageChallengeURL() {
        return imageChallengeURL;
    }

    /**
     * Sets the value of the imageChallengeURL property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setImageChallengeURL(String value) {
        this.imageChallengeURL = value;
    }

    /**
     * Gets the value of the audioChallengeURL property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getAudioChallengeURL() {
        return audioChallengeURL;
    }

    /**
     * Sets the value of the audioChallengeURL property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAudioChallengeURL(String value) {
        this.audioChallengeURL = value;
    }

}
