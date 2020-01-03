<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>一点教程网-Spring MVC进行RESTful风格开发</title>
    <script src="/js/jquery-3.3.1.min.js"></script>
</head>
<body>

<!--增加 -->
<form action="/rest" method="post">
    <input type="submit" value="增加">
</form>

<!--查询 -->
<form action="/rest" method="get">
    <input type="submit" value="查询">
</form>

<!--修改 -->
<form action="/rest/1" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="修改">
</form>

<!--删除 -->
<form action="/rest/1" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="删除">
</form>
</body>
</html>
