<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 <head>
  <%@ include file="../common/include_script.jsp"%>
  <%@ include file="../common/include_css.jsp"%>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>恋活-サインアップ</title>
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
      <h3 class="panel-title">サインアップ画面</h3>
     </div>
     <div class="panel-body pink">
      <div class="row">
      <div class="col-md-3"></div>
      <div class="col-md-6">
       <form:form modelAttribute="s001002Form" action="/xiangqin/ui/s001002" method="post">
		<!--   画面メッセージエリア -->
		<%@include file="../common/message.jsp"%>
         <div class="form-group">
          <label for="email">メールアドレス</label>
          <form:input class="form-control" placeholder="メールアドレス" path="email"/>
          <label for="smsCode">認証コード</label>
          <form:input class="form-control" placeholder="認証コード" path="smsCode"/>
 		  <button type="submit" class="button-success" name="getVerificationCode">認証コードを送信</button>
 		  <hr>
 		  <label for="password">パスワード</label>
 		  <form:password class="form-control" path="password"/>
 		  <label for="repassword">確認パスワード</label>
 		  <form:password class="form-control" path="repassword"/>
 		  <hr>
 		  <form:checkbox path="agree" value="agree"/><a data-toggle="modal" data-target="#agreeModal">「会員規約」</a>を必ずお読みの上、ご登録ください。
          <button type="submit" class="button-success" name="register">サインアップ</button>
         </div>
        </form:form>
       </div>
       <div class="col-md-3"></div>
      </div>
     </div>
    </div>
   </div>
  </div>
	<!-- モーダル（Modal） -->
	<div class="modal fade" id="agreeModal" tabindex="-1" role="dialog" aria-labelledby="agreeModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="agreeModalLabel">
						「会員規約」
					</h4>
				</div>
				<div class="modal-body">
				<!--   「会員規約」を導入 -->
				<%@include file="../common/agree.jsp"%>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>

</body>
</html>