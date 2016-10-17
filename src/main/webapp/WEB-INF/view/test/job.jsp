<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="top.jsp"></jsp:include>
<input type="hidden" id="_index" value="1">
    <div>
        <table>
            <tbody>
            <tr>
                <th>编号</th>
                <th>所属项目</th>
                <th>内容</th>
                <th>检修记录</th>
            </tr>
            </tbody>
            <c:forEach items="${jobs}" var="i">
                <tr>
                    <td>${i.jid}</td>
                    <td>${i.pro_message.name}</td>
                    <td>${i.jcontent}</td>
                    <td>
                             <button type="button" onclick="job('${i.jid}')">编辑</button>


                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
<jsp:include page="bottom.jsp"></jsp:include>
<script>
    function job(jid) {
        window.location.href="/form?jid="+jid;
    }
</script>