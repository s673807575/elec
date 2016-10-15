
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html dir="ltr" lang="en-US">
<head>


    <title>登陆</title>

    <!--- CSS --->
    <link rel="stylesheet" href="/css/style.css" type="text/css" />


    <!--- Javascript libraries (jQuery and Selectivizr) used for the custom checkbox --->

    <!--[if (gte IE 6)&(lte IE 8)]>
    <script type="text/javascript" src="/js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="/js/selectivizr.js"></script>
    <noscript><link rel="stylesheet" href="/css/fallback.css" /></noscript>
    <![endif]-->

</head>

<body>
<div id="container">
    <form action="/login" method="post">
        <div class="login">登陆</div>
        <div class="username-text">账号:</div>
        <div class="password-text">密码:</div>
        <div class="username-field">
            <input type="text" name="name" value="" required placeholder="账号"/>
        </div>
        <div class="password-field">
            <input type="password" name="pwd" value="" required placeholder="密码"/>
        </div>
        <input type="checkbox" name="remember-me" id="remember-me" /><label for="remember-me">记住我</label>
        <div class="forgot-usr-pwd">忘记 <a href="#">账号</a> 或 <a href="#">密码</a> ?</div>
        <input type="submit" value="GO" />
    </form>
</div>
<div id="footer">
    <%--Web 2.0 Login More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a>--%>
</div>
</body>
</html>

