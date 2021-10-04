<%--
  Created by IntelliJ IDEA.
  User: gejiawei
  Date: 2021/10/5
  Time: 0:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="/register" method="post">
    <h3>学生管理系统</h3><br>
    <tr>
        <li>用户名:</li>
        <td><input type="text" name="username"></td>
    </tr>
    <tr>
        <li>密码：</li>
        <td><input type="text" name="password"></td>
    </tr>
    <tr>
        <td>真实姓名：</td>
        <td><input type="text" name="realname"></td>
    </tr>
    <tr><input type="submit" value="注册"></tr>
</form>
</body>
</html>
