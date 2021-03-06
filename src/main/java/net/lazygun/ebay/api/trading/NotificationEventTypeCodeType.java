package net.lazygun.ebay.api.trading;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationEventTypeCodeType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="NotificationEventTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="OutBid"/>
 *     &lt;enumeration value="EndOfAuction"/>
 *     &lt;enumeration value="AuctionCheckoutComplete"/>
 *     &lt;enumeration value="CheckoutBuyerRequestsTotal"/>
 *     &lt;enumeration value="Feedback"/>
 *     &lt;enumeration value="FeedbackForSeller"/>
 *     &lt;enumeration value="FixedPriceTransaction"/>
 *     &lt;enumeration value="SecondChanceOffer"/>
 *     &lt;enumeration value="AskSellerQuestion"/>
 *     &lt;enumeration value="ItemListed"/>
 *     &lt;enumeration value="ItemRevised"/>
 *     &lt;enumeration value="BuyerResponseDispute"/>
 *     &lt;enumeration value="SellerOpenedDispute"/>
 *     &lt;enumeration value="SellerRespondedToDispute"/>
 *     &lt;enumeration value="SellerClosedDispute"/>
 *     &lt;enumeration value="BestOffer"/>
 *     &lt;enumeration value="MyMessagesAlertHeader"/>
 *     &lt;enumeration value="MyMessagesAlert"/>
 *     &lt;enumeration value="MyMessageseBayMessageHeader"/>
 *     &lt;enumeration value="MyMessageseBayMessage"/>
 *     &lt;enumeration value="MyMessagesM2MMessageHeader"/>
 *     &lt;enumeration value="MyMessagesM2MMessage"/>
 *     &lt;enumeration value="INRBuyerOpenedDispute"/>
 *     &lt;enumeration value="INRBuyerRespondedToDispute"/>
 *     &lt;enumeration value="INRBuyerClosedDispute"/>
 *     &lt;enumeration value="INRSellerRespondedToDispute"/>
 *     &lt;enumeration value="Checkout"/>
 *     &lt;enumeration value="WatchedItemEndingSoon"/>
 *     &lt;enumeration value="ItemClosed"/>
 *     &lt;enumeration value="ItemSuspended"/>
 *     &lt;enumeration value="ItemSold"/>
 *     &lt;enumeration value="ItemExtended"/>
 *     &lt;enumeration value="UserIDChanged"/>
 *     &lt;enumeration value="EmailAddressChanged"/>
 *     &lt;enumeration value="PasswordChanged"/>
 *     &lt;enumeration value="PasswordHintChanged"/>
 *     &lt;enumeration value="PaymentDetailChanged"/>
 *     &lt;enumeration value="AccountSuspended"/>
 *     &lt;enumeration value="AccountSummary"/>
 *     &lt;enumeration value="ThirdPartyCartCheckout"/>
 *     &lt;enumeration value="ItemRevisedAddCharity"/>
 *     &lt;enumeration value="ItemAddedToWatchList"/>
 *     &lt;enumeration value="ItemRemovedFromWatchList"/>
 *     &lt;enumeration value="ItemAddedToBidGroup"/>
 *     &lt;enumeration value="ItemRemovedFromBidGroup"/>
 *     &lt;enumeration value="FeedbackLeft"/>
 *     &lt;enumeration value="FeedbackReceived"/>
 *     &lt;enumeration value="FeedbackStarChanged"/>
 *     &lt;enumeration value="BidPlaced"/>
 *     &lt;enumeration value="BidReceived"/>
 *     &lt;enumeration value="ItemWon"/>
 *     &lt;enumeration value="ItemLost"/>
 *     &lt;enumeration value="ItemUnsold"/>
 *     &lt;enumeration value="CounterOfferReceived"/>
 *     &lt;enumeration value="BestOfferDeclined"/>
 *     &lt;enumeration value="BestOfferPlaced"/>
 *     &lt;enumeration value="AddToWatchList"/>
 *     &lt;enumeration value="PlaceOffer"/>
 *     &lt;enumeration value="RemoveFromWatchList"/>
 *     &lt;enumeration value="AddToBidGroup"/>
 *     &lt;enumeration value="RemoveFromBidGroup"/>
 *     &lt;enumeration value="ItemsCanceled"/>
 *     &lt;enumeration value="TokenRevocation"/>
 *     &lt;enumeration value="BulkDataExchangeJobCompleted"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="ItemMarkedShipped"/>
 *     &lt;enumeration value="ItemMarkedPaid"/>
 *     &lt;enumeration value="EBPMyResponseDue"/>
 *     &lt;enumeration value="EBPOtherPartyResponseDue"/>
 *     &lt;enumeration value="EBPEscalatedCase"/>
 *     &lt;enumeration value="EBPAppealedCase"/>
 *     &lt;enumeration value="EBPMyPaymentDue"/>
 *     &lt;enumeration value="EBPPaymentDone"/>
 *     &lt;enumeration value="EBPClosedAppeal"/>
 *     &lt;enumeration value="EBPClosedCase"/>
 *     &lt;enumeration value="MyMessagesHighPriorityMessage"/>
 *     &lt;enumeration value="MyMessagesHighPriorityMessageHeader"/>
 *     &lt;enumeration value="EBPOnHoldCase"/>
 *     &lt;enumeration value="ReadyToShip"/>
 *     &lt;enumeration value="ReadyForPayout"/>
 *     &lt;enumeration value="BidItemEndingSoon"/>
 *     &lt;enumeration value="ReturnCreated"/>
 *     &lt;enumeration value="ReturnWaitingForSellerInfo"/>
 *     &lt;enumeration value="ReturnSellerInfoOverdue"/>
 *     &lt;enumeration value="ReturnShipped"/>
 *     &lt;enumeration value="ReturnDelivered"/>
 *     &lt;enumeration value="ReturnRefundOverdue"/>
 *     &lt;enumeration value="ReturnClosed"/>
 *     &lt;enumeration value="ReturnEscalated"/>
 *     &lt;enumeration value="UnmatchedPaymentReceived"/>
 *     &lt;enumeration value="RefundSuccess"/>
 *     &lt;enumeration value="RefundFailure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 * Note: Per JAXB standards, underscores are added to separate words in enumerations (e.g., PayPal becomes PAY_PAL).
 */
@XmlType(name = "NotificationEventTypeCodeType")
@XmlEnum
public enum NotificationEventTypeCodeType {


    /**
     * Not a notification event.
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * Sent to a user when another buyer has placed a higher maximum bid
     * and the user is no longer the current high bidder.
     * <br><br>
     * Applies to Buyers.
     */
    @XmlEnumValue("OutBid")
    OUT_BID("OutBid"),

    /**
     * Sent when an auction ends. An auction ends either when its duration
     * expires or the buyer purchases an item with Buy It Now. Applies to
     * all competitive-bid auctions.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("EndOfAuction")
    END_OF_AUCTION("EndOfAuction"),

    /**
     * Sent to a seller when a buyer completes the checkout process for an item. Not
     * sent when an auction ends without bids.
     * <br><br>
     * For checkouts that involve more than one item, AuctionCheckoutComplete is sent only for the first item.
     * Because its payload is based on GetItemTransactions, only a single item is included in the notification.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("AuctionCheckoutComplete")
    AUCTION_CHECKOUT_COMPLETE("AuctionCheckoutComplete"),

    /**
     * Sent to a seller each time a buyer requests a total price. Occurs
     * before checkout is complete.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("CheckoutBuyerRequestsTotal")
    CHECKOUT_BUYER_REQUESTS_TOTAL("CheckoutBuyerRequestsTotal"),

    /**
     * When a user leaves feedback, this notification is sent to a third party who
     * has subscribed on a user's behalf. The user can be a buyer who leaves
     * feedback for a seller or a seller who leaves feedback for a buyer.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("Feedback")
    FEEDBACK("Feedback"),
    @XmlEnumValue("FeedbackForSeller")
    FEEDBACK_FOR_SELLER("FeedbackForSeller"),

    /**
     * Sent to a seller when a buyer purchases a fixed-price item.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("FixedPriceTransaction")
    FIXED_PRICE_TRANSACTION("FixedPriceTransaction"),

    /**
     * Reserved for future use.
     * <br><br>
     * Applies to Buyers.
     */
    @XmlEnumValue("SecondChanceOffer")
    SECOND_CHANCE_OFFER("SecondChanceOffer"),

    /**
     * Sent to a seller when a question is posted about one of the seller's
     * active listings.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("AskSellerQuestion")
    ASK_SELLER_QUESTION("AskSellerQuestion"),

    /**
     * Sent to an eBay partner on behalf of a seller when a seller
     * lists or relists an item. Sent for each item the seller lists.
     * <br><br>
     * This notification is triggered by automatic relists. For example, a seller
     * who has opted in to automated relisting of unpaid items using
     * UnpaidItemAssistancePreferencesType.AutoRelist will receive this notification
     * when an unpaid item is automatically relisted.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("ItemListed")
    ITEM_LISTED("ItemListed"),

    /**
     * Sent to an eBay partner on behalf of a seller when a seller has
     * revised an item.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("ItemRevised")
    ITEM_REVISED("ItemRevised"),

    /**
     * Sent to an eBay partner on behalf of a seller when a buyer responds
     * to a dispute the seller has opened. Sent for each response the buyer makes.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("BuyerResponseDispute")
    BUYER_RESPONSE_DISPUTE("BuyerResponseDispute"),

    /**
     * Sent to an eBay partner on behalf of a seller when a seller opens a
     * dispute. Sent for each dispute the seller opens.
     * <br><br>
     * Applies to Buyers.
     */
    @XmlEnumValue("SellerOpenedDispute")
    SELLER_OPENED_DISPUTE("SellerOpenedDispute"),

    /**
     * Sent to an eBay partner on behalf of a seller when a seller responds
     * to a dispute they had opened. Sent for each response the seller makes.
     * <br><br>
     * Applies to Buyers.
     */
    @XmlEnumValue("SellerRespondedToDispute")
    SELLER_RESPONDED_TO_DISPUTE("SellerRespondedToDispute"),

    /**
     * Sent to an eBay partner on behalf of a seller when a seller closes a
     * dispute they had opened. Sent for each closure the seller performs.
     * <br><br>
     * Applies to Sellers and Buyers.
     */
    @XmlEnumValue("SellerClosedDispute")
    SELLER_CLOSED_DISPUTE("SellerClosedDispute"),

    /**
     * Sent to a seller when a bidder makes a best offer on an item opted
     * into the Best Offer feature by the seller.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("BestOffer")
    BEST_OFFER("BestOffer"),
    @XmlEnumValue("MyMessagesAlertHeader")
    MY_MESSAGES_ALERT_HEADER("MyMessagesAlertHeader"),
    @XmlEnumValue("MyMessagesAlert")
    MY_MESSAGES_ALERT("MyMessagesAlert"),

    /**
     * A notification type where a specified user or application is
     * notified when a message from eBay is sent to My Messages. This notification
     * type sends a GetMyMessages response at a detail level of ReturnHeaders.
     * MyMessageseBayMessageHeader and MyMessageseBayMessage cannot be subscribed
     * to at the same time or specified in the same call.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("MyMessageseBayMessageHeader")
    MY_MESSAGESE_BAY_MESSAGE_HEADER("MyMessageseBayMessageHeader"),

    /**
     * A notification type where a specified user or application is
     * notified when a message from eBay is sent to My Messages. This notification
     * type sends a GetMyMessages response at a detail level of ReturnMessages.
     * MyMessageseBayMessageHeader and MyMessageseBayMessage cannot be subscribed
     * to at the same time or specified in the same call.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("MyMessageseBayMessage")
    MY_MESSAGESE_BAY_MESSAGE("MyMessageseBayMessage"),

    /**
     * A notification type where a specified user or application is
     * notified when a member to member (M2M) message is sent to My Messages. This
     * notification type sends a GetMyMessages response at a detail level of
     * ReturnHeaders. MyMessagesM2MMessageHeader and MyMessagesM2MMessage cannot
     * be subscribed to at the same time or specified in the same call.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("MyMessagesM2MMessageHeader")
    MY_MESSAGES_M_2_M_MESSAGE_HEADER("MyMessagesM2MMessageHeader"),

    /**
     * A notification type where a specified user or application is
     * notified when a member to member (M2M) message is sent to My Messages. This
     * notification type sends a GetMyMessages response at a detail level of
     * ReturnMessages. MyMessagesM2MMessageHeader and MyMessagesM2MMessage cannot
     * be subscribed to at the same time or specified in the same call.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("MyMessagesM2MMessage")
    MY_MESSAGES_M_2_M_MESSAGE("MyMessagesM2MMessage"),

    /**
     * A notification type where a specified user or application is
     * notified on behalf of a buyer when a buyer opens an Item Not Received dispute.
     * Sent for each dispute the buyer opens.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("INRBuyerOpenedDispute")
    INR_BUYER_OPENED_DISPUTE("INRBuyerOpenedDispute"),

    /**
     * A notification type where a specified user or application is
     * notified on behalf of a buyer when a buyer responds to Item Not Received
     * dispute that buyer had opened. Sent for each response the buyer makes.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("INRBuyerRespondedToDispute")
    INR_BUYER_RESPONDED_TO_DISPUTE("INRBuyerRespondedToDispute"),

    /**
     * A notification type where a specified user or application is
     * notified on behalf of a buyer when a buyer closes Item Not Received
     * dispute that buyer had opened. Sent for each closure the buyer performs.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("INRBuyerClosedDispute")
    INR_BUYER_CLOSED_DISPUTE("INRBuyerClosedDispute"),

    /**
     * A notification type where a specified user or application is
     * notified on behalf of a seller when a seller responds to an Item Not Received
     * dispute that buyer had opened. Sent for each response the seller makes.
     * <br><br>
     * Applies to Buyers.
     */
    @XmlEnumValue("INRSellerRespondedToDispute")
    INR_SELLER_RESPONDED_TO_DISPUTE("INRSellerRespondedToDispute"),

    /**
     * Do not use. This notification event is tied to eBay Express functionality
     * which no longer exists.
     */
    @XmlEnumValue("Checkout")
    CHECKOUT("Checkout"),

    /**
     * A notification type where the listing of the watched item is about
     * to end. This event has a property with which caller can specify the TimeLeft
     * before the listing ends.
     * <br><br>
     * Applies to Buyers.
     */
    @XmlEnumValue("WatchedItemEndingSoon")
    WATCHED_ITEM_ENDING_SOON("WatchedItemEndingSoon"),

    /**
     * Specifies that an ItemClosed notification event has occurred. This event is triggered by
     * ItemWon and ItemUnsold events.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("ItemClosed")
    ITEM_CLOSED("ItemClosed"),

    /**
     * Specifies an ItemSuspended notification event. Subscribe to this event to be notified when eBay has taken down a listing for a listing problem, for example, listing in the wrong category.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("ItemSuspended")
    ITEM_SUSPENDED("ItemSuspended"),

    /**
     * Specifies an ItemSold notification event, triggered when an eBay listing ends in a sale.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("ItemSold")
    ITEM_SOLD("ItemSold"),

    /**
     * Specifies an ItemExtended notification event, when a seller has extended the duration of a listing.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("ItemExtended")
    ITEM_EXTENDED("ItemExtended"),

    /**
     * The userid was changed. Available for SMS on the UK and Germany
     * sites. Not applicable to Platform Notifications.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("UserIDChanged")
    USER_ID_CHANGED("UserIDChanged"),

    /**
     * The email address was changed. Available for SMS on the UK and
     * Germany sites. Not applicable to Platform Notifications.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("EmailAddressChanged")
    EMAIL_ADDRESS_CHANGED("EmailAddressChanged"),

    /**
     * The password was changed. Available for SMS on the UK and Germany
     * sites. Not applicable to Platform Notifications.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("PasswordChanged")
    PASSWORD_CHANGED("PasswordChanged"),

    /**
     * The password hint was changed. Available for SMS on the UK and
     * Germany sites. Not applicable to Platform Notifications.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("PasswordHintChanged")
    PASSWORD_HINT_CHANGED("PasswordHintChanged"),

    /**
     * The payment detail was changed. Available for SMS on the UK and
     * Germany sites. Not applicable to Platform Notifications.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("PaymentDetailChanged")
    PAYMENT_DETAIL_CHANGED("PaymentDetailChanged"),

    /**
     * The account was suspended. Available for SMS on the UK and Germany
     * sites. Not applicable to Platform Notifications.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("AccountSuspended")
    ACCOUNT_SUSPENDED("AccountSuspended"),

    /**
     * An informational alert about account activity.
     * A user can subscribe to receive an account activity summary via SMS.
     * The user can specify the period (time range) for the account summary and can
     * select how often the summary is to be sent. It is not triggered by an event
     * but rather by an eBay daemon process that monitors a schedule database.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("AccountSummary")
    ACCOUNT_SUMMARY("AccountSummary"),
    @XmlEnumValue("ThirdPartyCartCheckout")
    THIRD_PARTY_CART_CHECKOUT("ThirdPartyCartCheckout"),

    /**
     * Sent to an eBay partner on behalf of a seller when a seller has
     * revised an item and added charity.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("ItemRevisedAddCharity")
    ITEM_REVISED_ADD_CHARITY("ItemRevisedAddCharity"),

    /**
     * Sent to a subscribing third party when a user adds an item to her or his watch list.
     * <br><br>
     * Applies to Buyers.
     */
    @XmlEnumValue("ItemAddedToWatchList")
    ITEM_ADDED_TO_WATCH_LIST("ItemAddedToWatchList"),

    /**
     * Sent to a subscribing third party when a user removes an item from her or his watch list.
     * <br><br>
     * Applies to Buyers.
     */
    @XmlEnumValue("ItemRemovedFromWatchList")
    ITEM_REMOVED_FROM_WATCH_LIST("ItemRemovedFromWatchList"),

    /**
     * Sent to a subscribing third party when a user adds an item to her or his bid group.
     * <br><br>
     * Applies to Buyers.
     */
    @XmlEnumValue("ItemAddedToBidGroup")
    ITEM_ADDED_TO_BID_GROUP("ItemAddedToBidGroup"),

    /**
     * Sent to a subscribing third party when a user removes an item from her or his bid group.
     * <br><br>
     * Applies to Buyers.
     */
    @XmlEnumValue("ItemRemovedFromBidGroup")
    ITEM_REMOVED_FROM_BID_GROUP("ItemRemovedFromBidGroup"),

    /**
     * Sent to third parties subscribed on a user's behalf when
     * feedback comments are left by that user.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("FeedbackLeft")
    FEEDBACK_LEFT("FeedbackLeft"),

    /**
     * Sent to third parties subscribed on a user's behalf when
     * feedback comments are received by that user.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("FeedbackReceived")
    FEEDBACK_RECEIVED("FeedbackReceived"),

    /**
     * Sent to a subscribing third party when a user's feedback star level changes.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("FeedbackStarChanged")
    FEEDBACK_STAR_CHANGED("FeedbackStarChanged"),

    /**
     * Sent to a subscribing third party for the buyer when a user places a bid for an item.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("BidPlaced")
    BID_PLACED("BidPlaced"),

    /**
     * Sent to a subscribing third party for the seller when a user places a bid for an item.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("BidReceived")
    BID_RECEIVED("BidReceived"),

    /**
     * Sent to a subscribing third party for the buyer when a user bought an item.
     * <br><br>
     * Applies to Buyers.
     */
    @XmlEnumValue("ItemWon")
    ITEM_WON("ItemWon"),

    /**
     * Sent to a subscribing third party for the buyer when a user lost a bid for an item.
     * <br><br>
     * Applies to Buyers.
     */
    @XmlEnumValue("ItemLost")
    ITEM_LOST("ItemLost"),

    /**
     * Sent to a subscribing third party for the seller when an item was not sold.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("ItemUnsold")
    ITEM_UNSOLD("ItemUnsold"),

    /**
     * Sent to a subscribing third party for a buyer when a seller makes a counter offer to the buyer's best offer on an item opted	into the Best Offer feature by the seller.
     * <br><br>
     * Applies to Buyers.
     */
    @XmlEnumValue("CounterOfferReceived")
    COUNTER_OFFER_RECEIVED("CounterOfferReceived"),

    /**
     * Sent to a subscribing third-party for a buyer when a seller rejects the buyer's best offer on an item opted into
     * the Best Offer feature by the seller. Also sent to a buyer when the buyer rejects a seller's counteroffer.
     * <br><br>
     * Applies to Buyers.
     */
    @XmlEnumValue("BestOfferDeclined")
    BEST_OFFER_DECLINED("BestOfferDeclined"),

    /**
     * Sent to a subscribing third party for a buyer who makes a best offer on an item opted into the Best Offer feature by a seller.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("BestOfferPlaced")
    BEST_OFFER_PLACED("BestOfferPlaced"),

    /**
     * An informational alert sent to a user when an item is added to her or his watch list. DO NOT USE. This notification was REMOVED in 549.
     */
    @XmlEnumValue("AddToWatchList")
    ADD_TO_WATCH_LIST("AddToWatchList"),

    /**
     * An informational alert sent to a user when he or she places an offer for an item. DO NOT USE. This notification was REMOVED in 549.
     */
    @XmlEnumValue("PlaceOffer")
    PLACE_OFFER("PlaceOffer"),

    /**
     * An informational alert sent to a user when an item is removed from her or his watch list. DO NOT USE. This notification was REMOVED in 549.
     */
    @XmlEnumValue("RemoveFromWatchList")
    REMOVE_FROM_WATCH_LIST("RemoveFromWatchList"),

    /**
     * An informational alert sent to a user when when an item is added to her or his bid group. DO NOT USE. This notification was REMOVED in 549.
     */
    @XmlEnumValue("AddToBidGroup")
    ADD_TO_BID_GROUP("AddToBidGroup"),

    /**
     * An informational alert sent to a user when an item is removed from her or his bid group. DO NOT USE. This notification was REMOVED in 549.
     */
    @XmlEnumValue("RemoveFromBidGroup")
    REMOVE_FROM_BID_GROUP("RemoveFromBidGroup"),

    /**
     * This event is not functional.
     */
    @XmlEnumValue("ItemsCanceled")
    ITEMS_CANCELED("ItemsCanceled"),

    /**
     * An informational alert sent to a subscribing application when a user token has been revoked.
     * <br><br>
     * Applies to both Buyers and Sellers.
     */
    @XmlEnumValue("TokenRevocation")
    TOKEN_REVOCATION("TokenRevocation"),

    /**
     * An informational alert sent to a subscribing application when the Bulk exchange job completes.
     * <br><br>
     * Applies to Sellers.
     */
    @XmlEnumValue("BulkDataExchangeJobCompleted")
    BULK_DATA_EXCHANGE_JOB_COMPLETED("BulkDataExchangeJobCompleted"),

    /**
     * Reserved for future use.
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * Alert sent to a subscribing buyer or seller when item marked as shipped by the seller.
     * <br><br>
     * Applies to Sellers and Buyers.
     */
    @XmlEnumValue("ItemMarkedShipped")
    ITEM_MARKED_SHIPPED("ItemMarkedShipped"),

    /**
     * Alert sent to a subscribing buyer or seller when item marked as paid by the seller.
     * <br><br>
     * Applies to Sellers and Buyers.
     */
    @XmlEnumValue("ItemMarkedPaid")
    ITEM_MARKED_PAID("ItemMarkedPaid"),

    /**
     * This notification is sent to a subscribing buyer or seller (or application)
     * when a response to the eBP case is due from the call user. When a eBP case is
     * opened, this notification is only sent to the seller involved in the case and
     * not the buyer.
     */
    @XmlEnumValue("EBPMyResponseDue")
    EBP_MY_RESPONSE_DUE("EBPMyResponseDue"),

    /**
     * This notification is sent to the subscribed buyer or seller (or application)
     * when a response to the eBP case is due from the other party in the case.
     */
    @XmlEnumValue("EBPOtherPartyResponseDue")
    EBP_OTHER_PARTY_RESPONSE_DUE("EBPOtherPartyResponseDue"),

    /**
     * This notification is sent to the subscribed buyer or seller (or application)
     * when an eBP case is escalated.
     */
    @XmlEnumValue("EBPEscalatedCase")
    EBP_ESCALATED_CASE("EBPEscalatedCase"),

    /**
     * This notification is sent to the subscribed buyer or seller (or application)
     * when the decision of an eBP case is appealed.
     */
    @XmlEnumValue("EBPAppealedCase")
    EBP_APPEALED_CASE("EBPAppealedCase"),

    /**
     * This notification is sent to the subscribed seller (or application) when
     * payment (to eBay or buyer) is due.
     */
    @XmlEnumValue("EBPMyPaymentDue")
    EBP_MY_PAYMENT_DUE("EBPMyPaymentDue"),

    /**
     * This notification is sent to the subscribed seller (or application) when
     * payment (to eBay or buyer) is processed.
     */
    @XmlEnumValue("EBPPaymentDone")
    EBP_PAYMENT_DONE("EBPPaymentDone"),

    /**
     * This notification is sent to the subscribed buyer or seller (or application)
     * when an appeal of an eBP case decision has been closed.
     */
    @XmlEnumValue("EBPClosedAppeal")
    EBP_CLOSED_APPEAL("EBPClosedAppeal"),

    /**
     * This notification is sent to the subscribed buyer or seller (or application)
     * when an eBP case has been closed.
     */
    @XmlEnumValue("EBPClosedCase")
    EBP_CLOSED_CASE("EBPClosedCase"),

    /**
     * A notification type in which a specified user or application is notified
     * when a High Priority Message (of priority 1 or 2) is sent to My Messages. Only
     * High Priority Message will be sent back as part of the Notification payload. This
     * notification type sends a GetMyMessages response at a detail level of
     * ReturnMessages.
     */
    @XmlEnumValue("MyMessagesHighPriorityMessage")
    MY_MESSAGES_HIGH_PRIORITY_MESSAGE("MyMessagesHighPriorityMessage"),

    /**
     * A notification type in which a specified user or application is notified
     * when a High Priority Message (of priority 1 or 2) is sent to My Messages. Only
     * High Priority Messages will be sent back as part of the notification
     * payload. This notification type sends a GetMyMessages response at a detail level
     * of ReturnHeaders.
     */
    @XmlEnumValue("MyMessagesHighPriorityMessageHeader")
    MY_MESSAGES_HIGH_PRIORITY_MESSAGE_HEADER("MyMessagesHighPriorityMessageHeader"),

    /**
     * This notification is sent to the subscribed buyer or seller (or application)
     * when an eBP case has been onholded by CS.
     */
    @XmlEnumValue("EBPOnHoldCase")
    EBP_ON_HOLD_CASE("EBPOnHoldCase"),

    /**
     * This notification is sent to a DE or AT seller when an order (subject to the
     * new eBay payment process) has been paid for by the buyer. This notification is
     * triggered and sent when Checkout status is complete in GetOrders and other order
     * retrieval API calls. Shipping the item and providing proof of shipment can
     * expedite the process of payout to the seller's account.
     */
    @XmlEnumValue("ReadyToShip")
    READY_TO_SHIP("ReadyToShip"),

    /**
     * This notification is sent to a DE or AT seller when a seller payout for an order
     * (subject to the new eBay payment process) is scheduled to be distributed to the seller's
     * account in the next disbursement cycle. This notification is triggered and sent
     * when the value of PaymentHoldStatus is 'Complete' in GetOrders and other order
     * retrieval API calls.
     */
    @XmlEnumValue("ReadyForPayout")
    READY_FOR_PAYOUT("ReadyForPayout"),

    /**
     * A notification type where the listing of the bid item is about
     * to end. This event has a property with which caller can specify the TimeLeft
     * before the listing ends.
     * <br><br>
     * Applies to Buyers.
     */
    @XmlEnumValue("BidItemEndingSoon")
    BID_ITEM_ENDING_SOON("BidItemEndingSoon"),

    /**
     * This notification is sent to the subscribed buyer or seller (or application)
     * when a return is created.
     */
    @XmlEnumValue("ReturnCreated")
    RETURN_CREATED("ReturnCreated"),

    /**
     * This notification is sent to the subscribed seller (or application)
     * when a return is waiting for Seller information like RMA and Return Address.
     */
    @XmlEnumValue("ReturnWaitingForSellerInfo")
    RETURN_WAITING_FOR_SELLER_INFO("ReturnWaitingForSellerInfo"),

    /**
     * This notification is sent to the subscribed buyer or seller (or application)
     * when Seller information like RMA and Return Address is overdue.
     */
    @XmlEnumValue("ReturnSellerInfoOverdue")
    RETURN_SELLER_INFO_OVERDUE("ReturnSellerInfoOverdue"),

    /**
     * This notification is sent to the subscribed buyer or seller (or application)
     * when a return is shipped.
     */
    @XmlEnumValue("ReturnShipped")
    RETURN_SHIPPED("ReturnShipped"),

    /**
     * This notification is sent to the subscribed buyer or seller (or application)
     * when a return is delivered.
     */
    @XmlEnumValue("ReturnDelivered")
    RETURN_DELIVERED("ReturnDelivered"),

    /**
     * This notification is sent to the subscribed seller (or application)
     * when refund is overdue on a return.
     */
    @XmlEnumValue("ReturnRefundOverdue")
    RETURN_REFUND_OVERDUE("ReturnRefundOverdue"),

    /**
     * This notification is sent to the subscribed buyer or seller (or application)
     * when a return is closed.
     */
    @XmlEnumValue("ReturnClosed")
    RETURN_CLOSED("ReturnClosed"),

    /**
     * This notification is sent to the subscribed buyer or seller (or application)
     * when a return is escalated.
     */
    @XmlEnumValue("ReturnEscalated")
    RETURN_ESCALATED("ReturnEscalated"),

    /**
     * A notification type that is sent to German and Austrian sellers when eBay determines that
     * a buyer has paid less than or more than the order amount using the EFT payment method.
     * Upon receiving this notification, the seller can then either accept or reject the buyer's
     * payment amount through the site or by using the AcceptAdjustment or RejectAdjustment call
     * of the Order Adjustment API.
     */
    @XmlEnumValue("UnmatchedPaymentReceived")
    UNMATCHED_PAYMENT_RECEIVED("UnmatchedPaymentReceived"),

    /**
     * A notification type where sellers are notified when voluntary refunds are
     * successful.
     * <br><br>
     * This notification type is only applicable for DE/AT orders going through the new eBay
     * payment process.
     */
    @XmlEnumValue("RefundSuccess")
    REFUND_SUCCESS("RefundSuccess"),

    /**
     * A notification type where sellers are notified when voluntary refunds failed.
     * <br><br>
     * This notification type is only applicable for DE/AT orders going through the new eBay
     * payment process.
     */
    @XmlEnumValue("RefundFailure")
    REFUND_FAILURE("RefundFailure");
    private final String value;

    NotificationEventTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationEventTypeCodeType fromValue(String v) {
        for (NotificationEventTypeCodeType c : NotificationEventTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
