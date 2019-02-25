<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<body>
<head>
    <h1 align="center">Hi Prinshu</h1>
    <p align="center">Welcome to present. :) </p></br></br>
</head>
<form id="login" action="/present" method="post">
<div align="center">
    Email ID <input align="center" type="email" name="userName"><div class="clear"/>
    Password <input type="password" name="password"><div class="clear"/></br>

    <button style="background-color: lightseagreen" type="submit"> Log In </button>
</div>
</form>
</body>

</html>