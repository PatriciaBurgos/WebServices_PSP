<%-- 
    Document   : frmCorreo
    Created on : 04-mar-2020, 20:41:01
    Author     : patri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Correo</h1>
        <form name="frm_muestra" method="post" action="controlador">
            <table>
                <input type="hidden" name="op" value="" />                
                <tr>
                    <td>Destino: <input type="String" name="destino" value=""></td>
                </tr>
                <tr>
                    <td>Asunto: <input type="String" name="asunto" value=""></td>
                </tr>
                <tr>
                    <td>Texto: <input type="String" name="texto" value=""></td>
                </tr>
                <tr>
                    <td><input type="button" value="ENVIAR" onclick="javascript:document.frm_muestra.op.value='enviar';
                        document.frm_muestra.submit()"></td>       
                </tr>
            </table>
            
            <a href="javascript:void(0)" onclick="javascript:document.frm_muestra.op.value='menu'; document.frm_muestra.submit();">Volver al MENU</a>
       
        </form>
    </body>
</html>
