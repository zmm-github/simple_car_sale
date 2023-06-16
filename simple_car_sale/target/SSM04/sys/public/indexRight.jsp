<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2021/4/11
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>首页右部分</title>
    <link rel="stylesheet" type="text/css" href="../../style/css/indexRight.css">
    <script type="text/javascript" src="../../webjars/jquery/3.5.1/jquery.js"></script>
    <script type="text/javascript" src="../../style/js/indexRight.js"></script>
</head>
<body>
<div id="content">
    <h1><img src="../../style/img/logo1.png" title="logo"/>微信4S后台管理</h1>
    <div class="left">
        <h3 class="h3">快捷入口<a href="#" class="lab"></a></h3>
        <div class="left-content slide">
            <div class="show"><img src="../../style/img/car-logo.jfif" width="80px" height="80px"/>
                <p>品牌车型</p>
            </div>
            <div class="show"><img src="../../style/img/customer-logo.jfif" width="80px" height="80px"/>
                <p>客户管理</p>
            </div>
        </div>
    </div>
    <div class="right">
        <h3 class="h3">登录信息<a href="#" class="lab"></a></h3>
        <div class="right-content slide">
            <table>
                <thead>
                <tr>
                    <td>${sessionScope.get("administrator").username}</td>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>用户角色：超级管理员</td>
                </tr>
                <tr>
                    <td>上次登录时间:<%=new Date()%>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <div class="bottom">
        <h3 class="h3">最新资讯<a href="#" class="lab"></a></h3>
        <div class="bottom-content slide">
            <h5>11/11/2020</h5>
            <ul>
                <li>
                    <a href="#">关于财务公司资金管理平台TMS系统升级的通知</a>
                </li>
                <li>
                    <a href="#">汽车金融业务2020年校园招聘</a>
                </li>
                <li>
                    <a href="#">2019年正式员工招聘公告</a>
                </li>
                <li>
                    <a href="#">招聘公告</a>
                </li>
                <li>
                    <a href="#">兵装财务2018年正式员工补充招聘</a>
                </li>
            </ul>
            <h5>10/09/2020</h5>
            <ul>
                <li>
                    <a href="#">兵装财务公司服务收费价目监督投诉电话</a>
                </li>
                <li>
                    <a href="#">关于兵装集团财务公司TMS系统版本升级的通知</a>
                </li>
            </ul>
            <h5>08/08/2020</h5>
            <ul>
                <li>
                    <a href="#">关于兵装集团财务公司TMS系统进行的升级的通知</a>
                </li>
                <li>
                    <a href="#">关于启用兵器装备集团财资管理平台(TMS系统)电子回单功能的通知</a>
                </li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
