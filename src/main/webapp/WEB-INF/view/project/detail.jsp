<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-2.0.0.min.js"></script>
<jsp:include page="../commpage/top.jsp"></jsp:include>
<script>

    $(function(){
        $(".btn-danger").click(function(){
            var btn = $(this).val()

            var result = confirm('确认不通过吗？');
            if(result){
                window.location.href='/project/checker_nopass2?id='+btn;
                alert('该项目已成功回退！');
            }
        });
        $(".btn-primary").click(function(){
            var btn = $(this).val()

            var result = confirm('确认通过吗？');
            if(result){
                window.location.href='/project/checker_pass2?id='+btn;
                alert('该项目已成功进入！');
            }
        });
    })
</script>
<input type="hidden" id="_index" value="2">
    <div>

            <input type="hidden" value="${pro_message.id}" name="pid">
        <table>

            <tr>
                <td>报告名称</td><td>${pro_message.report.rname}</td>
            </tr>
            <tr>
                <td>设备范围</td><td>${pro_message.report.rang}</td>
            </tr>
            <tr>
                <td>电压等级</td><td>${pro_message.report.eleLevel}</td>
            </tr>
            <tr>
                <td>设备类型</td><td>${pro_message.report.deviceType}</td>
            </tr>
            <tr>
                <td>试验类型</td><td>${pro_message.report.textType}</td>
            </tr>
            <tr>
                <td>试验开始时间</td><td><fmt:formatDate value="${pro_message.report.startTime}" pattern="yyyy-MM-dd"/></td>
            </tr>
            <tr>
                <td>试验结束时间</td><td><fmt:formatDate value="${pro_message.report.endTime}" pattern="yyyy-MM-dd"/></td>
            </tr>
            <tr>
                <td>修试设备数量</td><td>${pro_message.report.mount}</td>
            </tr>
            <tr>
                <td>报告填写人</td><td>${cus.name}</td>
            </tr>
        </table>
        <table>
            <tr>
                <th>检修内容</th>
                <th>检修人员</th>
                <th>检修时间</th>
                <th>检修结果</th>
            </tr>
            <c:forEach items="${exm}" var="i">
                <tr>
                    <td>${i.job.jcontent}</td>
                    <td>${i.person}</td>
                    <td>${i.examineData}</td>
                    <td>${i.result}</td>
                </tr>
            </c:forEach>
        </table>
        <tr>
            <button class="btn btn-primary btn-mini"  value="${pro_message.id}">通 过</button> <button class="btn btn-danger btn-mini" value="${pro_message.id}">不通过</button>
            <%--<td colspan="2"><input type="button" onclick="edit('${pro_message.id}')" value="编辑"> <input type="button" value="返回" onclick="job()"></td>--%>
        </tr>
    </div>
<jsp:include page="../commpage/bottom.jsp"></jsp:include>
