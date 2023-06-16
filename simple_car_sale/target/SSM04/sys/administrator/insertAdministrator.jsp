<%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2021/6/16
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加配件</title>
    <script type="text/javascript" src="../../webjars/jquery/3.5.1/jquery.js"></script>
    <script type="text/javascript" src="../../style/js/CRUD.js"></script>
    <link rel="stylesheet" type="text/css" href="../../style/css/CRUD.css">
</head>
<body>
<div id="box">
    <h1><img src="../../style/img/posts.png" title="logo"/>添加管理员</h1>
    <div class="bottom">
        <h3 class="h3">管理员数据<a href="#" class="lab"></a></h3>
        <div class="bottom-content slide">
            <form action="../../insertAdministrator.do" method="post">
                <table cellspacing="0" cellpadding="0">
                    <tr>
                        <td>用户名：</td>
                        <td><input type="text" name="username" required> *</td>
                    </tr>
                    <tr>
                        <td>密码：</td>
                        <td><input type="text" name="password" required> *</td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="添加">
                            <input type="reset" value="重置">
                            <a href="javascript:history.go(-1);" class="cancel">取消</a>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
</body>
</html>
