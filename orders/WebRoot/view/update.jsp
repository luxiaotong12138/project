<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>更新用户信息</title>
    
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
   <form action="user/update.do" method="post">
   		<table border="1">
   		<tr><td>ID</td>
   		<td><input type="text" name="id" value="1"></td>
   		</tr>
   		<tr><td>username</td>
   		<td><input type="text" name="username"></td>
   		</tr>
   		<tr><td>birthday</td>
   		<td><input type="text" name="birthday"></td>
   		</tr>
   		<tr><td>sex</td>
   		<td><input type="text" name="sex"></td>
   		</tr>
   		<tr><td>address</td>
   		<td><input type="text" name="address"></td>
   		</tr>
   		<tr><td>
   		<input type="submit" value="确认修改"/></td>
   		<td>
   		<input type="reset" /></td></tr>
   		</table>
   </form>
  </body>
</html>
