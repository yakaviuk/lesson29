<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read information</title>
</head>
<body>
<%@include file="/index.jsp"%>
<form action="/controller" method="POST">
    <label for="user Id"><b>Enter user Id: </b></label>
    <input type="number" placeholder="user Id" name="userId" required>
    <input type="hidden" name="flag" value="read">
    <p></p>
    <input type="submit" value="Get info"></input>
</form>
</body>
</html>
