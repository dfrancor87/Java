<%-- 
    Document   : jsp8registrar
    Created on : 09-mar-2015, 9:06:17
    Author     : Montse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar usuari</title>
    </head>
    <body>
        <h1> Nou registre </h1>
        <% if (request.getParameter("nom") == null) {%>
        <form action="jsp8Registrar.jsp" method="post">
            Nom <input type="text" name="nom" size="20"/><br/>
            Clau <input type="password" name="clau" size="20"  /> <br/>
            <input type="submit" value="Entrar"/>
        </form>
        <% } else {
            
            out.print("Registre efectuat..."); //aixo no es veu a la pàgina pq hi ha un forward
        %>
        <jsp:forward page="jsp6IniciSessio.jsp" />

        <% }%>
    </body>
</html>
