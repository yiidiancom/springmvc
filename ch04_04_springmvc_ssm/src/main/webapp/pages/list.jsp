<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>一点教程网-显示用户数据</title>
</head>
<body>
<h3>用户列表</h3>
<table border="1">
    <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>生日</td>
        <td>性别</td>
        <td>地址</td>
    </tr>
    <!--
    items: 需要需要遍历的集合
    var： 每个对象的变量名称
    -->
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.birthday}</td>
            <td>${user.sex}</td>
            <td>${user.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
