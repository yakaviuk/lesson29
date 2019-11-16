<%@ page import="entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display info</title>
</head>
<body>
<%@include file="/jsp/read.jsp"%>
<% User user = (User) request.getSession().getAttribute("user"); %>
Display info
<p>userId: <%= user.getIdUser()%> </p>
<p>Name: <%= user.getLogin() %></p>
<p>Age: <%= user.getPassword()%></p>
</body>
</html>
