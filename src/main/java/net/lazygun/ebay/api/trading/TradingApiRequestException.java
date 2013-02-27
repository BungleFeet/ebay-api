package net.lazygun.ebay.api.trading;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ewan
 * Date: 27/02/13
 * Time: 18:46
 * To change this template use File | Settings | File Templates.
 */
public class TradingApiRequestException extends TradingApiException {
    public TradingApiRequestException(List<ErrorType> errors) {
        super(errors);
    }
}
