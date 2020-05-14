
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Signup</title>
    <link href="Static/css/csssignup.css" rel="stylesheet" type="text/css"/>
    
</head>
<body>
    <div class="center">
        <div class="header">Signup</div>
        <form action="signup" method="POST">
            <input type="text" placeholder="Firstname" name="firstname">
            <input class="last" type="text" placeholder="Lastname" name="lastname">
            <input class="user" type="text" placeholder="Username" name="username">
            <input class="add" type="text" placeholder="Address" name="address">
            <input class="con" type="text" placeholder="Contact No" name="contactno">
            <input class="dob" type="date" placeholder="DOB" name="dob">
            <input class="pass" type="email" placeholder="Email Address" name="email">
            <input class="pass" type="password" placeholder="Password" name="password">
            <input class="pass "type="password" placeholder="Confirm Password" >
            <input type="submit" value="Sign Up">
        </form>

    </div>
    
</body>
</html>
