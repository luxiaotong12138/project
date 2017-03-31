<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>menus.jsp</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
		<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
	<script type="text/javascript">
	$(function(){
		//alert( ${json.menus})
		//var temp=${json.menus};
		//alert(temp.length)
		var str = '${json.menus}'; 
		var obj = eval("("+str+")");
		//alert(obj.id)
		for(var i in obj.name){
			if(obj.id[i]==1){
				$('div').append('<ul><li id='obj.name[i]'+'>'+obj.name[i]+'</li><ul>')
			}
			
		}
	});
	</script>
	<style type="text/css">
	ul li{list-style: none;}
	</style>
  </head>
 
  <body>
    ${json.menus}<br/>
    <div>
    
    </div>
  </body>
</html>
