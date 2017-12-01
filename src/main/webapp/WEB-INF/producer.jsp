<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/11/29
  Time: 上午11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发送消息</title>
</head>
<body>
<form action="/sendmsg" method="post">
    文本信息:<textarea name="message">测试信息</textarea>
    <input type="submit" value="提交">
</form>
<h2><a href="/">返回首页</a> </h2>
</body>
</html>
