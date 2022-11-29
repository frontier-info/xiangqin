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
			<!--   引入导航栏 -->
			<%@include file="../common/header.jsp"%>
		</div>
		<div class="col-md-2"></div>
	</div>
	<form:form modelAttribute="s009020Form" action="/xiangqin/ui/s009021" method="post">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-pink">
				<div class="panel-heading pink">
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
								<div class="col-md-1"></div>
								<div class="col-md-3">
								  <!-- 显示用户照片和身份验证照片 -->
									<div class="swiper-container" id="case4">
									    <div class="swiper-wrapper">
										  <c:if test="${not empty s009020Form.userFullInfo.uimages1}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009020Form.userFullInfo.uimages1}" style="width:100%;"/>
							      			</div>
							      		  </c:if>
										  <c:if test="${not empty s009020Form.userFullInfo.uimages2}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009020Form.userFullInfo.uimages2}" style="width:100%;"/>
							      			</div>
							      		  </c:if>
										  <c:if test="${not empty s009020Form.userFullInfo.uimages3}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009020Form.userFullInfo.uimages3}" style="width:100%;"/>
							      			</div>
							      		  </c:if>
										  <c:if test="${not empty s009020Form.userFullInfo.identificationImg}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009020Form.userFullInfo.identificationImg}" style="width:100%;"/>
							      			</div>
							      		  </c:if>
									    </div>
									    <!-- 如果需要导航按钮 -->
									    <div class="swiper-button-prev"></div>
									    <div class="swiper-button-next"></div>
									    <div class="swiper-pagination"></div>
									</div>
								</div>
								<div class="col-md-7">
									<div class="media">
										<div class="media-left media-top">
											<img
												src="${pageContext.request.contextPath}/${s009020Form.userFullInfo.avatarImg}"
												class="media-object avatar">
										</div>
										<div class="media-body">
											<h4 class="media-heading">用户名:${s009020Form.userFullInfo.uname}</h4>
											<p>性别:${s009020Form.userFullInfo.sex}</p>
											<p>自我介绍:${s009020Form.userFullInfo.introduce}</p>
											<p>出生年月日:<fmt:formatDate type="date" value="${s009020Form.userFullInfo.birthDate}"/></p>
											<p>出生地:${s009020Form.userFullInfo.birthPlace}</p>
											<p>住所:${s009020Form.userFullInfo.address}</p>
											<p>职业:${s009020Form.userFullInfo.profession}</p>
											<p>兴趣:${s009020Form.userFullInfo.interest}</p>
											<p>身高:${s009020Form.userFullInfo.uheight}</p>
											<p>体重:${s009020Form.userFullInfo.uweight}</p>
										</div>
									</div>
								</div>
								<div class="col-md-1"></div>
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
<script>
	var swiper = new Swiper('#case4', {
		loop : false, //允许从第一张到最后一张，或者从最后一张到第一张  循环属性
		slidesPerView : 1, // 设置显示1张
		//centeredSlides : true,     //使当前图片居中显示
		freeMode : true, // 使幻灯片滑动时不止滑动一格，且不会自动贴合 
		slidesPerGroup : 1, //定义1张图片为一组
		autoplay : false, //可选选项，自动滑动
		speed : 10, //设置过度时间
		grabCursor : true, //鼠标样式根据浏览器不同而定 
		//observer: true,
		autoHeight : true,
		keyboard : {
			enabled : true,
		},
		pagination : {
			el : ".swiper-pagination",
			clickable : true,
		},
		// 如果需要前进后退按钮
		navigation : {
			nextEl : '.swiper-button-next',
			prevEl : '.swiper-button-prev',
		},
	});
</script>
</html>