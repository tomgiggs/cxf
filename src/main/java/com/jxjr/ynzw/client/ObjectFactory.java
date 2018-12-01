
package com.jxjr.ynzw.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jxjr.ynzw.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetData_QNAME = new QName("http://127.0.0.1:8787/Entrance", "getData");
    private final static QName _GetDataResponse_QNAME = new QName("http://127.0.0.1:8787/Entrance", "getDataResponse");
    private final static QName _GetText_QNAME = new QName("http://127.0.0.1:8787/Entrance", "getText");
    private final static QName _GetTextResponse_QNAME = new QName("http://127.0.0.1:8787/Entrance", "getTextResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jxjr.ynzw.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link GetText }
     * 
     */
    public GetText createGetText() {
        return new GetText();
    }

    /**
     * Create an instance of {@link GetTextResponse }
     * 
     */
    public GetTextResponse createGetTextResponse() {
        return new GetTextResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://127.0.0.1:8787/Entrance", name = "getData")
    public JAXBElement<GetData> createGetData(GetData value) {
        return new JAXBElement<GetData>(_GetData_QNAME, GetData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://127.0.0.1:8787/Entrance", name = "getDataResponse")
    public JAXBElement<GetDataResponse> createGetDataResponse(GetDataResponse value) {
        return new JAXBElement<GetDataResponse>(_GetDataResponse_QNAME, GetDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://127.0.0.1:8787/Entrance", name = "getText")
    public JAXBElement<GetText> createGetText(GetText value) {
        return new JAXBElement<GetText>(_GetText_QNAME, GetText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTextResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://127.0.0.1:8787/Entrance", name = "getTextResponse")
    public JAXBElement<GetTextResponse> createGetTextResponse(GetTextResponse value) {
        return new JAXBElement<GetTextResponse>(_GetTextResponse_QNAME, GetTextResponse.class, null, value);
    }

}
