<%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2021/6/16
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>修改配件</title>
    <script type="text/javascript" src="webjars/jquery/3.5.1/jquery.js"></script>
    <script type="text/javascript" src="style/js/CRUD.js"></script>
    <link rel="stylesheet" type="text/css" href="style/css/CRUD.css">
</head>
<body>
<div id="box">
    <h1><img src="style/img/posts.png" title="logo"/>修改管理员</h1>
    <div class="bottom">
        <h3 class="h3">管理员数据<a href="#" class="lab"></a></h3>
        <div class="bottom-content slide">
            <form action="updateAdministratorById.do?id=${administrator.id}" method="post">
                <table cellspacing="0" cellpadding="0">
                    <tr>
                        <td>用户名：</td>
                        <td><input type="text" name="username" required
                                   value="${requestScope.get("administrator").username}">
                            *
                        </td>
                    </tr>
                    <tr>
                        <td>密码：</td>
                        <td><input type="text" name="password" required value="${requestScope.get("administrator").password}"> *
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="修改">
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