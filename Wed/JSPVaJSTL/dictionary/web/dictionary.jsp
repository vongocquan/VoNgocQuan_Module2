<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 21/05/2020
  Time: 7:17 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Map<String, String> map = new HashMap<>();
%>
<%
    map.put("hello", "Xin Chào");
    String search = request.getParameter("search");
    String result = map.get(search);
    if (result != null){
        out.print(result);
    }
    else {
        out.print("Not found");
    }
%>
</body>
</html>
