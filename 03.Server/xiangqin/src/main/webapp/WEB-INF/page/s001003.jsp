<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 <head>
  <%@ include file="../common/include_script.jsp"%>
  <%@ include file="../common/include_css.jsp"%>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta name="save" content="history">
  <title>相亲-找回密码</title>
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
				<h3 class="panel-title">找回密码</h3>				
			</div>					
			<div class="panel-body">					
				<div class="row">				
					<div class="col-md-3"></div>			
					<div class="col-md-6">			
						<form:form modelAttribute="s001003Form" action="/xiangqin/ui/s001003" method="post">		
							<div class="form-group">
								<form:errors path="*" element="div" class="alert alert-danger" role="alert"/>
								<c:if test="${not empty message}">
						           <div class="alert alert-success" role="alert"><p>${message}</p></div>
						        </c:if>
						        <div>
									<label for="mobile">手机</label>	
									<form:input class="form-control" type="text" path="mobile" placeholder="请输入手机号"/>
									<label for="smsCode">验证码</label>	
									<form:input class="form-control" type="text" path="smsCode" value=""/>
									<button type="submit" class="btn btn-default" name="getVerificationCode" >发送验证码</button>				
									<hr>
									<label for="password">密码</label>	
									<input class="form-control" type="password" name="password" value=""/>
									<label for="repassword">重复密码</label>	
									<input class="form-control" type="password" name="repassword" value=""/>
									<hr>	
									<button type="submit" class="btn btn-default" name="changePassword" >重置密码</button>
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