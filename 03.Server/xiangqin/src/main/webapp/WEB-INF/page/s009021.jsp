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
		      <a class="navbar-brand" href="${pageContext.request.contextPath}/ui/s009020/e000">XiangQin</a>
		     </div>
		     <div>
		      <!--向右对齐-->
		      <ul class="nav nav-pills navbar-right">
		       <li class="nav-item">
		        <a href="${pageContext.request.contextPath}/ui/s009020/e000" class="nav-link">首页</a>
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
	<form:form modelAttribute="s009020Form" action="/xiangqin/ui/s009021" method="post">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">用户详细信息</h3>
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
							<!-- 用户详细信息 -->
							<div class="row">
								<div class="col-md-2"></div>
								<div class="col-md-4">
									<div class="media">
										<div class="media-left media-top">
											<img
												src="${pageContext.request.contextPath}/${s009020Form.userFullInfo.uimages}"
												class="media-object" style="width: 90px">用户个人照片
										</div>
										<div class="media-body">
											<h4 class="media-heading">用户名:${s009020Form.userFullInfo.uname}</h4>
											<p>性别:${s009020Form.userFullInfo.sex}</p>
											<p>自我介绍:${s009020Form.userFullInfo.introduce}</p>
											<p>出生年月日:<fmt:formatDate type="date" value="${s009020Form.userFullInfo.birthDate}"/></p>
											<p>出生地:${s009020Form.userFullInfo.birthPlace}</p>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="media">
										<div class="media-left media-top">
											<img
												src="${pageContext.request.contextPath}/${s009020Form.userFullInfo.identificationPhoto}"
												class="media-object" style="width: 90px">身份认证信息
										</div>
										<div class="media-body">
											<p>住所:${s009020Form.userFullInfo.address}</p>
											<p>职业:${s009020Form.userFullInfo.profession}</p>
											<p>兴趣:${s009020Form.userFullInfo.interest}</p>
											<p>身高:${s009020Form.userFullInfo.uheight}</p>
											<p>体重:${s009020Form.userFullInfo.uweight}</p>
										</div>
									</div>
								</div>
								<div class="col-md-2"></div>
							</div>
							<hr size="2" color="#ffffff">
							<div class="row">
								<div class="col-md-2"></div>
								<div class="col-md-2">
									<p>当前用户权限:${s009020Form.userFullInfo.userRankName}</p>
									<p>当前用户审查状态:${s009020Form.userFullInfo.userStatusName}</p>
									<input type="button" class="form-control" data-toggle="modal" data-target="#changeUserRankModal" value="变更用户权限" />
									<input type="button" class="form-control" data-toggle="modal" data-target="#updateUserStatusModal" value="新用户审查结果" />
									<input type="button" class="form-control" data-toggle="modal" data-target="#deleteUserModal" value="删除用户" />
									
								</div>
								<div class="col-md-8"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="changeUserRankModal" tabindex="-1" role="dialog" aria-labelledby="changeUserRankModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="changeUserRankModalLabel">
						变更用户权限
					</h4>
				</div>
				<div class="modal-body">
					<p>
						<label>用户名:${s009020Form.userFullInfo.uname}</label>
					</p>
					<p>
						<label for="userRankCode">用户权限:</label>
						<select name="userRankCode" class="form-control">
							<option value="">--请选择用户权限--</option>
							<c:forEach items="${s009020Form.userRankLi}" var="userRank">
								<option value="${userRank.selectKey}">${userRank.selectValue}</option>
							</c:forEach>
						</select>
					</p>
				</div>
				<div class="modal-footer">
					<input type="button" class="btn btn-default" data-dismiss="modal" value="关闭"/>
					<input type="submit" class="btn btn-primary" name="changeUserRank" value="变更用户权限"/>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="updateUserStatusModal" tabindex="-1" role="dialog" aria-labelledby="updateUserStatusModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="updateUserStatusModalLabel">
						新用户审查
					</h4>
				</div>
				<div class="modal-body">
					<p>
						<label>用户名:${s009020Form.userFullInfo.uname}</label>
					</p>
					<p>
						<label for="userCensorResult">新用户审查书面结果:</label>
						<input type="text" class="form-control" size="5" name="userCensorResult">
					</p>
					<p>
						<label for="userStatusCode">新用户审查结果:</label>
						<select name="userStatusCode" class="form-control">
							<option value="">--请选择审查结果--</option>
							<c:forEach items="${s009020Form.userStatusLi}" var="userStatus">
								<option value="${userStatus.selectKey}">${userStatus.selectValue}</option>
							</c:forEach>
						</select>
					</p>
				</div>
				<div class="modal-footer">
					<input type="button" class="btn btn-default" data-dismiss="modal" value="关闭"/>
					<input type="submit" class="btn btn-primary" name="updateUserStatus" value="提交用户审查结果"/>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="deleteUserModal" tabindex="-1" role="dialog" aria-labelledby="deleteUserModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="deleteUserModalLabel">
						用户删除
					</h4>
				</div>
				<div class="modal-body">
					<p>
						<label>确定要删除该用户吗?</label>
					</p>
				</div>
				<div class="modal-footer">
					<input type="button" class="btn btn-default" data-dismiss="modal" value="关闭"/>
					<input type="submit" class="btn btn-primary" name="deleteUser" value="删除用户"/>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>
	<form:hidden path="uid" value="${s009020Form.userFullInfo.uid}"/>
	</form:form>

</body>
</html>