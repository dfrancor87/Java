<%-- 
    Document   : 1_formulari_alta
    Created on : 28-mar-2017, 23:12:06
    Author     : Prof1
--%>


<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="bean" scope="request" class="model.BeanProva" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulari Alta Bean Prova</title>
    </head>
    <body>

        <jsp:setProperty name="bean" property="*" />
        <% if (request.getParameter("nom") == null) {%>                                  
        Introducció de dades de prova <br/>
        <form method="post">
            <p> Numero (int): <input name="numero" type="text" size="4"></p>
            <p> Nom (String): <input name="nom" type="text" size="20"></p>
            <p> Preu (double): <input name ="preu" type="text"> </p>
            <p> Necessari (boolean): <input  name="necessari" type="radio" value="true"> </p>
            <input type="submit" name="InserirBeanProva" value="Inserir BeanProva"> 
        </form>
        <%} else {%>
        <jsp:forward page="ControladorBeanProva?accio=insertBeanProva"/>
        <%}%>
    </body>
</html>
