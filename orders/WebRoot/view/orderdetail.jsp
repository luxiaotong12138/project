<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/mainStyle.css">



<title>欢迎来到购物中心</title>
<script src="js/jquery-3.1.1.js"></script>
<script type="text/javascript">
function frmSubmit1(form){
	
        form.action = "login/shoppingCart.do";
        form.submit();
}

function frmSubmit2(form){
        form.action = "login/purchase.do";
        form.submit();
}
$(document).ready(function(){ 
	 $('.spinner').fadeOut();
	 $('#temp').fadeOut();
	});
</script>
<style>
.spinner {
  margin: 300px auto;
  width: 50px;
  height: 60px;
  text-align: center;
  font-size: 10px;
}
 
.spinner > div {
  background-color: #67CF22;
  height: 100%;
  width: 6px;
  display: inline-block;
   
  -webkit-animation: stretchdelay 1.2s infinite ease-in-out;
  animation: stretchdelay 1.2s infinite ease-in-out;
}
 
.spinner .rect2 {
  -webkit-animation-delay: -1.1s;
  animation-delay: -1.1s;
}
 
.spinner .rect3 {
  -webkit-animation-delay: -1.0s;
  animation-delay: -1.0s;
}
 
.spinner .rect4 {
  -webkit-animation-delay: -0.9s;
  animation-delay: -0.9s;
}
 
.spinner .rect5 {
  -webkit-animation-delay: -0.8s;
  animation-delay: -0.8s;
}
 
@-webkit-keyframes stretchdelay {
  0%, 40%, 100% { -webkit-transform: scaleY(0.4) } 
  20% { -webkit-transform: scaleY(1.0) }
}
 
@keyframes stretchdelay {
  0%, 40%, 100% {
    transform: scaleY(0.4);
    -webkit-transform: scaleY(0.4);
  }  20% {
    transform: scaleY(1.0);
    -webkit-transform: scaleY(1.0);
  }
}
</style> 
</head>

<body>
<div style="width: 1300px;height: 780px;" id="temp">
<div id="loading" class="spinner">
  <div class="rect1"></div>
  <div class="rect2"></div>
  <div class="rect3"></div>
  <div class="rect4"></div>
  <div class="rect5"></div>
</div>
</div>
	<div id="Container">
		<div id="Header">
			<div id="logo">
				<%-- 网页的头部分--%>

				<table style="margin-left: 660px;width: 700px">
					<tr>
						
						<td width="100px"></td>
						<td width="100px"></td>
						
						<td width="150px"><a href="">我的购物车</a></td>
						<td width="150px"><a href="">我的订单</a></td>
						<td width="150px"><a href="">客服中心</a></td>
					</tr>
				</table>
			</div>
		</div>
		<div id="Content">
			<div id="Content-Left">
				<!-- 网页的左面部分-->
				<center>
					<table height="400px" style="font-size: 23px;font-style: normal;">
					<tr><td></td></tr>
					<tr><td></td></tr>
					<tr><td></td></tr>
						<tr>
							<td><a href="items/view.do?str=电器">电&nbsp;&nbsp;&nbsp;器</a></td>
						</tr>
						<tr>
							<td><a href="items/view.do?str=箱包">箱&nbsp;&nbsp;&nbsp;包</a></td>
						</tr>
						<tr>
							<td><a href="items/view.do?str=食品">食&nbsp;&nbsp;&nbsp;品</a></td>
						</tr>
						<tr>
							<td><a href="items/view.do?str=酒水">酒&nbsp;&nbsp;&nbsp;水</a></td>
						</tr>
						<tr>
							<td><a href="items/view.do?str=服饰">服&nbsp;&nbsp;&nbsp;饰</a></td>
						</tr>
						<tr>
							<td><a href="items/view.do?str=鞋帽">鞋&nbsp;&nbsp;&nbsp;帽</a></td>
						</tr>
						<tr>
							<td><a href="items/view.do?str=办公">办&nbsp;&nbsp;&nbsp;公</a></td>
						</tr>
						<tr>
							<td><a href="items/view.do?str=美妆">美&nbsp;&nbsp;&nbsp;妆</a></td>
						</tr>
						<tr>
							<td><a href="items/view.do?str=家居">家&nbsp;&nbsp;&nbsp;居</a></td>
						</tr>
					</table>
				</center>
			</div>
			<div id="Content-Main">
				<!-- 网页的右面部分-->
				<center>
				<form action="" method="post">
				<table border="1" height="450px" width="800px">
				<c:forEach items="${items}" var="it">
				<tr>
				<td rowspan="3"><img src='<c:out value="${it.pic}"/>'></td>
				<td>名称:<c:out value="${it.name}"/></td>
				</tr>
				<tr>
				
				<td>价格:<c:out value="${it.price}"></c:out></td>
				</tr>
				<tr>
				
				<td>生产日期:<c:out value="${it.createtime}"/></td>
				</tr>
				<tr>
				<td colspan="2">详情:<c:out value="${it.detail}"/></td>
				
				</tr height="20px;">
				<tr><td>
				请输入需要购买的数量:<input type="text" name="items_num" value="1"/></td>
				<td>商品ID:<input type="text" name="str" value='<c:out value="${it.id}"/>'/>
				</td>
				</tr>
				<tr>
				<td><input type="button" value="加入购物车" onclick="frmSubmit1(this.form);"/></td>
				
				<td><input type="button" value="立即购买" onclick="frmSubmit2(this.form);"/></td>
				</tr>
				</c:forEach>
				</table>
				</form>
				</center>		
			</div>
		</div>
		<div class="Clear">
			<!--如何你上面用到float,下面布局开始前最好清除一下。-->
		</div>
		<div id="Footer">@copyright tong.lu@sihuatech.com</div>
	</div>
</body>
</html>
