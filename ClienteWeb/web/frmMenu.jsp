<%-- 
    Document   : frmMenu
    Created on : 04-mar-2020, 20:34:33
    Author     : patri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MENU</title>
    </head>
    <body>
        <h1>Elige una opción del MENU</h1>
        <form name="frm_muestra" method="post" action="controlador">
            <input type="hidden" name="op" value="login">
            <table border="1">
                    <tr><td><input type="button" value="CALCULADORA" onclick="javascript:document.frm_muestra.op.value='Calculadora'; document.frm_muestra.submit()"></td></tr>
                    <tr><td><input type="button" value="C++" onclick="javascript:document.frm_muestra.op.value='Programa'; document.frm_muestra.submit()"></td></tr>                  
                    <tr><td><input type="button" value="CORREO ELECTRONICO" onclick="javascript:document.frm_muestra.op.value='Correo'; document.frm_muestra.submit()"></td></tr>
            </table>                    
        </form>
    </body>
</html>
