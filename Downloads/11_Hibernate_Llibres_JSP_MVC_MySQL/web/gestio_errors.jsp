<%-- 
    Document   : gestio_errors
    
    Author     : Montse
--%>

<%@ page import="model.LlibreRepetitException"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" contentType="text/html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Houston, houston, tenemos un problema</title>
    </head>
    <body>

        <%
            if (exception.getCause() instanceof LlibreRepetitException) {
                out.print("Ho lamento: no podem tenir llibres amb el mateix identificador\n");
            } else {
                String s = exception.getMessage();
                out.print(s);
                out.print("Un altre error");
            }

        %>






    </body>
</html>
