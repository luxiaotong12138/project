<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<script src="js/jquery-3.1.1.js"></script>

<title>欢迎来到购物中心</title>
<!--  
<script type="text/javascript" charset="UTF-8">
function gettext(){
	var category=window.location.search;
	var cateval = category.substring(category.lastIndexOf('=')+1, category.length);
	alert(cateval)
	
}
</script>-->
<script type="text/javascript">
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
						<td width="150px"><a href="login/myShoppingCart.do">我的购物车</a></td>
						<td width="150px"><a href="login/myPurchase.do">我的订单</a></td>
						<td width="150px"><a href="">客服中心</a></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td colspan="2"><form action="items/search.do" method="post">
								<input type="text" name="name" value="搜索你想要的宝贝" /> <input
									type="submit" value="搜索" />

							</form></td>
						<td></td>
					</tr>
				</table>
			</div>
		</div>
		<div id="Content">
			<div id="Content-Left">
				<%-- 网页的左面部分--%>
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
				<!-- 网页的右面部分 -->
				<center><label style="text-shadow: 5px 3px 6px #000;font-size: 25px;">商品展示</label>
				
					<table border="1">
					<tr>	
					<c:forEach items="${items1}" var="it1">
						<td><table rules="groups">
							<tr style="margin: 10px;">
							<!--  <td><c:out value="${it.id}"></c:out></td>-->
							<td><a href='items/detailView.do?str=<c:out value="${it1.id}"/>'><img src='<c:out value="${it1.pic}"></c:out>'></a></td>
							<tr><td><label>商品名字:</label><c:out value="${it1.name}"/> </td></tr>
							<tr><td><label>￥:</label><c:out value="${it1.price}"/> </td></tr>
							
							</table></td>
						</c:forEach>
					
					</tr>
						<tr>	
					<c:forEach items="${items2}" var="it2">
						<td><table rules="groups">
							<tr style="margin: 10px;">
							<!--  <td><c:out value="${it.id}"></c:out></td>-->
							<td><a href='items/detailView.do?str=<c:out value="${it2.id}"></c:out>'><img src='<c:out value="${it2.pic}"></c:out>'></a></td>
							<tr><td><label>商品名字:</label><c:out value="${it2.name}"></c:out> </td></tr>
							<tr><td><label>￥:</label><c:out value="${it2.price}"></c:out> </td></tr>
							
							</table></td>
						</c:forEach>
					
					</tr>
				</table>
				</center>
			</div>
				
		</div>
		
		<div class="Clear">
		</div>
		<center>
		<table>
		<c:forEach begin="1" end="${pagenum}" step="1" var="num">
						<a href='items/viewpage.do?str=<c:out value="${num}"/>' onclick="gettext();">第<c:out value="${num}"/>页</a>
				
				</c:forEach></center>
		<div id="Footer">@copyright tong.lu@sihuatech.com</div>
	</div>
</body>
</html>
