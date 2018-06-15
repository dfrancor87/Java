<%-- 
    Document   : benvinguda_amb_sessio.jsp
    A aquesta jsp s'arriba des del servlet ControladorUsuaris_amb_errors.java 
    Created on : 10-may-2017, 17:10:19
    Author     : montse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String nom=(String)request.getSession().getAttribute("nom");
        %>
        <%//Exemple JSTL %>
        ${nom}
        <h1>Hola <%=nom%></h1>
    </body>
</html>
