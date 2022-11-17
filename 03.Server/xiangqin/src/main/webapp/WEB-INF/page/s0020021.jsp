<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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
								<font face="verdana">
									<font size="6" color="black">个人信息确认页面 
							</h2>
							<h3>
								<font size="3" color="pink">💛金风玉露一相逢，便胜却人间无数。💛 
							</h3>
							<hr />

							<form:form modelAttribute="s002002Form" action="/xiangqin/ui/s002002" method="post" enctype="multipart/form-data">

								<div>
									<label>用户名:${s002002Form.uname}</label>
									<form:hidden path="uname" />
								</div>
								<div>
									<label>性别:${s002002Form.sex}</label>
									<form:hidden path="sex" />
								</div>
								<div>
									<label>出生年月日:${s002002Form.birthDate}</label>
									<form:hidden path="birthDate" />
								</div>
								<div>
									<label>出生地:${s002002Form.birthPlace}</label>
									<form:hidden path="birthPlace" />
								</div>
								<div>
									<label>住所:${s002002Form.address}</label>
									<form:hidden path="address" />
								</div>
								<div>
									<label>职业:${s002002Form.profession}</label>
									<form:hidden path="profession" />
								</div>
								<div>
									<label>兴趣:${s002002Form.interest}</label>
									<form:hidden path="interest" />
								</div>
								<div>
									<label>身高:${s002002Form.uheight}</label>
									<form:hidden path="uheight" />
								</div>
								<div>
									<label>体重:${s002002Form.uweight}</label>
									<form:hidden path="uweight" />
								</div>
								<div>
									<label>自我介绍:${s002002Form.introduce}</label>
									<form:hidden path="introduce" />
								</div>
								<div>
									<label>上传照片:${s002002Form.uimages.fileItem.name}</label>
								</div>
								<div>
									<label>上传照片:${s002002Form.identificationPhoto}</label>
									<form:hidden path="identificationPhoto" />
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

