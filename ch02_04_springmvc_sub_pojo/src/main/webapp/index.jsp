<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>一点教程网 - www.yiidian.com</title>
</head>
<body>
<h2>包装Pojo类型参数封装</h2>
<form action="/param.do" method="post">
    用户名：<input type="text" name="username"><br>
    年龄：<input type="text" name="age"><br>
    省份：<input type="text" name="address.province"><br>
    城市：<input type="text" name="address.city"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
