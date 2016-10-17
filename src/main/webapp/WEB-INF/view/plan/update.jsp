<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/16
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>方案修改</title>
</head>
<body>
<div>
    <form action="/plan/Preserve" method="get">
        <input type="hidden" name="id" value="${update.id}">
    <table align="left" style="width: 100%">
        <tr align="center" >
            <td colspan="2">方案修改</td>
        </tr>
        <tr >
            <td>方案名称</td>
            <td><input type="text" name="pname" value="${update.pname}"></td>
        </tr>
        <tr>
            <td>项目编号</td>
            <td><input type="text" name="pid" value="${update.pid}"></td>
        </tr>
        <tr>
            <td>组织措施</td>
            <td><input type="text" name="organ" value="${update.organ}"></td>
        </tr>
        <tr>
            <td>安全措施</td>
            <td><input type="text" name="safe" value="${update.safe}"></td>
        </tr>
        <tr>
            <td>技术措施</td>
            <td><input type="text" name="technique" value="${update.technique}"></td>
        </tr>
        <tr>
            <td>项目表</td>
            <td><input type="text" name="project" value="${update.project}"></td>
        </tr>
        <tr>
            <td>进度表</td>
            <td><input type="text" name="schedule" value="${update.schedule}"></td>
        </tr>
        <tr>
            <td>缺陷表</td>
            <td><input type="text" name="defect" value="${update.defect}"></td>
        </tr>
        <tr>
            <td align="center" colspan="2" style="width: 100%">
                <input type="button" value="返回" onclick="javascript:document.location.href='/plan/query'">
                <input type="submit" value="保存">
            </td>
        </tr>
    </table>
        </form>
</div>
</body>
</html>
