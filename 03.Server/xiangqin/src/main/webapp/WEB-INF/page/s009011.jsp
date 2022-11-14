<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台管理</title>
</head>
<body>

	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
		   <!--   导航栏 -->
		   <nav class="navbar navbar-primary" role="navigation">
		    <div class="container-fluid">
		     <div class="navbar-header">
		      <a class="navbar-brand" href="${pageContext.request.contextPath}/ui/s009010/e000">XiangQin</a>
		     </div>
		     <div>
		      <!--向右对齐-->
		      <ul class="nav nav-pills navbar-right">
		       <li class="nav-item">
		        <a href="${pageContext.request.contextPath}/ui/s009010/e000" class="nav-link">首页</a>
		       </li>
		       <li class="nav-item">
		        <a href="${pageContext.request.contextPath}/ui/s009030" class="nav-link">用户审查</a>
		       </li>
		       <li class="nav-item">
		        <a href="${pageContext.request.contextPath}/ui/s002001/e003" class="nav-link">退出登录</a>
		       </li>
		      </ul>
		     </div>
		    </div>
		   </nav>
		</div>
		<div class="col-md-2"></div>
	</div>
	<form:form modelAttribute="s009010Form" action="/xiangqin/ui/s009011" method="post">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">用户详细信息</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-md-12">
							<!-- 用户详细信息 -->
							<div class="row">
								<div class="col-md-4"></div>
								<div class="col-md-4">
									<div>
										<label>用户名:${s009010Form.userBasicInfo.uname}</label>
									</div>
									<div>
										<label>性别:
										<c:if test="${s009010Form.userBasicInfo.sex==0}" >女</c:if>
										<c:if test="${s009010Form.userBasicInfo.sex==1}" >男</c:if>
										</label>
									</div>
									<div>
										<label>出生年月日:${s009010Form.userBasicInfo.birthDate}</label>
									</div>
									<div>
										<label>出生地:${s009010Form.userBasicInfo.birthPlace}</label>
									</div>
									<div>
										<label>住所:${s009010Form.userBasicInfo.address}</label>
									</div>
									<div>
										<label>职业:${s009010Form.userBasicInfo.profession}</label>
									</div>
									<div>
										<label>兴趣:${s009010Form.userBasicInfo.interest}</label>
									</div>
									<div>
										<label>身高:${s009010Form.userBasicInfo.uheight}</label>
									</div>
									<div>
										<label>体重:${s009010Form.userBasicInfo.uweight}</label>
									</div>
									<div>
										<label>自我介绍:${s009010Form.userBasicInfo.introduce}</label>
									</div>
									<div>
										<label>上传照片:${s009010Form.userBasicInfo.uimages}</label>
									</div>
									<div>
										<label>上传照片:${s009010Form.userBasicInfo.identificationPhoto}</label>
									</div>
								</div>
							</div>
							<div class="col-md-4"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</form:form>

</body>
</html>