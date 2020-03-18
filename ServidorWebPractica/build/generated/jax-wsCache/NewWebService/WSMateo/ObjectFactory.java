
package WSMateo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WSMateo package. 
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

    private final static QName _Login_QNAME = new QName("http://controller/", "login");
    private final static QName _Multi_QNAME = new QName("http://controller/", "multi");
    private final static QName _HelloPatriResponse_QNAME = new QName("http://controller/", "helloPatriResponse");
    private final static QName _Randnumber_QNAME = new QName("http://controller/", "randnumber");
    private final static QName _Mail_QNAME = new QName("http://controller/", "mail");
    private final static QName _Suma_QNAME = new QName("http://controller/", "suma");
    private final static QName _SumaResponse_QNAME = new QName("http://controller/", "sumaResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://controller/", "loginResponse");
    private final static QName _MailResponse_QNAME = new QName("http://controller/", "mailResponse");
    private final static QName _HelloPatri_QNAME = new QName("http://controller/", "helloPatri");
    private final static QName _RestaResponse_QNAME = new QName("http://controller/", "restaResponse");
    private final static QName _Hello_QNAME = new QName("http://controller/", "hello");
    private final static QName _Resta_QNAME = new QName("http://controller/", "resta");
    private final static QName _MultiResponse_QNAME = new QName("http://controller/", "multiResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://controller/", "helloResponse");
    private final static QName _RandnumberResponse_QNAME = new QName("http://controller/", "randnumberResponse");
    private final static QName _Division_QNAME = new QName("http://controller/", "division");
    private final static QName _DivisionResponse_QNAME = new QName("http://controller/", "divisionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WSMateo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Suma }
     * 
     */
    public Suma createSuma() {
        return new Suma();
    }

    /**
     * Create an instance of {@link SumaResponse }
     * 
     */
    public SumaResponse createSumaResponse() {
        return new SumaResponse();
    }

    /**
     * Create an instance of {@link MailResponse }
     * 
     */
    public MailResponse createMailResponse() {
        return new MailResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Mail }
     * 
     */
    public Mail createMail() {
        return new Mail();
    }

    /**
     * Create an instance of {@link Randnumber }
     * 
     */
    public Randnumber createRandnumber() {
        return new Randnumber();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link HelloPatriResponse }
     * 
     */
    public HelloPatriResponse createHelloPatriResponse() {
        return new HelloPatriResponse();
    }

    /**
     * Create an instance of {@link Multi }
     * 
     */
    public Multi createMulti() {
        return new Multi();
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link RandnumberResponse }
     * 
     */
    public RandnumberResponse createRandnumberResponse() {
        return new RandnumberResponse();
    }

    /**
     * Create an instance of {@link MultiResponse }
     * 
     */
    public MultiResponse createMultiResponse() {
        return new MultiResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Resta }
     * 
     */
    public Resta createResta() {
        return new Resta();
    }

    /**
     * Create an instance of {@link HelloPatri }
     * 
     */
    public HelloPatri createHelloPatri() {
        return new HelloPatri();
    }

    /**
     * Create an instance of {@link RestaResponse }
     * 
     */
    public RestaResponse createRestaResponse() {
        return new RestaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "multi")
    public JAXBElement<Multi> createMulti(Multi value) {
        return new JAXBElement<Multi>(_Multi_QNAME, Multi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloPatriResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "helloPatriResponse")
    public JAXBElement<HelloPatriResponse> createHelloPatriResponse(HelloPatriResponse value) {
        return new JAXBElement<HelloPatriResponse>(_HelloPatriResponse_QNAME, HelloPatriResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Randnumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "randnumber")
    public JAXBElement<Randnumber> createRandnumber(Randnumber value) {
        return new JAXBElement<Randnumber>(_Randnumber_QNAME, Randnumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "mail")
    public JAXBElement<Mail> createMail(Mail value) {
        return new JAXBElement<Mail>(_Mail_QNAME, Mail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "suma")
    public JAXBElement<Suma> createSuma(Suma value) {
        return new JAXBElement<Suma>(_Suma_QNAME, Suma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "sumaResponse")
    public JAXBElement<SumaResponse> createSumaResponse(SumaResponse value) {
        return new JAXBElement<SumaResponse>(_SumaResponse_QNAME, SumaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "mailResponse")
    public JAXBElement<MailResponse> createMailResponse(MailResponse value) {
        return new JAXBElement<MailResponse>(_MailResponse_QNAME, MailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloPatri }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "helloPatri")
    public JAXBElement<HelloPatri> createHelloPatri(HelloPatri value) {
        return new JAXBElement<HelloPatri>(_HelloPatri_QNAME, HelloPatri.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "restaResponse")
    public JAXBElement<RestaResponse> createRestaResponse(RestaResponse value) {
        return new JAXBElement<RestaResponse>(_RestaResponse_QNAME, RestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "resta")
    public JAXBElement<Resta> createResta(Resta value) {
        return new JAXBElement<Resta>(_Resta_QNAME, Resta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "multiResponse")
    public JAXBElement<MultiResponse> createMultiResponse(MultiResponse value) {
        return new JAXBElement<MultiResponse>(_MultiResponse_QNAME, MultiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandnumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "randnumberResponse")
    public JAXBElement<RandnumberResponse> createRandnumberResponse(RandnumberResponse value) {
        return new JAXBElement<RandnumberResponse>(_RandnumberResponse_QNAME, RandnumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

}
