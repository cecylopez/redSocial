<%-- 
    Document   : header
    Created on : Nov 14, 2015, 12:59:21 AM
    Author     : Ceci
--%>

<%@page import="util.ManejadorSesiones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ManejadorSesiones m= new ManejadorSesiones();
    if(!m.usuarioEnSession(request)) {
        %> <script type="text/javascript">window.location.href = "Login.jsp"; </script> <%
    }
    
   %>