
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>相亲-择偶要求设定</title>
</head>
<body>

	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<!--   引入导航栏 -->
			<%@include file="../common/header.jsp"%>
		</div>
		<div class="col-md-3"></div>

	</div>
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-pink">
				<div class="panel-heading pink">
					<h3 class="panel-title">检索条件设定</h3>
				</div>
				<div class="panel-body pink">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-4">
				          <form:errors path="*" element="div" class="alert alert-danger" role="alert"/>
				          <c:if test="${not empty message}">
				           <div class="alert alert-success" role="alert"><p>${message}</p></div>
				          </c:if>

							<h2>
								<font face="verdana">
									<font size="6" color="black">请您填入择偶要求 
							</h2>
							<h3>
								<font size="3" color="pink">💛金凤玉露一相逢，便胜却人间无数。💛 
							</h3>
							<hr />
							<form:form modelAttribute="s002003Form" action="/xiangqin/ui/s002003" method="post">

								<div>
									<p>
										<label for="ageFrom">年龄：从</label>
										<form:input class="form-control" path="ageFrom"/>
										<label for="ageTo">到</label>
										<form:input class="form-control" path="ageTo"/>
									</p>
								</div>
								<div>
									<p>
										<label for="birthPlace">出生地:</label>
										<form:select path="birthPlace" class="form-control">
											<option value="">--请选择地区--</option>
										    <form:options items="${s002003Form.birthPlaceLi}"/>
										</form:select>
									</p>
								</div>

								<div>
									<p>
										<label for="address">住所:</label>
										<form:select path="address" class="form-control" >
											<option value="">--请选择地区--</option>
								            <form:options items="${s002003Form.addressLi}"/>
										</form:select>
									</p>
								</div>

								<div>
									<p>
										<label for="profession">职业:</label>
										<form:select path="profession" class="form-control" >
											<option value="">--请选择行业--</option>
								            <form:options items="${s002003Form.professionLi}"/>
										</form:select>
									</p>
								</div>

								<div>
									<p>
										<label for="uheightFrom">身高：从</label>
										<form:input class="form-control" path="uheightFrom"/>
										<label for="uheightTo">到</label>
										<form:input class="form-control" path="uheightTo"/>
									</p>
								</div>

								<div>
									<p>
										<label for="uweightFrom">体重：从</label>
										<form:input class="form-control" path="uweightFrom"/>
										<label for="uweightTo">到</label>
										<form:input class="form-control" path="uweightTo"/>
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