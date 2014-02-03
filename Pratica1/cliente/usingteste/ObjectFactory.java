
package usingteste;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the usingteste package. 
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

    private final static QName _TestandoOp1_QNAME = new QName("http://teste/", "TestandoOp1");
    private final static QName _TestandoOp1Response_QNAME = new QName("http://teste/", "TestandoOp1Response");
    private final static QName _TestandoOp_QNAME = new QName("http://teste/", "TestandoOp");
    private final static QName _TestandoOpResponse_QNAME = new QName("http://teste/", "TestandoOpResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: usingteste
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestandoOpResponse }
     * 
     */
    public TestandoOpResponse createTestandoOpResponse() {
        return new TestandoOpResponse();
    }

    /**
     * Create an instance of {@link TestandoOp1Response }
     * 
     */
    public TestandoOp1Response createTestandoOp1Response() {
        return new TestandoOp1Response();
    }

    /**
     * Create an instance of {@link TestandoOp1 }
     * 
     */
    public TestandoOp1 createTestandoOp1() {
        return new TestandoOp1();
    }

    /**
     * Create an instance of {@link TestandoOp }
     * 
     */
    public TestandoOp createTestandoOp() {
        return new TestandoOp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestandoOp1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://teste/", name = "TestandoOp1")
    public JAXBElement<TestandoOp1> createTestandoOp1(TestandoOp1 value) {
        return new JAXBElement<TestandoOp1>(_TestandoOp1_QNAME, TestandoOp1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestandoOp1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://teste/", name = "TestandoOp1Response")
    public JAXBElement<TestandoOp1Response> createTestandoOp1Response(TestandoOp1Response value) {
        return new JAXBElement<TestandoOp1Response>(_TestandoOp1Response_QNAME, TestandoOp1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestandoOp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://teste/", name = "TestandoOp")
    public JAXBElement<TestandoOp> createTestandoOp(TestandoOp value) {
        return new JAXBElement<TestandoOp>(_TestandoOp_QNAME, TestandoOp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestandoOpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://teste/", name = "TestandoOpResponse")
    public JAXBElement<TestandoOpResponse> createTestandoOpResponse(TestandoOpResponse value) {
        return new JAXBElement<TestandoOpResponse>(_TestandoOpResponse_QNAME, TestandoOpResponse.class, null, value);
    }

}
