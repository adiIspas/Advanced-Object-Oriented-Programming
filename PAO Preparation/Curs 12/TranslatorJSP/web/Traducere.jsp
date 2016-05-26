<%-- 
    Document   : Traducere
    Created on : May 26, 2016, 2:45:49 PM
    Author     : Adrian ISPAS
--%>

<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cuvantul cautat este: <%= request.getParameter("cuvant")%></h1>
        acesta 
            <%
                String cuvant = request.getParameter("cuvant");
                Scanner input = new Scanner(new File("C:\\Users\\NOI25\\Desktop\\PAO Preparation\\TranslatorJSP\\cuvinte.txt"));
                
                boolean found = false;
                while(input.hasNext()){
                    if(input.next().equals(cuvant)){
                        found = true;
                        break;
                    }
                }
                
                if(found){
                    %><b>exista</b>
                <%}
                else{
                    %>
                    <b>nu exista</b>
                    <%
                }
                
                %>
        in baza de date.
    </body>
</html>
