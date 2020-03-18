
package WSMateo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NewWebService", targetNamespace = "http://controller/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewWebService {


    /**
     * 
     * @param pass
     * @param user
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://controller/", className = "WSMateo.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://controller/", className = "WSMateo.LoginResponse")
    @Action(input = "http://controller/NewWebService/loginRequest", output = "http://controller/NewWebService/loginResponse")
    public Boolean login(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "pass", targetNamespace = "")
        String pass);

    /**
     * 
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "helloPatri", targetNamespace = "http://controller/", className = "WSMateo.HelloPatri")
    @ResponseWrapper(localName = "helloPatriResponse", targetNamespace = "http://controller/", className = "WSMateo.HelloPatriResponse")
    @Action(input = "http://controller/NewWebService/helloPatriRequest", output = "http://controller/NewWebService/helloPatriResponse")
    public String helloPatri(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre);

    /**
     * 
     * @param numer1
     * @param numer2
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multi", targetNamespace = "http://controller/", className = "WSMateo.Multi")
    @ResponseWrapper(localName = "multiResponse", targetNamespace = "http://controller/", className = "WSMateo.MultiResponse")
    @Action(input = "http://controller/NewWebService/multiRequest", output = "http://controller/NewWebService/multiResponse")
    public Double multi(
        @WebParam(name = "numer1", targetNamespace = "")
        double numer1,
        @WebParam(name = "numer2", targetNamespace = "")
        double numer2);

    /**
     * 
     * @param numer1
     * @param numer2
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "division", targetNamespace = "http://controller/", className = "WSMateo.Division")
    @ResponseWrapper(localName = "divisionResponse", targetNamespace = "http://controller/", className = "WSMateo.DivisionResponse")
    @Action(input = "http://controller/NewWebService/divisionRequest", output = "http://controller/NewWebService/divisionResponse")
    public Double division(
        @WebParam(name = "numer1", targetNamespace = "")
        double numer1,
        @WebParam(name = "numer2", targetNamespace = "")
        double numer2);

    /**
     * 
     * @param numer1
     * @param numer2
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suma", targetNamespace = "http://controller/", className = "WSMateo.Suma")
    @ResponseWrapper(localName = "sumaResponse", targetNamespace = "http://controller/", className = "WSMateo.SumaResponse")
    @Action(input = "http://controller/NewWebService/sumaRequest", output = "http://controller/NewWebService/sumaResponse")
    public Double suma(
        @WebParam(name = "numer1", targetNamespace = "")
        double numer1,
        @WebParam(name = "numer2", targetNamespace = "")
        double numer2);

    /**
     * 
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "randnumber", targetNamespace = "http://controller/", className = "WSMateo.Randnumber")
    @ResponseWrapper(localName = "randnumberResponse", targetNamespace = "http://controller/", className = "WSMateo.RandnumberResponse")
    @Action(input = "http://controller/NewWebService/randnumberRequest", output = "http://controller/NewWebService/randnumberResponse")
    public Integer randnumber();

    /**
     * 
     * @param numero1
     * @param numero2
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resta", targetNamespace = "http://controller/", className = "WSMateo.Resta")
    @ResponseWrapper(localName = "restaResponse", targetNamespace = "http://controller/", className = "WSMateo.RestaResponse")
    @Action(input = "http://controller/NewWebService/restaRequest", output = "http://controller/NewWebService/restaResponse")
    public Double resta(
        @WebParam(name = "numero1", targetNamespace = "")
        double numero1,
        @WebParam(name = "numero2", targetNamespace = "")
        double numero2);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://controller/", className = "WSMateo.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://controller/", className = "WSMateo.HelloResponse")
    @Action(input = "http://controller/NewWebService/helloRequest", output = "http://controller/NewWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param asunto
     * @param cuerpo
     * @param destinatario
     */
    @WebMethod
    @RequestWrapper(localName = "mail", targetNamespace = "http://controller/", className = "WSMateo.Mail")
    @ResponseWrapper(localName = "mailResponse", targetNamespace = "http://controller/", className = "WSMateo.MailResponse")
    @Action(input = "http://controller/NewWebService/mailRequest", output = "http://controller/NewWebService/mailResponse")
    public void mail(
        @WebParam(name = "destinatario", targetNamespace = "")
        String destinatario,
        @WebParam(name = "asunto", targetNamespace = "")
        String asunto,
        @WebParam(name = "cuerpo", targetNamespace = "")
        String cuerpo);

}
