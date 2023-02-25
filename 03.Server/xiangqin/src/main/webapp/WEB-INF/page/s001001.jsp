<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 <head>
  <%@ include file="../common/include_script.jsp"%>
  <%@ include file="../common/include_css.jsp"%>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>恋活-ログイン</title>
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
      <script type="text/javascript">

        function Choose(check){
            	console.log(check.checked);
            	const email = document.getElementById('email');
        		const mobile = document.getElementById('mobile');
        		const emaillogin = document.getElementById('emailLogin');
        		const mobilelogin = document.getElementById('mobileLogin');
            	if (check.checked == true){
            		email.style.display = "none";
            	    email.disable = true;
            	    mobile.style.display = "block";
            	    mobile.disable = false;
            	    emaillogin.style.display ="none";
        	        emaillogin.disable = true;
        	        mobilelogin.style.display = "block";
        	        mobilelogin.disable = true;
            	    return true;
            	  } else {
      	           email.style.display = "block";
          	       email.disable = false;
          	       mobile.style.display = "none";
      	           mobile.disable = true;
      	           emaillogin.style.display ="block";
      	           emaillogin.disable = false;
      	           mobilelogin.style.display = "none";
      	           mobilelogin.disable = true;
          	        return false;
            	  }
        }
    </script>
       <form:form modelAttribute="s001001Form" action="/xiangqin/ui/s001001" method="post">
		<!--   画面メッセージエリア -->
		<%@include file="../common/message.jsp"%>
         <div class="form-group">
          <label for="email">メールアドレス</label>
          <!--<form:input class="form-control" path="email" />-->
          <input type="checkbox" name="myCheck" onclick="Choose(this)">
          <label for="myCheck">電話番号</label> 
          <form:input style="display:none" class="form-control"  placeholder="電話番号を入力してください。" path="mobile" />
          <form:input style="display:block" class="form-control" placeholder="メイルアドレスを入力してください。" path="email" />
          <label for="name">パスワード</label>
          <form:password class="form-control" path="password" />
          <hr>
          <button type="submit" class="button-success" id="emailLogin" style="display:block" name="emaillogin">ログイン</button>
          <button type="submit" class="button-success" id="mobileLogin" style="display:none" name="mobilelogin">ログイン</button>
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