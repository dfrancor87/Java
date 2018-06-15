<%-- 
    Document   : eliminarPelicula
    Created on : 02-may-2018, 19:15:40
    Author     : Danny Franco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar peliculas</title>
    </head>
    <body>
        <h4>Eliminar peliculas</h4>
        <form action="ControladorForm?accion=deletePeli" method="post">
            <label>¿id de la pelicula a eliminar? <br />
                <input type="text" name="idPelicula" />
            </label>
            <input type="submit" name="Eliminar" value="Eliminar Personaje"> 
        </form>
    </body>
</html>
