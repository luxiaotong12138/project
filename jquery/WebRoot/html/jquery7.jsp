<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jquery7.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/H-ui.css">
	<script type="text/javascript" src="js/jquery.js"></script>
  	<script type="text/javascript" src="js/H-ui.js"></script>
  <script type="text/javascript">
  $(function(){ 
	  //设置cookie
	  $.cookie('username', 'the_value');
	  //获取
	  var obj=$.cookie('username')
     	//alert(obj);
	  //删除
	  $.cookie('username',null)
	  //获取文件名
	  var options = {
			success: function (data) {
				$("#responseText").text(data);
			}
		};
		$("#form1").ajaxForm(options);
		//延时加载，页面翻到的时候再去加载 
		$("img.lazyload").lazyload()
});    
</script>  
  </head>
  
  <body>
  <a href="html/jquery7.html">测试cookie</a> 
  <form id="form1" action="ajaxOperation.ashx?Action=formUpload" method="post" enctype="multipart/form-data">
	<div>附件名字: <input type="text" name="fileName"></div>
	<div>附件: <input type="file" name="document"></div>
	<div><input type="submit" value="模拟iframe提交表单" /></div>
</form>
<label id="responseText"></label>
--------------------------------------------------------------<br>
<div style="width: 1000px;height: 600px;">
<!-- 加载一块区域 -->
<iframe align="top" scrolling="yes" frameborder="1" height="400px" src="txt/路通周报20170329.doc">iframe</iframe>
</div>
<!-- 延时加载，页面翻到的时候再去加载 -->
<img class="lazyload" alt="" width="1000" height="60" data-original="http://images.h-ui.net/www/AD-1000x60.gif" />
  </body>
</html>
