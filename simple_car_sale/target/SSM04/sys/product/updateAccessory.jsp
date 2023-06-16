<%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2021/4/18
  Time: 17:11
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
    <h1><img src="style/img/posts.png" title="logo"/>修改配件</h1>
    <div class="bottom">
        <h3 class="h3">配件数据<a href="#" class="lab"></a></h3>
        <div class="bottom-content slide">
            <form action="updateAccessoryById.do?id=${accessory.id}" method="post">
                <table cellspacing="0" cellpadding="0">
                    <tr>
                        <td>配件名称：</td>
                        <td><input type="text" name="accessoryName" required value="${requestScope.get("accessory").accessoryName}">
                            *
                        </td>
                    </tr>
                    <tr>
                        <td>所属车系：</td>
                        <td><input type="text" name="carSeries" required value="${requestScope.get("accessory").carSeries}">
                            *
                        </td>
                    </tr>
                    <tr>
                        <td>配件价格：</td>
                        <td><input type="text" name="money" required value="${requestScope.get("accessory").money}"> *
                        </td>
                    </tr>
                    <tr>
                        <td>创建时间：</td>
                        <td><input type="datetime-local" name="createTime" required
                                   value="${requestScope.get("accessory").createTime}"> *
                        </td>
                    </tr>
                    <tr>
                        <td>创建人：</td>
                        <td><input type="text" name="createPeople" required
                                   value="${requestScope.get("accessory").createPeople}"> *
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
