<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ユーザー管理</title>
</head>
<body>

	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<!--   ナビゲーションバー -->
			<%@include file="../common/header.jsp"%>
		</div>
		<div class="col-md-2"></div>
	</div>
	<form:form modelAttribute="s009010Form" action="/xiangqin/ui/s009010" method="post">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-pink">
				<div class="panel-heading pink">
					<h3 class="panel-title">ユーザー管理(一般)</h3>
				</div>
				<div class="panel-body pink">
					<div class="row">
					  <!-- 画面メッセージエリア -->
					  <div class="col-md-3"></div>
					  <div class="col-md-6">
			          <form:errors path="*" element="div" class="alert alert-danger" role="alert"/>
			          <c:if test="${not empty message}">
			           <div class="alert alert-success" role="alert"><p>${message}</p></div>
			          </c:if>
					  </div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<!-- 検索条件エリア -->
							<div class="form-inline row">
								<div class="col-md-3">
								<p>
									<label for="uid">ユーザーID:</label>
									<input type="text" class="form-control" size="5" name="uid">
								</p>
								</div>
								<div class="col-md-3">
								<p>
									<label for="birthPlace">出生地:</label> <select name="birthPlace" class="form-control">
										<option value="">--地域を選択してください--</option>  
										<c:forEach items="${s009010Form.birthPlaceLi}" var="birthPlace">
											<option value="${birthPlace}">${birthPlace}</option>
										</c:forEach>
									</select>
								</p>
								</div>
								<div class="col-md-3">
								<p>
									<label>年齢：</label> 
									<label for="ageFrom">From</label> 
									<input type="text" class="form-control" size="3" name="ageFrom"> 
									<label for="ageTo">To</label> 
									<input type="text" class="form-control" size="3" name="ageTo">
								</p>
								</div>
								<div class="col-md-3">
								<p>
									<label>ユーザー審査状態：</label> 
									<select name="userStatus" class="form-control">
										<option value="">--審査状態を選択してください--</option>  
										<c:forEach items="${s009010Form.userStatusLi}" var="userStatus">
											<option value="${userStatus.selectKey}">${userStatus.selectValue}</option>
										</c:forEach>
									</select>
								</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-3">
								<p>
									<label for="uname">性别：</label>
									<label for="sex" class="radio-inline"> <input type="radio" name="sex" value="" checked="checked">未選択</label>
									<label for="sex" class="radio-inline"> <input type="radio" name="sex" value="女">女</label>
									<label for="sex" class="radio-inline"> <input type="radio" name="sex" value="男">男</label>
								</p>
								</div>
								<div class="col-md-3">
								<p>
									<label for="address">居住地:</label>
									<select name="address" class="form-control">
										<option value="">--地域を選択してください--</option>  
										<c:forEach items="${s009010Form.addressLi}" var="address">
											<option value="${address}">${address}</option>
										</c:forEach>
									</select>
								</p>
								</div>
								<div class="col-md-3">
								<p>
									<label>身長：</label> 
									<label for="uheightFrom">From</label> 
									<input type="text" class="form-control" size="3" name="uheightFrom"> 
									<label for="uheightTo">To</label> 
									<input type="text" class="form-control" size="3" name="uheightTo">
								</p>
								</div>
								<div class="col-md-3">
								<p>
									<label>ユーザーレベル：</label> 
									<select name="userRank" class="form-control">
										<option value="">--ユーザーレベルを選択してください--</option>  
										<c:forEach items="${s009010Form.userRankLi}" var="userRank">
											<option value="${userRank.selectKey}">${userRank.selectValue}</option>
										</c:forEach>
									</select>
								</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-3"></div>
								<div class="col-md-3">
								<p>
									<label for="profession">職業:</label>
									<select name="profession" class="form-control">
										<option value="">--業種を選択してください--</option>  
										<c:forEach items="${s009010Form.professionLi}" var="profession">
											<option value="${profession}">${profession}</option>
										</c:forEach>
									</select>
								</p>
								</div>
								<div class="col-md-3">
								<p>
									<label>体重：</label> 
									<label for="uweightFrom">From</label> 
									<input type="text" class="form-control" size="3" name="uweightFrom"> 
									<label for="uweightTo">To</label> 
									<input type="text" class="form-control" size="3" name="uweightTo">
								</p>
								</div>
							</div>
							<hr size="2" color="#ffffff">
							<div class="form-inline row">
								<div class="col-md-3"></div>
								<div class="col-md-3">
								<p>
									<input type="submit" class="form-control" name="search" value="検索" />
									<input type="reset" class="form-control" value="リセット" />
								</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<c:if test="${s009010Form.userFullInfoLi.size() > 0}">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-pink">
				<div class="panel-heading pink">
					<h3 class="panel-title">检索结果</h3>
				</div>
				<div class="panel-body pink">
					<div class="row">
						<div class="col-md-12">
							<!-- 检索结果エリア -->
					         <table id="userFullInfoTable" class="table table-bordered table-striped">
						      <thead>
							   <tr>
							    <th>ユーザーID</th>
							    <th>名前</th>
							    <th>性别</th>
							    <th>出生年月</th>
							    <th>連絡先</th>
							    <th>メールアドレス</th>
							    <th>出生地</th>
							    <th>居住地</th>
							    <th>職業</th>
							    <th>趣味</th>
							    <th>身長</th>
							    <th>体重</th>
							    <th>ユーザー状態</th>
							    <th>ユーザーレベル</th>
							    <th>審査结果</th>
							   </tr>
						      </thead>
						      <tbody>
						      <c:forEach items="${s009010Form.userFullInfoLi}" var="userFullInfo">
							    <tr>
							     <td><a href="${pageContext.request.contextPath}/ui/s009010/e002?uid=${userFullInfo.uid}">${userFullInfo.uid}</a></td>
							     <td>${userFullInfo.uname}</td>
							     <td>${userFullInfo.sex}</td>
							     <td><fmt:formatDate type="date" value="${userFullInfo.birthDate}"/></td>
							     <td>${userFullInfo.mobile}</td>
							     <td>${userFullInfo.email}</td>
							     <td>${userFullInfo.birthPlace}</td>
							     <td>${userFullInfo.address}</td>
							     <td>${userFullInfo.profession}</td>
							     <td>${userFullInfo.interest}</td>
							     <td>${userFullInfo.uheight}</td>
							     <td>${userFullInfo.uweight}</td>
							     <td>${userFullInfo.userStatusName}</td>
							     <td>${userFullInfo.userRankName}</td>
							     <td>${userFullInfo.userCensorResult}</td>
							    </tr>
							  </c:forEach>
						      </tbody>
					         </table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</c:if>
	</form:form>

</body>
 <script>
 $(document).ready(function() {
     $("#userFullInfoTable").dataTable({
    	 // 开启外部CSS
    	 "jQueryUI": true,
    	 // 关闭排序
    	 "ordering": true,
    	 // 关闭検索
    	 "searching": false,
    	 "scrollY": "400px",
    	 "scrollCollapse": true,
    	 // 分页ボタン
    	 "pagingType": 'full_numbers',
    	 // 信息
    	 "info": "From 0 To 0 の第 0 页",
    	 // 国际化
    	 "language": {
   	        "paginate": {
   	            "first": '««',
   	            "previous": '«',
   	            "next": '»',
   	            "last": '»»'
   	        },
       	 }
     });
 });
 </script>
</html>