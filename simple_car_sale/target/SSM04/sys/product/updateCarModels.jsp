<%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2021/4/18
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>修改车型</title>
    <script type="text/javascript" src="webjars/jquery/3.5.1/jquery.js"></script>
    <script type="text/javascript" src="style/js/CRUD.js"></script>
    <link rel="stylesheet" type="text/css" href="style/css/CRUD.css">
</head>
<body>
<div id="box">
    <h1><img src="style/img/posts.png" title="logo"/>修改车型</h1>
    <div class="bottom">
        <h3 class="h3">车型数据<a href="#" class="lab"></a></h3>
        <div class="bottom-content slide">
            <form action="updateCarModelsById.do?id=${carModels.id}" method="post">
                <table cellspacing="0" cellpadding="0">
                    <tr>
                        <td>图片：</td>
                        <td><input type="text" name="image" required value="${requestScope.get("carModels").image}">
                            *
                        </td>
                    </tr>
                    <tr>
                        <td>车系名称：</td>
                        <td><input type="text" name="carName" required value="${requestScope.get("carModels").carName}">
                            *
                        </td>
                    </tr>
                    <tr>
                        <td>报价(*万元)：</td>
                        <td><input type="text" name="money" required value="${requestScope.get("carModels").money}"> *
                        </td>
                    </tr>
                    <tr>
                        <td>创建时间：</td>
                        <td><input type="datetime-local" name="createTime" required
                                   value="${requestScope.get("carModels").createTime}"> *
                        </td>
                    </tr>
                    <tr>
                        <td>创建人：</td>
                        <td><input type="text" name="createPeople" required
                                   value="${requestScope.get("carModels").createPeople}"> *
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
