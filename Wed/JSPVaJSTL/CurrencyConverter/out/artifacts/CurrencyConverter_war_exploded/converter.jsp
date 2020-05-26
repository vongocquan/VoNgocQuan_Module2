<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 21/05/2020
  Time: 7:02 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    float rate;
    float usd;
    float vnd;
    try {
         rate = Float.parseFloat(request.getParameter("rate"));
         usd = Float.parseFloat(request.getParameter("usd"));
         vnd = (rate * usd);
         %>
<h1>Rate: <%=rate%></h1>
<h1>USD: <%=usd%></h1>
<h1>VND: <%=vnd%></h1>
<%
    }catch (NumberFormatException e) {
        out.print("error");
    }
%>
</body>
</html>
