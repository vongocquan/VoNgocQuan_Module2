
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <table>
        <tr>
            <td>account</td>
            <td><input type="text" name="account"/></td>
        </tr>
        <tr>
            <td>password</td>
            <td><input type="password" name="password"/></td>
        </tr>
    </table>
    <input type="submit" value="login"/>
</form>
<form action="/signUp" method="post">
    <input type="submit" value="registration"/>
</form>
</body>
</html>
