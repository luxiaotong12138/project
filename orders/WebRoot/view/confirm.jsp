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

<title>My JSP 'confirm.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<!-- 五秒后跳转到别的页面 -->
<meta http-equiv="refresh" content="5;url=view/main.jsp">
<script type="text/javascript">
	var num = 6;
	function calc() {
		if (num > 0) {
			num--;
			document.getElementById('second').innerHTML = num+'秒后自动跳转';
		} else {
			location.href = 'view/login.jsp?messageID="+messageID+"'
		}
		setTimeout('calc()', 1000);
	}
</script>
  </head>

  
  
<body style="margin-top: 100px;" onload="calc();">
    <center style="font-size: 23px; color: #FF6347;">操作成功!<br>
    	订单号是:${number}<br>
    	商品数量:${items_id}
    <div id='second' style="color:purple;">5</div>
    <a href="">点击立即跳转</a>
    </center>
  </body>
</html>
