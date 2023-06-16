<%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2021/4/20
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>救援记录</title>
    <script type="text/javascript" src="webjars/jquery/3.5.1/jquery.js"></script>
    <script type="text/javascript" src="style/js/right.js"></script>
    <link type="text/css" rel="stylesheet" href="style/css/right.css"/>
</head>
<body>
<div id="content">
    <h1><img src="style/img/posts.png" title="logo"/>救援记录</h1>
    <div class="top">
        <h3 class="h3">操作<a href="#" class="lab"></a></h3>
        <div class="top-content slide">
            <a href="sys/customer/insertRescueRecords.jsp" class="add" target="right">
                <img src="style/img/glyph-add.png" width="80px" height="80px"/>
                <p>添加救援</p>
            </a>
        </div>
    </div>
    <div class="bottom">
        <h3 class="h3">救援列表<a href="#" class="lab"></a></h3>
        <div class="bottom-content slide">
            <table cellspacing="0" cellpadding="0">
                <thead>
                <tr>
                    <th>昵称</th>
                    <th>创建时间</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="rescueRecords" items="${requestScope.get('list')}">
                    <tr>
                        <td>${rescueRecords.name}</td>
                        <td>${rescueRecords.createTime}</td>
                        <td>
                            <a href="selectRescueRecordsById.do?id=${rescueRecords.id}"><img src="style/img/edit.png"
                                                                                             title="修改"/></a>
                            <a href="javascript:if(confirm('你确定要删除救援人${rescueRecords.name}吗?'))location='deleteRescueRecordsById.do?id=${rescueRecords.id}'"
                               target="right"><img src="style/img/delete.png" title="删除"/></a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div class="pagination">
                <c:if test="${pagination.currPage==1}">
                    <a class="headPage disabled" href="selectRescueRecords.do?cp=1">首页</a>
                </c:if>
                <c:if test="${pagination.currPage!=1}">
                    <a class="headPage" href="selectRescueRecords.do?cp=1">首页</a>
                </c:if>
                <c:if test="${pagination.currPage>1}">
                    <a class="upPage"
                       href="selectRescueRecords.do?cp=${(pagination.currPage-1)>0?pagination.currPage-1:pagination.currPage}">上一页</a>
                </c:if>
                <c:if test="${pagination.currPage<=1}">
                    <a class="upPage disabled"
                       href="selectRescueRecords.do?cp=${(pagination.currPage-1)>0?pagination.currPage-1:pagination.currPage}">上一页</a>
                </c:if>
                <a class="pages">${pagination.currPage}/${pagination.totalPage}</a>
                <c:if test="${pagination.currPage<pagination.totalPage}">
                    <a class="nextPage"
                       href="selectRescueRecords.do?cp=${(pagination.currPage+1)<=pagination.totalPage?pagination.currPage+1:pagination.currPage}">下一页</a>
                </c:if>
                <c:if test="${pagination.currPage==pagination.totalPage}">
                    <a class="nextPage disabled"
                       href="selectRescueRecords.do?cp=${(pagination.currPage+1)<=pagination.totalPage?pagination.currPage+1:pagination.currPage}">下一页</a>
                </c:if>
                <c:if test="${pagination.currPage==pagination.totalPage}">
                    <a class="endPage disabled" href="selectRescueRecords.do?cp=${pagination.totalPage}">尾页</a>
                </c:if>
                <c:if test="${pagination.currPage<pagination.totalPage}">
                    <a class="endPage" href="selectRescueRecords.do?cp=${pagination.totalPage}">尾页</a>
                </c:if>
            </div>
        </div>
    </div>
</div>
</body>
</html>