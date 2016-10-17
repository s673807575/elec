<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/15
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加新方案</title>
</head>
<body>
<div>
    <form action="/plan/addplan" method="post">
    <table align="left" style="width: 100%">
        <tr align="center" >
            <td colspan="2">新方案</td>
        </tr>
        <tr >
            <td>方案名称</td>
            <td><input type="text" name="pname"></td>
        </tr>
        <tr>
            <td>项目编号</td>
            <td><input type="text" name="pid"></td>
        </tr>
        <tr>
            <td>组织措施</td>
            <td><input type="text" name="organ"></td>
        </tr>
        <tr>
            <td>安全措施</td>
            <td><input type="text" name="safe"></td>
        </tr>
        <tr>
            <td>技术措施</td>
            <td><input type="text" name="technique"></td>
        </tr>
        <tr>
            <td>项目表</td>
            <td><input type="text" name="project"></td>
        </tr>
        <tr>
            <td>进度表</td>
            <td><input type="text" name="schedule"></td>
        </tr>
        <tr>
            <td>缺陷表</td>
            <td><input type="text" name="defect"></td>
        </tr>
        <tr>
            <td align="center" colspan="2" style="width: 100%">
                <input type="button" value="返回" onclick="javascript:document.location.href='/plan/query'">
                <input type="submit" value="保存" >
            </td>
        </tr>
    </table>
        </form>
</div>
</body>
</html>
