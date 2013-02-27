package net.lazygun.ebay.api.trading;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ewan
 * Date: 27/02/13
 * Time: 18:47
 * To change this template use File | Settings | File Templates.
 */
public class TradingApiExceptionHandler {

    public static final List<String> SYSTEM_ERRORS = new ArrayList<String>();

    static {
        SYSTEM_ERRORS.add(""); // TODO: Populate list of system errors
    }

    public AbstractResponseType throwOnError(AbstractResponseType response) {
        if (response.getErrorsLength() == 0) return response;

        List<ErrorType> systemErrors = new ArrayList<ErrorType>();
        List<ErrorType> requestErrors = new ArrayList<ErrorType>();

        for (ErrorType error : response.getErrors())
            if (error.getSeverityCode().equals(SeverityCodeType.ERROR))
                if (isSystemError(error)) systemErrors.add(error);
                else requestErrors.add(error);

        if (systemErrors.size() > 0)
            throw new TradingApiSystemException(systemErrors);
        if (requestErrors.size() > 0)
            throw new TradingApiRequestException(requestErrors);

        return response;
    }

    public boolean isSystemError(ErrorType error) {
        return SYSTEM_ERRORS.contains(error.getErrorCode());
    }
}
