<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="top.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<input type="hidden" id="_index" value="4">
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
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${a}" var="a">
                            <tr class="odd gradeX">
                                <td>${a.id}</td>
                                <td>${a.name}</td>
                                <td>${a.textType}</td>
                                <td><fmt:formatDate value="${a.startTime}" pattern="yyyy年MM月dd日 hh:mm:ss"/></td>
                                <td><fmt:formatDate value="${a.endTime}" pattern="yyyy年MM月dd日 hh:mm:ss"/></td>
                                <td>${a.period}</td>
                                <td>${a.devicemess}</td>
                                <td>已通过</td>

                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>

<jsp:include page="bottom.jsp"></jsp:include>