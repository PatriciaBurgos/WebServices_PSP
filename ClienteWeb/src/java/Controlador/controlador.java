/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ORM.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 *
 * @author patri
 */
@WebServlet(name = "controlador", urlPatterns = {"/controlador"}, initParams = {
    @WebInitParam(name = "op", value = "")})
public class controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, AddressException, MessagingException {
        
            String oper = request.getParameter("op");
            if(oper==null){ oper = "";}
            
            RequestDispatcher rd;

            switch (oper){
                case "login":
                    response.sendRedirect("frmLogin.jsp");
                    break;
                case "menu":
                    response.sendRedirect("frmMenu.jsp");
                    break;
                case "comprobarLogin":
                    String usuario = request.getParameter("idUser");
                    String pass = request.getParameter("password");
                    System.out.println("usuario= " + usuario);
                    System.out.println("pass= " + pass);
                    //INVOCACIÓN DEL WEBSERVICE
                    boolean check = login(usuario,pass);
                    //CAPTAR RESUPUESTA WEBSERVICE
                    if(check==true){
                        response.sendRedirect("frmMenu.jsp");             
                    }else{
                        response.sendRedirect("frmLogin.jsp");                        
                    }
                    break;
                case "Calculadora":
                    response.sendRedirect("frmCalculadora.jsp");
                    break;
                case "solucion":
                    rd = request.getRequestDispatcher("solucionCalculadora.jsp");
                    rd.forward(request,response);
                    break;
                case "Programa":
                    response.sendRedirect("frmPrograma.jsp");
                    break;
                case "Correo":
                    response.sendRedirect("frmCorreo.jsp");
                    break;
                case "enviar":
                    String remitente = "";
                    String clave = "";
                    String destino = request.getParameter("destino");
                    String asunto = request.getParameter("asunto");
                    String texto = request.getParameter("texto");
                            
                    correo(remitente,clave,destino,asunto,texto);  
                    
                    response.sendRedirect("correoEnviado.jsp");
                    break;
                default:
                    response.sendRedirect("frmLogin.jsp");
            }
        }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (MessagingException ex) {
            Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (MessagingException ex) {
            Logger.getLogger(controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static Boolean login(java.lang.String login, java.lang.String pass) {
        webservice.NewWebService_Service service = new webservice.NewWebService_Service();
        webservice.NewWebService port = service.getNewWebServicePort();
        return port.login(login, pass);
    }

    public static String suma(java.lang.String dig1, java.lang.String dig2) {
        webservice.NewWebService_Service service = new webservice.NewWebService_Service();
        webservice.NewWebService port = service.getNewWebServicePort();
        return port.suma(dig1, dig2);
    }

    public static String resta(java.lang.String res1, java.lang.String res2) {
        webservice.NewWebService_Service service = new webservice.NewWebService_Service();
        webservice.NewWebService port = service.getNewWebServicePort();
        return port.resta(res1, res2);
    }

    public static String multiplicacion(java.lang.String mul1, java.lang.String mul2) {
        webservice.NewWebService_Service service = new webservice.NewWebService_Service();
        webservice.NewWebService port = service.getNewWebServicePort();
        return port.multiplicacion(mul1, mul2);
    }

    public static String division(java.lang.String div1, java.lang.String div2) {
        webservice.NewWebService_Service service = new webservice.NewWebService_Service();
        webservice.NewWebService port = service.getNewWebServicePort();
        return port.division(div1, div2);
    }

    public static String programa() {
        webservice.NewWebService_Service service = new webservice.NewWebService_Service();
        webservice.NewWebService port = service.getNewWebServicePort();
        return port.programa();
    }

    private static void correo(java.lang.String remitente, java.lang.String clave, java.lang.String destino, java.lang.String asunto, java.lang.String texto) {
        webservice.Correo_Service service = new webservice.Correo_Service();
        webservice.Correo port = service.getCorreoPort();
        port.correo(remitente, clave, destino, asunto, texto);
    } 

    public static String mateo() {
        webservice.NewWebService_Service service = new webservice.NewWebService_Service();
        webservice.NewWebService port = service.getNewWebServicePort();
        return port.mateo();
    }


}
