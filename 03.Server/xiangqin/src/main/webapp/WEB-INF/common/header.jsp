<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
   <nav class="navbar navbar-primary" role="navigation">
    <div class="container-fluid">
     <div class="navbar-header">
      <a class="navbar-brand" href="#">QuantitativeTrading</a>
     </div>
     <div>
      <!--向右对齐-->
      <ul class="nav nav-pills navbar-right">
       <li class="dropdown">
        <a href="${pageContext.request.contextPath}/s0101001" class="dropdown-toggle text-muted" data-toggle="dropdown">行情中心<span class="caret"></span></a>
        <ul class="dropdown-menu">
         <li><a href="${pageContext.request.contextPath}/s0102001">股票行情</a></li>
         <li><a href="${pageContext.request.contextPath}/s0103001">指数行情</a></li>
         <li><a href="${pageContext.request.contextPath}/s0104001">期货行情</a></li>
         <li><a href="${pageContext.request.contextPath}/s0105001">基本面</a></li>
         <li><a href="${pageContext.request.contextPath}/s0106001">模拟盘持仓</a></li>
         <li><a href="${pageContext.request.contextPath}/s0107001">实盘持仓</a></li>
         <li><a href="${pageContext.request.contextPath}/s0108001">机器学习</a></li>
         <li><a href="${pageContext.request.contextPath}/s0108002">机器学习(全品种)</a></li>
        </ul>
       </li>
       <li class="dropdown">
        <a href="#" class="dropdown-toggle text-muted" data-toggle="dropdown">交易信号<span class="caret"></span></a>
        <ul class="dropdown-menu">
         <li><a href="${pageContext.request.contextPath}/s0201001">蜡烛图</a></li>
         <li><a href="${pageContext.request.contextPath}/s0202001">市场成交额</a></li>
         <li><a href="${pageContext.request.contextPath}/s0203001">划线技术</a></li>
        </ul>
       </li>
       <li class="dropdown">
        <a href="#" class="dropdown-toggle text-muted" data-toggle="dropdown">回测研究<span class="caret"></span></a>
        <ul class="dropdown-menu">
         <li><a href="${pageContext.request.contextPath}/s0301001">方案管理</a></li>
         <li><a href="${pageContext.request.contextPath}/s0302001">策略评价</a></li>
         <li><a href="${pageContext.request.contextPath}/s0303001">策略回测</a></li>
        </ul>
       </li>
       <li class="dropdown">
        <a href="#" class="dropdown-toggle text-muted" data-toggle="dropdown">模拟盘测试<span class="caret"></span></a>
        <ul class="dropdown-menu">
         <li><a href="${pageContext.request.contextPath}/s0401001">期货主力合约回测</a></li>
        </ul>
       </li>
       <li class="dropdown">
        <a href="#" class="dropdown-toggle text-muted" data-toggle="dropdown">实盘测试<span class="caret"></span></a>
        <ul class="dropdown-menu">
         <li><a href="${pageContext.request.contextPath}/s05010001">开发中</a></li>
        </ul>
       </li>
       <li class="dropdown">
        <a href="#" class="dropdown-toggle text-muted" data-toggle="dropdown">用户名<span class="caret"></span></a>
        <ul class="dropdown-menu">
         <li><a href="${pageContext.request.contextPath}/s06001">我的信息</a></li>
         <li class="divider"></li>
         <li><a href="${pageContext.request.contextPath}">退出登录</a></li>
        </ul>
       </li>
      </ul>
     </div>
    </div>
   </nav>

   