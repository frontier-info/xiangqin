<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 <head>
  <%@ include file="../common/include_script.jsp"%>
  <%@ include file="../common/include_css.jsp"%>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>恋活-パスワード変更</title>
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
				<h3 class="panel-title">パスワード変更</h3>				
			</div>					
			<div class="panel-body pink">					
				<div class="row">				
					<div class="col-md-3"></div>			
					<div class="col-md-6">			
						<form:form modelAttribute="s001003Form" action="/xiangqin/ui/s001003" method="post">	
							<!--   画面メッセージエリア -->
							<%@include file="../common/message.jsp"%>	
							<div class="form-group">
						        <div>
									<label for="email">メールアドレス</label>	
									<form:input class="form-control" type="text" path="email" placeholder="メールアドレスを入力してください"/>
									<label for="smsCode">認証コード</label>	
									<form:input class="form-control" type="text" path="smsCode" value=""/>
									<button type="submit" class="button-success" name="getVerificationCode" >認証コードを送信</button>				
									<hr>
									<label for="password">パスワード</label>	
									<input class="form-control" type="password" name="password" value=""/>
									<label for="repassword">確認パスワード</label>	
									<input class="form-control" type="password" name="repassword" value=""/>
									<hr>	
									<button type="submit" class="button-success" name="changePassword" >パスワード変更</button>
								</div>
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