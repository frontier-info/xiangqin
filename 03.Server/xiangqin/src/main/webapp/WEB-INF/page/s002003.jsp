
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
	<form:form modelAttribute="s002003Form" action="/xiangqin/ui/s002003" method="post">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-pink">
				<div class="panel-heading pink">
					<h3 class="panel-title">检索条件设定</h3>
				</div>
				<div class="panel-body pink">
					<div class="row">
						<div class="col-md-12">
				          <form:errors path="*" element="div" class="alert alert-danger" role="alert"/>
				          <c:if test="${not empty message}">
				           <div class="alert alert-success" role="alert"><p>${message}</p></div>
				          </c:if>
							<h2><font size="6" color="pink">请您填检索条件 </font></h2>
							<h3><font size="3" color="pink">💛金凤玉露一相逢，便胜却人间无数。💛 </font></h3>
							<hr />
							<!-- 检索条件区域 -->
							<div class="form-inline row">
								<div class="col-md-1"></div>
								<div class="col-md-3">
									<p>
										<label for="birthPlace">出生地:</label>
										<form:select path="birthPlace" class="form-control">
											<option value="">--请选择地区--</option>
										    <form:options items="${s002003Form.birthPlaceLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label>年龄：</label> 
										<label for="ageFrom">从</label> 
										<form:input class="form-control" size="3" path="ageFrom"/> 
										<label for="ageTo">到</label> 
										<form:input class="form-control" size="3" path="ageTo"/>
									</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-1"></div>
								<div class="col-md-3">
									<p>
										<label for="address">住所: </label>
										<form:select path="address" class="form-control" >
											<option value="">--请选择地区--</option>
								            <form:options items="${s002003Form.addressLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label>身高：</label> 
										<label for="uheightFrom">从</label> 
										<form:input class="form-control" size="3" path="uheightFrom"/> 
										<label for="uheightTo">到</label> 
										<form:input class="form-control" size="3" path="uheightTo"/>
									</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-1"></div>
								<div class="col-md-3">
									<p>
										<label for="profession">职业: </label>
										<form:select path="profession" class="form-control" >
											<option value="">--请选择行业--</option>
								            <form:options items="${s002003Form.professionLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label>体重：</label> 
										<label for="uweightFrom">从</label> 
										<form:input class="form-control" size="3" path="uweightFrom"/> 
										<label for="uweightTo">到</label> 
										<form:input class="form-control" size="3" path="uweightTo"/>
									</p>
								</div>
							</div>
							<hr size="2" color="#ffffff">
							<div class="form-inline row">
								<div class="col-md-1"></div>
								<div class="col-md-3">
									<input type="reset" class="button-default" value="信息重置">
									<input type="submit" class="button-success" name="saveSearchCondition" value="保存搜索条件">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</form:form>
</body>
</html>