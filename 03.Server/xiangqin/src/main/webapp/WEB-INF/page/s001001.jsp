<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 <head>
  <%@ include file="../common/include_script.jsp"%>
  <%@ include file="../common/include_css.jsp"%>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>相亲-登录</title>
</head>
<body>
  <div class="row">
   <div class="col-md-4"></div>
   <div class="col-md-4">
     <h1><a class="navbar-brand pink" href="${pageContext.request.contextPath}/ui/s001001">XiangQin</a></h1>
   </div>
   <div class="col-md-4"></div>
  </div>
  <div class="row">
   <div class="col-md-4"></div>
   <div class="col-md-4">
    <div class="panel panel-pink">
     <div class="panel-heading pink">
      <h3 class="panel-title">用户登录</h3>
     </div>
     <div class="panel-body pink">
      <div class="row">
      <div class="col-md-3"></div>
      <div class="col-md-6">
       <form:form modelAttribute="s001001Form" action="/xiangqin/ui/s001001" method="post">
		<!--   引入页面提示信息 -->
		<%@include file="../common/message.jsp"%>
         <div class="form-group">
          <label for="name">邮箱</label>
          <form:input class="form-control" path="email" />
          <label for="name">密码</label>
          <form:password class="form-control" path="password" />
          <hr>
          <button type="submit" class="button-success" name="login">登录</button>
          <button type="submit" class="button-success" name="register">注册</button>
          <button type="submit" class="button-success" name="repassword">忘记密码</button>
         </div>
        </form:form>
       </div>
      </div>
     </div>
    </div>
   </div>
  </div>
<div id="recaptcha-container"></div>
</body>
</html>