package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemTypeCodeType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="ItemTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AuctionItemsOnly"/>
 *     &lt;enumeration value="FixedPricedItem"/>
 *     &lt;enumeration value="AllItems"/>
 *     &lt;enumeration value="StoreInventoryOnly"/>
 *     &lt;enumeration value="FixedPriceExcludeStoreInventory"/>
 *     &lt;enumeration value="ExcludeStoreInventory"/>
 *     &lt;enumeration value="AllItemTypes"/>
 *     &lt;enumeration value="AllFixedPriceItemTypes"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="ClassifiedItemsOnly"/>
 *     &lt;enumeration value="AdFormat"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "ItemTypeCodeType")
@XmlEnum
public enum ItemTypeCodeType {


    /**
     * Retrieve listings for single-item auction, regardless of the BuyItNowEnabled value.
     * Items with any of the following listing types are not retrieved:
     * StoresFixedPrice, FixedPriceItem, and AdType.
     */
    @XmlEnumValue("AuctionItemsOnly")
    AUCTION_ITEMS_ONLY("AuctionItemsOnly"),

    /**
     * Retrieves only listings that can be purchased at a fixed price. That is,
     * only retrieves listings for which listing type is StoresFixedPrice or
     * FixedPriceItem. Whether StoresFixedPrice items are retrieved depends on the site
     * default. If StoresFixedPrice items are retrieved, they are returned after the
     * other retrieved items. Also retrieves competitive-bid auction listings for which
     * BuyItNowEnabled is true. Does not retrieve listings for which listing type is
     * AdType, and does not retrieve auction listings for which BuyItNowEnabled is
     * false.
     */
    @XmlEnumValue("FixedPricedItem")
    FIXED_PRICED_ITEM("FixedPricedItem"),

    /**
     * Returns all listing types (the default for FindItemsAdvanced).
     * It is recommended that you use AllItemTypes instead of AllItems.
     * Whether StoresFixedPrice items are retrieved depends on the site default.
     */
    @XmlEnumValue("AllItems")
    ALL_ITEMS("AllItems"),

    /**
     * Only retrieves listings for which the listing type is StoresFixedPrice.
     */
    @XmlEnumValue("StoreInventoryOnly")
    STORE_INVENTORY_ONLY("StoreInventoryOnly"),

    /**
     * Excludes listings that have listing type set to StoresFixedPrice.
     * Excludes listings that have listing type set to AdType.
     * Excludes auction listings in which BuyItNowEnabled is false.
     */
    @XmlEnumValue("FixedPriceExcludeStoreInventory")
    FIXED_PRICE_EXCLUDE_STORE_INVENTORY("FixedPriceExcludeStoreInventory"),

    /**
     * Excludes listings that have listing type set to StoresFixedPrice.
     */
    @XmlEnumValue("ExcludeStoreInventory")
    EXCLUDE_STORE_INVENTORY("ExcludeStoreInventory"),

    /**
     * Retrieves listings whether or not listing type is set to StoresFixedPrice;
     * include auction items. In searches for items, you must specify the AllItemTypes value
     * if you want Store Inventory format (StoresFixedPrice) items to be returned.
     */
    @XmlEnumValue("AllItemTypes")
    ALL_ITEM_TYPES("AllItemTypes"),

    /**
     * Retrieves fixed-price items.
     * Whether StoresFixedPrice items are retrieved does not depend on the site default.
     * The StoresFixedPrice items are retrieved after the basic fixed price items.
     * Items are retrieved whether or not listing type is set to StoresFixedPrice.
     * Does not retrieve items for which listing type is AdType.
     * Does not retrieve auction items for which BuyItNowEnabled is false.
     */
    @XmlEnumValue("AllFixedPriceItemTypes")
    ALL_FIXED_PRICE_ITEM_TYPES("AllFixedPriceItemTypes"),

    /**
     * Reserved for internal or future use.
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * Only retrieves Classified Ad format listings.
     */
    @XmlEnumValue("ClassifiedItemsOnly")
    CLASSIFIED_ITEMS_ONLY("ClassifiedItemsOnly"),

    /**
     * Restricts listings to return only items that have the Ad Format feature.
     */
    @XmlEnumValue("AdFormat")
    AD_FORMAT("AdFormat");
    private final String value;

    ItemTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemTypeCodeType fromValue(String v) {
        for (ItemTypeCodeType c : ItemTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
