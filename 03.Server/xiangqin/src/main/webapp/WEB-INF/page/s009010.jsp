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
					<h3 class="panel-title">后台管理(高级)</h3>
				</div>
				<div class="panel-body">
					<div class="row">
					  <!-- 提示信息区域 -->
					  <div class="col-md-3"></div>
					  <div class="col-md-6">
			          <form:errors path="*" element="div" class="alert alert-danger" role="alert"/>
			          <c:if test="${not empty message}">
			           <div class="alert alert-success" role="alert"><p>${message}</p></div>
			          </c:if>
					  </div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<!-- 检索条件区域 -->
							<div class="form-inline row">
								<div class="col-md-3">
								<p>
									<label for="uid">用户ID:</label>
									<input type="text" class="form-control" size="5" name="uid">
								</p>
								</div>
								<div class="col-md-3">
								<p>
									<label for="birthPlace">出生地:</label> <select name="birthPlace" class="form-control">
										<option value="">--请选择地区--</option>
										<c:forEach items="${s009010Form.birthPlaceLi}" var="birthPlace">
											<option value="${birthPlace}">${birthPlace}</option>
										</c:forEach>
									</select>
								</p>
								</div>
								<div class="col-md-3">
								<p>
									<label>年龄：</label> 
									<label for="ageFrom">从</label> 
									<input type="text" class="form-control" size="3" name="ageFrom"> 
									<label for="ageTo">到</label> 
									<input type="text" class="form-control" size="3" name="ageTo">
								</p>
								</div>
								<div class="col-md-3">
								<p>
									<label>用户审核状态：</label> 
									<select name="userStatus" class="form-control">
										<option value="">--请选择审核状态--</option>
										<c:forEach items="${s009010Form.userStatusLi}" var="userStatus">
											<option value="${userStatus.selectKey}">${userStatus.selectValue}</option>
										</c:forEach>
									</select>
								</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-3">
								<p>
									<label for="uname">性别：</label>
									<label for="sex" class="radio-inline"> <input type="radio" name="sex" value="" checked="checked">不限</label>
									<label for="sex" class="radio-inline"> <input type="radio" name="sex" value="女">女</label>
									<label for="sex" class="radio-inline"> <input type="radio" name="sex" value="男">男</label>
								</p>
								</div>
								<div class="col-md-3">
								<p>
									<label for="address">住所:</label>
									<select name="address" class="form-control">
										<option value="">--请选择地区--</option>
										<c:forEach items="${s009010Form.addressLi}" var="address">
											<option value="${address}">${address}</option>
										</c:forEach>
									</select>
								</p>
								</div>
								<div class="col-md-3">
								<p>
									<label>身高：</label> 
									<label for="uheightFrom">从</label> 
									<input type="text" class="form-control" size="3" name="uheightFrom"> 
									<label for="uheightTo">到</label> 
									<input type="text" class="form-control" size="3" name="uheightTo">
								</p>
								</div>
								<div class="col-md-3">
								<p>
									<label>用户级别：</label> 
									<select name="userRank" class="form-control">
										<option value="">--请选择用户级别--</option>
										<c:forEach items="${s009010Form.userRankLi}" var="userRank">
											<option value="${userRank.selectKey}">${userRank.selectValue}</option>
										</c:forEach>
									</select>
								</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-3"></div>
								<div class="col-md-3">
								<p>
									<label for="profession">职业:</label>
									<select name="profession" class="form-control">
										<option value="">--请选择行业--</option>
										<c:forEach items="${s009010Form.professionLi}" var="profession">
											<option value="${profession}">${profession}</option>
										</c:forEach>
									</select>
								</p>
								</div>
								<div class="col-md-3">
								<p>
									<label>体重：</label> 
									<label for="uweightFrom">从</label> 
									<input type="text" class="form-control" size="3" name="uweightFrom"> 
									<label for="uweightTo">到</label> 
									<input type="text" class="form-control" size="3" name="uweightTo">
								</p>
								</div>
							</div>
							<hr size="2" color="#ffffff">
							<div class="form-inline row">
								<div class="col-md-3"></div>
								<div class="col-md-3">
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
	<c:if test="${s009010Form.userFullInfoLi.size() > 0}">
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
					         <table id="userFullInfoTable" class="table table-bordered table-striped">
						      <thead>
							   <tr>
							    <th>用户ID</th>
							    <th>姓名</th>
							    <th>性别</th>
							    <th>出生年月</th>
							    <th>电话号码</th>
							    <th>邮箱</th>
							    <th>籍贯</th>
							    <th>现住址</th>
							    <th>职业</th>
							    <th>兴趣</th>
							    <th>身高</th>
							    <th>体重</th>
							    <th>用户状态</th>
							    <th>用户级别</th>
							    <th>审核结果</th>
							   </tr>
						      </thead>
						      <tbody>
						      <c:forEach items="${s009010Form.userFullInfoLi}" var="userFullInfo">
							    <tr>
							     <td>${userFullInfo.uid}</td>
							     <td><a href="${pageContext.request.contextPath}/ui/s009010/e002?uid=${userFullInfo.uid}">${userFullInfo.uname}</a></td>
							     <td>${userFullInfo.sex}</td>
							     <td><fmt:formatDate type="date" value="${userFullInfo.birthDate}"/></td>
							     <td>${userFullInfo.mobile}</td>
							     <td>${userFullInfo.email}</td>
							     <td>${userFullInfo.birthPlace}</td>
							     <td>${userFullInfo.address}</td>
							     <td>${userFullInfo.profession}</td>
							     <td>${userFullInfo.interest}</td>
							     <td>${userFullInfo.uheight}</td>
							     <td>${userFullInfo.uweight}</td>
							     <td>${userFullInfo.userStatusName}</td>
							     <td>${userFullInfo.userRankName}</td>
							     <td>${userFullInfo.userCensorResult}</td>
							    </tr>
							  </c:forEach>
						      </tbody>
					         </table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</c:if>
	</form:form>

</body>
 <script>
 $(document).ready(function() {
     $("#userFullInfoTable").dataTable({
    	 // 开启外部CSS
    	 "jQueryUI": true,
    	 // 关闭排序
    	 "ordering": true,
    	 // 关闭搜索
    	 "searching": false,
    	 "scrollY": "400px",
    	 "scrollCollapse": true,
    	 // 分页按钮
    	 "pagingType": 'full_numbers',
    	 // 信息
    	 "info": "从 0 到 0 的第 0 页",
    	 // 国际化
    	 "language": {
   	        "paginate": {
   	            "first": '««',
   	            "previous": '«',
   	            "next": '»',
   	            "last": '»»'
   	        },
       	 }
     });
 });
 </script>
</html>