<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:include page="top.jsp"></jsp:include>
<input type="hidden" id="_index" value="1">
    <div>
        <table>
            <tbody>
            <tr>
                <th>名称</th>
                <th>实验类型</th>
                <th>周期</th>
                <th>起始时间</th>
                <th>截止时间</th>
                <th>设备信息</th>
                <th></th>
                <th></th>
            </tr>
            </tbody>
            <c:forEach items="${proes}" var="i">
                <tr>
                    <td>${i.name}</td>
                    <td>${i.textType}</td>
                    <td>${i.period}</td>
                    <td><fmt:formatDate value="${i.startTime}" pattern="yyyy年MM月dd日"/></td>
                    <td><fmt:formatDate value="${i.endTime}" pattern="yyyy年MM月dd日"/></td>
                    <td>${i.devicemess}</td>
                    <td><button type="button" onclick="job(${i.id})">工作</button> </td>
                    <c:if test="${i.isqualified==3}">
                        <c:if test="${i.report.status!=1}">
                            <td><button type="button" onclick="report(${i.id})">修试报告</button></td>
                        </c:if>
                        <c:if test="${i.report.status==1}">
                            审阅通过
                        </c:if>
                    </c:if>
                    <c:if test="${i.isqualified==2}">
                        <td>请先完成所有工作</td>
                    </c:if>
                </tr>
            </c:forEach>
        </table>
    </div>
<jsp:include page="bottom.jsp"></jsp:include>
<script>
    function job(pid) {
        window.location.href="/job?pid="+pid;
    }
    function report(pid) {
        window.location.href="/report?pid="+pid;
    }
</script>