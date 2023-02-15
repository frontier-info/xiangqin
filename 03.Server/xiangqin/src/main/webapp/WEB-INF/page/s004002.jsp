<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>申請された友達一覧 -詳細情報</title>
</head>
<body>

	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
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
					  <!-- 画面メッセージエリア -->
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
							<!-- ユーザー基本情報 -->
							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-3" style="height: 400px;">
								  <!-- ユーザー写真を表示 -->
									<div class="swiper-container" >
									    <div class="swiper-wrapper">
								  		  <!-- リクエストステップ1为承認以外の場合空白の写真を表示 -->
										  <c:if test="${s004001Form.userFullInfo.relationLevel1 != ConstantInfo.RELATION_LEVEL_1_AGREE}">
							      			<div class="swiper-slide">
							      				<img src="${pageContext.request.contextPath}/resources/image/blank_avatar.jfif" class="uimages"/>
							      			</div>
							      		  </c:if>
								  		  <!-- リクエストステップ1が承認の場合相手の個人写真を表示 -->
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
									    <!-- ボタン -->
									    <div class="swiper-button-prev"></div>
									    <div class="swiper-button-next"></div>
									    <div class="swiper-pagination"></div>
									</div>
									<!-- リクエストステップ1が待ちの場合:クリック個人写真を交換ボタン显示对方照片 -->
								  	<c:if test="${s004001Form.userFullInfo.relationLevel1 == ConstantInfo.RELATION_LEVEL_1_REQUEST}">
								    	<div class="uimage_comment">※クリック個人写真を交換ボタン显示对方照片</div>
								    </c:if>
									<!-- リクエストステップ1が拒否の場合:拒否了对方の交友请求 -->
								  	<c:if test="${s004001Form.userFullInfo.relationLevel1 == ConstantInfo.RELATION_LEVEL_1_DISAGREE}">
								    	<div class="uimage_comment">※拒否了对方の交友请求</div>
								    </c:if>
								</div>
								<div class="col-md-7">
									<!-- ユーザー基本情報 -->
									<div class="row">
										<div class="col-md-10">
										  <!-- 显示ユーザー基本情報 -->
										  <h4 class="area-title">基本情報</h4>
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
													<li><span class="label label-pink">年齢:</span><div class="udata">${s004001Form.userFullInfo.age}歳</div></li>
													<li><span class="label label-pink">身長:</span><div class="udata">${s004001Form.userFullInfo.uheight}cm</div></li>
													<li><div class="udata introduce" style="width: 250px;"><font class="zeaicolor">自己紹介: </font>${s004001Form.userFullInfo.introduce}</div></li>
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
													<li><span class="label label-pink">メールアドレス: </span>
											  		    <!-- リクエストステップ2が空の場合 -->
													    <c:if test="${empty s004001Form.userFullInfo.relationLevel2}">
															<div class="udata lang">クリック連絡先を交換ボタン后显示...</div>
										      		    </c:if>
											  		    <!-- リクエストステップ2が拒否の場合 -->
													    <c:if test="${s004001Form.userFullInfo.relationLevel2 == ConstantInfo.RELATION_LEVEL_2_DISAGREE}">
															<div class="udata lang">拒否了对方の交友请求...</div>
										      		    </c:if>
											  		    <!-- リクエストステップ2が承認の場合 -->
													    <c:if test="${s004001Form.userFullInfo.relationLevel2 == ConstantInfo.RELATION_LEVEL_2_AGREE}">
															<div class="udata">${s004001Form.userFullInfo.email}</div>
										      		    </c:if>
										      		</li>
													<li><span class="label label-pink">連絡先:</span>
											  		    <!-- リクエストステップ2が空の場合 -->
													    <c:if test="${empty s004001Form.userFullInfo.relationLevel2}">
															<div class="udata lang">クリック連絡先を交換ボタン后显示...</div>
										      		    </c:if>
											  		    <!-- リクエストステップ2が拒否の場合 -->
													    <c:if test="${s004001Form.userFullInfo.relationLevel2 == ConstantInfo.RELATION_LEVEL_2_DISAGREE}">
															<div class="udata lang">拒否了对方の交友请求...</div>
										      		    </c:if>
											  		    <!-- リクエストステップ2が承認の場合 -->
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
								  		    <!-- リクエストステップ1が請求の場合,個人写真を交換ボタンが活性 -->
										    <c:if test="${s004001Form.userFullInfo.relationLevel1 == ConstantInfo.RELATION_LEVEL_1_REQUEST}">
												<input type="submit" name="relationLevel1Agree" class="button-success" value="個人写真を交換" />
							      		    </c:if>
								  		    <!-- リクエストステップ1が請求以外の場合,個人写真を交換ボタンが非活性 -->
										    <c:if test="${s004001Form.userFullInfo.relationLevel1 != ConstantInfo.RELATION_LEVEL_1_REQUEST}">
												<input type="submit" name="relationLevel1Agree" class="button-disabled" value="個人写真を交換" disabled="disabled"/>
							      		    </c:if>
								  		    <!-- リクエストステップ2が空の場合,連絡先を交換ボタンが活性 -->
										    <c:if test="${empty s004001Form.userFullInfo.relationLevel2}">
												<input type="submit" name="relationLevel2Agree" class="button-success" value="連絡先を交換" />
							      		    </c:if>
								  		    <!-- リクエストステップ2が空以外の場合,連絡先を交換ボタンが非活性 -->
										    <c:if test="${not empty s004001Form.userFullInfo.relationLevel2}">
												<input type="submit" name="relationLevel2Agree" class="button-disabled" value="連絡先を交換"  disabled="disabled"/>
							      		    </c:if>
								  		    <!-- リクエストステップ1が請求またはリクエストステップ2が空の場合,拒否ボタンが活性 -->
										    <c:if test="${s004001Form.userFullInfo.relationLevel1 == ConstantInfo.RELATION_LEVEL_1_REQUEST or 
										    				empty s004001Form.userFullInfo.relationLevel2}">
												<input type="submit" name="reject" class="button-danger" value="拒否" />
							      		    </c:if>
								  		    <!-- リクエストステップ1が請求以外かつリクエストステップ2が空以外の場合,拒否ボタンが非活性 -->
										    <c:if test="${s004001Form.userFullInfo.relationLevel1 != ConstantInfo.RELATION_LEVEL_1_REQUEST and 
										    				not empty s004001Form.userFullInfo.relationLevel2}">
												<input type="submit" name="reject" class="button-disabled" value="拒否"  disabled="disabled"/>
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
							<!-- ユーザー詳細情報 -->
							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-10">
								  <!-- 显示ユーザー詳細情報 -->
								  <h4 class="area-title">詳細资料</h4>
								</div>
							</div>
							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">出生地:</span><div class="udata">${s004001Form.userFullInfo.birthPlace}</div></li>
									<li><span class="label label-pink">居住地: </span><div class="udata">${s004001Form.userFullInfo.address}</div></li>
									<li><span class="label label-pink">職業: </span><div class="udata">${s004001Form.userFullInfo.profession}</div></li>
								  </ul>
								</div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">体重: </span><div class="udata">${s004001Form.userFullInfo.uweight}kg</div></li>
									<li><div class="udata interest"><font class="zeaicolor">趣味: </font>${s004001Form.userFullInfo.interest}</div></li>
								  </ul>
								</div>
							</div>
							<hr>
							<!-- ユーザー配偶者の要件 -->
							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-10">
								  <!-- 显示ユーザー配偶者の要件 -->
								  <h4 class="area-title">配偶者の要件</h4>
								</div>
							</div>
							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">出生地:</span><div class="udata">${s004001Form.userFullInfo.requireBirthPlace}</div></li>
									<li><span class="label label-pink">居住地: </span><div class="udata">${s004001Form.userFullInfo.requireAddress}</div></li>
									<li><span class="label label-pink">職業: </span><div class="udata">${s004001Form.userFullInfo.requireProfession}</div></li>
								  </ul>
								</div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">年齢範囲:</span><div class="udata">${s004001Form.userFullInfo.requireAgeFrom}~${s004001Form.userFullInfo.requireAgeTo}歳</div></li>
									<li><span class="label label-pink">身長範囲:</span><div class="udata">${s004001Form.userFullInfo.requireHeightFrom}~${s004001Form.userFullInfo.requireHeightTo}cm</div></li>
									<li><span class="label label-pink">体重範囲:</span><div class="udata">${s004001Form.userFullInfo.requireWeightFrom}~${s004001Form.userFullInfo.requireWeightTo}kg</div></li>
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
		loop : true, //允许From第一张To最后一张，或者From最后一张To第一张  循环属性
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
		// 如果需要前进后退ボタン
		navigation : {
			nextEl : '.swiper-button-next',
			prevEl : '.swiper-button-prev',
		},
	});
</script>
</html>