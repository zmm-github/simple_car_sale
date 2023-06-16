<%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2021/4/16
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>车型管理</title>
    <script type="text/javascript" src="webjars/jquery/3.5.1/jquery.js"></script>
    <script type="text/javascript" src="style/js/right.js"></script>
    <link rel="stylesheet" type="text/css" href="style/css/right.css">
</head>
<body>
<div id="content">
    <h1><img src="style/img/posts.png" title="logo"/>车型管理</h1>
    <div class="top">
        <h3 class="h3">操作<a href="#" class="lab"></a></h3>
        <div class="top-content slide">
            <a href="sys/product/insertCarModels.jsp" class="add" target="right">
                <img src="style/img/glyph-add.png" width="80px" height="80px"/>
                <p>添加车型</p>
            </a>
        </div>
    </div>
    <div class="bottom">
        <h3 class="h3">车型：新嘉年华（两厢）<a href="#" class="lab"></a></h3>
        <div class="bottom-content slide">
            <table cellspacing="0" cellpadding="0">
                <thead>
                <tr>
                    <th>图片</th>
                    <th>车型名称</th>
                    <th>官方指导价（元）</th>
                    <th>创建时间</th>
                    <th>创建人</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="carModels" items="${requestScope.get('list')}">
                    <tr>
                        <td>
                            <a href="${carModels.image}"><img src="${carModels.image}" width="150" height="100"></a>
                        </td>
                        <td>${carModels.carName}</td>
                        <td>${carModels.money}</td>
                        <td>${carModels.createTime}</td>
                        <td>${carModels.createPeople}</td>
                        <td>
                            <a href="selectCarModelsById.do?id=${carModels.id}"><img src="style/img/edit.png"
                                                                                     title="修改"/></a>
                            <a href="javascript:if(confirm('你确定要删除${carModels.carName}车型吗?'))location='deleteCarModelsById.do?${carModels.id}'"
                               target="right"><img src="style/img/delete.png" title="删除"/></a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div class="pagination">
                <c:if test="${pagination.currPage==1}">
                    <a class="headPage disabled" href="selectCarModels.do?cp=1">首页</a>
                </c:if>
                <c:if test="${pagination.currPage!=1}">
                    <a class="headPage" href="selectCarModels.do?cp=1">首页</a>
                </c:if>
                <c:if test="${pagination.currPage>1}">
                    <a class="upPage"
                       href="selectCarModels.do?cp=${(pagination.currPage-1)>0?pagination.currPage-1:pagination.currPage}">上一页</a>
                </c:if>
                <c:if test="${pagination.currPage<=1}">
                    <a class="upPage disabled"
                       href="selectCarModels.do?cp=${(pagination.currPage-1)>0?pagination.currPage-1:pagination.currPage}">上一页</a>
                </c:if>
                <a class="pages">${pagination.currPage}/${pagination.totalPage}</a>
                <c:if test="${pagination.currPage<pagination.totalPage}">
                    <a class="nextPage"
                       href="selectCarModels.do?cp=${(pagination.currPage+1)<=pagination.totalPage?pagination.currPage+1:pagination.currPage}">下一页</a>
                </c:if>
                <c:if test="${pagination.currPage==pagination.totalPage}">
                    <a class="nextPage disabled"
                       href="selectCarModels.do?cp=${(pagination.currPage+1)<=pagination.totalPage?pagination.currPage+1:pagination.currPage}">下一页</a>
                </c:if>
                <c:if test="${pagination.currPage==pagination.totalPage}">
                    <a class="endPage disabled" href="selectCarModels.do?cp=${pagination.totalPage}">尾页</a>
                </c:if>
                <c:if test="${pagination.currPage<pagination.totalPage}">
                    <a class="endPage" href="selectCarModels.do?cp=${pagination.totalPage}">尾页</a>
                </c:if>
            </div>
        </div>
    </div>
</div>
</body>
</html>