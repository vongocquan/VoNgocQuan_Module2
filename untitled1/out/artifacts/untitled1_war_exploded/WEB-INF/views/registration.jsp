<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 07/06/2020
  Time: 4:58 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/signUp" method="get">
    <table>
        <tr>
            <td>name</td>
            <td><input type="text" name="name"/> </td>
        </tr>
        <tr>
            <td>email</td>
            <td><input type="text" name="email"/> </td>
        </tr>
        <tr>
            <td>account</td>
            <td><input type="text" name="account"/> </td>
        </tr>
        <tr>
            <td>password</td>
            <td><input type="password" name="password_1"/> </td>
        </tr>
        <tr>
            <td>password</td>
            <td><input type="password" name="password_2"/> </td>
        </tr>
        <tr>
            <td>old</td>
            <td><input type="number" value="0" name="old"/> </td>
        </tr>
        <tr>
            <td>address</td>
            <td><input type="text" name="address"/> </td>
        </tr>
    </table>
    <p>${result}</p>
    <input type="submit" value="sign up"/>

</form>
</body>
</html>
