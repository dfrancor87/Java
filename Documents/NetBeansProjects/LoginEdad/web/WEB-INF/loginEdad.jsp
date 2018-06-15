<%-- 
    Document   : loginEdad
    Created on : 21-mar-2018, 17:24:07
    Author     : Danny Franco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login edad</title>
    </head>
    <body>
        <h3>Login Edad</h3>
        <form action="loginEdad.jsp" method="post">
            Nom  <input type="text" name="nom" size="20"/><br/>
            Cognom  <input type="text" name="cognom" size="20"/><br/>
            edad <input type="number" name="edad" size="20"  /> <br/>
            <input type="submit" value="Entrar"/>
        </form>


        <%
            String requestEdad = request.getParameter("edad");
            String nom = request.getParameter("nom");
            String cognom = request.getParameter("cognom");
            int edad = Integer.parseInt(requestEdad);
            
            if (edad >= 18){
                 out.print("Benvingut al sistema "+nom);
            }else{
                out.print("Eres menor de edad");
            }
        %>
    </body>
</html>
