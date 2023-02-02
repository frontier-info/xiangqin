<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>向我打过招呼的人 -详细信息</title>
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
	<form:form modelAttribute="s004001Form" action="/xiangqin/ui/s004001/e003" method="post">
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
								  <!-- 显示用户照片和身份验证照片 -->
									<div class="swiper-container" >
									    <div class="swiper-wrapper">
								  		  <!-- 交友阶段1为同意以外时显示空白图片 -->
										  <c:if test="${s004001Form.userFullInfo.relationLevel1 != ConstantInfo.RELATION_LEVEL_1_AGREE}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/resources/image/blank_avatar.jfif" class="uimages"/>
							      			</div>
							      		  </c:if>
								  		  <!-- 交友阶段1为同意时显示对方照片 -->
										  <c:if test="${s004001Form.userFullInfo.relationLevel1 == ConstantInfo.RELATION_LEVEL_1_AGREE}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s004001Form.userFullInfo.uimages1}" class="uimages"/>
							      			</div>
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s004001Form.userFullInfo.uimages2}" class="uimages"/>
							      			</div>
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/${s004001Form.userFullInfo.uimages3}" class="uimages"/>
							      			</div>
							      		  </c:if>
									    </div>
									    <!-- 导航按钮 -->
									    <div class="swiper-button-prev"></div>
									    <div class="swiper-button-next"></div>
									    <div class="swiper-pagination"></div>
									</div>
									<!-- 交友阶段1为等待时:点击交换个人照片按钮显示对方照片 -->
								  	<c:if test="${s004001Form.userFullInfo.relationLevel1 == ConstantInfo.RELATION_LEVEL_1_REQUEST}">
								    	<div class="uimage_comment">※点击交换个人照片按钮显示对方照片</div>
								    </c:if>
									<!-- 交友阶段1为拒绝时:拒绝了对方的交友请求 -->
								  	<c:if test="${s004001Form.userFullInfo.relationLevel1 == ConstantInfo.RELATION_LEVEL_1_DISAGREE}">
								    	<div class="uimage_comment">※拒绝了对方的交友请求</div>
								    </c:if>
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
														<img src="${pageContext.request.contextPath}/${s004001Form.userFullInfo.avatarImg}"
															class="media-object avatar">
													</c:if>
												</div>
												<div class="media-body">
													<h4 class="media-heading"><span class="label label-default">${s004001Form.userFullInfo.uname}</span></h4>
													<c:if test="${s004001Form.userFullInfo.sex == ConstantInfo.MALE}">
													  <img src="${pageContext.request.contextPath}/resources/image/sex_male.png" class="ugrade2"/>
									      		    </c:if>
													<c:if test="${s004001Form.userFullInfo.sex == ConstantInfo.FEMALE}">
													  <img src="${pageContext.request.contextPath}/resources/image/sex_female.png" class="ugrade2"/>
									      		    </c:if>
												</div>
											</div>
											<div class="media">
												<div class="media-body">
												  <ul style="list-style-type: none;">
													<li><span class="label label-pink">年龄:</span><div class="udata">${s004001Form.userFullInfo.age}岁</div></li>
													<li><span class="label label-pink">身高:</span><div class="udata">${s004001Form.userFullInfo.uheight}cm</div></li>
													<li><div class="udata introduce" style="width: 250px;"><font class="zeaicolor">自我介绍: </font>${s004001Form.userFullInfo.introduce}</div></li>
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
											  		    <!-- 交友阶段2为空时 -->
													    <c:if test="${empty s004001Form.userFullInfo.relationLevel2}">
															<div class="udata lang">点击交换联系方式按钮后显示...</div>
										      		    </c:if>
											  		    <!-- 交友阶段2为拒绝时 -->
													    <c:if test="${s004001Form.userFullInfo.relationLevel2 == ConstantInfo.RELATION_LEVEL_2_DISAGREE}">
															<div class="udata lang">拒绝了对方的交友请求...</div>
										      		    </c:if>
											  		    <!-- 交友阶段2为同意时 -->
													    <c:if test="${s004001Form.userFullInfo.relationLevel2 == ConstantInfo.RELATION_LEVEL_2_AGREE}">
															<div class="udata">${s004001Form.userFullInfo.email}</div>
										      		    </c:if>
										      		</li>
													<li><span class="label label-pink">手机号:</span>
											  		    <!-- 交友阶段2为空时 -->
													    <c:if test="${empty s004001Form.userFullInfo.relationLevel2}">
															<div class="udata lang">点击交换联系方式按钮后显示...</div>
										      		    </c:if>
											  		    <!-- 交友阶段2为拒绝时 -->
													    <c:if test="${s004001Form.userFullInfo.relationLevel2 == ConstantInfo.RELATION_LEVEL_2_DISAGREE}">
															<div class="udata lang">拒绝了对方的交友请求...</div>
										      		    </c:if>
											  		    <!-- 交友阶段2为同意时 -->
													    <c:if test="${s004001Form.userFullInfo.relationLevel2 == ConstantInfo.RELATION_LEVEL_2_AGREE}">
															<div class="udata">${s004001Form.userFullInfo.email}</div>
										      		    </c:if>
										      		</li>
												  </ul>
												</div>
											</div>
										</div>
									</div>
									<hr>
									<div class="row">
										<div class="col-md-12">
										    <input type="hidden" name="relationId" value="${s004001Form.userFullInfo.relationId}"> 
								  		    <!-- 交友阶段1为请求时,交换个人照片按钮为活性 -->
										    <c:if test="${s004001Form.userFullInfo.relationLevel1 == ConstantInfo.RELATION_LEVEL_1_REQUEST}">
												<input type="submit" name="relationLevel1Agree" class="button-success" value="交换个人照片" />
							      		    </c:if>
								  		    <!-- 交友阶段1为请求以外时,交换个人照片按钮为非活性 -->
										    <c:if test="${s004001Form.userFullInfo.relationLevel1 != ConstantInfo.RELATION_LEVEL_1_REQUEST}">
												<input type="submit" name="relationLevel1Agree" class="button-disabled" value="交换个人照片" disabled="disabled"/>
							      		    </c:if>
								  		    <!-- 交友阶段2为空时,交换联系方式按钮为活性 -->
										    <c:if test="${empty s004001Form.userFullInfo.relationLevel2}">
												<input type="submit" name="relationLevel2Agree" class="button-success" value="交换联系方式" />
							      		    </c:if>
								  		    <!-- 交友阶段2不为空时,交换联系方式按钮为非活性 -->
										    <c:if test="${not empty s004001Form.userFullInfo.relationLevel2}">
												<input type="submit" name="relationLevel2Agree" class="button-disabled" value="交换联系方式"  disabled="disabled"/>
							      		    </c:if>
								  		    <!-- 交友阶段1为请求或阶段2为空时,拒绝按钮为活性 -->
										    <c:if test="${s004001Form.userFullInfo.relationLevel1 == ConstantInfo.RELATION_LEVEL_1_REQUEST or 
										    				empty s004001Form.userFullInfo.relationLevel2}">
												<input type="submit" name="reject" class="button-danger" value="拒绝" />
							      		    </c:if>
								  		    <!-- 交友阶段1不为请求且阶段2不为空时,拒绝按钮为非活性 -->
										    <c:if test="${s004001Form.userFullInfo.relationLevel1 != ConstantInfo.RELATION_LEVEL_1_REQUEST and 
										    				not empty s004001Form.userFullInfo.relationLevel2}">
												<input type="submit" name="reject" class="button-disabled" value="拒绝"  disabled="disabled"/>
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
									<li><span class="label label-pink">出生地:</span><div class="udata">${s004001Form.userFullInfo.birthPlace}</div></li>
									<li><span class="label label-pink">住所: </span><div class="udata">${s004001Form.userFullInfo.address}</div></li>
									<li><span class="label label-pink">职业: </span><div class="udata">${s004001Form.userFullInfo.profession}</div></li>
								  </ul>
								</div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">体重: </span><div class="udata">${s004001Form.userFullInfo.uweight}kg</div></li>
									<li><div class="udata interest"><font class="zeaicolor">兴趣: </font>${s004001Form.userFullInfo.interest}</div></li>
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
									<li><span class="label label-pink">出生地:</span><div class="udata">${s004001Form.userFullInfo.requireBirthPlace}</div></li>
									<li><span class="label label-pink">住所: </span><div class="udata">${s004001Form.userFullInfo.requireAddress}</div></li>
									<li><span class="label label-pink">职业: </span><div class="udata">${s004001Form.userFullInfo.requireProfession}</div></li>
								  </ul>
								</div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">年龄范围:</span><div class="udata">${s004001Form.userFullInfo.requireAgeFrom}~${s004001Form.userFullInfo.requireAgeTo}岁</div></li>
									<li><span class="label label-pink">身高范围:</span><div class="udata">${s004001Form.userFullInfo.requireHeightFrom}~${s004001Form.userFullInfo.requireHeightTo}cm</div></li>
									<li><span class="label label-pink">体重范围:</span><div class="udata">${s004001Form.userFullInfo.requireWeightFrom}~${s004001Form.userFullInfo.requireWeightTo}kg</div></li>
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