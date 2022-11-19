<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 <head>
  <%@ include file="../common/include_script.jsp"%>
  <%@ include file="../common/include_css.jsp"%>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>相亲-注册1/2</title>
</head>
<body>
  <div class="row">
   <div class="col-md-4"></div>
   <div class="col-md-4">
    <div class="page-header">
     <h1>XiangQin</h1>
    </div>
   </div>
   <div class="col-md-4"></div>
  </div>
  <div class="row">
   <div class="col-md-4"></div>
   <div class="col-md-4">
    <div class="panel panel-primary">
     <div class="panel-heading">
      <h3 class="panel-title">注册页面1</h3>
     </div>
     <div class="panel-body">
      <div class="row">
      <div class="col-md-3"></div>
      <div class="col-md-6">
       <form:form modelAttribute="s001002Form" action="/xiangqin/ui/s001002" method="post">
         <div class="form-group">
          <form:errors path="*" element="div" class="alert alert-danger" role="alert"/>
          <c:if test="${not empty message}">
           <div class="alert alert-success" role="alert"><p>${message}</p></div>
          </c:if>
          <label for="name">手机号</label>
          <form:input class="form-control" placeholder="手机号码" path="mobile"/>
          <label for="name">验证码</label>
          <form:input class="form-control" placeholder="短信验证码" path="registerSmsCode"/>
 		  <button type="submit" class="btn btn-default" name="getVerificationCode">获取验证码</button>
 		  <hr><label for="name">密码</label>
 		  <form:password class="form-control" path="password"/>
 		 <hr> <label for="name">确认密码</label>
 		  <form:password class="form-control" path="repassword"/>
 		  <hr>
          <button type="submit" class="btn btn-default" name="register">注册</button>
         </div>
        </form:form>
       </div>
       <div class="col-md-3"></div>
      </div>
     </div>
    </div>
   </div>
  </div>

</body>
</html>