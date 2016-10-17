<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/16
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<div align="center">
    <form action="upload.do" method="post" enctype="multipart/form-data">
        <input type="hidden" name="id" value="${id}">
        <input type="file" name="instructor">
        <input type="submit">
    </form>
    </div>
</body>
</html>
