package net.lazygun.ebay.api.trading

import spock.lang.Specification

import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBIntrospector
import javax.xml.bind.Marshaller
import javax.xml.bind.Unmarshaller

class TradingApiExceptionHandlerTest extends Specification {

    def token = System.properties.token
    def endpoint = new URL(System.getProperty('endpoint') ?: "https://api.sandbox.ebay.com/ws/api.dll")
    def headers = new RequestHeaders(System.getProperty('appId'), System.getProperty('devId'), System.getProperty('certId'))
        .withCallName(GeteBayOfficialTimeRequestType)
    Marshaller marshaller
    Unmarshaller unmarshaller
    def request


    URLConnection prepareConnection() {
        def connection = endpoint.openConnection() as HttpURLConnection
        headers.toMap().each { header, value -> connection.addRequestProperty(header, value as String) }
        connection.setDoOutput(true)
        connection.setRequestMethod('POST')
        connection
    }

    def setup() {
        def context = JAXBContext.newInstance('net.lazygun.ebay.api.trading')
        marshaller = context.createMarshaller()
        unmarshaller = context.createUnmarshaller()
        request = new GeteBayOfficialTimeRequestType()
        request.requesterCredentials = new XMLRequesterCredentialsType(eBayAuthToken: token)
    }

    def "TradingApiException is thrown when incorrect credentials are supplied"() {
        given:
        request = new GeteBayOfficialTimeRequestType()
        request.requesterCredentials = new XMLRequesterCredentialsType(eBayAuthToken: "blah")

        when:
        def connection = prepareConnection()
        marshaller.marshal(request, connection.outputStream)
        TradingApiExceptionHandler.throwOnError JAXBIntrospector.getValue(unmarshaller.unmarshal(connection.content as InputStream)) as AbstractResponseType

        then:
        TradingApiException e = thrown()
        !e.retryable
    }

}
