<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ユーザー管理</title>
</head>
<body>

	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<!--   ナビゲーションバー -->
			<%@include file="../common/header.jsp"%>
		</div>
		<div class="col-md-2"></div>
	</div>
	<form:form modelAttribute="s009020Form" action="/xiangqin/ui/s009021" method="post">
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
									    <div class="swiper-button-prev"></div>
									    <div class="swiper-button-next"></div>
									    <div class="swiper-pagination"></div>
									</div>
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
													<li><span class="label label-pink">年齢:</span><div class="udata">${s009020Form.userFullInfo.age}歳</div></li>
													<li><span class="label label-pink">身長:</span><div class="udata">${s009020Form.userFullInfo.uheight}cm</div></li>
													<li><div class="udata introduce" style="width: 250px;"><font class="zeaicolor">自己紹介: </font>${s009020Form.userFullInfo.introduce}</div></li>
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
													<span class="label label-pink">ユーザー権限:</span><div class="udata">${s009020Form.userFullInfo.userRankName}</div>
													<span class="label label-pink">ユーザー審査状態:</span><div class="udata">${s009020Form.userFullInfo.userStatusName}</div>
												</div>
											</div>
										</div>
									</div>
									<hr>
									<div class="row">
										<div class="col-md-12">
											<input type="button" class="button-success" data-toggle="modal" data-target="#changeUserRankModal" value="ユーザー権限变更" />
											<input type="button" class="button-success" data-toggle="modal" data-target="#updateUserStatusModal" value="ユーザー審査结果更新" />
											<input type="button" class="button-danger" data-toggle="modal" data-target="#deleteUserModal" value="ユーザー削除" />
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
								  <h4 class="area-title">詳細资料</h4>
								</div>
							</div>
							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">出生地:</span><div class="udata">${s009020Form.userFullInfo.birthPlace}</div></li>
									<li><span class="label label-pink">居住地: </span><div class="udata">${s009020Form.userFullInfo.address}</div></li>
									<li><span class="label label-pink">職業: </span><div class="udata">${s009020Form.userFullInfo.profession}</div></li>
								  </ul>
								</div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">体重: </span><div class="udata">${s009020Form.userFullInfo.uweight}kg</div></li>
									<li><div class="udata interest"><font class="zeaicolor">趣味: </font>${s009020Form.userFullInfo.interest}</div></li>
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
									<li><span class="label label-pink">出生地:</span><div class="udata">${s009020Form.userFullInfo.requireBirthPlace}</div></li>
									<li><span class="label label-pink">居住地: </span><div class="udata">${s009020Form.userFullInfo.requireAddress}</div></li>
									<li><span class="label label-pink">職業: </span><div class="udata">${s009020Form.userFullInfo.requireProfession}</div></li>
								  </ul>
								</div>
								<div class="col-md-3">
								  <ul style="list-style-type: none;">
									<li><span class="label label-pink">年齢範囲:</span><div class="udata">${s009020Form.userFullInfo.requireAgeFrom}~${s009020Form.userFullInfo.requireAgeTo}歳</div></li>
									<li><span class="label label-pink">身長範囲:</span><div class="udata">${s009020Form.userFullInfo.requireHeightFrom}~${s009020Form.userFullInfo.requireHeightTo}cm</div></li>
									<li><span class="label label-pink">体重範囲:</span><div class="udata">${s009020Form.userFullInfo.requireWeightFrom}~${s009020Form.userFullInfo.requireWeightTo}kg</div></li>
								  </ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- モーダル（Modal） -->
	<div class="modal fade" id="changeUserRankModal" tabindex="-1" role="dialog" aria-labelledby="changeUserRankModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="changeUserRankModalLabel">
						ユーザー権限变更
					</h4>
				</div>
				<div class="modal-body">
					<p>
						<label>ユーザー名前:${s009020Form.userFullInfo.uname}</label>
					</p>
					<p>
						<label for="userRankCode">ユーザー権限:</label>
						<select name="userRankCode" class="form-control">
							<option value="">--ユーザー権限を選択してくださいを選択してください--</option>  
							<c:forEach items="${s009020Form.userRankLi}" var="userRank">
								<option value="${userRank.selectKey}">${userRank.selectValue}</option>
							</c:forEach>
						</select>
					</p>
				</div>
				<div class="modal-footer">
					<input type="submit" class="btn button-success" name="changeUserRank" value="ユーザー権限变更"/>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>
	<!-- モーダル（Modal） -->
	<div class="modal fade" id="updateUserStatusModal" tabindex="-1" role="dialog" aria-labelledby="updateUserStatusModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="updateUserStatusModalLabel">
						新ユーザー審査
					</h4>
				</div>
				<div class="modal-body">
					<p>
						<label>ユーザー名:${s009020Form.userFullInfo.uname}</label>
					</p>
					<p>
						<label for="userCensorResult">新ユーザー審査结果詳細:</label>
						<input type="text" class="form-control" size="5" name="userCensorResult">
					</p>
					<p>
						<label for="userStatusCode">新ユーザー審査结果:</label>
						<select name="userStatusCode" class="form-control">
							<option value="">--審査结果を選択してくださいを選択してください--</option>  
							<c:forEach items="${s009020Form.userStatusLi}" var="userStatus">
								<option value="${userStatus.selectKey}">${userStatus.selectValue}</option>
							</c:forEach>
						</select>
					</p>
				</div>
				<div class="modal-footer">
					<input type="submit" class="btn button-success" name="updateUserStatus" value="審査结果更新"/>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>
	<!-- モーダル（Modal） -->
	<div class="modal fade" id="deleteUserModal" tabindex="-1" role="dialog" aria-labelledby="deleteUserModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="deleteUserModalLabel">
						ユーザー削除
					</h4>
				</div>
				<div class="modal-body">
					<p>
						<label>このユーザーを削除してもよろしいでしょうか。</label>
					</p>
				</div>
				<div class="modal-footer">
					<input type="submit" class="btn button-danger" name="deleteUser" value="ユーザー削除"/>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>
	<form:hidden path="uid" value="${s009020Form.userFullInfo.uid}"/>
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