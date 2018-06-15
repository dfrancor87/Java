<%-- 
    Document   : 2_llistat
    Created on : 28-mar-2017, 23:34:40
    Author     : Prof1
--%>

<%@page import="model.BeanProva"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% if (request.getAttribute("beans") == null) {%> 
        <h1>Vols fer un llistat dels beans? clica!</h1>
        <a href="ControladorBeanProva?accio=llistat"> Llistat Beans</a> <br/>
        <% } else {%>
        <% out.print("<table>"); %>
            <% ArrayList<BeanProva> llista=(ArrayList<BeanProva>)request.getAttribute("beans");         
            for(BeanProva bp: llista){             
                 out.print("<tr><td>"+bp.getNumero()+"</td>");
                 out.print("<td>"+bp.getNom()+"</td>");
                 out.print("<td>"+bp.getPreu()+"</td>");
                 out.print("<td>"+bp.isNecessari()+"</td>");
                 out.print("<br/> </tr>");
            }
            out.print("</table>");
            %>    
                <%} %>
    </body>
</html>