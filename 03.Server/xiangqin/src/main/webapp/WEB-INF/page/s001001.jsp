<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 <head>
  <%@ include file="../common/include_script.jsp"%>
  <%@ include file="../common/include_css.jsp"%>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>婚活-ログイン</title>
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
      <h3 class="panel-title">ユーザーログイン</h3>
     </div>
     <div class="panel-body pink">
      <div class="row">
      <div class="col-md-3"></div>
      <div class="col-md-6">
       <form:form modelAttribute="s001001Form" action="/xiangqin/ui/s001001" method="post">
		<!--   画面メッセージエリア -->
		<%@include file="../common/message.jsp"%>
         <div class="form-group">
          <label for="email"><input type="radio" name="loginType" value="email" checked="checked"/>メールアドレス</label>
          <label for="mobile"><input type="radio" name="loginType" value="mobile"/>電話番号</label> 
          <form:input class="form-control" path="mobileOrEmail" />
          <label for="password">パスワード</label>
          <form:password class="form-control" path="password" />
          <hr>
          <button type="submit" class="button-success" name="login">ログイン</button>
          <button type="submit" class="button-success" name="register">サインアップ</button>
          <button type="submit" class="button-success" name="repassword">パスワード変更</button>
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