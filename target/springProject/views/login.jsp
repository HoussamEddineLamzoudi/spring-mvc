<%--
  Created by IntelliJ IDEA.
  User: YC
  Date: 13/12/2022
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<h1>${message}</h1>
    <form action="/login" method="post">
        <input name="username" type="text">
        <input name="password" type="password">
        <input type="submit">
    </form>
</body>
</html>
