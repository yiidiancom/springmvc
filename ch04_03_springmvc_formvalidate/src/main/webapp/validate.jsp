<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>一点教程网-表单数据验证</title

</head>
<body>
<form action="/hello" method="post">
    用户名：<input type="text" name="name">${ERROR_name}<br/>
    年龄：<input type="text" name="age">${ERROR_age}<br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
