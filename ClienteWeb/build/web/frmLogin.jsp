<%-- 
    Document   : frmLogin
    Created on : 04-mar-2020, 20:04:01
    Author     : patri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form method="post" action="controlador"> 
                <table> 
                        <tr> 
                                <td> 
                                        <input type="hidden" name="op" value="comprobarLogin"/> 
                                        <p>Nombre:</p>
                                        <input name="idUser" required type="text" size="20"  maxlength="20"/> 
                                        <p>Contraseña:</p>
                                        <input type="password" name="password" required type="text" size="20"  maxlength="20"/> 
                                        <p></p>
                                </td> 
                        </tr> 
                        <tr> 
                                <td> 
                                        <input type="submit" value="ENTRAR"/>  
                                </td> 
                        </tr> 
                </table> 
        </form> 
    </body>
</html>
