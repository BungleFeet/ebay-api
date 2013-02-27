package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Returns the folder structure of the input folderID.
 * <p/>
 * <p/>
 * <p>Java class for GetSellingManagerInventoryFolderResponseType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="GetSellingManagerInventoryFolderResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Folder" type="{urn:ebay:apis:eBLBaseComponents}SellingManagerFolderDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSellingManagerInventoryFolderResponseType", propOrder = {
        "folder"
})
@XmlRootElement(name = "GetSellingManagerInventoryFolderResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerInventoryFolderResponseType
        extends AbstractResponseType
        implements Serializable {

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "Folder")
    protected SellingManagerFolderDetailsType folder;

    /**
     * Gets the value of the folder property.
     *
     * @return possible object is
     *         {@link SellingManagerFolderDetailsType }
     */
    public SellingManagerFolderDetailsType getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     *
     * @param value allowed object is
     *              {@link SellingManagerFolderDetailsType }
     */
    public void setFolder(SellingManagerFolderDetailsType value) {
        this.folder = value;
    }

}
