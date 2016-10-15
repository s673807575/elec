<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:include page="../commpage/top.jsp"></jsp:include>
<input type="hidden" id="_index" value="2">
    <div>
        <table id="tablepage" style="width: 100%">
            <thead>
            <tr>
                <th>名称</th>
                <th>项目名</th>
                <th>设备范围</th>
                <th>电压等级</th>
                <th>设备类型</th>
                <th>试验类型</th>
                <th>报告填写时间</th>
                <th>状态</th>
                <th></th>
                <th></th>
            </tr>
            </thead>
            <c:forEach items="${pro_message}" var="i">
                <tr>
                    <td>${i.report.rname}</td>
                    <td>${i.name}</td>
                    <td>${i.report.rang}</td>
                    <td>${i.report.eleLevel}</td>
                    <td>${i.report.deviceType}</td>
                    <td>${i.report.textType}</td>
                    <td><fmt:formatDate value="${i.report.date}" pattern="yyyy年MM月dd日 hh:mm:ss"/></td>
                   <td> <c:if test="${i.report.status==1}">
                       审阅通过
                    </c:if>
                    <c:if test="${i.report.status==2}">
                        正在审阅
                    </c:if>
                    <c:if test="${i.report.status==3}">
                        审阅不通过
                    </c:if>
                    </td>
                    <td><input type="button" value="详细" onclick="detail(${i.id})"></td>
                    <td>
                    <c:if test="${i.report.status!=1}">
                        <input type="button" value="编辑" onclick="report(${i.id})">
                    </c:if>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
<jsp:include page="../commpage/bottom.jsp"></jsp:include>
<script>
    function detail(pid) {
        window.location.href="/detail?pid="+pid;
    }
    function report(pid) {
        window.location.href="/report?pid="+pid;
    }
    $("#tablepage").dataTable({
        "bJQueryUI": true,
        "sPaginationType": "full_numbers",
        "sDom": '<""l>t<"F"fp>'
    });
</script>