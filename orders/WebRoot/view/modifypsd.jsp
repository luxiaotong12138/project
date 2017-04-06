<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改密码</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="#FFF0F5">
  <center> <div style="width: 300px;height: 500px;margin-top: 100px;">
   <form action="user/modifypsd.do" method="post">
   	用户名:<input type="text" name="username" style="margin-top: 30px;"/><br>
   	原密码:<input type="password" name="password" style="margin-top: 30px;"><br>
   	新密码:<input type="password" name="password" style="margin-top: 30px;"><br>
   	<input type="submit" value="确认修改" style="margin-top: 30px;margin-right: 20px;"/><input type="reset" style="margin-top: 30px;"/>
   </form>
   </div></center>
  </body>
</html>
