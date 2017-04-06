<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>所有商品的信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/H-ui.css">
	<link rel="stylesheet" type="text/css" href="css/Hui-iconfont/1.0.8/iconfont.css">
	<link rel="stylesheet" type="text/css" href="css/H-ui.admin.css">
  <script type="text/javascript" src="js/jquery.js"></script>
  <script type="text/javascript" src="js/H-ui.admin.js"></script>
  <script type="text/javascript" src="js/H-ui.js"></script>
  
  <script type="text/javascript">
  $(function(){
		$.Huifold("#Huifold1 .item h4","#Huifold1 .item .info","fast",1,"click"); /*5个参数顺序不可打乱，分别是：相应区,隐藏显示的内容,速度,类型,事件*/
	});
  </script>
	

  </head>
  
  <body>
    
   <header class="navbar-wrapper">
	<div class="navbar navbar-black">
		<div class="container cl">
			<a class="logo navbar-logo f-l mr-10 hidden-xs Hui-iconfont" href="#">&#xe62d; 欢迎进入管理员界面</a>
			
			<a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
			<nav class="nav navbar-nav nav-collapse" role="navigation" id="Hui-navbar">
				<ul class="cl">
					<li class="current Hui-iconfont"><a href="view/admin.jsp">&#xe625; 首页</a></li>
					<li class="col-lg-8 Hui-iconfont"><a href="log/log4j.txt">&#xe626; 网站运行日志</a></li>	
					<li class="ml-900 Hui-iconfont"><a href="#">&#xe6d0; 客户反馈中心</a></li>
				</ul>
			</nav>
			<nav class="navbar-userbar hidden-xs">
				
			</nav>
		</div>
	</div>
</header>
<aside class="Hui-aside">
<ul id="Huifold1" class="Huifold">
  <li class="item">
    <h4 class="Hui-iconfont">&#xe62b;用户操作<b>+</b></h4>
     <div class="info ml-10"><a href="view/user.do">显示所有用户</a></div>
  </li>
  <li class="item">
    <h4 class="Hui-iconfont">&#xe626;所有商品<b>+</b></h4>
    <div class="info"><a href="view/items.do">显示所有商品</a></div>
  </li>
  <li class="item">
    <h4 class="Hui-iconfont">&#xe6c1; <a href="items/BestSellers.do">热销商品</a><b>+</b></h4>
    <div class="info"></div>
  </li>
</ul>
</aside>
<div class="page-container" style="width: 1100px;float: right;">
<table class="table table-border table-bordered table-bg">
		<thead>
			<tr>
				<th colspan="7" scope="col">用户信息统计</th>
			</tr>
			<tr class="text-c">
				<th>ID</th>
				<th>商品名称</th>
				<th>价格</th>
				<th>详情</th>
				<th>图片路径</th>
				<th>生产日期</th>
				<th>所属类型</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			
		<c:forEach items="${itemsInfo}" var="ii">
   <tr> <td><c:out value="${ii.id}"/></td>
    <td><c:out value="${ii.name}"/></td>
    <td><c:out value="${ii.price}"/></td>
    <td><c:out value="${ii.detail}"/></td>
     <td> <c:out value="${ii.pic}"/></td>
   <td> <c:out value="${ii.createtime}"/></td>
    <td> <c:out value="${ii.ordertype}"/></td>
   		<td class="Hui-iconfont"><a href='items/delete.do?id=<c:out value="${ii.id}"/>'>&#xe6e2;</a>
   	<a href='view/updateitems.jsp?id=<c:out value="${ii.id}"/>' class="Hui-iconfont">&#xe6df;</a></td>
    </tr>
    </c:forEach>
		</tbody>
	</table>
</div>
  </body>
</html>
