<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../commpage/top.jsp"></jsp:include>
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-2.0.0.min.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    function detail(pid) {
        window.location.href="/test/detail?pid="+pid;
    }
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
<div class="container-fluid">
    <hr>
    <div class="row-fluid">
        <div class="span12">
            <div class="widget-box">

                <div class="widget-content nopadding">
                    <table class="table table-bordered table-striped">
                        <thead>
                        <tr>
                            <th>修试报告编号</th>
                            <th>修试报告名称</th>
                            <th>项目编号</th>
                            <th>修试范围</th>
                            <th>开始时间</th>
                            <th>结束时间</th>
                            <th>填写人</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${a}" var="a">
                            <tr class="odd gradeX">
                                <td>${a.rid}</td>
                                <td>${a.rname}</td>
                                <td>${a.pid}</td>
                                <td>${a.rang}</td>
                                <td><fmt:formatDate value="${a.startTime}" pattern="yyyy年MM月dd日 hh:mm:ss"/></td>
                                <td><fmt:formatDate value="${a.endTime}" pattern="yyyy年MM月dd日 hh:mm:ss"/></td>
                                <td>${a.person}</td>
                                <td>
                                    <button class="btn btn-primary btn-mini"  onclick="detail(${a.pid})">详情</button>
                                    <%--<button class="btn btn-primary btn-mini"  value="${a.rid}">通 过</button> <button class="btn btn-danger btn-mini" value="${a.rid}">不通过</button>--%>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>

            <jsp:include page="../commpage/bottom.jsp"></jsp:include>
