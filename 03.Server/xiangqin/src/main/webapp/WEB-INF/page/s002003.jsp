<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/include_script.jsp"%>
<%@ include file="../common/include_css.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>恋活-検索条件設定</title>
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
	<form:form modelAttribute="s002003Form" action="/xiangqin/ui/s002003" method="post">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-pink">
				<div class="panel-heading pink">
					<h3 class="panel-title">検索条件設定</h3>
				</div>
				<div class="panel-body pink">
					<div class="row">
						<div class="col-md-12">
							<!--   画面メッセージエリア -->
							<%@include file="../common/message.jsp"%>
							<h2><font size="5" color="pink">検索条件を入力してください。 </font></h2>
							<hr />
							<!-- 検索条件エリア -->
							<div class="form-inline row">
								<div class="col-md-1"></div>
								<div class="col-md-3">
									<p>
										<label for="birthPlace">出生地:</label>
										<form:select path="birthPlace" class="form-control">
											<option value="">--地域を選択してください--</option>  
										    <form:options items="${s002003Form.birthPlaceLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label>年齢：</label> 
										<label for="ageFrom">From</label> 
										<form:input class="form-control" size="3" path="ageFrom" pattern="[0-9]{1,3}" title="３桁以下の数字を入力してください"/> 
										<label for="ageTo">To</label> 
										<form:input class="form-control" size="3" path="ageTo" pattern="[0-9]{1,3}" title="３桁以下の数字を入力してください"/>
									</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-1"></div>
								<div class="col-md-3">
									<p>
										<label for="address">居住地: </label>
										<form:select path="address" class="form-control" >
											<option value="">--地域を選択してください--</option>  
								            <form:options items="${s002003Form.addressLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label>身長：</label> 
										<label for="uheightFrom">From</label> 
										<form:input class="form-control" size="3" path="uheightFrom" pattern="[0-9]{1,3}" title="３桁以下の数字を入力してください"/> 
										<label for="uheightTo">To</label> 
										<form:input class="form-control" size="3" path="uheightTo" pattern="[0-9]{1,3}" title="３桁以下の数字を入力してください"/>
									</p>
								</div>
							</div>
							<div class="form-inline row">
								<div class="col-md-1"></div>
								<div class="col-md-3">
									<p>
										<label for="profession">職業: </label>
										<form:select path="profession" class="form-control" >
											<option value="">--業種を選択してください--</option>  
								            <form:options items="${s002003Form.professionLi}"/>
										</form:select>
									</p>
								</div>
								<div class="col-md-3">
									<p>
										<label>体重：</label> 
										<label for="uweightFrom">From</label> 
										<form:input class="form-control" size="3" path="uweightFrom" pattern="[0-9]{1,3}" title="３桁以下の数字を入力してください"/> 
										<label for="uweightTo">To</label> 
										<form:input class="form-control" size="3" path="uweightTo" pattern="[0-9]{1,3}" title="３桁以下の数字を入力してください"/>
									</p>
								</div>
							</div>
							<hr size="2" color="#ffffff">
							<div class="form-inline row">
								<div class="col-md-1"></div>
								<div class="col-md-3">
									<input type="reset" class="button-default" value="情報リセット">
									<input type="submit" class="button-success" name="saveSearchCondition" value="検索条件を保存">
								</div>
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