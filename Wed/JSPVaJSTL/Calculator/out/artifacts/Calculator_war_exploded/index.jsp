<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 21/05/2020
  Time: 7:24 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1><b>Simple Calculator</b></h1>
  <b>Calculator</b>
  <form action="calculate.jsp" method="post">
    <label>
      First Operand<input type="text" name="firstOperand" placeholder="0"/>
    </label> <br/>
    <label>
      Operand
      <select name="operand">
        <option>addition</option>
        <option>subtraction</option>
        <option>multiplication</option>
        <option>division</option>
      </select>

    </label> <br/>
    <label>
      Second Operand<input type="text" name="secondOperand" placeholder="0"/>
    </label> <br/>
    <input type="submit" value="submit">
  </form>
  </body>
</html>
