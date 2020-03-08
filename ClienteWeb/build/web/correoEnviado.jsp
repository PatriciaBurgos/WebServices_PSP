<%-- 
    Document   : correoEnviado
    Created on : 08-mar-2020, 16:25:34
    Author     : patri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Correo</title>
    </head>
    <body>
        <h1>Correo Enviado</h1>
        <form name="frm_muestra" method="post" action="controlador">
            <input type="hidden" name="op" value="" />           
            <a href="javascript:void(0)" onclick="javascript:document.frm_muestra.op.value='menu'; document.frm_muestra.submit();">Volver al MENU</a>
        </form>
    </body>
</html>
