<%-- 
    Document   : llistat_llibres
    Created on : 2017
    Author     : Montse
--%>

<%@page import="model.Llibre"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Llistat llibres</title>
    </head>
    <body>
        Llistat de llibres
        
             
        <table>   
            <tr><th>Id</th><th>Títol</th><th> Autor</th></tr>       
        
        <% ArrayList<Llibre> l=(ArrayList<Llibre>)request.getAttribute("llibres");         
            for(Llibre book: l){
                 out.print("<tr><td>"+book.getIdLlibre()+"</td>");
                 out.print("<td>"+book.getTitol()+"</td>");
                 out.print("<td>"+book.getAutor()+"</td>");         
                 out.print(" </tr>");
            }
            %>
       </table>
    </body>
</html>

