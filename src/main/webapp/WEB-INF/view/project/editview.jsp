<jsp:include page="../commpage/top.jsp"></jsp:include>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
    <h1>修改项目</h1>
    <div class="row-fluid">
        <form action="/project/edit" method="post" class="form-horizontal"      >
            <div class="control-group">
                <label class="control-label">修试项目编号 :</label>
                <div class="controls">
                   <h5>${a.id}</h5>
                    <input type="hidden" class="span11" value="${a.id}"  name="id"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">修试项目名称 :</label>
                <div class="controls">
                    <input type="text" class="span11" value="${a.name}"  name="name" />
                </div>
            </div>
            <div class="control-group">
                <label class="control-label">修试类型 :</label>
                <div class="controls">
                    <input type="text" class="span11" value="${a.textType}"  name="textType"/>
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
                    <input type="text" class="span11" value="${a.devicemess}"  name="devicemess"/>
                </div>
            </div>
            <input type="hidden" class="span11" value="0"  name="isqualified"/>
            <%--<div class="control-group">--%>
            <%--<label class="control-label">Message</label>--%>
            <%--<div class="controls">--%>
            <%--<textarea class="span11" ></textarea>--%>
            <%--</div>--%>
            <%--</div>--%>
<div style="text-align: center">
    <button  type="submit" class="btn btn-success" >修改</button>
</div>


        </form>


    </div>

</div>
</div>
<jsp:include page="../commpage/bottom.jsp"></jsp:include>
