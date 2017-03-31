<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'menu.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
	<script type="text/javascript">
	$(function(){
		  //alert(${json.menu.typeName}.length)
		  //alert(${json.menu.typeName})
		  //遍历json数组
		  var num=${json.menu.num};
		  if(num==1){
		  for(var i in ${json.menu.typeName}){
			  //alert(${json.menu.typeName}[i])
			  var typeName=${json.menu.typeName}[i];
			  $('div').append('<ul><li id="'+typeName+'">'+typeName+'</li></ul>')
		  }
		  }
	});
		</script>
		<style type="text/css">
		ul{list-style: none;}
		</style>
  </head>
  
  <body>
  ${json.menu}
  <br>
     ${json.menu.num}
     ${json.menu.typeName}
     <div style="width: 300px;">

     </div>
  </body>
</html>
