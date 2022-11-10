<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户主页</title>
</head>
<body>

	<div class="row">

		<div class="col-md-3"></div>
		<div class="col-md-6">
			<!--   引入导航栏 -->
			<%@include file="../common/header.jsp"%>
		</div>
		<div class="col-md-3"></div>

	</div>
	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">用户主页</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-8">
							<ul style="list-style-type: none;">
								<li>
									<div class="media">
										<div class="media-left media-top">
											<img
												src="${pageContext.request.contextPath}\resources\userdata\uid_1\images.jfif"
												class="media-object" style="width: 90px">
										</div>
										<div class="media-body">
											<h4 class="media-heading">张三</h4>
											<p>女</p>
											<p>这是一些简介</p>
										</div>
									</div>
								</li>
								<li>
									<div class="media">
										<div class="media-left media-top">
											<img
												src="https://static.runoob.com/images/mix/img_avatar.png"
												class="media-object" style="width: 90px">
										</div>
										<div class="media-body">
											<h4 class="media-heading">张三</h4>
											<p>女</p>
											<p>这是一些简介</p>
										</div>
									</div>
								</li>
								<li>
									<div class="media">
										<div class="media-left media-top">
											<img
												src="https://static.runoob.com/images/mix/img_avatar.png"
												class="media-object" style="width: 90px">
										</div>
										<div class="media-body">
											<h4 class="media-heading">张三</h4>
											<p>女</p>
											<p>这是一些简介</p>
										</div>
									</div>
								</li>
								<li>
									<div class="media">
										<div class="media-left media-top">
											<img
												src="https://static.runoob.com/images/mix/img_avatar.png"
												class="media-object" style="width: 90px">
										</div>
										<div class="media-body">
											<h4 class="media-heading">张三</h4>
											<p>女</p>
											<p>这是一些简介</p>
										</div>
									</div>
								</li>
							</ul>


							<%--        <form:form modelAttribute="s002001Form" action="/xiangqin/ui/s002001" method="post"> --%>
							<!--          <div class="form-group"> -->
							<!--           <button type="submit" class="btn btn-default" name="a">用户信息设定</button> -->
							<!--           <button type="submit" class="btn btn-default" name="b">检索条件设定</button> -->
							<!--           <button type="submit" class="btn btn-default" name="c">退出登录</button> -->
							<!--          </div> -->
							<%--         </form:form> --%>
						</div>
						<div class="col-md-2"></div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>