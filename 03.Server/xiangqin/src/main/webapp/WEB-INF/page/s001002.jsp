<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
 <head>
  <%@ include file="../common/include_script.jsp"%>
  <%@ include file="../common/include_css.jsp"%>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>相亲-注册</title>
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
      <h3 class="panel-title">注册页面</h3>
     </div>
     <div class="panel-body pink">
      <div class="row">
      <div class="col-md-3"></div>
      <div class="col-md-6">
       <form:form modelAttribute="s001002Form" action="/xiangqin/ui/s001002" method="post">
		<!--   引入页面提示信息 -->
		<%@include file="../common/message.jsp"%>
         <div class="form-group">
          <label for="mobile">手机号</label>
          <form:input class="form-control" placeholder="手机号码" path="mobile"/>
          <label for="smsCode">验证码</label>
          <form:input class="form-control" placeholder="短信验证码" path="smsCode"/>
 		  <button type="submit" class="button-success" name="getVerificationCode">获取验证码</button>
 		  <hr>
 		  <label for="password">密码</label>
 		  <form:password class="form-control" path="password"/>
 		  <label for="repassword">确认密码</label>
 		  <form:password class="form-control" path="repassword"/>
 		  <hr>
 		  <form:checkbox path="agree" value="agree"/>已阅读和同意相亲网的<a data-toggle="modal" data-target="#agreeModal">服务协议</a>
          <button type="submit" class="button-success" name="register">注册</button>
         </div>
        </form:form>
       </div>
       <div class="col-md-3"></div>
      </div>
     </div>
    </div>
   </div>
  </div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="agreeModal" tabindex="-1" role="dialog" aria-labelledby="agreeModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="agreeModalLabel">
						服务协议
					</h4>
				</div>
				<div class="modal-body">
				<!--   引入服务协议 -->
				<%@include file="../common/agree.jsp"%>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>

</body>
</html>