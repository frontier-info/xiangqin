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
	<form:form modelAttribute="s009010Form" action="/xiangqin/ui/s009010" method="post">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">后台管理(普通)</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-md-12">
							<!-- 检索条件区域 -->

								<div class="row">
									<div class="col-md-4">
									<p>
										<label for="uname">用户ID:</label>
										<input type="text" class="form-control" name="uid">
									</p>
									</div>
									<div class="col-md-4">
									<p>
										<label for="uname">性别：</label> 
									</p>
									<p>
										<label for="sex" class="radio-inline"> <input type="radio" name="sex" value="0"> 女</label>
										<label for="sex" class="radio-inline"> <input type="radio" name="sex" value="1" checked="checked"> 男</label>
									</p>
									</div>
									<div class="form-inline col-md-4">
									<p>
										<label>年龄：</label> 
									</p>
									<p>
										<label for="ageFrom">从</label> 
										<input type="text" class="form-control" name="ageFrom"> 
										<label for="ageTo">到</label> 
										<input type="text" class="form-control" name="ageTo">
									</p>
									</div>
								</div>
								<div class="row">
									<div class="col-md-4">
									<p>
										<label for="birthPlace">出生地:</label> <select name="birthPlace" class="form-control">
											<option value="">--请选择地区--</option>
											<c:forEach items="${s009010Form.birthPlaceLi}" var="birthPlace">
												<option value="${birthPlace}">${birthPlace}</option>
											</c:forEach>
										</select>
									</p>
									</div>
									<div class="col-md-4">
									<p>
										<label for="address">住所:</label> <select name="address" class="form-control">
											<option value="">--请选择地区--</option>
											<c:forEach items="${s009010Form.addressLi}" var="address">
												<option value="${address}">${address}</option>
											</c:forEach>
										</select>
									</p>
									</div>
									<div class="col-md-4">
									<p>
										<label for="profession">职业:</label> <select name="profession" class="form-control">
											<option value="">--请选择行业--</option>
											<c:forEach items="${s009010Form.professionLi}" var="profession">
												<option value="${profession}">${profession}</option>
											</c:forEach>
										</select>
									</p>
									</div>
								</div>
								<div class="row">
									<div class="form-inline col-md-4">
									<p>
										<label>身高：</label> 
									</p>
									<p>
										<label for="uheightFrom">从</label> 
										<input type="text" class="form-control" name="uheightFrom"> 
										<label for="uheightTo">到</label> 
										<input type="text" class="form-control" name="uheightTo">
									</p>
									</div>
									<div class="form-inline col-md-4">
									<p>
										<label>体重：</label> 
									</p>
									<p>
										<label for="uweightFrom">从</label> 
										<input type="text" class="form-control" name="uweightFrom"> 
										<label for="uweightTo">到</label> 
										<input type="text" class="form-control" name="uweightTo">
									</p>
									</div>
									<div class="form-inline col-md-4">
									<p>
										<label for="photo">有照片：</label> 
										<input type="checkbox" name="photo" value="1">
									</p>
									<p>
										<input type="submit" class="form-control" name="search" value="搜索" />
										<input type="reset" class="form-control" value="重置" />
									</p>
									</div>
								</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</form:form>
	<c:if test="${s009010Form.userSimpleInfoLi.size() > 0}">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">检索结果</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-md-12">
							<!-- 检索结果区域 -->
							<ul style="list-style-type: none;">
								<c:forEach items="${s009010Form.userSimpleInfoLi}" var="userSimpleInfo">
									<li>
										<div class="media">
											<div class="media-left media-top">
												<img src="${pageContext.request.contextPath}/${userSimpleInfo.uimages}" class="media-object" style="width: 90px">
											</div>
											<div class="media-body">
												<h4 class="media-heading"><a href="${pageContext.request.contextPath}/ui/s009010/e002?uid=${userSimpleInfo.uid}">${userSimpleInfo.uname}</a></h4>
												<c:if test="${userSimpleInfo.sex==0}"><p>女</p></c:if>
												<c:if test="${userSimpleInfo.sex==1}"><p>男</p></c:if>
												<p><c:out value="${userSimpleInfo.introduce}"/></p>
											</div>
										</div>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</c:if>

</body>
</html>