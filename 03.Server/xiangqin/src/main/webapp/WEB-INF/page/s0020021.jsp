<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>XiangQin-用户信息设定确认</title>
</head>

<style>
body {
	background-color: whitesmoke;
}
</style>

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

							<h2>
								<font face="verdana"><font size="6" color="black">个人信息确认页面
							</h2>
							<h3>
								<font size="3" color="pink">💛金风玉露一相逢，便胜却人间无数。💛
							</h3>
							<hr />

							<form:form modelAttribute="s002002Form"
								action="/xiangqin/ui/s002002" method="post">

								<div>
									<div>
										用户名:
										<form:input path="uname" readonly="true" />
									</div>
									性别:
									<form:input path="sex" />
								</div>
								<div>
									出生年月日:
									<form:input path="birthDate" />
								</div>
								<div>
									出生地:
									<form:input path="birthPlace" />
								</div>
								<div>
									住所:
									<form:input path="address" />
								</div>
								<div>
									职业:
									<form:input path="profession" />
								</div>
								<div>
									兴趣:
									<form:input path="interest" />
								</div>
								<div>
									身高:
									<form:input path="uheight" />
								</div>
								<div>
									体重:
									<form:input path="uweight" />
								</div>
								<div>
									自我介绍:
									<form:input path="introduce" />
								</div>
								<div>
									上传照片:
									<form:input path="uimages" />
								</div>
								<div>
									上传照片:
									<form:input path="identificationPhoto" />
								</div>
								<input type="submit" name="d" value="确认提交个人信息" />
							</form:form>
						</div>
						<div class="col-md-2"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--   引入版权信息栏 -->
	<%@include file="../common/footer.jsp"%>

</body>



</html>

