<%-- 
    Document   : formulari_eliminar_llibre
    Created on : 31-mar-2015, 18:39:20
    Author     : Montse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar llibres</title>
    </head>
    <body>
        
        <form action="Controlador?accio=delete" method="post">
       <label> Quin id de llibre vols eliminar? <br />
          <input type="text" name="idLlibre" />
       </label>
            <input type="submit" name="Eliminar" value="Eliminar llibre"> 
        </form>
    </body>
</html>
