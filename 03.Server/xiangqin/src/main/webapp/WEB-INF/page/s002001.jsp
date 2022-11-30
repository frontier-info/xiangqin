<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户主页</title>
</head>
<body>

	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<!--   引入导航栏 -->
			<%@include file="../common/header.jsp"%>
		</div>
		<div class="col-md-3"></div>

	</div>
    <form:form modelAttribute="s002001Form" action="/xiangqin/ui/s002001" method="post">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-pink">
				<div class="panel-heading pink">
					<h3 class="panel-title">用户主页</h3>
				</div>
				<div class="panel-body pink">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-8">
							<!--   引入页面提示信息 -->
							<%@include file="../common/message.jsp"%>
							<h5 class="area-title-min">已为您找到符合检索条件的异性信息</h5>
							<ul style="list-style-type: none;">
							<c:forEach items="${s002001Form.userSimpleInfoLi}" var="userSimpleInfo">
								<li>
									<div class="media">
										<div class="media-left media-top">
											<c:if test="${empty userSimpleInfo.avatarImg}">
												<img src="${pageContext.request.contextPath}/resources/image/blank_avatar.jfif"
													class="media-object avatar">
											</c:if>
											<c:if test="${not empty userSimpleInfo.avatarImg}">
												<img src="${pageContext.request.contextPath}/${userSimpleInfo.avatarImg}"
													class="media-object avatar">
											</c:if>
										</div>
										<div class="media-body">
											<h4 class="media-heading">
											<a href="${pageContext.request.contextPath}/ui/s005001/e000?uid=${userSimpleInfo.uid}">${userSimpleInfo.uname}</a>
											</h4>
											<p>${userSimpleInfo.sex}</p>
											<p>${userSimpleInfo.introduce}</p>
										</div>
									</div>
								</li>
							</c:forEach>
							</ul>
							<hr>
							<h5 class="area-title-min">到底了.您可能喜欢...</h5>
							<ul style="list-style-type: none;">
							<c:forEach items="${s002001Form.randomUserSimpleInfoLi}" var="randomUserSimpleInfo">
								<li>
									<div class="media">
										<div class="media-left media-top">
											<c:if test="${empty randomUserSimpleInfo.avatarImg}">
												<img src="${pageContext.request.contextPath}/resources/image/blank_avatar.jfif"
													class="media-object avatar">
											</c:if>
											<c:if test="${not empty randomUserSimpleInfo.avatarImg}">
												<img src="${pageContext.request.contextPath}/${randomUserSimpleInfo.avatarImg}"
													class="media-object avatar">
											</c:if>
										</div>
										<div class="media-body">
											<h4 class="media-heading">
											<a href="${pageContext.request.contextPath}/ui/s005001/e000?uid=${randomUserSimpleInfo.uid}">${randomUserSimpleInfo.uname}</a>
											</h4>
											<p>${randomUserSimpleInfo.sex}</p>
											<p>${randomUserSimpleInfo.introduce}</p>
										</div>
									</div>
								</li>
							</c:forEach>
							</ul>
						</div>
						<div class="col-md-2"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
    </form:form>

</body>
</html>