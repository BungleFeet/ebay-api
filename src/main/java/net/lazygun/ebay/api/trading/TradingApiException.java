package net.lazygun.ebay.api.trading;

import java.text.MessageFormat;
import java.util.ArrayList;
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

    private final List<ErrorType> errors;

    public TradingApiException(List<ErrorType> errors) {
        super(createMessage(errors));
        this.errors = new ArrayList<ErrorType>(errors);
    }

    public List<ErrorType> getErrors() {
        return Collections.unmodifiableList(errors);
    }

    public boolean isRetryable() {
        for (ErrorType error : errors) {
            if (!error.getErrorClassification().equals(ErrorClassificationCodeType.SYSTEM_ERROR))
                return false;
        }
        return true;
    }

    private static String createMessage(List<ErrorType> errors) {
        // Create an error message from the first error with ERROR severity, or the first error
        // of any severity if none exist. Format the message to include the error's long message,
        // classification, severity and error code.
        if (errors.size() == 0) return "<No errors>";
        ErrorType errorToReport = null;
        for (ErrorType error : errors) {
            if (error.getSeverityCode().equals(SeverityCodeType.ERROR)) {
                errorToReport = error;
                break;
            }
        }
        if (errorToReport == null) errorToReport = errors.get(0);
        return MessageFormat.format("{0} ({1} {2} {3})", errorToReport.getLongMessage(),
                                    errorToReport.getErrorClassification(),
                                    errorToReport.getSeverityCode(), errorToReport.getErrorCode());
    }

}
