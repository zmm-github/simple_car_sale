<%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2021/4/6
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>汽车销售系统后台登录</title>
    <%--引入外部css样式--%>
    <link rel="stylesheet" type="text/css" href="style/css/login.css"/>
</head>

<body>
<div class="main">
    <header>
        <div class="header-content">
            <div class="header-title">
                登录页面
            </div>
            <div class="header-img"></div>
        </div>
    </header>
    <div class="content">
        <img src="style/img/d.png" width="50%" height="100%"/>
        <form action="checkAdministrator.do" method="post">
            <div class="userBox">
                <input type="text" name="username" autocomplete="off" placeholder="请输入用户名" required/>
            </div>
            <div class="pswBox">
                <input type="password" name="password" placeholder="请输入密码" required/>
            </div>
            <div class="submit">
                <input type="submit" value="登录"/>
            </div>
            <div class="other">
                <a href="#">忘记密码？</a>
                <a href="#">注册新账号</a>
            </div>
        </form>
    </div>
</div>
</body>

</html>