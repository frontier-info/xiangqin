<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>向我打过招呼的人 -详细信息</title>
</head>
<body>

	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
		   <!--   导航栏 -->
			<%@include file="../common/header.jsp"%>
		</div>	
		<div class="col-md-2"></div>
	</div>
	<form:form modelAttribute="s004001Form" action="/xiangqin/ui/s004001/e003" method="post">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-pink">
				<div class="panel-heading pink">
					<h3 class="panel-title">用户详细信息</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-md-12">
							<!-- 用户详细信息 -->
							<div class="row">
								<div class="col-md-2"></div>
								<div class="col-md-4">
						          <form:errors path="*" element="div" class="alert alert-danger" role="alert"/>
						          <c:if test="${not empty message}">
						           <div class="alert alert-success" role="alert"><p>${message}</p></div>
						          </c:if>
									<div class="media">
										<div class="media-left media-top">
											<img
												src="${pageContext.request.contextPath}/${s004001Form.userFullInfo.avatarImg}"
												class="media-object" style="width: 90px">用户头像
										</div>
										<div class="media-body">
											<h4 class="media-heading">用户名:${s004001Form.userFullInfo.uname}</h4>
											<p>性别:${s004001Form.userFullInfo.sex}</p>
											<p>自我介绍:${s004001Form.userFullInfo.introduce}</p>
											<p>出生年月日:<fmt:formatDate type="date" value="${s004001Form.userFullInfo.birthDate}"/></p>
											<p>出生地:${s004001Form.userFullInfo.birthPlace}</p>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="media">
										<div class="media-body">
											<p>住所:${s004001Form.userFullInfo.address}</p>
											<p>职业:${s004001Form.userFullInfo.profession}</p>
											<p>兴趣:${s004001Form.userFullInfo.interest}</p>
											<p>身高:${s004001Form.userFullInfo.uheight}</p>
											<p>体重:${s004001Form.userFullInfo.uweight}</p>
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-2">
							    <input type="hidden" name="relationId" value="${s004001Form.userFullInfo.uid}"> 
								<input type="submit"  name="agree"  class="form-control"  value="同意" />
								<input type="submit"  name="reject"  class="form-control"  value="拒绝" />
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