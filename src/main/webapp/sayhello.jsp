<%-- 
    Document   : sayhello
    Created on : 08/02/2021, 23:08:15
    Author     : viter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SayHello.jsp</title>
    </head>
    <body>
        <jsp:useBean id="myBean" class="hello.MessageBean"/>
        <jsp:useBean id="myGreetings" class="hello.Greetings"/>
        <jsp:useBean id="myDate" class="hello.ActualDate"/>
        <h1>SayHello.jsp</h1>
        <% String lang = request.getParameter("lang"); %>
        <jsp:setProperty name="myBean" property="msg" value="<%=lang%>"/>
        <jsp:getProperty name="myBean" property="msg"/>, <%=request.getParameter("nome")%>!
        <br><br>
        <jsp:setProperty name="myGreetings" property="greeting" value="<%=lang%>"/>
        <jsp:getProperty name="myGreetings" property="greeting"/>
        <br><br>
        <jsp:setProperty name="myDate" property="date" value="<%=lang%>"/>
        <jsp:getProperty name="myDate" property="date"/>
    </body>
</html>
