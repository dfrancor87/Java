<%-- 
    Document   : formulario
    Created on : 29-abr-2018, 10:35:55
    Author     : Danny Franco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="perso" scope="request" class="modelo.Personaje" />
<jsp:useBean id="peli" scope="request" class="modelo.Pelicula" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Personaje y sus peliculas</title>
    </head>
    <body>
        <h3>Registrar Personaje</h3>
         <jsp:setProperty name="perso" property="*" />
          <% if (request.getParameter("nombre") == null){ %>                                  
           <form method="post">
            <!-- els name dels formularis han de coincidir amb els atributs del POJO -->
            <!-- sino, no va... -->
            <table>
                <th>Personaje</th>
                <tr><td>Nombre</td><td> <input name="nombre" type="text" size="30" required></td>
                <tr><td>Alias</td><td><input name="alias" type="text" size="30" required></td></tr>
                <th>Pelicula que actua</th>
                <tr><td>Nombre Pelicula</td>
                    <td><input name="nomPeli1" type="text" size="20" required></td>
                    <td><input name="nomPeli2" type="text" size="20" required></td></tr>
            </table>
            <input type="submit" name="inserir" value="Insertar personaje">
        </form>
        <%} else {%>
        <jsp:forward page="ControladorForm?accion=inserir"/>
        
        <%}%>
    </body>
</html>
