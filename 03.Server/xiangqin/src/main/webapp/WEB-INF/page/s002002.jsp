<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>相亲-登录</title>
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
						<div class="col-md-4">

							<h2>
								<font face="verdana">
									<font size="6" color="black">请您填入个人信息 
							</h2>
							<h3>
								<font size="3" color="pink">💛金凤玉露一相逢，便胜却人间无数。💛 
							</h3>
							<hr />

							<form:form modelAttribute="s002002Form" action="/xiangqin/ui/s002002" method="post" enctype="multipart/form-data">

								<div>
									<p>
										<label for="uname">用户名:</label>
										<input type="text" class="form-control" name="uname">
									</p>
								</div>

								<div>
									<p>
										<label for="uname">性别：</label>
										<label for="sex" class="radio-inline">
										<input type="radio" name="sex" value="女">女
										</label>
										<label for="sex" class="radio-inline">
										<input type="radio" name="sex" value="男" checked="checked">男
										</label>
									</p>
								</div>

								<div>
									<p>
										<label for="start">出生年月日:</label>
										<input type="date" class="form-control" name="birthDate" value="2000-01-01" min="1923-01-01" max="2002-01-01">
									</p>
								</div>

								<div>
									<p>
										<label for="birthPlace">出生地:</label>
										<select name="birthPlace" class="form-control" >
											<option value="">--请选择地区--</option>
								           <c:forEach items="${s002002Form.birthPlaceLi}" var="birthPlace">
										    <option value="${birthPlace}">${birthPlace}</option>
								           </c:forEach>
										</select>
									</p>
								</div>
								<div>
									<p>
										<label for="address">住所:</label>
										<select name="address" class="form-control" >
											<option value="">--请选择地区--</option>
								           <c:forEach items="${s002002Form.addressLi}" var="address">
										    <option value="${address}">${address}</option>
								           </c:forEach>
										</select>
									</p>
								</div>

								<div>
									<p>
										<label for="profession">职业:</label>
										<select name="profession" class="form-control" >
											<option value="">--请选择行业--</option>
								           <c:forEach items="${s002002Form.professionLi}" var="profession">
										    <option value="${profession}">${profession}</option>
								           </c:forEach>
										</select>
									</p>
								</div>

								<div>
									<p>
										<label for="interest">兴趣:</label>
										<input type="text" class="form-control" name="interest">
									</p>
								</div>

								<div>
									<p>
										<label for="uheight">身高:</label>
										<input type="text" class="form-control" name="uheight">
									</p>

								</div>

								<div>
									<p>
										<label for="uweight">体重:</label>
										<input type="text" class="form-control" name="uweight">
									</p>
								</div>

								<div>
									<p>
										<label for="introduce">自我介绍:</label>

										<textarea class="form-control" name="introduce" rows="13" onblur="check_note_input(this);countWorkNums(1);" onkeyup="countWorkNums(1);" onfocus="click_note_input(this);clearText(this);countWorkNums(1);">填写自我介绍更有利于被关注哦！勤劳的虫儿有鸟吃！</textarea>
									</p>
								</div>


								<div>
									<p>
										<label for="uimages">上传照片:</label>
										<input type="file" class="form-control" name="uimages">
									</p>
								</div>


								<div>
									<p>
										<label for="identification_photo">上传照片:</label>
										<input type="text" class="form-control" name="identification_photo">
									</p>
								</div>

								<div>
									<input type="reset" class="form-control" value="信息重置">
								    <input type="submit" class="form-control" name="b" value="提交个人信息">
								</div>



							</form:form>
						</div>
						<div class="col-md-6"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--   引入版权信息栏 -->
	<%@include file="../common/footer.jsp"%>

</body>
</html>
