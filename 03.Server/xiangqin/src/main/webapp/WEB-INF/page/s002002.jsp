<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>相亲-登录</title>
</head>

<style>
body {
	background-color: whitesmoke;
}
</style>

<body>

	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<!--   引入导航栏 -->
			<%@include file="../common/header.jsp"%>
		</div>
		<div class="col-md-3"></div>

	</div>
	<form:form modelAttribute="s002002Form" action="/xiangqin/ui/s002002" method="post" enctype="multipart/form-data">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">个人信息设定</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-md-12">
				          <form:errors path="*" element="div" class="alert alert-danger" role="alert"/>
				          <c:if test="${not empty message}">
				           <div class="alert alert-success" role="alert"><p>${message}</p></div>
				          </c:if>
							<h2><font size="6" color="black">请您填入个人信息 </font></h2>
							<h3><font size="3" color="pink">💛金凤玉露一相逢，便胜却人间无数。💛 </font></h3>
							<hr />
							<!-- 检索条件区域 -->
							<div class="form-inline row">
								<div class="col-md-3">
									<div style="display: inline-block;">
										<c:if test="${empty s002002Form.avatarImg}">
											<img src="${pageContext.request.contextPath}/resources/image/blank_avatar.jfif"
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
											<label for="uname">用户名:</label>
											<form:input class="form-control" path="uname"/>
										</p>
									</div>
								</div>
								<div class="col-md-3">
									<p>
										<label for="birthPlace">出生地:</label>
										<form:select path="birthPlace" class="form-control">
											<option value="">--请选择地区--</option>
										    <form:options items="${s002002Form.birthPlaceLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label for="birthDate">出生年月日:</label>
										<fmt:formatDate pattern="yyyy-MM-dd" value="${s002002Form.birthDate}" var="userBirthDate"/>
										<input type="date" class="form-control" name="birthDate" value="${userBirthDate}">
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label for="interest">兴趣:</label>
										<form:input class="form-control" path="interest"/>
									</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-3">
								    <br>
									<p>
										<label for="sex">性别：</label>
										<form:radiobuttons path="sex" items="${s002002Form.sexLi}" />
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label for="address">住所:</label>
										<form:select path="address" class="form-control" >
											<option value="">--请选择地区--</option>
								            <form:options items="${s002002Form.addressLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label for="uheight">身高:</label>
										<form:input class="form-control" path="uheight"/>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label for="introduce">自我介绍:</label>
										<form:textarea class="form-control" path="introduce" rows="2" />
									</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-3"></div>
								<div class="col-md-3">
									<p>
										<label for="profession">职业:</label>
										<form:select path="profession" class="form-control" >
											<option value="">--请选择行业--</option>
								            <form:options items="${s002002Form.professionLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label for="uweight">体重:</label>
										<form:input class="form-control" path="uweight"/>
									</p>
								</div>
							</div>
						</div>
					</div>
					<hr size="2" color="#ffffff">
					<div class="row">
						<!-- 用户图片上传区 -->
						<div class="col-md-1"></div>
						<div class="col-md-6">
							<div>
								<label for="uimages">上传照片(共3张):</label>
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
						<div class="col-md-4">
							<div>
								<label for="identificationImg">上传身份验证照片(共1张,在留卡,住民票等):</label>
								<br>
								<label for="identification">※仅用于用户验证真实性</label>
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
							</div>
						</div>
					</div>
					<hr size="2" color="#ffffff">
					<div class="row">
						<div class="col-md-12">
							<h4>择偶条件</h4>
							<!-- 择偶条件区域 -->
							<div class="form-inline row">
								<div class="col-md-3"></div>
								<div class="col-md-3">
									<p>
										<label for="birthPlace">出生地:</label>
										<form:select path="requireBirthPlace" class="form-control">
											<option value="">--请选择地区--</option>
										    <form:options items="${s002002Form.requireBirthPlaceLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label>年龄：</label> 
										<label for="ageFrom">从</label> 
										<form:input class="form-control" size="3" path="requireAgeFrom"/> 
										<label for="ageTo">到</label> 
										<form:input class="form-control" size="3" path="requireAgeTo"/>
									</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-3"></div>
								<div class="col-md-3">
									<p>
										<label for="address">住所:</label>
										<form:select path="requireAddress" class="form-control" >
											<option value="">--请选择地区--</option>
								            <form:options items="${s002002Form.requireAddressLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label>身高：</label> 
										<label for="uheightFrom">从</label> 
										<form:input class="form-control" size="3" path="requireHeightFrom"/> 
										<label for="uheightTo">到</label> 
										<form:input class="form-control" size="3" path="requireHeightTo"/>
									</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-3"></div>
								<div class="col-md-3">
									<p>
										<label for="profession">职业:</label>
										<form:select path="requireProfession" class="form-control" >
											<option value="">--请选择行业--</option>
								            <form:options items="${s002002Form.requireProfessionLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label>体重：</label> 
										<label for="uweightFrom">从</label> 
										<form:input class="form-control" size="3" path="requireWeightFrom"/> 
										<label for="uweightTo">到</label> 
										<form:input class="form-control" size="3" path="requireWeightTo"/>
									</p>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<!-- 按钮区 -->
						<div class="col-md-2"></div>
						<div class="col-md-3">
							<div>
								<input type="reset" class="form-control" value="信息重置">
								<input type="button" class="form-control" data-toggle="modal" data-target="#userInfoUpdate" value="提交个人信息" />
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="userInfoUpdate" tabindex="-1" role="dialog" aria-labelledby="userInfoUpdateLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="userInfoUpdateLabel">
						提交用户信息
					</h4>
				</div>
				<div class="modal-body">
					<p>
						<label>确定要提交用户信息吗?</label>
					</p>
				</div>
				<div class="modal-footer">
					<input type="button" class="btn btn-default" data-dismiss="modal" value="关闭"/>
					<input type="submit" class="btn btn-primary" value="提交"/>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>
	</form:form>
	<!--   引入版权信息栏 -->
	<%@include file="../common/footer.jsp"%>

</body>
<script>

	// 点击图片触发方法
	function img_onclick(input_id) {
		// 模拟点击隐藏的<input type="file">
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
