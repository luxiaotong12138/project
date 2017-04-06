<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>My JSP 'register.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/H-ui.css">
<link rel="stylesheet" type="text/css" href="css/Hui-iconfont/1.0.8/iconfont.css">
</head>

<body>
	<center>
	<div id="loacl">
		
			<form action="login/register.do" method="post">
				<label class="form-label col-xs-4 mt-50 Hui-iconfont">&#xe62c; 用户名:</label>
				<div class="formControls col-xs-6">
					<input type="text" name="username" class="input-text radius size-S mt-50"/>
					</div>
					<div id="message">${result}</div>
				
				<label class="form-label col-xs-4 mt-10 Hui-iconfont">&#xe60e; 密码:</label>
				<div class="formControls col-xs-6">
				<input type="password" name="password" class="input-text radius size-S mt-10"/>
				</div>
				<label class="form-label col-xs-4 mt-10 Hui-iconfont">&#xe728; 出生日期:</label>
				<div class="formControls col-xs-6">	
				<input type="text" name="birthday" class="input-text radius size-S mt-10"/></td>
					</div>
				
					<label class="form-label col-xs-4 mt-10 Hui-iconfont">&#xe62b; 性别:</label>
				<div class="formControls col-xs-6">
				<input type="text" name="sex" class="input-text radius size-S mt-10"/></td>
					</div>
				
				
					<label class="form-label col-xs-4 mt-10 Hui-iconfont">&#xe671; 地址:</label>
				<div class="formControls col-xs-6">
				<input type="text" name="address" class="input-text radius size-S mt-10"/>
					</div>
			<div class="form-label col-xs-5">
					<input type="reset" id="button2" class="btn btn-primary mt-30"/>
					</div>
				<div class="formControls col-xs-6">	
					<input type="submit" value="确认注册" class="btn btn-primary mt-30" id="button1"/>
				</div>
			</form>
	</center>
	</div>
</body>
</html>
