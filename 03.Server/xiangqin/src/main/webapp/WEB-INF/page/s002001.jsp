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

   <div class="col-md-4"></div>
   <div class="col-md-4">
    <div class="page-header">
     <h1>XiangQin</h1>
    </div>
   </div>
   <div class="col-md-4"></div>

  </div>
  <div class="row">
   <div class="col-md-4"></div>
   <div class="col-md-4">
    <div class="panel panel-primary">
     <div class="panel-heading">
      <h3 class="panel-title">用户主页</h3>
     </div>
     <div class="panel-body">
      <div class="row">
      <div class="col-md-3"></div>
      <div class="col-md-6">
       <form:form modelAttribute="s002001Form" action="/xiangqin/ui/s002001" method="post">
         <div class="form-group">
         
         
         
          <button type="submit" class="btn btn-default" name="a">用户信息设定</button>
          <button type="submit" class="btn btn-default" name="b">检索条件设定</button>
          <button type="submit" class="btn btn-default" name="c">退出登录</button>
         </div>
        </form:form>
       </div>
       <div class="col-md-3"></div>
      </div>
     </div>
    </div>
   </div>
  </div>

</body>
</html>