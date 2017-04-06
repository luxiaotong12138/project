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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="#0D0D0D">
  <a href="view/admin.jsp">返回首页</a>
  <center>
  <a href="view/items.do">刷新</a>
  <table border="1" style="font-size: 20px;color: #ADFF2F;">
  <tr><td>ID</td>
  		<td>商品名称</td>
  		<td>价格</td>
  		<td>详情</td>
  		<td>图片路径</td>
  		<td>生成日期</td>
  		<td>所属类型</td>
  		<td colspan="2">操作</td>
  </tr>
    <c:forEach items="${itemsInfo}" var="ii">
   <tr> <td><c:out value="${ii.id}"/></td>
    <td><c:out value="${ii.name}"/></td>
    <td><c:out value="${ii.price}"/></td>
    <td><c:out value="${ii.detail}"/></td>
     <td> <c:out value="${ii.pic}"/></td>
   <td> <c:out value="${ii.createtime}"/></td>
    <td> <c:out value="${ii.ordertype}"/></td>
   		<td><a href='items/delete.do?id=<c:out value="${ii.id}"/>'>删除</a></td>
   		<td><a href='view/updateitems.jsp?id=<c:out value="${ii.id}"/>'>修改</a></td>
    </tr>
    </c:forEach>
    </table>
    </center>
  </body>
</html>
