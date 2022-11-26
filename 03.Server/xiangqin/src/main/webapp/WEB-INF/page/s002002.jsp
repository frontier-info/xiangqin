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

		<div class="col-md-3"></div>
		<div class="col-md-6">
			<!--   引入导航栏 -->
			<%@include file="../common/header.jsp"%>
		</div>
		<div class="col-md-3"></div>

	</div>
	<form:form modelAttribute="s002002Form" action="/xiangqin/ui/s002002" method="post" enctype="multipart/form-data">
	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">用户主页</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-4">
				          <form:errors path="*" element="div" class="alert alert-danger" role="alert"/>
				          <c:if test="${not empty message}">
				           <div class="alert alert-success" role="alert"><p>${message}</p></div>
				          </c:if>

							<h2>
								<font face="verdana">
									<font size="6" color="black">请您填入个人信息 
							</h2>
							<h3>
								<font size="3" color="pink">💛金凤玉露一相逢，便胜却人间无数。💛 
							</h3>
							<hr />


								<div>
									<div style="display: inline-block;">
										<c:if test="${empty s002002Form.avatarImg}">
											<img src="${pageContext.request.contextPath}/resources/image/blank_avatar.jfif"
												class="media-object" style="width: 90px; height: 90px; border-radius:50%; overflow:hidden;"
												id="avatar_img"
												onclick="img_onclick('avatar_img_input')">
										</c:if>
										<c:if test="${not empty s002002Form.avatarImg}">
											<img src="${pageContext.request.contextPath}/${s002002Form.avatarImg}"
												class="media-object" style="width: 90px; height: 90px; border-radius:50%; overflow:hidden;"
												id="avatar_img"
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
								<br>
								<div>
									<p>
										<label for="sex">性别：</label>
										<form:radiobuttons path="sex" items="${s002002Form.sexLi}" />
									</p>
								</div>

								<div>
									<p>
										<label for="birthDate">出生年月日:</label>
										<fmt:formatDate pattern="yyyy-MM-dd" value="${s002002Form.birthDate}" var="userBirthDate"/>
										<input type="date" class="form-control" name="birthDate" value="${userBirthDate}">
									</p>
								</div>

								<div>
									<p>
										<label for="birthPlace">出生地:</label>
										<form:select path="birthPlace" class="form-control">
											<option value="">--请选择地区--</option>
										    <form:options items="${s002002Form.birthPlaceLi}"/>
										</form:select>
									</p>
								</div>
								<div>
									<p>
										<label for="address">住所:</label>
										<form:select path="address" class="form-control" >
											<option value="">--请选择地区--</option>
								            <form:options items="${s002002Form.addressLi}"/>
										</form:select>
									</p>
								</div>

								<div>
									<p>
										<label for="profession">职业:</label>
										<form:select path="profession" class="form-control" >
											<option value="">--请选择行业--</option>
								            <form:options items="${s002002Form.professionLi}"/>
										</form:select>
									</p>
								</div>

								<div>
									<p>
										<label for="interest">兴趣:</label>
										<form:input class="form-control" path="interest"/>
									</p>
								</div>

								<div>
									<p>
										<label for="uheight">身高:</label>
										<form:input class="form-control" path="uheight"/>
									</p>

								</div>

								<div>
									<p>
										<label for="uweight">体重:</label>
										<form:input class="form-control" path="uweight"/>
									</p>
								</div>

								<div>
									<p>
										<label for="introduce">自我介绍:</label>

										<form:textarea class="form-control" path="introduce" rows="13" onblur="check_note_input(this);countWorkNums(1);" onkeyup="countWorkNums(1);" onfocus="click_note_input(this);clearText(this);countWorkNums(1);"/>
									</p>
								</div>
						</div>
						<div class="col-md-6"></div>
					</div>
					<div class="row">
						<!-- 用户图片上传区 -->
						<div class="col-md-2"></div>
						<div class="col-md-10">
							<div>
								<p>
									<label for="uimages">上传照片(共3张):</label>
									<span id="uimages_span">
										<c:if test="${empty s002002Form.uimages1}">
											<img src="${pageContext.request.contextPath}/resources/image/add_pictures.png"
												class="media-object" style="width: 90px; height: 90px; border-radius:50%; overflow:hidden;"
												id="uimages1"
												onclick="img_onclick('uimages1_input')">
										</c:if>
										<c:if test="${not empty s002002Form.uimages1}">
											<img src="${pageContext.request.contextPath}/${s002002Form.uimages1}"
												class="media-object" style="width: 90px; height: 90px; border-radius:50%; overflow:hidden;"
												id="uimages1"
												onclick="img_onclick('uimages1_input')">
										</c:if>
										<c:if test="${empty s002002Form.uimages2}">
											<img src="${pageContext.request.contextPath}/resources/image/add_pictures.png"
												class="media-object" style="width: 90px; height: 90px; border-radius:50%; overflow:hidden;"
												id="uimages2"
												onclick="img_onclick('uimages2_input')">
										</c:if>
										<c:if test="${not empty s002002Form.uimages2}">
											<img src="${pageContext.request.contextPath}/${s002002Form.uimages2}"
												class="media-object" style="width: 90px; height: 90px; border-radius:50%; overflow:hidden;"
												id="uimages2"
												onclick="img_onclick('uimages2_input')">
										</c:if>
										<c:if test="${empty s002002Form.uimages3}">
											<img src="${pageContext.request.contextPath}/resources/image/add_pictures.png"
												class="media-object" style="width: 90px; height: 90px; border-radius:50%; overflow:hidden;"
												id="uimages3"
												onclick="img_onclick('uimages3_input')">
										</c:if>
										<c:if test="${not empty s002002Form.uimages3}">
											<img src="${pageContext.request.contextPath}/${s002002Form.uimages3}"
												class="media-object" style="width: 90px; height: 90px; border-radius:50%; overflow:hidden;"
												id="uimages3"
												onclick="img_onclick('uimages3_input')">
										</c:if>
									</span>
									<input type="file" class="form-control" id="uimages1_input"
										name="uimages1File" style="display:none" onchange="input_file_onchange(this, '#uimages1')">
									<input type="file" class="form-control" id="uimages2_input"
										name="uimages2File" style="display:none" onchange="input_file_onchange(this, '#uimages2')">
									<input type="file" class="form-control" id="uimages3_input"
										name="uimages3File" style="display:none" onchange="input_file_onchange(this, '#uimages3')">
								</p>
							</div>
							<div>
								<p>
									<label for="identificationImg">上传身份验证照片(共1张,在留卡,住民票等):</label>
									<br>
									<label for="identification">※仅用于用户验证真实性</label>
									<span id="identification_span">
										<c:if test="${empty s002002Form.identificationImg}">
											<img src="${pageContext.request.contextPath}/resources/image/add_pictures.png"
												class="media-object" style="width: 90px; height: 90px; border-radius:50%; overflow:hidden;"
												id="identification_img"
												onclick="img_onclick('identification_img_input')">
										</c:if>
										<c:if test="${not empty s002002Form.identificationImg}">
											<img src="${pageContext.request.contextPath}/${s002002Form.identificationImg}"
												class="media-object" style="width: 90px; height: 90px; border-radius:50%; overflow:hidden;"
												id="identification_img"
												onclick="img_onclick('identification_img_input')">
										</c:if>
									</span>
									<input type="file" class="form-control" id="identification_img_input"
										name="identificationImgFile" style="display:none" onchange="input_file_onchange(this, '#identification_img')">
								</p>
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
