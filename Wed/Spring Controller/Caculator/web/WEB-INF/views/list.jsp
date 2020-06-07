<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 05/06/2020
  Time: 8:33 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/caculator" method="post" >
    <input name="num1" />
    <input name="num2" /><br/>
    <input type="submit" name="calculation" value="Addition(+)"/>
    <input type="submit" name="calculation" value="Addition(-)"/>
    <input type="submit" name="calculation" value="Addition(*)"/>
    <input type="submit" name="calculation" value="Addition(/)"/>
</form>
<h1>${result}</h1>
</body>
</html>
