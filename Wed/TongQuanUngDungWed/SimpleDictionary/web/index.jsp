<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 21/05/2020
  Time: 8:22 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Vietnamese Dictionary</h2>
  <form method="post" action="${pageContext.request.contextPath}/dictionary">
    <label>
      <input type="text" name="txtSearch" placeholder="enter the work: "/><br/>
    </label>
    <input type="submit" id="=submit" value="Search"/>


  </form>
  </body>
</html>
