<%-- 
    Document   : formulari_alta_llibre
    Created on : 31-mar-2015, 11:38:50
    Author     : Montse
--%>

<%@page errorPage="gestio_errors.jsp" contentType="text/html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="llibre" scope="request" class="model.Llibre" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta Llibres</title>
    </head>

    <body>

        <jsp:setProperty name="llibre" property="*" />
        <% if (request.getParameter("idLlibre") == null) {%>                                  
        Introducció de dades de llibres <br/>
        <form method="post">
            <p> Id de llibre: <input name="idLlibre" type="text" size="4"></p>
            <p> Títol del llibre: <input name="titol" type="text" size="20"></p>
            <p> Autor: <input name ="autor" type="text"> </p>
            <input type="submit" name="Inserir" value="Inserir Llibre"> 
        </form>
        <%} else {%>
        <jsp:forward page="Controlador?accio=insert"/>
        <%}%>
    </body>
</html>
