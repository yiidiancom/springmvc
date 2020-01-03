<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>一点教程网 - www.yiidian.com</title>
</head>
<body>
<h2>Map集合类型参数封装</h2>
<form action="/param.do" method="post">
    用户名：<input type="text" name="username"><br>
    年龄：<input type="text" name="age"><br>
    省份1：<input type="text" name="address['a1'].province"><br>
    城市1：<input type="text" name="address['a1'].city"><br>
    省份2：<input type="text" name="address['a2'].province"><br>
    城市2：<input type="text" name="address['a2'].city"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
