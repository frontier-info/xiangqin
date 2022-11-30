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
							<!-- 用户基本信息 -->
							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-3" style="height: 400px;">
								  <!-- 显示用户照片和身份验证照片 -->
									<div class="swiper-container" >
									    <div class="swiper-wrapper">
										  <c:if test="${not empty s009020Form.userFullInfo.uimages1}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009020Form.userFullInfo.uimages1}" class="uimages"/>
							      			</div>
							      		  </c:if>
										  <c:if test="${not empty s009020Form.userFullInfo.uimages2}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009020Form.userFullInfo.uimages2}" class="uimages"/>
							      			</div>
							      		  </c:if>
										  <c:if test="${not empty s009020Form.userFullInfo.uimages3}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009020Form.userFullInfo.uimages3}" class="uimages"/>
							      			</div>
							      		  </c:if>
										  <c:if test="${not empty s009020Form.userFullInfo.identificationImg}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009020Form.userFullInfo.identificationImg}" class="uimages"/>
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
									<!-- 用户基本信息 -->
									<div class="row">
										<div class="col-md-10">
										  <!-- 显示用户基本信息 -->
										  <h4 class="area-title">基本资料</h4>
										</div>
									</div>
									<div class="row">
										<div class="col-md-6">
											<div class="media">
												<div class="media-left media-top">
													<img
														src="${pageContext.request.contextPath}/${s009020Form.userFullInfo.avatarImg}"
														class="media-object avatar">
												</div>
												<div class="media-body">
													<h4 class="media-heading"><span class="label label-default">${s009020Form.userFullInfo.uname}</span></h4>
													<c:if test="${s009020Form.userFullInfo.sex == ConstantInfo.MALE}">
													  <img src="${pageContext.request.contextPath}/resources/image/sex_male.png" class="ugrade2"/>
									      		    </c:if>
													<c:if test="${s009020Form.userFullInfo.sex == ConstantInfo.FEMALE}">
													  <img src="${pageContext.request.contextPath}/resources/image/sex_female.png" class="ugrade2"/>
									      		    </c:if>
												</div>
											</div>
											<div class="media">
												<div class="media-body">
												  <ul style="list-style-type: none;">
													<li><span class="label label-pink">年龄:</span><div class="udata">${s009020Form.userFullInfo.age}岁</div></li>
													<li><span class="label label-pink">身高:</span><div class="udata">${s009020Form.userFullInfo.uheight}cm</div></li>
													<li><div class="udata introduce" style="width: 250px;"><font class="zeaicolor">自我介绍: </font>${s009020Form.userFullInfo.introduce}</div></li>
												  </ul>
												</div>
											</div>
										</div>
										<div class="col-md-6">
											<br>
											<br>
											<br>
											<div class="media">
												<div class="media-body">
													<span class="label label-pink">当前用户权限:</span><div class="udata">${s009020Form.userFullInfo.userRankName}</div>
													<span class="label label-pink">当前用户审查状态:</span><div class="udata">${s009020Form.userFullInfo.userStatusName}</div>
												</div>
											</div>
										</div>
									</div>
									<hr>
									<div class="row">
										<div class="col-md-12">
											<input type="button" class="form-control btn-success" data-toggle="modal" data-target="#changeUserRankModal" value="变更用户权限" />
											<input type="button" class="form-control btn-success" data-toggle="modal" data-target="#updateUserStatusModal" value="新用户审查结果" />
											<input type="button" class="form-control btn-danger" data-toggle="modal" data-target="#deleteUserModal" value="删除用户" />
										</div>
									</div>
								</div>
								<div class="col-md-1"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-pink">
				<div class="panel-body">
					<div class="row">
						<div class="col-md-12">
							<!-- 用户详细信息 -->
							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-10">
								  <!-- 显示用户详细信息 -->
								  <h4 class="area-title">详细资料</h4>
								</div>
							</div>
							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">出生地:</span><div class="udata">${s009020Form.userFullInfo.birthPlace}</div></li>
									<li><span class="label label-pink">住所: </span><div class="udata">${s009020Form.userFullInfo.address}</div></li>
									<li><span class="label label-pink">职业: </span><div class="udata">${s009020Form.userFullInfo.profession}</div></li>
								  </ul>
								</div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">体重: </span><div class="udata">${s009020Form.userFullInfo.uweight}kg</div></li>
									<li><div class="udata interest"><font class="zeaicolor">兴趣: </font>${s009020Form.userFullInfo.interest}</div></li>
								  </ul>
								</div>
							</div>
							<hr>
							<!-- 用户择偶要求 -->
							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-10">
								  <!-- 显示用户择偶要求 -->
								  <h4 class="area-title">择偶要求</h4>
								</div>
							</div>
							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">出生地:</span><div class="udata">${s009020Form.userFullInfo.requireBirthPlace}</div></li>
									<li><span class="label label-pink">住所: </span><div class="udata">${s009020Form.userFullInfo.requireAddress}</div></li>
									<li><span class="label label-pink">职业: </span><div class="udata">${s009020Form.userFullInfo.requireProfession}</div></li>
								  </ul>
								</div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">年龄范围:</span><div class="udata">${s009020Form.userFullInfo.requireAgeFrom}~${s009020Form.userFullInfo.requireAgeTo}岁</div></li>
									<li><span class="label label-pink">身高范围:</span><div class="udata">${s009020Form.userFullInfo.requireHeightFrom}~${s009020Form.userFullInfo.requireHeightTo}cm</div></li>
									<li><span class="label label-pink">体重范围:</span><div class="udata">${s009020Form.userFullInfo.requireWeightFrom}~${s009020Form.userFullInfo.requireWeightTo}kg</div></li>
								  </ul>
								</div>
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
					<input type="submit" class="btn btn-success" name="changeUserRank" value="变更用户权限"/>
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
					<input type="submit" class="btn btn-success" name="updateUserStatus" value="提交审查结果"/>
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
					<input type="submit" class="btn btn-danger" name="deleteUser" value="删除用户"/>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>
	<form:hidden path="uid" value="${s009020Form.userFullInfo.uid}"/>
	</form:form>

</body>
<script>
	var swiper = new Swiper('.swiper-container', {
		loop : true, //允许从第一张到最后一张，或者从最后一张到第一张  循环属性
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