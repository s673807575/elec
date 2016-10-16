<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <jsp:include page="../commpage/top.jsp"></jsp:include>
            <script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-2.0.0.min.js"></script>
            <%@ page contentType="text/html;charset=UTF-8" language="java" %>
            <script type="text/javascript">

                $(function(){
                    $(".btn-danger").click(function(){
                        var btn = $(this).val()

                        var result = confirm('确认删除吗？');
                        if(result){
                            window.location.href='/project/delete?id='+btn;
                            alert('删除成功！');
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
                                        <th>修试项目编号</th>
                                        <th>修试项目名称</th>
                                        <th>修试类型</th>
                                        <th>开始时间</th>
                                        <th>结束时间</th>
                                        <th>持续周期</th>
                                        <th>修试设备</th>
                                        <th>状态</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${a}" var="a">
                                        <tr class="odd gradeX">
                                            <td>${a.id}</td>
                                            <td>${a.name}</td>
                                            <td>${a.textType}</td>
                                            <td>${a.startTime}</td>
                                            <td>${a.endTime}</td>
                                            <td>${a.period}</td>
                                            <td>${a.devicemess}</td>
                                            <td>未通过</td>
                                            <td>
                                                <button class="btn btn-primary btn-mini" onclick="javascript:window.location.href='/project/editview?id=${a.id}'">修改</button> <button class="btn btn-danger btn-mini" value="${a.id}">删除</button>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>

<jsp:include page="../commpage/bottom.jsp"></jsp:include>