<%-- 
    Document   : frmCalculadora
    Created on : 04-mar-2020, 20:22:51
    Author     : patri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        <form name="frm_muestra" method="post" action="controlador">
            <input type="hidden" name="operador" />
            <table>
                <input type="hidden" name="op" value="suma" />
                <tr>
                    <td><input type="String" name="pri" value="0"></td>
                </tr>
                <tr>
                    <td><input type="String" name="seg" value="0"></td>
                </tr>
            </table>
            <table>
                <tr>
                    <td><input type="button" value="+" onclick="javascript:document.frm_muestra.op.value='solucion';
                        document.frm_muestra.operador.value='+';
                        document.frm_muestra.submit()"></td>            
                    <td><input type="button" value="-" onclick="javascript:document.frm_muestra.op.value='solucion'; 
                        document.frm_muestra.operador.value='-';
                        document.frm_muestra.submit()"></td>            
                    <td><input type="button" value="x" onclick="javascript:document.frm_muestra.op.value='solucion'; 
                        document.frm_muestra.operador.value='x';
                        document.frm_muestra.submit()"></td>            
                    <td><input type="button" value="/" onclick="javascript:document.frm_muestra.op.value='solucion'; 
                        document.frm_muestra.operador.value='/';
                        document.frm_muestra.submit()"></td>
                </tr>
            </table>
                  
            <a href="javascript:void(0)" onclick="javascript:document.frm_muestra.op.value='menu'; document.frm_muestra.submit();">Volver al MENU</a>
        
        </form>
    </body>
</html>
