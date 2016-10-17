<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="top.jsp"></jsp:include>
<input type="hidden" id="_index" value="1">
<!-- 配置文件 -->
<script type="text/javascript" src="/ueditor/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script type="text/javascript" src="/ueditor/ueditor.all.js"></script>
<!-- 语言包文件(建议手动加载语言包，避免在ie下，因为加载语言失败导致编辑器加载失败) -->
<script type="text/javascript" src="/ueditor/lang/zh-cn/zh-cn.js"></script>
    <div>
        <form action="/suform" method="post">
            <input type="hidden" value="${job.jid}" name="pid">
            <input type="hidden" value="${recode.id}" name="eid">
        <table style="width: 100%">

            <tr>
                <td>检修内容</td><td>${job.jcontent}</td>
            </tr>
            <tr>
                <td>检修时期</td><td><input type="text" name="examineData" required value="${recode.examineData}"></td>
            </tr>
            <tr>
                <td>检修人员</td><td><input type="text" name="person" required value="${recode.person}"></td>
            </tr>
            <tr>
                <td>检修结果</td><td>
                <%--<textarea name="result" required >${recode.result}</textarea>--%>
                <script id="container" name="result" type="text/plain">${recode.result}</script>
            </td>
            </tr>


            <tr>
                <td colspan="2"><input type="submit" value="提交"> <input type="button" value="返回" onclick="job('${job.pid}')"></td>
            </tr>
        </table>
        </form>
    </div>
<jsp:include page="bottom.jsp"></jsp:include>

<script>
    var editor= new UE.ui.Editor({
        initialFrameWidth:'900',
        initialFrameHeight:'300'});
    editor.render('container');
    function job(pid) {
        window.location.href="/job?pid="+pid;
    }
</script>