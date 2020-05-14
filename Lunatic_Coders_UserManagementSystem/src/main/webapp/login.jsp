
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title>Login</title>
        <link href="Static/css/csslogin.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="center">
            <h1>Login</h1>
            <form action="login" method="POST">
                <div class="txt_field">
                    <input type="text" required name="uname">
                    <span></span>
                    <label>Username</label>
                </div>
                <div class="txt_field">
                    <input type="password" required name="pass">
                    <span></span>
                    <label>Password</label>
                </div>
                <div class="pass">Forgot Password?</div>
                <input type="submit" value="Login">
                <div class="signup_link">
                    Not a member? <a href="signup.jsp">Signup</a>
                </div>
        </div>

        <%
            String status = request.getParameter("status");

            if (status != null) {

                if (status.equals("false")) {
                    out.println("<h2>Email and password did not match </h2>");
                } else if (status.equals("error")) {
                    out.println("some error occurted");
                }
            }


        %>

    </div> 
</form>




</body>
</html>

