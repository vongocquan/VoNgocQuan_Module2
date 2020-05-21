<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 20/05/2020
  Time: 6:39 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Currency Converter</h2>
  <form method="post" action="${pageContext.request.contextPath}/convert">
    <label>rate</label><br/>
    <label>
      <input type="text" name="rate" placeholder="RATE" value="22000"/>
    </label><br/>
    <label>USD: </label><br/>
    <label>
      <input type="text" name="usd" placeholder="USD" value="0"/>
    </label><br/>
    <input type = "submit" id = "submit" value = "Converter"/>
  </form>
  </body>
</html>
