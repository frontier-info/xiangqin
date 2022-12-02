<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>打招呼对象</title>
</head>
<body>

	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
		   <!--   导航栏 -->
			<%@include file="../common/header.jsp"%>
		</div>	
		<div class="col-md-2"></div>
	</div>
	<form:form modelAttribute="s005001Form" action="/xiangqin/ui/s005001/e001" method="post">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-pink">
				<div class="panel-body pink">
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
								  <!-- 显示用户照片 -->
									<div class="swiper-container" >
									    <div class="swiper-wrapper">
								  		  <!-- 未向该异性用户打过招呼时显示空白图片:打招呼通过后显示个人照片 -->
						      			  <div class="swiper-slide">
						      				<img src="${pageContext.request.contextPath}/resources/image/blank_avatar.jfif" class="uimages"/>
						      			  </div>
									    </div>
									</div>
								  <div class="uimage_comment">※打招呼通过后显示个人照片</div>
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
													<c:if test="${empty userSimpleInfo.avatarImg}">
														<img src="${pageContext.request.contextPath}/resources/image/blank_avatar.jfif"
															class="media-object avatar">
													</c:if>
													<c:if test="${not empty userSimpleInfo.avatarImg}">
														<img src="${pageContext.request.contextPath}/${s005001Form.userFullInfo.avatarImg}"
															class="media-object avatar">
													</c:if>
												</div>
												<div class="media-body">
													<h4 class="media-heading"><span class="label label-default">${s005001Form.userFullInfo.uname}</span></h4>
													<c:if test="${s005001Form.userFullInfo.sex == ConstantInfo.MALE}">
													  <img src="${pageContext.request.contextPath}/resources/image/sex_male.png" class="ugrade2"/>
									      		    </c:if>
													<c:if test="${s005001Form.userFullInfo.sex == ConstantInfo.FEMALE}">
													  <img src="${pageContext.request.contextPath}/resources/image/sex_female.png" class="ugrade2"/>
									      		    </c:if>
												</div>
											</div>
											<div class="media">
												<div class="media-body">
												  <ul style="list-style-type: none;">
													<li><span class="label label-pink">年龄:</span><div class="udata">${s005001Form.userFullInfo.age}岁</div></li>
													<li><span class="label label-pink">身高:</span><div class="udata">${s005001Form.userFullInfo.uheight}cm</div></li>
													<li><div class="udata introduce" style="width: 250px;"><font class="zeaicolor">自我介绍: </font>${s005001Form.userFullInfo.introduce}</div></li>
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
												  <ul style="list-style-type: none;">
													<li><span class="label label-pink">邮箱: </span>
														<div class="udata lang">打招呼通过后显示联系方式...</div></li>
													<li><span class="label label-pink">手机号:</span>
														<div class="udata lang">打招呼通过后显示联系方式...</div></li>
												  </ul>
												</div>
											</div>
										</div>
									</div>
									<hr>
									<div class="row">
										<div class="col-md-12">
										    <input type="hidden" name="relationId" value="${s005001Form.userFullInfo.relationId}"> 
								  		    <!-- 交友阶段1为空时,打招呼按钮为活性 -->
										    <c:if test="${empty s005001Form.userFullInfo.relationLevel1}">
											  <input type="submit" class="button-success"  value="打招呼" />
							      		    </c:if>
										    <c:if test="${not empty s005001Form.userFullInfo.relationLevel1}">
											  <input type="submit" class="button-disabled"  value="打招呼" disabled="disabled"/>
							      		    </c:if>
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
				<div class="panel-body pink">
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
									<li><span class="label label-pink">出生地:</span><div class="udata">${s005001Form.userFullInfo.birthPlace}</div></li>
									<li><span class="label label-pink">住所: </span><div class="udata">${s005001Form.userFullInfo.address}</div></li>
									<li><span class="label label-pink">职业: </span><div class="udata">${s005001Form.userFullInfo.profession}</div></li>
								  </ul>
								</div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">体重: </span><div class="udata">${s005001Form.userFullInfo.uweight}kg</div></li>
									<li><div class="udata interest"><font class="zeaicolor">兴趣: </font>${s005001Form.userFullInfo.interest}</div></li>
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
									<li><span class="label label-pink">出生地:</span><div class="udata">${s005001Form.userFullInfo.requireBirthPlace}</div></li>
									<li><span class="label label-pink">住所: </span><div class="udata">${s005001Form.userFullInfo.requireAddress}</div></li>
									<li><span class="label label-pink">职业: </span><div class="udata">${s005001Form.userFullInfo.requireProfession}</div></li>
								  </ul>
								</div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">年龄范围:</span><div class="udata">${s005001Form.userFullInfo.requireAgeFrom}~${s005001Form.userFullInfo.requireAgeTo}岁</div></li>
									<li><span class="label label-pink">身高范围:</span><div class="udata">${s005001Form.userFullInfo.requireHeightFrom}~${s005001Form.userFullInfo.requireHeightTo}cm</div></li>
									<li><span class="label label-pink">体重范围:</span><div class="udata">${s005001Form.userFullInfo.requireWeightFrom}~${s005001Form.userFullInfo.requireWeightTo}kg</div></li>
								  </ul>
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