<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>一点教程网-文件上传</title>
</head>
<body>
<h3>SpringMVC方式文件上传</h3>
<form action="/upload" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="imgFile"> <br/>
    文件描述：<input type="text" name="memo"> <br/>
    <input type="submit" value="上传">
</form>
</body>
</html>
