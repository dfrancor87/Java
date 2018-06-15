<%-- 
    Document   : jsp6IniciSessio
    Created on : 08-mar-2015, 23:50:09
    Author     : Montse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Has entrat al sistema</title>
    </head>
    <body>
        <%String nom = request.getParameter("nom");%>
    
        <h1>Benvingut al sistema <%=nom%> </h1>
    </body>
</html>
