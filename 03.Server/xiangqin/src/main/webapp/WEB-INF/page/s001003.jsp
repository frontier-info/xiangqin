<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 <head>
  <%@ include file="../common/include_script.jsp"%>
  <%@ include file="../common/include_css.jsp"%>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>相亲-找回密码</title>
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
				<h3 class="panel-title">找回密码</h3>				
			</div>					
			<div class="panel-body pink">					
				<div class="row">				
					<div class="col-md-3"></div>			
					<div class="col-md-6">			
						<form:form modelAttribute="s001003Form" action="/xiangqin/ui/s001003" method="post">	
							<!--   引入页面提示信息 -->
							<%@include file="../common/message.jsp"%>	
							<div class="form-group">
						        <div>
									<label for="mobile">手机</label>	
									<form:input class="form-control" type="text" path="mobile" placeholder="请输入手机号"/>
									<label for="smsCode">验证码</label>	
									<form:input class="form-control" type="text" path="smsCode" value=""/>
									<button type="submit" class="button-success" name="getVerificationCode" >发送验证码</button>				
									<hr>
									<label for="password">密码</label>	
									<input class="form-control" type="password" name="password" value=""/>
									<label for="repassword">重复密码</label>	
									<input class="form-control" type="password" name="repassword" value=""/>
									<hr>	
									<button type="submit" class="button-success" name="changePassword" >重置密码</button>
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