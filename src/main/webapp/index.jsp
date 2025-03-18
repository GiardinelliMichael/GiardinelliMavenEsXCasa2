<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.Date" %>
<%
    request.setAttribute("currentDate", new Date());
%>


<html>
<head>
    <title>Benvenuto</title>
</head>
<body>
    <h1>Benvenuto Utente Curioso, questo è la mia prima JSP.</h1>
    <p>Oggi è il giorno <c:out value="${currentDate}"/></p>
    <p>Autore: <a href="author.jsp">link</a></p>
</body>
</html>
