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
    <div class="panel panel-primary">
     <div class="panel-heading">
      <h3 class="panel-title">用户登录</h3>
     </div>
     <div class="panel-body">
      <div class="row">
      <div class="col-md-3"></div>
      <div class="col-md-6">
       <form:form modelAttribute="s001001Form" action="/xiangqin/ui/s001001" method="post">
         <div class="form-group">
          <form:errors path="*" element="div" class="alert alert-danger" role="alert"/>
          <c:if test="${not empty message}">
           <div class="alert alert-success" role="alert"><p>${message}</p></div>
          </c:if>
          <label for="name">手机</label>
          <input class="form-control" type="text" name="mobile" value="123"/>
          <label for="name">密码</label>
          <input class="form-control" type="password" name="password" value="123"/>
          <hr>
          <button type="submit" class="btn btn-default" name="login">登录</button>
          <button type="submit" class="btn btn-default" name="register">注册</button>
          <button type="submit" class="btn btn-default" name="repassword">忘记密码</button>
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