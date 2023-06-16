<%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2021/6/1
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>汽车销售管理系统后台页面</title>
    <style>
        * {
            padding: 0;
            margin: 0;
        }

        #iframe {
            width: 86%;
            height: calc(100% - 52px);
            float: right;
            background-image: url("style/img/bg.png");
        }
    </style>
</head>
<body>
<%@include file="public/top.jsp" %>
<%@include file="public/left.jsp" %>
<iframe id="iframe" src="sys/public/indexRight.jsp" frameborder="0" name="right"></iframe>
</html>
