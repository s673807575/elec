<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/16
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增设新工作</title>
</head>
<body>
<div>
    <form action="/plan/addjob" method="get">
        <table align="left" style="width: 100%">
            <tr align="center" >
                <td colspan="2">新工作</td>
            </tr>
            <tr >
                <td>项目编号</td>
                <td><input type="text" name="pid"></td>
            </tr>
            <tr>
                <td>工作内容</td>
                <td><input type="text" name="jcontent"></td>
            </tr>
            <tr>
                <td align="center" colspan="2" style="width: 100%">
                    <input type="button" value="返回" onclick="javascript:document.location.href='/plan/queryjob'">
                    <input type="submit" value="保存" >
                </td>
            </tr>
        </table>
    </form>
    </div>
</body>
</html>
