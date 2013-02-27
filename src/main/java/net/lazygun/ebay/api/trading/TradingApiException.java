package net.lazygun.ebay.api.trading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Exception to be thrown when a subclass of {@link AbstractResponseType} contains serious errors. When populated with
 * the {@link ErrorType} array from the response, the exception can be interrogated to determine if the request may be
 * retried without modification. This logic is based on this <a href="http://developer.ebay.com/DevZone/XML/docs/Reference/eBay/Errors/ErrorMessages.htm"
 * >list of eBay Trading API errors</a>.
 *
 * @author Ewan Dawson
 */
public class TradingApiException extends RuntimeException {

    public static final List<String> RETRYABLE_ERRORS = new ArrayList<String>();

    static {
        String retryable =
            "24,50,63,248,249,252,368,377,1050,3021,10007,10090,10091,10092,12214,17104,17108,17400,17401," +
                "17435,17546,17582,17777,20150,20191,20212,20213,20214,20378,20390,21122,21252,21260,21421,21422," +
                "21425,21428,21430,21852,21855,21910,219078,219255,219289,2190789,21916543,21916595,21916785,21916803," +
                "21917178,21917193,21917241,21917245,21917326,21917350,21919040,21919062,21919117";

        RETRYABLE_ERRORS.addAll(Arrays.asList(retryable.split(",")));
    }

    private final List<ErrorType> errors;

    public TradingApiException(List<ErrorType> errors) {
        this.errors = new ArrayList<ErrorType>(errors);
    }

    public List<ErrorType> getErrors() {
        return Collections.unmodifiableList(errors);
    }

    public boolean isRetryable() {
        for (ErrorType error : errors) {
            if (RETRYABLE_ERRORS.contains(error.getErrorCode()))
                return true;
        }
        return false;
    }
}
