<%-- 
    Document   : registrar_amb_errors.jsp
    Created on : 10-may-2017, 19:36:13
    Author     : montse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="usu" scope="request" class="model.Usuari" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nou usuari</title>
    </head>
    <body>
        <h1> Nou usuari </h1>
        <jsp:setProperty name="usu" property="*" />
        <% 
        String missError=(String)request.getSession().getAttribute("error");
        if(missError!=null) out.print(missError);
        //elimina l'atribut, sino, cada request guarda el mateix valor del principi
        request.getSession().removeAttribute("error");      
        %>
        <% if (request.getParameter("id") == null) {%>                                  
        <br/>Dades de l'usuari <br/>
        <form method="post">
            <!-- els name dels formularis han de coincidir amb els atributs del POJO -->
            <!-- sino, no va... -->
            <p> email o id <input name="id" type="text" size="20" required></p>
            <p> password <input name="password" type="password" size="20" required></p>
            <p> nom <input type ="text" name="nom" size="40" required/> </p>
            <input type="submit" name="Inserir" value="Nou usuari"> 
        </form>
        <%} else {%>
        <jsp:forward page="ControladorUsuaris_amb_errors?accio=registre"/>
        <%}%>
    </body>
</html>
