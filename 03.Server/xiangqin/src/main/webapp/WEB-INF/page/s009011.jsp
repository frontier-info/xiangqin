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
	<form:form modelAttribute="s009010Form" action="/xiangqin/ui/s009011" method="post">
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
								<div class="col-md-1"></div>
								<div class="col-md-3">
								  <!-- 显示用户照片和身份验证照片 -->
									<div class="swiper-container" id="case4">
									    <div class="swiper-wrapper">
										  <c:if test="${not empty s009010Form.userFullInfo.uimages1}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009010Form.userFullInfo.uimages1}" style="width:100%;"/>
							      			</div>
							      		  </c:if>
										  <c:if test="${not empty s009010Form.userFullInfo.uimages2}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009010Form.userFullInfo.uimages2}" style="width:100%;"/>
							      			</div>
							      		  </c:if>
										  <c:if test="${not empty s009010Form.userFullInfo.uimages3}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009010Form.userFullInfo.uimages3}" style="width:100%;"/>
							      			</div>
							      		  </c:if>
										  <c:if test="${not empty s009010Form.userFullInfo.identificationImg}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s009010Form.userFullInfo.identificationImg}" style="width:100%;"/>
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
												src="${pageContext.request.contextPath}/${s009010Form.userFullInfo.avatarImg}"
												class="media-object avatar">
										</div>
										<div class="media-body">
											<h4 class="media-heading">用户名:${s009010Form.userFullInfo.uname}</h4>
											<p>性别:${s009010Form.userFullInfo.sex}</p>
											<p>自我介绍:${s009010Form.userFullInfo.introduce}</p>
											<p>出生年月日:<fmt:formatDate type="date" value="${s009010Form.userFullInfo.birthDate}"/></p>
											<p>出生地:${s009010Form.userFullInfo.birthPlace}</p>
											<p>住所:${s009010Form.userFullInfo.address}</p>
											<p>职业:${s009010Form.userFullInfo.profession}</p>
											<p>兴趣:${s009010Form.userFullInfo.interest}</p>
											<p>身高:${s009010Form.userFullInfo.uheight}</p>
											<p>体重:${s009010Form.userFullInfo.uweight}</p>
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