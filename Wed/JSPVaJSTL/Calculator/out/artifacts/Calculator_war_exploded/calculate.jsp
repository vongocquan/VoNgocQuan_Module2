<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 21/05/2020
  Time: 7:43 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    float firstOperand = Float.parseFloat(request.getParameter("firstOperand"));
    float secondOperand = Float.parseFloat(request.getParameter("secondOperand"));
    String operand = request.getParameter("operand");
    String result = "";
    switch (operand) {
        case "addition":
            result += (firstOperand + secondOperand);
            break;
        case "subtraction":
            result += firstOperand - secondOperand;
            break;
        case "multiplication":
            result += firstOperand * secondOperand;
            break;
        default:
            if (secondOperand == 0) {
                result = "error";
            } else {
                result += firstOperand / secondOperand;
            }
            break;
    }
%>
<h1><b>Result:</b></h1>
<%=result%>
</body>
</html>
