<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="top.jsp"></jsp:include>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<input type="hidden" id="_index" value="2">
<div>
    <table align="center" style="width: 100%">
        <tr>
            <td>项目编号</td>
            <td>工作内容</td>

        </tr>
        <c:forEach items="${job}" var="i">
            <tr>
                <td>${i.pid}</td>
                <td>${i.jcontent}</td>
            </tr>
        </c:forEach>
        <tr>
            <td align="center" colspan="2"><a href="/plan/addjob1">添加新工作</a></td>
        </tr>
    </table>
</div>
<jsp:include page="bottom.jsp"></jsp:include>