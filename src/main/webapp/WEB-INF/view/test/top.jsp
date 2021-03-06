<%--
  Created by IntelliJ IDEA.
  User: 67380
  Date: 2016/9/27
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="/css/fullcalendar.css" />
    <link rel="stylesheet" href="/css/matrix-style.css" />
    <link rel="stylesheet" href="/css/matrix-media.css" />
    <link href="/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" href="/css/jquery.gritter.css" />

</head>
<body>

<!--Header-part-->
<div id="header">
    <h1><a href="dashboard.html">Matrix Admin</a></h1>
</div>
<!--close-Header-part-->


<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
    <ul class="nav">
        <li  class="dropdown" id="profile-messages" ><a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle"><i class="icon icon-user"></i>  <span class="text">Welcome User</span><b class="caret"></b></a>
            <ul class="dropdown-menu">
                <li><a href="#"><i class="icon-user"></i> My Profile</a></li>
                <li class="divider"></li>
                <li><a href="#"><i class="icon-check"></i> My Tasks</a></li>
                <li class="divider"></li>
                <li><a href="/"><i class="icon-key"></i> 注销</a></li>
            </ul>
        </li>
        <li class="dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-envelope"></i> <span class="text">Messages</span> <span class="label label-important">5</span> <b class="caret"></b></a>
            <ul class="dropdown-menu">
                <li><a class="sAdd" title="" href="#"><i class="icon-plus"></i> new message</a></li>
                <li class="divider"></li>
                <li><a class="sInbox" title="" href="#"><i class="icon-envelope"></i> inbox</a></li>
                <li class="divider"></li>
                <li><a class="sOutbox" title="" href="#"><i class="icon-arrow-up"></i> outbox</a></li>
                <li class="divider"></li>
                <li><a class="sTrash" title="" href="#"><i class="icon-trash"></i> trash</a></li>
            </ul>
        </li>
        <li class=""><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">Settings</span></a></li>
        <li class=""><a title="" href="/"><i class="icon icon-share-alt"></i> <span class="text">注销</span></a></li>
    </ul>
</div>
<!--close-top-Header-menu-->
<!--start-top-serch-->
<div id="search">
    <input type="text" placeholder="Search here..."/>
    <button type="submit" class="tip-bottom" title="Search"><i class="icon-search icon-white"></i></button>
</div>
<!--close-top-serch-->
<div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >免费模板</a></div>
<!--sidebar-menu-->
<div id="sidebar"><a href="#" class="visible-phone"><i class="icon icon-home"></i> Dashboard</a>
    <ul>
        <li class="active li_1"><a href="/test"><i class="icon icon-home"></i> <span>所有项目</span></a> </li>
        <%--<li> <a href="charts.html"><i class="icon icon-signal"></i> <span>Charts &amp; graphs</span></a> </li>--%>
        <%--<li> <a href="widgets.html"><i class="icon icon-inbox"></i> <span>Widgets</span></a> </li>--%>
        <%--<li><a href="tables.html"><i class="icon icon-th"></i> <span>Tables</span></a></li>--%>
        <%--<li><a href="grid.html"><i class="icon icon-fullscreen"></i> <span>Full width</span></a></li>--%>
        <li class="submenu li_2"> <a href="#"><i class="icon icon-th-list"></i> <span>修试报告</span> <span class="label label-important">4</span></a>
            <ul>
                <li><a href="/reportmanager?optty=0">所有报告</a></li>
                <li><a href="/reportmanager?optty=1">正在审阅</a></li>
                <li><a href="/reportmanager?optty=2">审阅通过</a></li>
                <li><a href="/reportmanager?optty=3">审阅不通过</a></li>
            </ul>
        </li>
        <%--<li><a href="buttons.html"><i class="icon icon-tint"></i> <span>Buttons &amp; icons</span></a></li>--%>
        <%--<li><a href="interface.html"><i class="icon icon-pencil"></i> <span>Eelements</span></a></li>--%>
        <%--<li class="submenu"> <a href="#"><i class="icon icon-file"></i> <span>Addons</span> <span class="label label-important">5</span></a>--%>
        <%--<ul>--%>
        <%--<li><a href="index2.html">Dashboard2</a></li>--%>
        <%--<li><a href="gallery.html">Gallery</a></li>--%>
        <%--<li><a href="calendar.html">Calendar</a></li>--%>
        <%--<li><a href="invoice.html">Invoice</a></li>--%>
        <%--<li><a href="chat.html">Chat option</a></li>--%>
        <%--</ul>--%>
        <%--</li>--%>
        <%--<li class="submenu"> <a href="#"><i class="icon icon-info-sign"></i> <span>Error</span> <span class="label label-important">4</span></a>--%>
        <%--<ul>--%>
        <%--<li><a href="error403.html">Error 403</a></li>--%>
        <%--<li><a href="error404.html">Error 404</a></li>--%>
        <%--<li><a href="error405.html">Error 405</a></li>--%>
        <%--<li><a href="error500.html">Error 500</a></li>--%>
        <%--</ul>--%>
        <%--</li>--%>
        <%--<li class="content"> <span>Monthly Bandwidth Transfer</span>--%>
        <%--<div class="progress progress-mini progress-danger active progress-striped">--%>
        <%--<div style="width: 77%;" class="bar"></div>--%>
        <%--</div>--%>
        <%--<span class="percent">77%</span>--%>
        <%--<div class="stat">21419.94 / 14000 MB</div>--%>
        <%--</li>--%>
        <%--<li class="content"> <span>Disk Space Usage</span>--%>
        <%--<div class="progress progress-mini active progress-striped">--%>
        <%--<div style="width: 87%;" class="bar"></div>--%>
        <%--</div>--%>
        <%--<span class="percent">87%</span>--%>
        <%--<div class="stat">604.44 / 4000 MB</div>--%>
        <%--</li>--%>
    </ul>
</div>
<!--sidebar-menu-->

<!--main-container-part-->
<div id="content">
    <!--breadcrumbs-->
    <div id="content-header">
        <div id="breadcrumb"> <a href="index.html" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a></div>
    </div>
    <!--End-breadcrumbs-->

    <!--Action boxes-->
    <div class="container-fluid">



