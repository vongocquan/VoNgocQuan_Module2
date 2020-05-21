<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 21/05/2020
  Time: 8:55 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Product Discount Calculator</h2>
  <form method="post" action="${pageContext.request.contextPath}/display-discount">
    <label>
      Product Description: <input type="text" name="ProductDescription" size="30" placeholder="Product Description"/>
    </label> <br/>
    <label>
      List Price: <input type="text" name="ListPrice" size="30" placeholder="0"/>
    </label> <br/>
    <label>
      Discount Percent: <input type="text" size="30" name="DiscountPercent" placeholder="%"/>
    </label> <br/>
    <input type="submit" value="Calculate Discount"/>
  </form>
  </body>
</html>
