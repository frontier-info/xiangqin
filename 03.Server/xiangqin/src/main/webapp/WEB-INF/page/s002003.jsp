
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>相亲-检索条件设定</title>
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
						<div class="col-md-4">

							<h2>
								<font face="verdana">
									<font size="6" color="black">请您填入检索条件 
							</h2>
							<h3>
								<font size="3" color="pink">💛金凤玉露一相逢，便胜却人间无数。💛 
							</h3>
							<hr />
							<form:form modelAttribute="s002003Form" action="/xiangqin/ui/s002003" method="post">

								<div>
									<p>
										<label for="uname">性别：</label>
										<label for="sex" class="radio-inline">
											<input type="radio" name="sex" value="0">
											女
										</label>
										<label for="sex" class="radio-inline">
											<input type="radio" name="sex" value="1" checked="checked">
											男
										</label>
									</p>
								</div>

								<div>
									<p>
										<label for="ageFrom">年龄：从</label>
										<input type="text" class="form-control" name="ageFrom">
										<label for="ageTo">到</label>
										<input type="text" class="form-control" name="ageTo">
									</p>
								</div>
								<div>
									<p>
										<label for="birthPlace">出生地:</label>
										<select name="birthPlace" class="form-control">
											<option value="">--请选择地区--</option>
											<c:forEach items="${s002003Form.birthPlaceLi}" var="birthPlace">
												<option value="${birthPlace}">${birthPlace}</option>
											</c:forEach>
										</select>
									</p>
								</div>

								<div>
									<p>
										<label for="address">住所:</label>
										<select name="address" class="form-control">
											<option value="">--请选择地区--</option>
											<c:forEach items="${s002003Form.addressLi}" var="address">
												<option value="${address}">${address}</option>
											</c:forEach>
										</select>
									</p>
								</div>

								<div>
									<p>
										<label for="profession">职业:</label>
										<select name="profession" class="form-control">
											<option value="">--请选择行业--</option>
											<c:forEach items="${s002003Form.professionLi}" var="profession">
												<option value="${profession}">${profession}</option>
											</c:forEach>
										</select>
									</p>
								</div>

								<div>
									<p>
										<label for="uheightFrom">身高：从</label>
										<input type="text" class="form-control" name="uheightFrom">
										<label for="uheightTo">到</label>
										<input type="text" class="form-control" name="uheightTo">
									</p>
								</div>

								<div>
									<p>
										<label for="uweightFrom">体重：从</label>
										<input type="text" class="form-control" name="uweightFrom">
										<label for="uweightTo">到</label>
										<input type="text" class="form-control" name="uweightTo">
									</p>
								</div>
								<div>
									<p>
										<label for="photo">有照片：</label>
										<label for="photo" class="radio-inline">
											<input type="checkbox" name="photo" value="1">
										</label>
									</p>
								</div>

								<hr size="2" color="#ffffff">

								<input type="submit" class="form-control" name="saveSearchCondition" value="保存搜索条件">
												&nbsp;&nbsp;&nbsp;
												<input type="reset" class="form-control" value="重置">
							</form:form>
						</div>
						<div class="col-md-6"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>