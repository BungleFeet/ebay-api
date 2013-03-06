package net.lazygun.ebay.api.trading;

import java.util.Arrays;

/**
 * Utility class for processing {@link ErrorType} instances returned in {@link AbstractResponseType} responses from the
 * eBay Trading API
 *
 * @author Ewan Dawson
 */
public class TradingApiExceptionHandler {

    /**
     * Examines the response and throws a {@link TradingApiException} if it is found to contain any errors of severity
     * {@link SeverityCodeType#ERROR}. No action is taken if the response contains warnings.
     *
     * @param response the {@link AbstractResponseType} to examine for serious errors
     * @throws TradingApiException if the response contains errors
     */
    public static void throwOnError(AbstractResponseType response) {
        if (response.getErrorsLength() == 0) return;
        ErrorType[] errors = response.getErrors();
        for (ErrorType error : response.getErrors()) {
            if (error.getSeverityCode().equals(SeverityCodeType.ERROR))
                throw new TradingApiException(Arrays.asList(errors));
        }
    }

}
