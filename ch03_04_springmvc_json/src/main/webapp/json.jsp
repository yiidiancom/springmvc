<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>一点教程网-JSON格式转换</title>
    <script src="/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<script>
    //页面加载完毕
    $(function(){
        //点击按钮，发送post请求，传递json参数
        $("#btn").click(function(){
            $.ajax({
                //设置请求类型
                type:'post',
                //请求路径
                url:'/json',
                //传递json参数
                data: '{"id":268,"name":"小红","age":18}',
                //指定参数类型（如果json参数格式，必须设置为json类型）
                contentType: 'application/json;charset=utf-8',
                //该方法接收后台返回的数据格式
                dataType: 'json',
                //处理方法
                success:function(result){
                    alert(result.id+'--'+result.name+'--'+result.age);
                }

            });
        });
    });

</script>

<input type="button" value="演示Json字符串与Java对象转换" id="btn">
</body>
</html>
