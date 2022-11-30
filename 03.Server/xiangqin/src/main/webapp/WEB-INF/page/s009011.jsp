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
	<form:form modelAttribute="s009010Form" action="/xiangqin/ui/s009011" method="post">
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
										  <c:if test="${not empty s009010Form.userFullInfo.uimages1}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009010Form.userFullInfo.uimages1}" class="uimages"/>
							      			</div>
							      		  </c:if>
										  <c:if test="${not empty s009010Form.userFullInfo.uimages2}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009010Form.userFullInfo.uimages2}" class="uimages"/>
							      			</div>
							      		  </c:if>
										  <c:if test="${not empty s009010Form.userFullInfo.uimages3}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009010Form.userFullInfo.uimages3}" class="uimages"/>
							      			</div>
							      		  </c:if>
										  <c:if test="${not empty s009010Form.userFullInfo.identificationImg}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009010Form.userFullInfo.identificationImg}" class="uimages"/>
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
									<div class="media">
										<div class="media-left media-top">
											<img
												src="${pageContext.request.contextPath}/${s009010Form.userFullInfo.avatarImg}"
												class="media-object avatar">
										</div>
										<div class="media-body">
											<h4 class="media-heading"><span class="label label-default">${s009010Form.userFullInfo.uname}</span></h4>
											<c:if test="${s009010Form.userFullInfo.sex == ConstantInfo.MALE}">
											  <img src="${pageContext.request.contextPath}/resources/image/sex_male.png" class="ugrade2"/>
							      		    </c:if>
											<c:if test="${s009010Form.userFullInfo.sex == ConstantInfo.FEMALE}">
											  <img src="${pageContext.request.contextPath}/resources/image/sex_female.png" class="ugrade2"/>
							      		    </c:if>
										</div>
									</div>
									<div class="media">
										<div class="media-body">
										  <ul style="list-style-type: none;">
											<li><span class="label label-pink">年龄:</span><div class="udata">${s009010Form.userFullInfo.age}岁</div></li>
											<li><span class="label label-pink">身高:</span><div class="udata">${s009010Form.userFullInfo.uheight}cm</div></li>
											<li><div class="udata introduce"><font class="zeaicolor">自我介绍: </font>${s009010Form.userFullInfo.introduce}</div></li>
										  </ul>
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
									<li><span class="label label-pink">出生地:</span><div class="udata">${s009010Form.userFullInfo.birthPlace}</div></li>
									<li><span class="label label-pink">住所: </span><div class="udata">${s009010Form.userFullInfo.address}</div></li>
									<li><span class="label label-pink">职业: </span><div class="udata">${s009010Form.userFullInfo.profession}</div></li>
								  </ul>
								</div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">体重: </span><div class="udata">${s009010Form.userFullInfo.uweight}kg</div></li>
									<li><div class="udata interest"><font class="zeaicolor">兴趣: </font>${s009010Form.userFullInfo.interest}</div></li>
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
									<li><span class="label label-pink">出生地:</span><div class="udata">${s009010Form.userFullInfo.requireBirthPlace}</div></li>
									<li><span class="label label-pink">住所: </span><div class="udata">${s009010Form.userFullInfo.requireAddress}</div></li>
									<li><span class="label label-pink">职业: </span><div class="udata">${s009010Form.userFullInfo.requireProfession}</div></li>
								  </ul>
								</div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">年龄范围:</span><div class="udata">${s009010Form.userFullInfo.requireAgeFrom}~${s009010Form.userFullInfo.requireAgeTo}岁</div></li>
									<li><span class="label label-pink">身高范围:</span><div class="udata">${s009010Form.userFullInfo.requireHeightFrom}~${s009010Form.userFullInfo.requireHeightTo}cm</div></li>
									<li><span class="label label-pink">体重范围:</span><div class="udata">${s009010Form.userFullInfo.requireWeightFrom}~${s009010Form.userFullInfo.requireWeightTo}kg</div></li>
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