
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Search Product</h1>
<p><a href="/products">back</a></p>
<form method="post">
    <table>
        <tr>
            <td>name</td>
            <td><input type="text" name="name"></td>
        </tr>
    </table>
    <input type="submit" value="Search Product"/>

    <table>
        <tr>
            <td><c:out value="name"/></td>
            <td><c:out value="${name}"/></td>
        </tr>
        <tr>
            <td><c:out value="price"/> </td>
            <td><c:out value="${price}"/> </td>
        </tr>
        <tr>
            <td><c:out value="description"/></td>
            <td><c:out value="${description}"/></td>
        </tr>
        <tr>
            <td><c:out value="producer"/></td>
            <td><c:out value="${producer}"/></td>
        </tr>

    </table>

</form>
</body>
</html>