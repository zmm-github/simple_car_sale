    <%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2021/4/10
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>侧边栏</title>
    <link rel="stylesheet" type="text/css" href="style/css/left.css">
    <script type="text/javascript" src="webjars/jquery/3.5.1/jquery.min.js"></script>
    <script type="text/javascript" src="style/js/left.js"></script>
</head>
<body>
<div id="sidebar">
    <ul>
        <li>
            <a href="javascript:;"><img src="style/img/layout.png">品牌车型</a>
            <ul>
                <li>
                    <a href="selectCarSeries.do" target="right">车系管理</a>
                </li>
                <li>
                    <a href="selectCarModels.do" target="right">车型管理</a>
                </li>
                <li>
                    <a href="selectAccessory.do" target="right">配件管理</a>
                </li>
            </ul>
        </li>
        <li>
            <a href="javascript:;"><img src="style/img/comment.png">用车指南</a>
            <ul>
                <li>
                    <a href="selectLamp.do" target="right">故障灯管理</a>
                </li>
                <li>
                    <a href="selectLectureHall.do" target="right">爱车讲堂</a>
                </li>
                <li>
                    <a href="selectGuide.do" target="right">用车指南</a>
                </li>
            </ul>
        </li>
        <li>
            <a href="javascript:;"><img src="style/img/brush.png">促销信息</a>
            <ul>
                <li>
                    <a href="selectPromotion.do" target="right">促销信息</a>
                </li>
            </ul>
        </li>
        <li>
            <a href="javascript:;"><img src="style/img/huser.png">客户管理</a>
            <ul>
                <li>
                    <a href="selectCustomer.do" target="right">客户管理</a>
                </li>
                <li>
                    <a href="selectOrderRecords.do" target="right">预约记录</a>
                </li>
                <li>
                    <a href="selectRescueRecords.do" target="right">救援记录</a>
                </li>
            </ul>
        </li>
        <li>
            <a href="javascript:;"><img src="style/img/lab.png">管理员管理</a>
            <ul>
                <li>
                    <a href="selectAdministrator.do" target="right">管理员管理</a>
                </li>
            </ul>
        </li>
    </ul>
</div>
</body>
</html>
