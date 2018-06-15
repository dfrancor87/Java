<%-- 
    Document   : listadoPersonaje
    Created on : 02-may-2018, 17:58:03
    Author     : Danny Franco
--%>
<%@page import="modelo.Personaje"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado Personajes</title>
    </head>
    <body>
        <h4>Listado de Personajes</h4>
        <table>   
            <tr><th>Id</th><th>Nombre</th><th>Alias</th></tr>       

            <% ArrayList<Personaje> l = (ArrayList<Personaje>) request.getAttribute("personaje");
                for (Personaje perso : l) {
                    out.print("<tr><td>" + perso.getId() + "</td>");
                    out.print("<td>" + perso.getNombre() + "</td>");
                    out.print("<td>" + perso.getAlias() + "</td>");
                    out.print(" </tr>");
                }
            %>
        </table>
    </body>
</html>
