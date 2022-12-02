<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>我打过招呼的人</title>
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
    <form:form modelAttribute="s003001Form" action="/xiangqin/ui/s003001" method="post">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-pink">
				<div class="panel-heading pink">
					<h3 class="panel-title">我打过招呼的人</h3>
				</div>
				<div class="panel-body pink">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-8">
				          <form:errors path="*" element="div" class="alert alert-danger" role="alert"/>
				          <c:if test="${not empty message}">
				           <div class="alert alert-success" role="alert"><p>${message}</p></div>
				          </c:if>
							<ul style="list-style-type: none;">
							<c:forEach items="${s003001Form.userSimpleInfoLi}" var="userSimpleInfo">
								<li>
									<div class="media">
										<div class="media-left media-top">
											<img
												src="${pageContext.request.contextPath}/${userSimpleInfo.avatarImg}"
												class="media-object avatar">
										</div>
										<div class="media-body">
											<h4 class="media-heading">
											<a href="${pageContext.request.contextPath}/ui/s003001/e002?relationId=${userSimpleInfo.relationId}">${userSimpleInfo.uname}</a>
											</h4>
											<p>${userSimpleInfo.sex}</p>
											<p>${userSimpleInfo.introduce}</p>
								            <c:if test="${userSimpleInfo.relationLevel1 == ConstantInfo.RELATION_LEVEL_1_REQUEST}">
								             <p>对方未回应</p>
								            </c:if>
								            <c:if test="${userSimpleInfo.relationLevel1 == ConstantInfo.RELATION_LEVEL_1_AGREE}">
								             <p>对方同意查看个人照片</p>
								            </c:if>
								            <c:if test="${userSimpleInfo.relationLevel1 == ConstantInfo.RELATION_LEVEL_1_DISAGREE}">
								             <p>对方已拒绝</p>
								            </c:if>
								            <c:if test="${userSimpleInfo.relationLevel2 == ConstantInfo.RELATION_LEVEL_2_AGREE}">
								             <p>对方同意交换联系方式</p>
								            </c:if>
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