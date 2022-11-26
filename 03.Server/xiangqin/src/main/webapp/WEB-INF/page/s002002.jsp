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
										<img src="${pageContext.request.contextPath}/resources/image/blank_avatar.jfif"
											class="media-object" style="width: 90px; height: 90px; border-radius:50%; overflow:hidden;"
											id="avatar_img"
											onclick="avatar_image_onclick()">
										<input type="file" class="form-control" id="avatar_input" name="avatarImg" style="display:none">
									</div>
									<div style="display: inline-block; position: absolute; margin-left:20px;">
										<p>
											<label for="uname">用户名:</label>
											<input type="text" class="form-control" name="uname">
										</p>
									</div>
								</div>
								<br>
								<div>
									<p>
										<label for="uname">性别：</label>
										<label for="sex" class="radio-inline">
										<input type="radio" name="sex" value="女">女
										</label>
										<label for="sex" class="radio-inline">
										<input type="radio" name="sex" value="男" checked="checked">男
										</label>
									</p>
								</div>

								<div>
									<p>
										<label for="start">出生年月日:</label>
										<input type="date" class="form-control" name="birthDate" value="2000-01-01" min="1923-01-01" max="2002-01-01">
									</p>
								</div>

								<div>
									<p>
										<label for="birthPlace">出生地:</label>
										<select name="birthPlace" class="form-control" >
											<option value="">--请选择地区--</option>
								           <c:forEach items="${s002002Form.birthPlaceLi}" var="birthPlace">
										    <option value="${birthPlace}">${birthPlace}</option>
								           </c:forEach>
										</select>
									</p>
								</div>
								<div>
									<p>
										<label for="address">住所:</label>
										<select name="address" class="form-control" >
											<option value="">--请选择地区--</option>
								           <c:forEach items="${s002002Form.addressLi}" var="address">
										    <option value="${address}">${address}</option>
								           </c:forEach>
										</select>
									</p>
								</div>

								<div>
									<p>
										<label for="profession">职业:</label>
										<select name="profession" class="form-control" >
											<option value="">--请选择行业--</option>
								           <c:forEach items="${s002002Form.professionLi}" var="profession">
										    <option value="${profession}">${profession}</option>
								           </c:forEach>
										</select>
									</p>
								</div>

								<div>
									<p>
										<label for="interest">兴趣:</label>
										<input type="text" class="form-control" name="interest">
									</p>
								</div>

								<div>
									<p>
										<label for="uheight">身高:</label>
										<input type="text" class="form-control" name="uheight">
									</p>

								</div>

								<div>
									<p>
										<label for="uweight">体重:</label>
										<input type="text" class="form-control" name="uweight">
									</p>
								</div>

								<div>
									<p>
										<label for="introduce">自我介绍:</label>

										<textarea class="form-control" name="introduce" rows="13" onblur="check_note_input(this);countWorkNums(1);" onkeyup="countWorkNums(1);" onfocus="click_note_input(this);clearText(this);countWorkNums(1);">填写自我介绍更有利于被关注哦！勤劳的虫儿有鸟吃！</textarea>
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
									<img src="${pageContext.request.contextPath}/resources/image/add_pictures.png"
										class="media-object" style="width: 90px; height: 90px; border-radius:50%; overflow:hidden;"
										id="uimages_add_img"
										onclick="uimages_add_onclick()">
									</span>
									<input type="file" class="form-control" id="uimages1" name="uimages1" style="display:none">
									<input type="file" class="form-control" id="uimages2" name="uimages2" style="display:none">
									<input type="file" class="form-control" id="uimages3" name="uimages3" style="display:none">
								</p>
							</div>
							<div>
								<p>
									<label for="identificationImg">上传身份验证照片(共1张,在留卡,住民票等):</label>
									<br>
									<label for="identification">※仅用于用户验证真实性</label>
									<span id="identification_span">
									<img src="${pageContext.request.contextPath}/resources/image/add_pictures.png"
										class="media-object" style="width: 90px; height: 90px; border-radius:50%; overflow:hidden;"
										id="identification_add_img"
										onclick="identification_add_onclick()">
									</span>
									<input type="file" class="form-control" id="identification_input" name="identificationImg" style="display:none">
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

	// 上传头像处理
	function avatar_image_onclick() {
		//my_photo隐藏的input[file]的id
		document.getElementById('avatar_input').click();
	}

	// 头像预览
	$("#avatar_input").change(function() {//avatar_file input[file]的ID

		// 获取上传文件对象
		var file = $(this)[0].files[0];

		// 读取文件URL
		var reader = new FileReader();

		reader.readAsDataURL(file);

		// 阅读文件完成后触发的事件
		reader.onload = function() {
			// 读取的URL结果：this.result
			$("#avatar_img").attr("src", this.result);//avatar_img img标签的ID

		}

	});

	// 上传个人照片处理
	// 个人照片点击次数
	var uimage_click_count = 0;
	function uimages_add_onclick() {
		uimage_click_count++;
		if(uimage_click_count <= 3){
			// 点击不超过3次,添加图片并显示预览
			// 生成input id名
			let input_file_id = "uimages"+uimage_click_count;
			console.log(input_file_id);
			document.getElementById(input_file_id).click();
		}
		if(uimage_click_count == 3){
			// 点击超过3次,添加图片图标变灰,点击无效
			$("#uimages_add_img").attr("src", "${pageContext.request.contextPath}/resources/image/add_pictures_grey.png");
		}
	}

	// 个人照片预览
	$("#uimages1").change(function() {
		uimage_display($(this)[0].files[0]);
	});
	$("#uimages2").change(function() {
		uimage_display($(this)[0].files[0]);
	});
	$("#uimages3").change(function() {
		uimage_display($(this)[0].files[0]);
	});
	
	// 个人照片预览共通方法
	function uimage_display(file){

		// 读取文件URL
		var reader = new FileReader();

		reader.readAsDataURL(file);

		// 阅读文件完成后触发的事件
		reader.onload = function() {
			// 读取的URL结果：this.result
			$("#uimages_span").append("<img src='"+this.result+"'>");

		}
		
	}
	
	// 上传个人身份验证处理
	var identification_click_count = 0;
	function identification_add_onclick() {
		identification_click_count++;
		if(identification_click_count <= 1){
			// 点击添加图片并显示预览
			document.getElementById("identification_input").click();
			// 点击1次后,添加图片图标变灰,点击无效
			$("#identification_add_img").attr("src", "${pageContext.request.contextPath}/resources/image/add_pictures_grey.png");
		}
	}

	// 个人身份验证预览
	$("#identification_input").change(function() {

		// 获取上传文件对象
		var file = $(this)[0].files[0];

		// 读取文件URL
		var reader = new FileReader();

		reader.readAsDataURL(file);

		// 阅读文件完成后触发的事件
		reader.onload = function() {
			// 读取的URL结果：this.result
			$("#identification_span").append("<img src='"+this.result+"'>");

		}

	});
	
</script>
</html>
