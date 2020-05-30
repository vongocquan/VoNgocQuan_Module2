<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 28/05/2020
  Time: 6:24 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Update Product</h1>
<p><a href="/products">back</a></p>
<c:out value="${message}"></c:out>
<form method="post">
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" /></td>
        </tr>
        <tr>
            <td>price</td>
            <td><input type="text" name="price" /></td>
        </tr>
        <tr>
            <td>description</td>
            <td><input type="text" name="description" /></td>
        </tr>
        <tr>
            <td>producer</td>
            <td><input type="text" name="producer" /></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="create product"/><a href="/products"></a> </td>
        </tr>
    </table>
</form>
</body>
</html>
