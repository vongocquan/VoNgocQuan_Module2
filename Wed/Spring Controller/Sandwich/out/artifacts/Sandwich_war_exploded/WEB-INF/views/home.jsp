<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 05/06/2020
  Time: 11:42 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  method="post" action="/save">
    <input type="checkbox" name="condiment" value="lettuce"/>Lettuce
    <input type="checkbox" name="condiment" value="tomato"/>Tomato
    <input type="checkbox" name="condiment" value="mustard">Mustard
    <input type="checkbox" name="condiment" value="sprouts">Sprouts
    <input type="submit" value="Save"/>
</form>
</body>
</html>
