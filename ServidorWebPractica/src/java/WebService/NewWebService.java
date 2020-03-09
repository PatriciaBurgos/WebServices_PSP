/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.StringJoiner;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author patri
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public Boolean login(@WebParam(name = "login") String login, @WebParam(name = "pass") String pass) {
        boolean check = false;
        Session s = ORM.NewHibernateUtil.getInstance().getSessionFactory().openSession();
        try{
            Query q = s.createQuery("FROM User").setReadOnly(true);
            List<ORM.User> usuarios = (List<ORM.User>)
                    q.list();

            if(usuarios.isEmpty()) { 
                System.out.println("No existen usuarios");
            } else {
         
                for(ORM.User unUser: usuarios){
                    if(login.equals(unUser.getIdUser()) && pass.equals(unUser.getPassword())){
                        check = true;
                    }
                }
            }
            
        }catch (Exception e){
            e.printStackTrace(System.err);
        }
              
        return check;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public String suma(@WebParam(name = "dig1") String dig1, @WebParam(name = "dig2") String dig2) {
        String res = "";
        double result = Double.parseDouble(dig1) + Double.parseDouble(dig2);
        res = String.valueOf(result);
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "resta")
    public String resta(@WebParam(name = "res1") String res1, @WebParam(name = "res2") String res2) {
        String res = "";
        double result = Double.parseDouble(res1) - Double.parseDouble(res2);
        res = String.valueOf(result);
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplicacion")
    public String multiplicacion(@WebParam(name = "mul1") String mul1, @WebParam(name = "mul2") String mul2) {
        String res = "";
        double result = Double.parseDouble(mul1) * Double.parseDouble(mul2);
        res = String.valueOf(result);
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "division")
    public String division(@WebParam(name = "div1") String div1, @WebParam(name = "div2") String div2) {
        String res = "";
        double result = Double.parseDouble(div1) / Double.parseDouble(div2);
        res = String.valueOf(result);
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "programa")
    public String programa() {
        Runtime app = Runtime.getRuntime();
        String resultado="";
        try{
            Process p = app.exec("C:\\Users\\patri\\Documents\\Proyecto1.exe");
            //app.exec("C:\\Program Files (x86)\\Windows NT\\Accessories\\wordpad.exe");
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            resultado = reader.readLine();
        }catch(Exception e){
            System.out.println(e);
        }
        
        return resultado;
    }

    
        
}
