<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>更新商品信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <center> <form action="items/update.do">
    <table style="color: orange;font-size: 23px;">
    <tr><td>ID</td> <td><input type="text" name="id" value="id"/></td></tr>
    	<tr><td>name</td><td><input type="text" name="name" value=""/></td> </tr>
    	<tr><td>price</td> <td><input type="text" name="price" value=""/></td></tr>
    	<tr><td>detail</td> <td><input type="text" name="detail" value=""/></tr>
    	<tr><td>pic</td> <td><input type="text" name="pic" value=""/></td></tr>
    	<tr><td>createtime</td><td><input type="text" name="createtime" value=""/> </tr>
    	<tr><td>ordertype</td><td><input type="text" name="ordertype" value=""/></td>
    </tr>
    
    <tr><td><input type="submit" value="确认提交"/></td>
    <td> <input type="reset"/></td></tr>
    </table>
    </form></center>
  </body>
</html>
