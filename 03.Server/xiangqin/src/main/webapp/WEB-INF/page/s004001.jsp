<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>申請された友達一覧</title>
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
    <form:form modelAttribute="s004001Form" action="/xiangqin/ui/s004001/e002" method="post">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-pink">
				<div class="panel-heading pink">
					<h3 class="panel-title">申請された友達一覧</h3>
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
							<c:forEach items="${s004001Form.userSimpleInfoLi}" var="userSimpleInfo">
								<li>
									<div class="media">
										<div class="media-left media-top">
											<img
												src="${pageContext.request.contextPath}/${userSimpleInfo.avatarImg}"
												class="media-object avatar">
										</div>
										<div class="media-body">
											<h4 class="media-heading">
											<a href="${pageContext.request.contextPath}/ui/s004001/e002?relationId=${userSimpleInfo.relationId}">${userSimpleInfo.uname}</a>
											</h4>
											<p>${userSimpleInfo.sex}</p>
											<p>${userSimpleInfo.introduce}</p>
								            <c:if test="${userSimpleInfo.relationLevel1 == ConstantInfo.RELATION_LEVEL_1_REQUEST}">
								             <p>未返答</p>
								            </c:if>
								            <c:if test="${userSimpleInfo.relationLevel1 == ConstantInfo.RELATION_LEVEL_1_AGREE}">
								             <p>個人写真の交換を承認済</p>
								            </c:if>
								            <c:if test="${userSimpleInfo.relationLevel1 == ConstantInfo.RELATION_LEVEL_1_DISAGREE}">
								             <p>拒否</p>
								            </c:if>
								            <c:if test="${userSimpleInfo.relationLevel2 == ConstantInfo.RELATION_LEVEL_2_AGREE}">
								             <p>連絡先の交換を承認済</p>
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