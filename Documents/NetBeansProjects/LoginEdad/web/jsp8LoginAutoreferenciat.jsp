<%-- 
    Document   : jsp8LoginAutoreferenciat
    Created on : 09-mar-2015, 8:53:25
    Author     : Montse
--%>

<%@ page contentType="text/html"%>
<%@ page pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Entrada al sistema</title>
    </head>
    <body>
        <!-- <h1> Entrada al sistema </h1> -->
        <% if (request.getParameter("nom") == null) {%>
        <form action="jsp8LoginAutoreferenciat.jsp" method="post">
            Nom  <input type="text" name="nom" size="20"/><br/>
            Cognom  <input type="text" name="cognom" size="20"/><br/>
            edad <input type="number" name="edad" size="20"  /> <br/>

            <input type="submit" value="Entrar"/>
        </form>
        Si és la primera vegada, <a href="jsp8Registrar.jsp">registra't </a>
        <% } else {
            int edad = Integer.parseInt(request.getParameter("edad"));
           
            if (edad >= 18) {              
        %>

        <jsp:forward page="jsp6IniciSessio.jsp">
            <jsp:param name="nom"   value ="<%=request.getParameter("nom")%>"/>
        </jsp:forward>    


        <%  } else {
            out.print("Eres menor de edad");

            // response.sendRedirect("jsp8LoginAutoreferenciat.jsp");
        %>
        <br/>
        <a href="jsp8LoginAutoreferenciat.jsp">Torni a provar </a>
        <%                    }
            }
        %>

    </body>
</html>



