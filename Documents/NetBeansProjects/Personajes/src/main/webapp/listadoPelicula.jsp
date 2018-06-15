<%-- 
    Document   : listadoPelicula
    Created on : 02-may-2018, 18:28:03
    Author     : Danny Franco
--%>
<%@page import="modelo.Personaje"%>
<%@page import="modelo.Pelicula"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado pelicula</title>
    </head>
    <body>
        <h4>Listado de Peliculas</h4>
        <table>   
            <tr><th>Id</th><th>Nombre</th><th>Protagonista</th></tr>       

            <% ArrayList<Pelicula> l = (ArrayList<Pelicula>) request.getAttribute("pelicula");
                for (Pelicula peli : l) {
                    out.print("<tr><td>" + peli.getId() + "</td>");
                    out.print("<td>" + peli.getNombrePelicula() + "</td>");
                    out.print("<td>" + peli.getPersonaje().getAlias()+ "</td>");
                    out.print(" </tr>");
                }
            %>
        </table>
    </body>
</html>
