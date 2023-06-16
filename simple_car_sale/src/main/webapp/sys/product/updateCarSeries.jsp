<%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2021/4/17
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>修改车系</title>
    <script type="text/javascript" src="webjars/jquery/3.5.1/jquery.js"></script>
    <script type="text/javascript" src="style/js/CRUD.js"></script>
    <link rel="stylesheet" type="text/css" href="style/css/CRUD.css">
</head>
<body>
<div id="box">
    <h1><img src="style/img/posts.png" title="logo"/>修改车系</h1>
    <div class="bottom">
        <h3 class="h3">车系数据<a href="#" class="lab"></a></h3>
        <div class="bottom-content slide">
            <form action="updateCarSeriesById.do?id=${carSeries.id}" method="post">
                <table cellspacing="0" cellpadding="0">
                    <tr>
                        <td>车系名称：</td>
                        <td><input type="text" name="carName" required value="${requestScope.get("carSeries").carName}">
                            *
                        </td>
                    </tr>
                    <tr>
                        <td>报价(*万元)：</td>
                        <td><input type="text" name="money" required value="${requestScope.get("carSeries").money}"> *
                        </td>
                    </tr>
                    <tr>
                        <td>创建时间：</td>
                        <td><input type="datetime-local" name="createTime" required
                                   value="${requestScope.get("carSeries").createTime}"> *
                        </td>
                    </tr>
                    <tr>
                        <td>创建人：</td>
                        <td><input type="text" name="createPeople" required
                                   value="${requestScope.get("carSeries").createPeople}"> *
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
