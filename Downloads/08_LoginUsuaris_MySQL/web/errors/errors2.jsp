<%-- 
    Document   : errors2.jsp
    Created on : 2017
    Author     : Montse
--%>



<%@page import="model.UsuariRepetitException"%>
<%@page import="model.UsuariInexistentException"%>
<%@page import="model.PasswordIncorrecteException"%>
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
        out.print("Hola, això son errors en una carpeta diferent");
        if(exception.getCause() instanceof PasswordIncorrecteException){
        out.print("Ho lamento: el password sembla que no coincideix\n");}
        else {
            if(exception.getCause() instanceof UsuariInexistentException){
            out.print("Ho lamento: sembla que l'identificador no existeix\n");}
            else{
                if(exception.getCause() instanceof UsuariRepetitException){
                    out.print("Ho lamento: sembla que aquest identificador ja existeix");
                }
                else out.print("Ho lamento: error desconegut");
        }
          
        }
       
        
%>
        
                 
                  
                
                  
                
    </body>
</html>
