<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 22/05/2020
  Time: 10:29 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<style>
    html {
        text-align: center;
    }

    table {
        margin: 0 auto;
    }

    img {
        height: 200px;
        width: 300px;
    }

    td {
        text-align: center;
    }
</style>
<h2><b>Danh sách khách hàng</b></h2>
<table border="1px">
    <tr>
        <td>Tên</td>
        <td>Ngày Sinh</td>
        <td>Địa Chỉ</td>
        <td>Ảnh</td>
    </tr>
        <c:forEach items="${customers}" var="element">
            <tr>
                <td>${element[0]}</td>
                <td>${element[1]}</td>
                <td>${element[2]}</td>
                <td><img src="${element[3]}"/></td>
            </tr>
        </c:forEach>
</table>
</body>
</html>
