<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="jp.frontierinfo.common.constant.ConstantInfo"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-pink" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="${pageContext.request.contextPath}/ui/s002001">XiangQin</a>
		</div>
		<div>
			<!-- 右揃え -->
			<ul class="nav nav-pills navbar-right">
				<li class="nav-item"><a href="${pageContext.request.contextPath}/ui/s002001" class="nav-link">ホームページ</a></li>
				<!-- 管理員にユーザーの操作ボタンを非表示 -->
				<c:if test="${USER_LOGIN_INFO.userRankCode == '01' or USER_LOGIN_INFO.userRankCode == '02'}">
					<li class="nav-item"><a href="${pageContext.request.contextPath}/ui/s002001/e001" class="nav-link">ユーザー情報設定</a></li>
					<!-- 当ユーザー状態为02:審査完了時,検索条件ボタンを活性に変更 -->
					<c:if test="${USER_LOGIN_INFO.userStatusCode == '02'}">
						<li class="nav-item"><a href="${pageContext.request.contextPath}/ui/s002001/e002" class="nav-link">検索条件設定</a></li>
					</c:if>
					<c:if test="${USER_LOGIN_INFO.userStatusCode != '02'}">
						<li class="nav-item"><a href="#" class="nav-link disabled">検索条件設定</a></li>
					</c:if>
					<li class="nav-item"><a href="${pageContext.request.contextPath}/ui/s003001/e001" class="nav-link">友達申請済一覧</a></li>
					<li class="nav-item"><a href="${pageContext.request.contextPath}/ui/s004001/e001" class="nav-link">申請された友達一覧</a></li>
				</c:if>
<<<<<<< HEAD
				<li class="nav-item">
				<a href="${pageContext.request.contextPath}/ui/s002001/e003" class="nav-link">ログアウト</a>
				</li>
=======
				<li class="nav-item"><a href="${pageContext.request.contextPath}/ui/s002001/e003" class="nav-link">ログアウト</a><a href="${pageContext.request.contextPath}/ui/s002001/e004" class="nav-link">アカウント削除</a></li>

>>>>>>> e9351231ccf7ec74eb754c726ac1e8338e3c9741
			</ul>
		</div>
	</div>
</nav>

