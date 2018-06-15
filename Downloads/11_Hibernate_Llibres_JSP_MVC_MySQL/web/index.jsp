<%-- 
    Document   : index
    Created on : 2017
    Author     : Montse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <title></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        Operacions disponibles (alta, llistat i eliminació de llibres per id): <br/>
        <!-- llistat.jsp = vista -->
        <a href="Controlador?accio=llistat"> Llistat llibres</a> <br/>
        
        <!-- formulari_alta_llibre.jsp = vista;   insert= control -->
        <a href="Controlador?accio=alta"> Alta Llibre </a><br/>
        <!-- formulari_eliminar_llibre.jsp = vista; delete = control -->
        <a href="Controlador?accio=eliminar"> Eliminar llibre </a><br/>
       
    </body>
</html>
