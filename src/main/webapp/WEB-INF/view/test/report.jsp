<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:include page="../commpage/top.jsp"></jsp:include>
<input type="hidden" id="_index" value="2">
    <div>
        <form action="/reportform" method="post">
            <input type="hidden" value="${pro_message.id}" name="pid">
            <input type="hidden" value="${pro_message.report.rid}" name="rid">
        <table>

            <tr>
                <td>报告名称</td><td><input type="text" name="rname" required value="${pro_message.report.rname}"></td>
            </tr>
            <tr>
                <td>设备范围</td><td><input type="text" name="rang" required value="${pro_message.report.rang}"></td>
            </tr>
            <tr>
                <td>电压等级</td><td><input type="text" name="eleLevel" required value="${pro_message.report.eleLevel}"></td>
            </tr>
            <tr>
                <td>设备类型</td><td><input type="text" name="deviceType" required value="${pro_message.report.deviceType}"></td>
            </tr>
            <tr>
                <td>试验类型</td><td><input type="text" name="textType" required value="${pro_message.report.textType}"></td>
            </tr>
            <tr>
                <td>试验开始时间</td><td><input type="date" name="startTime" required value="<fmt:formatDate value="${pro_message.report.startTime}" pattern="yyyy-MM-dd"/>"></td>
            </tr>
            <tr>
                <td>试验结束时间</td><td><input type="date" name="endTime" required value="<fmt:formatDate value="${pro_message.report.endTime}" pattern="yyyy-MM-dd"/>"></td>
            </tr>
            <tr>
                <td>修试设备数量</td><td><input type="text" name="mount" required value="${pro_message.report.mount}"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交"> <input type="button" value="返回" onclick="job()"></td>
            </tr>
        </table>
        </form>
    </div>
<jsp:include page="../commpage/bottom.jsp"></jsp:include>
<script>
    function job() {
        window.location.href="/test";
    }
</script>