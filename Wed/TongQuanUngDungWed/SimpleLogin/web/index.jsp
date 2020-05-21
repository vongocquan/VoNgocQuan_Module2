<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 20/05/2020
  Time: 5:26 CH
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE HTML>
<html>
<style type="text/css">
    form{
        text-align: center;
    }
    .login {
        height:180px; width:230px;
        margin:0;
        padding:10px;
    }
    input {
        padding:5px; margin:5px;
        border:1px solid springgreen;
    }

</style>
<body>
<form method="post" action="${pageContext.request.contextPath}/login">
    <diz class="login">
        <h2>Login</h2>
        <label >
            <input type="text" name="username" size="30" placeholder="username"/>
        </label><br/>
        <label>
            <input type="password" name="password" size="30" placeholder="password"/>
        </label><br/>
        <input type="submit" value="Sign in"/>
    </diz>
</form>
</body>
</html>
