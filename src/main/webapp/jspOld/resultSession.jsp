<%@ page import="entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get Info</title>
</head>
<body>
<%@include file="getinfo.jsp"%>
<% User userEntity = (User) request.getSession().getAttribute("userEntity"); %>
<p>userId: <%= userEntity.getUserId()%> </p>
<p>Name: <%= userEntity.getName() %></p>
<p>Age: <%= userEntity.getAge()%></p>

</body>
</html>
