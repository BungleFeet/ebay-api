package net.lazygun.ebay.api.trading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ewan
 * Date: 27/02/13
 * Time: 18:45
 * To change this template use File | Settings | File Templates.
 */
public class TradingApiException extends RuntimeException {

    private final List<ErrorType> errors;

    public TradingApiException(List<ErrorType> errors) {
        this.errors = new ArrayList<ErrorType>(errors);
    }

    public List<ErrorType> getErrors() {
        return Collections.unmodifiableList(errors);
    }
}
