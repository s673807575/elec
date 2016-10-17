<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/28
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>详细方案</title>
</head>
<body>

<div>
    <table align="left" style="width: 100%">
        <tr align="center" >
            <td colspan="2">方案详情</td>
        </tr>
        <tr >
            <td>方案名称</td>
            <td>${Singleplan.pname}</td>
            </tr>
        <tr>
            <td>项目编号</td>
            <td>${Singleplan.pid}</td>
            </tr>
        <tr>
            <td>组织措施</td>
            <td>${Singleplan.organ}</td>
            </tr>
        <tr>
            <td>安全措施</td>
            <td>${Singleplan.safe}</td>
            </tr>
        <tr>
            <td>技术措施</td>
            <td>${Singleplan.technique}</td>
            </tr>
        <tr>
            <td>项目表</td>
            <td>${Singleplan.project}</td>
            </tr>
        <tr>
            <td>进度表</td>
            <td>${Singleplan.schedule}</td>
            </tr>
        <tr>
            <td>缺陷表</td>
            <td>${Singleplan.defect}</td>
            </tr>
        <tr>
            <td align="center" colspan="2" style="width: 100%">
                <input type="button" value="返回" onclick="javascript:document.location.href='/plan/query'">
                <input type="button" value="修改" onclick="javascript:document.location.href='/plan/Update?id=${Singleplan.id}&pname=${Singleplan.pname}&pid=${Singleplan.pid}&organ=${Singleplan.organ}&safe=${Singleplan.safe}&technique=${Singleplan.technique}&project=${Singleplan.project}&schedule=${Singleplan.schedule}&defect=${Singleplan.defect}'">
                </td>
        </tr>
    </table>
</div>
</body>
</html>
