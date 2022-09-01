<%-- 
    Document   : FormCorreo
    Created on : 21/06/2022, 11:56:14 AM
    Author     : Estirpe Nativa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Correo</title>
    </head>
    <body>
        <form action="ParametrosCorreo" method="POST">
            <label>Destino</label>
            <input type="text" name="destinatario"><br>
            
            <label>Asunto</label>
            <input type="text" name="asunto"><br>
            
            <label>Mensaje</label>
            <textarea rows="10" name="contenido"></textarea><br>
            
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
