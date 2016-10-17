
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="top.jsp"></jsp:include>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<input type="hidden" id="_index" value="1">
<div>
    <table align="center" style="width: 100%">
        <tr>
            <td>项目编号</td>
            <td>项目名称</td>

        </tr>
        <c:forEach items="${plan}" var="i">
            <tr>
                <td>${i.pid}</td>
                <td>${i.pname}</td>
                <td><a href="/plan/delete?id=${i.id}">删除</a></td>
                <td><a href="/plan/upload?id=${i.id}">指导书文档上传</a></td>
                <td><a href="${i.pupload}">指导书下载</a></td>
            </tr>
        </c:forEach>
        <tr>
            <td align="center" colspan="2"><a href="/plan/addplan1">添加新方案</a></td>
        </tr>
    </table>
</div>

<jsp:include page="bottom.jsp"></jsp:include>