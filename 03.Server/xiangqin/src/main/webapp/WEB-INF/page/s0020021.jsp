<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
  <%@ include file="../common/include_script.jsp"%>
  <%@ include file="../common/include_css.jsp"%>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>XiangQin-用户信息设定确认</title>
</head>

<style>
body { background-color:whitesmoke;}
</style>

<body>
<div id="container" style="width:500px">

<div id="header" style="background-color:#FF00FF;">
<h1 style="margin-bottom:0;">XiangQin</h1></div>

</div>

<h2><font face="verdana"><font size="6" color="black">个人信息确认页面</h2>
<h3><font size="3" color="pink">💛金风玉露一相逢，便胜却人间无数。💛</h3>
<hr/>

</body>

<form:form modelAttribute="s002002Form" action="/xiangqin/ui/s002002" method="post">
<div>
    用户ID:  <form:input type="text" path="uid" />
</div>
<div>
<div>
    用户名:  <form:input type="text" path="uname" />
</div>
    男  <form:input type="text" path="sex" />
    女  <form:input type="text" path="sex" />
</div>
<div>
    出生年月日:  <input type="text" path="birthDate" >
</div>
<div>
    出生地:  <input type="text" path="birthPlace" >
</div>
<div>
    住所:  <input type="text" path="address" >
</div>
<div>
    职业:  <input type="text" path="profession" >
</div>
<div>
    兴趣:  <input type="text" path="interest" >
</div>
<div>
    身高:  <input type="text" path="uheight" >
</div>
<div>
    体重:  <input type="text" path="uweight" >
</div>
<div>
    自我介绍:  <input type="text" path="introduce" >
</div>
<div>
    上传照片:  <input type="text" path="uimages" >
</div>
<div>
    上传照片:  <input type="text" path="identificationPhoto" >
</div>
<input type="submit" value="确认提交个人信息">
</form:form>
<div id="footer" style="background-color:#FFA500;clear:both;text-align:center;">
版权 XiangQin.com</div>

</textarea> 
</body>
</html>

