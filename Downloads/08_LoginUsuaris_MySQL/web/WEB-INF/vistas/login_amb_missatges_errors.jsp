<%-- 
    Document   : login_amb_missatges_errors.jsp
    Created on : 10-may-2017, 17:03:10
    Author     : montse
--%>

<jsp:useBean id="usu" scope="request" class="model.Usuari" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entrada al sistema</title>
    </head>
    <body>
        <h1> Entrada al sistema </h1>
        <jsp:setProperty name="usu" property="*" />
        <% 
        String missError=(String)request.getSession().getAttribute("error");
        if(missError!=null) out.print(missError);
        //elimina l'atribut, sino, cada request guarda el mateix valor del principi
        request.getSession().removeAttribute("error");      
        %>
        
        <% 
            if (request.getParameter("id") == null) { %>
        <form method="post">
            email o id<input type="text" name="id" size="20" required/><br/>
            password    <input type="password" name="password" size="20"  required/> <br/>
            <input type="submit" value="Entrar"/>
        </form>
       
        <% } else {%>
        
        <jsp:forward page="<%=request.getContextPath()%>/ControladorUsuaris_amb_errors?accio=login"/>   

        <%  }
            %>
        Si és la primera vegada, <a href="registrar_amb_errors.jsp">registra't </a>
    </body>
</html>

