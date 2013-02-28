package net.lazygun.ebay.api.trading;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ewan
 * Date: 28/02/13
 * Time: 09:26
 * To change this template use File | Settings | File Templates.
 */
public class RequestHeaders {

    public static String DEFAULT_COMPATIBILITY_LEVEL = "805";
    public static String DEFAULT_SITE_ID = "3";

    private final String applicationId;
    private final String developerId;
    private final String certificateId;
    private final String siteId = DEFAULT_SITE_ID;
    private final String compatibilityLevel = DEFAULT_COMPATIBILITY_LEVEL;
    private String callName = "GeteBayOfficialTime";

    public RequestHeaders(String applicationId, String developerId, String certificateId) {
        this.applicationId = applicationId;
        this.developerId = developerId;
        this.certificateId = certificateId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getDeveloperId() {
        return developerId;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getCompatibilityLevel() {
        return compatibilityLevel;
    }

    public String getCallName() {
        return callName;
    }

    public RequestHeaders withCallName(String callName) {
        RequestHeaders answer = new RequestHeaders(applicationId, developerId, certificateId);
        answer.callName = callName;
        return answer;
    }

    public RequestHeaders withCallName(Class<? extends AbstractRequestType> requestType) {
        return withCallName(requestType.getSimpleName().replace("RequestType", ""));
    }

    public Map<String, String> toMap() {
        Map<String, String> answer = new HashMap<String, String>(5);
        answer.put("X-EBAY-API-COMPATIBILITY-LEVEL", compatibilityLevel);
        answer.put("X-EBAY-API-DEV-NAME", developerId);
        answer.put("X-EBAY-API-APP-NAME", applicationId);
        answer.put("X-EBAY-API-CERT-NAME", certificateId);
        answer.put("X-EBAY-API-SITEID", siteId);
        answer.put("X-EBAY-API-CALL-NAME", callName);
        return answer;
    }
}
