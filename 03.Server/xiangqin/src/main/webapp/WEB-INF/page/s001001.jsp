<%@ page language= "java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
      
    <div>
    <label for="username">账户:</label>
    <input type="text" id="username" name="username">
</div>

<div>
    <label for="pass">密码:</label>
    <input type="password" id="pass" name="password"
           minlength="8" required>
</div>

<input type="submit" name="login" value="登录">


<input type="submit" name="register" value="注册">


<input type="submit" name="repassword" value="找回密码">

</body>
</html>