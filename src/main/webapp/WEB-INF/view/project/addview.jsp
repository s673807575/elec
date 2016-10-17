<jsp:include page="top.jsp"></jsp:include>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<input type="hidden" id="_index" value="1">
<div>
    <h1>增加项目</h1>
    <div class="row-fluid">
        <form action="/project/add" method="post" class="form-horizontal"     style="text-align: center" >
                        <div class="control-group">
                            <label class="control-label">修试项目名称 :</label>
                            <div class="controls">
                                <input type="text" class="span11" placeholder="请输入修试项目名称"  name="name"/>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">修试类型 :</label>
                            <div class="controls">
                                <input type="text" class="span11" placeholder="请输入修试类型"  name="textType"/>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">起始时间 :</label>
                            <div class="controls">
                                <input type="date" class="span11" name="startTime" value="2016-10-07 00:00:00"/>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">结束时间 :</label>
                            <div class="controls">
                                <input type="date" class="span11" name="endTime" value="2016-10-08 00:00:00"/>
                            </div>
                        </div>
            <div class="control-group">
                <label class="control-label">修试设备 :</label>
                <div class="controls">
                    <input type="text" class="span11" placeholder="请输入修试设备"  name="devicemess"/>
                </div>
            </div>
                        <%--<div class="control-group">--%>
                            <%--<label class="control-label">Message</label>--%>
                            <%--<div class="controls">--%>
                                <%--<textarea class="span11" ></textarea>--%>
                            <%--</div>--%>
                        <%--</div>--%>

                            <button  type="submit" class="btn btn-success">提交</button>

                    </form>


</div>

    </div>
        </div>
<jsp:include page="bottom.jsp"></jsp:include>
