<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>友達リクエスト对象</title>
</head>
<body>

	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
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
								  <!-- ユーザー写真 -->
									<div class="swiper-container" >
									    <div class="swiper-wrapper">
								  		  <!-- 未リクエスト時空白の写真を表示、友達リクエスト承認された場合個人写真を表示 -->
						      			  <div class="swiper-slide">
						      				<img src="${pageContext.request.contextPath}/resources/image/blank_avatar.jfif" class="uimages"/>
						      			  </div>
									    </div>
									</div>
								  <div class="uimage_comment">※友達リクエスト済場合のみ個人写真を表示</div>
								</div>
								<div class="col-md-7">
									<!-- ユーザー基本情報 -->
									<div class="row">
										<div class="col-md-10">
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
													<li><span class="label label-pink">年齢:</span><div class="udata">${s005001Form.userFullInfo.age}歳</div></li>
													<li><span class="label label-pink">身長:</span><div class="udata">${s005001Form.userFullInfo.uheight}cm</div></li>
													<li><div class="udata introduce" style="width: 250px;"><font class="zeaicolor">自己紹介: </font>${s005001Form.userFullInfo.introduce}</div></li>
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
														<div class="udata lang">友達リクエスト済場合のみメールアドレスを表示...</div></li>
													<li><span class="label label-pink">連絡先:</span>
														<div class="udata lang">友達リクエスト済場合のみ連絡先を表示...</div></li>
												  </ul>
												</div>
											</div>
										</div>
									</div>
									<hr>
									<div class="row">
										<div class="col-md-12">
										    <input type="hidden" name="relationId" value="${s005001Form.userFullInfo.relationId}"> 
								  		    <!-- リクエストステップ1が空の場合のみ、友達リクエストボタンが活性 -->
										    <c:if test="${empty s005001Form.userFullInfo.relationLevel1}">
											  <input type="submit" class="button-success"  value="友達リクエスト" />
							      		    </c:if>
										    <c:if test="${not empty s005001Form.userFullInfo.relationLevel1}">
											  <input type="submit" class="button-disabled"  value="友達リクエスト" disabled="disabled"/>
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
								  <h4 class="area-title">詳細情報</h4>
								</div>
							</div>
							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">出生地:</span><div class="udata">${s005001Form.userFullInfo.birthPlace}</div></li>
									<li><span class="label label-pink">居住地: </span><div class="udata">${s005001Form.userFullInfo.address}</div></li>
									<li><span class="label label-pink">職業: </span><div class="udata">${s005001Form.userFullInfo.profession}</div></li>
								  </ul>
								</div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">体重: </span><div class="udata">${s005001Form.userFullInfo.uweight}kg</div></li>
									<li><div class="udata interest"><font class="zeaicolor">趣味: </font>${s005001Form.userFullInfo.interest}</div></li>
								  </ul>
								</div>
							</div>
							<hr>
							<!-- ユーザー配偶者の要件 -->
							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-10">
								  <h4 class="area-title">配偶者の要件</h4>
								</div>
							</div>
							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">出生地:</span><div class="udata">${s005001Form.userFullInfo.requireBirthPlace}</div></li>
									<li><span class="label label-pink">居住地: </span><div class="udata">${s005001Form.userFullInfo.requireAddress}</div></li>
									<li><span class="label label-pink">職業: </span><div class="udata">${s005001Form.userFullInfo.requireProfession}</div></li>
								  </ul>
								</div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">年齢範囲:</span><div class="udata">${s005001Form.userFullInfo.requireAgeFrom}~${s005001Form.userFullInfo.requireAgeTo}歳</div></li>
									<li><span class="label label-pink">身長範囲:</span><div class="udata">${s005001Form.userFullInfo.requireHeightFrom}~${s005001Form.userFullInfo.requireHeightTo}cm</div></li>
									<li><span class="label label-pink">体重範囲:</span><div class="udata">${s005001Form.userFullInfo.requireWeightFrom}~${s005001Form.userFullInfo.requireWeightTo}kg</div></li>
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