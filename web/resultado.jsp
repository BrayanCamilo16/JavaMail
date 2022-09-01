<%-- 
    Document   : resultado.jsp
    Created on : 21/06/2022, 12:06:07 PM
    Author     : Estirpe Nativa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <h1><%=request.getAttribute("resultado")%></h1>
    </body>
</html>
