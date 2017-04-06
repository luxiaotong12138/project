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
    
    <title>我的购物车</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/myShoppingCart.css">
	

  </head>
  
  <body>
  <a href="view/main.jsp">返回首页</a>
  	<c:if test="${message!=null}">
  	${message}<a href="login/myShoppingCart.do">返回购物车</a>
  	</c:if>
   <c:forEach items="${shoppingCart}" var="sc">
   
   <table rules="groups" id="t1">
  <tr><td style="color: #8B0000;">商品名称:
   <c:out value="${sc.name}"/></td>
    <td style="color: #CD0000;">商品价格:
   <c:out value="${sc.price}"/></td>
    <tr><td>商品图片:
   	<img src='<c:out value="${sc.pic}"/>'> </td>
   <td>已加入的数量:
    <c:out value="${sc.items_num}"/></td>
    <td style="color: #080808;">订单号:
   <c:out value="${sc.number}"/></td>
   <td style="color: #080808;width: 25%;">下单时间:
   <c:out value="${sc.createtime}"/></td>
  <td style="width: 20%;"> <a href="login/myShoppingCartPurchase.do?number=<c:out value="${sc.number}"/>">立即购买</a></td></tr>
------------------------------------------------------------------------------------------------------------------------------------------------------------------
   </c:forEach>

   </table>

  </body>
</html>
