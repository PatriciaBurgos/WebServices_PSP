/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import java.util.Properties;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author patri
 */
@WebService(serviceName = "Correo")
public class Correo {

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
    @WebMethod(operationName = "correo")
    public void correo(@WebParam(name = "remitente") String remitente, @WebParam(name = "clave") String clave, @WebParam(name = "destino") String destino, @WebParam(name = "asunto") String asunto, @WebParam(name = "texto") String texto) {
        Properties props = System.getProperties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.user", remitente);
        props.put("mail.smtp.clave", clave);
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.starttls.enable", "true"); 
        props.put("mail.smtp.port", "25"); 
        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
                message.setFrom(new InternetAddress(remitente));
                message.addRecipients(Message.RecipientType.TO, destino);
                message.setSubject(asunto);
                message.setText(texto);
                Transport transport = session.getTransport("smtp");
                transport.connect("smtp.gmail.com", remitente, clave);
                transport.sendMessage(message, message.getAllRecipients());
                transport.close();
        }
        catch (MessagingException me) {
                me.printStackTrace();   //Si se produce un error
        }       
    }
}
