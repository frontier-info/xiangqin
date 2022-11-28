<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>向我打过招呼的人</title>
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
    <form:form modelAttribute="s004001Form" action="/xiangqin/ui/s004001/e002" method="post">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">向我打过招呼的人</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-8">
				          <form:errors path="*" element="div" class="alert alert-danger" role="alert"/>
				          <c:if test="${not empty message}">
				           <div class="alert alert-success" role="alert"><p>${message}</p></div>
				          </c:if>
							<ul style="list-style-type: none;">
							<c:forEach items="${s004001Form.userSimpleInfoLi}" var="userSimpleInfo">
								<li>
									<div class="media">
										<div class="media-left media-top">
											<img
												src="${pageContext.request.contextPath}/${userSimpleInfo.avatarImg}"
												class="media-object" style="width: 90px">
										</div>
										<div class="media-body">
											<h4 class="media-heading">
											<a href="${pageContext.request.contextPath}/ui/s004001/e002?relationId=${userSimpleInfo.uid}">${userSimpleInfo.uname}</a>
											</h4>
											<p>${userSimpleInfo.sex}</p>
											<p>${userSimpleInfo.introduce}</p>
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