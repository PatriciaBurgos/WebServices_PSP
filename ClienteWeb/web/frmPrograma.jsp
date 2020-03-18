<%-- 
    Document   : frmPrograma
    Created on : 04-mar-2020, 20:40:24
    Author     : patri
--%>

<%@page import="Controlador.controlador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Programa</title>
    </head>
    <body>
        <h1>C++</h1>
        <%String salida = controlador.mateo();%>
        <h3><%=salida%></h3>
        <form name="frm_muestra" method="post" action="controlador">
            <input type="hidden" name="op" value="" />           
            <a href="javascript:void(0)" onclick="javascript:document.frm_muestra.op.value='menu'; document.frm_muestra.submit();">Volver al MENU</a>
        </form>
    </body>    
</html>
