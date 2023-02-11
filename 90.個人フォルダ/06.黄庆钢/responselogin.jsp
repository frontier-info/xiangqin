<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
<form action="">
  <table>
       <tr>
        <td>用户名</td>
        <td><input type="text" name="username" id="username" placeholder="请输入用户"/></td>
       </tr>
       <tr>
        <td>密码</td>
        <td><input type="text" name="password" id="password" placeholder="请输入密码"/></td>
       </tr>
       <tr>
        <td><input type="checkbox" name="remember" id="remember" value="renenberMe" checked="checked"/></td>
        <td>记住密码</td>
       </tr>
       <tr>
        <td><input type="submit" value="登録"/></td>
        <td><input type="reset" value="重置"/></td>
       </tr>
  </table>
</form>
</body> 
</html>