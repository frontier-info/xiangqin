<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>恋活-個人情報設定</title>
</head>
<body>

	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<!--   ナビゲーションバー -->
			<%@include file="../common/header.jsp"%>
		</div>
		<div class="col-md-3"></div>

	</div>
	<form:form modelAttribute="s002002Form" action="/xiangqin/ui/s002002" method="post" enctype="multipart/form-data">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-pink">
				<div class="panel-heading pink">
					<h3 class="panel-title">個人情報設定</h3>
				</div>
				<div class="panel-body pink">
					<div class="row">
						<div class="col-md-12">
							<!--   画面メッセージエリア -->
							<%@include file="../common/message.jsp"%>
							<h2><font size="5" color="pink">個人情報設定を入力してください。 </font></h2>
							<hr>
							<!-- 検索条件エリア -->
							<div class="form-inline row">
								<div class="col-md-3">
									<div style="display: inline-block;">
										<c:if test="${empty s002002Form.avatarImg}">
											<img src="${pageContext.request.contextPath}/resources/image/add_avatar.jfif"
												class="media-object avatar" id="avatar_img"
												onclick="img_onclick('avatar_img_input')">
										</c:if>
										<c:if test="${not empty s002002Form.avatarImg}">
											<img src="${pageContext.request.contextPath}/${s002002Form.avatarImg}"
												class="media-object avatar" id="avatar_img"
												onclick="img_onclick('avatar_img_input')">
										</c:if>
										<input type="file" class="form-control" id="avatar_img_input"
											name="avatarImgFile" style="display:none" onchange="input_file_onchange(this, '#avatar_img')">
									</div>
									<div style="display: inline-block; position: absolute; margin-left:20px;">
										<p>
											<label for="uname">名前:</label>
											<form:input class="form-control" path="uname" maxlength="10"/>
										</p>
									</div>
								</div>
								<div class="col-md-3">
									<p>
										<label for="birthPlace">出生地:</label>
										<form:select path="birthPlace" class="form-control">
											<option value="">--地域を選択してください--</option>  
										    <form:options items="${s002002Form.birthPlaceLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label for="birthDate">出生年月:</label>
										<fmt:formatDate pattern="yyyy-MM-dd" value="${s002002Form.birthDate}" var="userBirthDate"/>
										<input type="date" class="form-control" name="birthDate" value="${userBirthDate}">
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label for="interest">趣味: </label>
										<form:input class="form-control" path="interest" maxlength="50"/>
									</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-3">
								    <br>
									<p>
										<label for="sex">      性别：</label>
										<form:radiobuttons path="sex" items="${s002002Form.sexLi}" />
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label for="address">居住地: </label>
										<form:select path="address" class="form-control" >
											<option value="">--地域を選択してください--</option>  
								            <form:options items="${s002002Form.addressLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label for="uheight">身長:  </label>
										<form:input class="form-control" path="uheight" pattern="[0-9]{1,3}" title="３桁以下の数字を入力してください"/>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label for="introduce">メールアドレス: </label>
										<form:input class="form-control" path="email" maxlength="50"/>
									</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-3"></div>
								<div class="col-md-3">
									<p>
										<label for="profession">職業: </label>
										<form:select path="profession" class="form-control" >
											<option value="">--業種を選択してください--</option>  
								            <form:options items="${s002002Form.professionLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label for="uweight">体重:  </label>
										<form:input class="form-control" path="uweight" pattern="[0-9]{1,3}" title="３桁以下の数字を入力してください"/>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label for="introduce">自己紹介:</label>
										<form:textarea class="form-control" path="introduce" rows="2" maxlength="100"/>
									</p>
								</div>
							</div>
						</div>
					</div>
					<hr size="2" color="#ffffff">
					<div class="row">
						<div class="col-md-12">
							<!-- ユーザー配偶者の要件エリア -->
							<div class="form-inline row">
								<div class="col-md-3">
									<h4>ユーザー配偶者の要件</h4>
								</div>
								<div class="col-md-3">
									<p>
										<label for="birthPlace">出生地:</label>
										<form:select path="requireBirthPlace" class="form-control">
											<option value="">--地域を選択してください--</option>  
										    <form:options items="${s002002Form.requireBirthPlaceLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label>年齢：</label> 
										<label for="ageFrom">From</label> 
										<form:input class="form-control" size="3" path="requireAgeFrom" pattern="[0-9]{1,3}" title="３桁以下の数字を入力してください"/> 
										<label for="ageTo">To</label> 
										<form:input class="form-control" size="3" path="requireAgeTo" pattern="[0-9]{1,3}" title="３桁以下の数字を入力してください"/>
									</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-3"></div>
								<div class="col-md-3">
									<p>
										<label for="address">居住地: </label>
										<form:select path="requireAddress" class="form-control" >
											<option value="">--地域を選択してください--</option>  
								            <form:options items="${s002002Form.requireAddressLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label>身長：</label> 
										<label for="uheightFrom">From</label> 
										<form:input class="form-control" size="3" path="requireHeightFrom" pattern="[0-9]{1,3}" title="３桁以下の数字を入力してください"/> 
										<label for="uheightTo">To</label> 
										<form:input class="form-control" size="3" path="requireHeightTo" pattern="[0-9]{1,3}" title="３桁以下の数字を入力してください"/>
									</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-3"></div>
								<div class="col-md-3">
									<p>
										<label for="profession">職業: </label>
										<form:select path="requireProfession" class="form-control" >
											<option value="">--業種を選択してください--</option>  
								            <form:options items="${s002002Form.requireProfessionLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label>体重：</label> 
										<label for="uweightFrom">From</label> 
										<form:input class="form-control" size="3" path="requireWeightFrom" pattern="[0-9]{1,3}" title="３桁以下の数字を入力してください"/> 
										<label for="uweightTo">To</label> 
										<form:input class="form-control" size="3" path="requireWeightTo" pattern="[0-9]{1,3}" title="３桁以下の数字を入力してください"/>
									</p>
								</div>
							</div>
						</div>
					</div>
					<hr size="2" color="#ffffff">
					<div class="row">
						<!-- ユーザー写真アップロードエリア -->
						<div class="col-md-1">
							<h4>個人写真</h4>
						</div>
						<div class="col-md-5">
							<!-- 個人写真エリア -->
							<div>
								<label for="uimages">写真をアップロード（計３枚）:</label>
								<br>
								<div style="display: flex;">
									<div class="uimages_div">
										<c:if test="${empty s002002Form.uimages1}">
											<img src="${pageContext.request.contextPath}/resources/image/add_pictures.png"
												class="media-object uimages" id="uimages1"
												onclick="img_onclick('uimages1_input')">
										</c:if>
										<c:if test="${not empty s002002Form.uimages1}">
											<img src="${pageContext.request.contextPath}/${s002002Form.uimages1}"
												class="media-object uimages" id="uimages1"
												onclick="img_onclick('uimages1_input')">
										</c:if>
									</div>
									<div class="uimages_div">
										<c:if test="${empty s002002Form.uimages2}">
											<img src="${pageContext.request.contextPath}/resources/image/add_pictures.png"
												class="media-object uimages" id="uimages2"
												onclick="img_onclick('uimages2_input')">
										</c:if>
										<c:if test="${not empty s002002Form.uimages2}">
											<img src="${pageContext.request.contextPath}/${s002002Form.uimages2}"
												class="media-object uimages" id="uimages2"
												onclick="img_onclick('uimages2_input')">
										</c:if>
									</div>
									<div class="uimages_div">
										<c:if test="${empty s002002Form.uimages3}">
											<img src="${pageContext.request.contextPath}/resources/image/add_pictures.png"
												class="media-object uimages" id="uimages3"
												onclick="img_onclick('uimages3_input')">
										</c:if>
										<c:if test="${not empty s002002Form.uimages3}">
											<img src="${pageContext.request.contextPath}/${s002002Form.uimages3}"
												class="media-object uimages" id="uimages3"
												onclick="img_onclick('uimages3_input')">
										</c:if>
									</div>
								</div>
								<input type="file" class="form-control" id="uimages1_input"
									name="uimages1File" style="display:none" onchange="input_file_onchange(this, '#uimages1')">
								<input type="file" class="form-control" id="uimages2_input"
									name="uimages2File" style="display:none" onchange="input_file_onchange(this, '#uimages2')">
								<input type="file" class="form-control" id="uimages3_input"
									name="uimages3File" style="display:none" onchange="input_file_onchange(this, '#uimages3')">
							</div>
						</div>
						<div class="col-md-5">
							<div>
								<label for="identificationImg">本人確認用の写真をアップロード(計１枚、外国人在留カード、住民票など）:</label>
								<br>
								<div class="uimages_div">
									<c:if test="${empty s002002Form.identificationImg}">
										<img src="${pageContext.request.contextPath}/resources/image/add_pictures.png"
											class="media-object uimages" id="identification_img"
											onclick="img_onclick('identification_img_input')">
									</c:if>
									<c:if test="${not empty s002002Form.identificationImg}">
										<img src="${pageContext.request.contextPath}/${s002002Form.identificationImg}"
											class="media-object uimages" id="identification_img"
											onclick="img_onclick('identification_img_input')">
									</c:if>
								</div>
								<input type="file" class="form-control" id="identification_img_input"
									name="identificationImgFile" style="display:none" onchange="input_file_onchange(this, '#identification_img')">
								<br>
								<label for="identification">※ユーザーの本人確認のみ使用</label>
							</div>
						</div>
					</div>
					<div class="row">
						<!-- ボタンエリア -->
						<div class="col-md-1"></div>
						<div class="col-md-3">
							<div>
								<input type="reset" class="button-default" value="情報リセット">
								<input type="submit" class="button-success" value="プロフィールを提出" />
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

	// 表单校验
// 	function inputcheck(){
// 		var message = new Array();
// 		var imgSize = 2048;
// 		$("#message").html("");
// 		// 校验单选ボタン非空
// 		if(isEmpty($("input[name='sex']:checked"))){
// 			message.push("性别");
// 		}
// 		// 校验下拉列表值非空
// 		if(isEmpty($("input[name='birthPlace']").val())){
// 			message.push("出生地");
// 		}
// 		if(isEmpty($("input[name='address']").val())){
// 			message.push("居住地");
// 		}
// 		if(isEmpty($("input[name='profession']").val())){
// 			message.push("職業");
// 		}
// 		if(isEmpty($("input[name='requireBirthPlace']").val())){
// 			message.push("ユーザー配偶者の要件-出生地");
// 		}
// 		if(isEmpty($("input[name='requireAddress']").val())){
// 			message.push("ユーザー配偶者の要件-居住地");
// 		}
// 		if(isEmpty($("input[name='requireProfession']").val())){
// 			message.push("ユーザー配偶者の要件-職業");
// 		}
// 		// 校验上传图片非空及大小限制
// 		if(isEmpty($("input[name='avatarImgFile']").val())){
// 			message.push("头像图片");
// 		}
// 		console.log($("input[name='avatarImgFile']").size);
// 		console.log(message);
// 		if(message.length > 0){
// 			$("#message").append("<div class='alert alert-success'></div>");
// 			message.forEach(function(elem) {
// 			$(".alert-success").append("<p>"+elem+"</p>");
// 			});
// 		}
// 	}

	// クリック图片触发方法
	function img_onclick(input_id) {
		// 模拟クリック隐藏の<input type="file">
		document.getElementById(input_id).click();
	}

	// 图片预览
	function input_file_onchange(this_obj, img_id) {
		
		// 获取上传文件对象
		var file = this_obj.files[0];
		var imgUrl =window.URL.createObjectURL(file);
		$(img_id).attr("src", imgUrl);
	}
	
</script>
</html>
