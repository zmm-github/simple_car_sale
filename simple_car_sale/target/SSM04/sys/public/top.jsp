<%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2021/4/10
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>顶部</title>
    <link rel="stylesheet" type="text/css" href="style/css/top.css">
</head>
<body>
<div id="head">
    <div class="left">
        <a class="userImg">
            <img src="style/img/huser.png" width="12px" height="15px" />
        </a>
        <span>Hi,</span>
        <a href="sys/public/indexRight.jsp" target="right" class="txt">${sessionScope.get("administrator").username}</a>
    </div>
    <div class="right">
        <a href="/exit.do">退出</a>
    </div>
</div>
</body>

</html>
