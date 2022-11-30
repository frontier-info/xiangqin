<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="jp.frontierinfo.common.constant.ConstantInfo"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-pink" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="${pageContext.request.contextPath}/ui/s002001">XiangQin</a>
		</div>
		<div>
			<!-- 向右对齐 -->
			<ul class="nav nav-pills navbar-right">
				<li class="nav-item"><a href="${pageContext.request.contextPath}/ui/s002001" class="nav-link">首页</a></li>
				<!-- 管理员界面不显示用户操作按钮 -->
				<c:if test="${USER_LOGIN_INFO.userRankCode == '01' or USER_LOGIN_INFO.userRankCode == '02'}">
					<li class="nav-item"><a href="${pageContext.request.contextPath}/ui/s002001/e001" class="nav-link">用户信息设定</a></li>
					<!-- 当用户状态为02:审核通过时,检索条件按钮设置为活性 -->
					<c:if test="${USER_LOGIN_INFO.userStatusCode == '02'}">
						<li class="nav-item"><a href="${pageContext.request.contextPath}/ui/s002001/e002" class="nav-link">检索条件设定</a></li>
					</c:if>
					<c:if test="${USER_LOGIN_INFO.userStatusCode != '02'}">
						<li class="nav-item"><a href="#" class="nav-link disabled">检索条件设定</a></li>
					</c:if>
					<li class="nav-item"><a href="${pageContext.request.contextPath}/ui/s003001/e001" class="nav-link">我打过招呼的人</a></li>
					<li class="nav-item"><a href="${pageContext.request.contextPath}/ui/s004001/e001" class="nav-link">向我打招呼的人</a></li>
				</c:if>
				<li class="nav-item"><a href="${pageContext.request.contextPath}/ui/s002001/e003" class="nav-link">退出登录</a></li>
			</ul>
		</div>
	</div>
</nav>

