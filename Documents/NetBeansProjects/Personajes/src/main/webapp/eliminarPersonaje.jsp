<%-- 
    Document   : eliminar_personaje
    Created on : 02-may-2018, 18:57:23
    Author     : Danny Franco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar personajes</title>
    </head>
    <body>
        <h4>Al eliminar un personaje, tambien eliminará sus peliculas</h4>
        <form action="ControladorForm?accion=delete" method="post">
            <label>¿id del personaje a eliminar? <br />
                <input type="text" name="idPersonaje" />
            </label>
            <input type="submit" name="Eliminar" value="Eliminar Personaje"> 
        </form>
    </body>
</html>
