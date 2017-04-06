<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>购物网站登录页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/H-ui.reset.css">
	<link rel="stylesheet" type="text/css" href="css/loginstyle.css">
    <link rel="stylesheet" type="text/css" href="css/H-ui.css">
    <link rel="stylesheet" type="text/css" href="css/Hui-iconfont/1.0.8/iconfont.css">
    <script type="text/javascript">
    function showMessage(){
    	
    	 window.open ('view/register.jsp', 'newwindow', 'height=430, width=430, top=200, left=400,statue=no,scrollbars=no,toolbar=no,menubar=no')
    }
   
    </script>
  </head>
  
  <body>
    <div id="Container">
    <div id="Header">
			<div id="logo">
			<img alt="" src="images/log.png"/>
			<center><h3 style="color: red">${result}</h3></center>
			<center><h3 style="color: red">${message}</h3></center>
			</div>
			</div>
    </div>
    <div id="Content">
			<div id="Content-Left">  </div>
			<div id="Content-Main">
				<div id="login"><center>
				
				<form action="login/valiatelogin.do" method="post" class="col-xs-10">
				<label class="form-label col-xs-2 Hui-iconfont mt-10">&#xe62c;</label>
				<div class="formControls col-xs-10">
				<input type="text" name="username" class="input-text radius size-S mt-10 " placeholder="用户名"/>
				</div>
				<label class="form-label col-xs-2 Hui-iconfont mt-10">&#xe60e;</label>
				<div class="formControls col-xs-10">
				<input type="password" name="password" class="input-text radius size-S mt-10 Hui-iconfont Hui-iconfont-suoding"  placeholder="密码"/>
				</div>
				<div class="formControls col-xs-12">
				<input type="submit" value="登录" class="btn btn-primary radius mt-30 ml-50"/>
				<input type="reset" class="btn btn-primary radius mt-30 ml-20"/>
				</div>
				</form>
				<center>
				<button onclick="showMessage();" class="btn btn-secondary radius mt-10">免费注册</button></center>
				</center></div>
			</div>
	<div class="Clear">
			<!--清除一下上面的布局-->
		</div>
		<div id="Footer">@copyright tong.lu@sihuatech.com</div>
	</div>
  </body>
</html>
