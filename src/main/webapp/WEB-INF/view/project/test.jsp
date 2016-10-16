<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xia
  Date: 2016/9/27
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>1111</h1>
<c:forEach items="${a}" var="d">
    <tr>${d.id}</tr>
    <tr>${d.name}</tr>
    <tr>${d.type}</tr>
</c:forEach>
</body>
</html>
