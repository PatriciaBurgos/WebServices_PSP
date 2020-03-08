<%-- 
    Document   : solucionCalculadora
    Created on : 07-mar-2020, 18:30:12
    Author     : patri
--%>

<%@page import="Controlador.controlador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solucion</title>
    </head>
    <body>
        <h1>Resultado:</h1>
            <%
                String operador = request.getParameter("operador");
                String sum1 = request.getParameter("pri");
                String sum2 = request.getParameter("seg");
                String finali = "";
                if(operador.equals("+")){                    
                    finali = controlador.suma(sum1,sum2);
                }else if(operador.equals("-")){
                    finali = controlador.resta(sum1,sum2);
                }else if(operador.equals("x")){
                    finali = controlador.multiplicacion(sum1,sum2);
                }else if(operador.equals("/")){
                    finali = controlador.division(sum1,sum2);
                }else{
                    finali = "HA OCURRIDO UN ERROR";
                }
                
                if(finali.endsWith(".0")){
                    finali = finali.substring(0, finali.length()-2);
                }
            %>
        
        <h2><%=finali%></h2>
        <form name="frm_muestra" method="post" action="controlador">
            <input type="hidden" name="op" value="" />           
            <a href="javascript:void(0)" onclick="javascript:document.frm_muestra.op.value='menu'; document.frm_muestra.submit();">Volver al MENU</a>
        </form>
    </body>
</html>
