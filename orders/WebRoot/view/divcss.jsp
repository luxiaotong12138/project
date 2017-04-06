<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->


<title>DIV+CSS布局教程</title>
<style type="text/css"> 
.AutoNewline 
{ 
  Word-break: break-all;/*必须*/ 
} 
</style>
<style type="text/css">
#Container {
	width: 1360px;
	margin: 0 auto; /*设置整个容器在浏览器中水平居中*/
	background: #FFFFFF;
}

#Header {
	height: 80px;
	background: #BE77FF;
}

#logo {
	padding-left: 50px;
	padding-top: 20px;
	padding-bottom: 50px;
}

#Content {
	height: 480px;
	/*此处对容器设置了高度，一般不建议对容器设置高度，一般使用overflow:auto;属性设置容器根据内容自适应高度，如果不指定高度或不设置自适应高度，容器将默认为1个字符高度，容器下方的布局元素（footer）设置margin-top:属性将无效*/
	margin-top: 0px; /*此处讲解margin的用法，设置content与上面header元素之间的距离*/
	margin-bottom: 0px;
	background: #FFFFFF;
}

#Content-Left {
	height: 480px;
	width: 150px;
	margin: 20px; /*设置元素跟其他元素的距离为20像素*/
	margin-left: 50px;
	float: left; /*设置浮动，实现多列效果，div+Css布局中很重要的*/
	background: #FF7F00;
}

#Content-Main {
	height: 480px;
	width: 800px;
	margin: 20px; /*设置元素跟其他元素的距离为20像素*/
	float: left; /*设置浮动，实现多列效果，div+Css布局中很重要的*/
	background: #FFD2D2;
}
#Content-right {
	height: 480px;
	width: 200px;
	margin: 20px; /*设置元素跟其他元素的距离为20像素*/
	margin-left: 50px;
	float: right; /*设置浮动，实现多列效果，div+Css布局中很重要的*/
	background: #F0F8FF;
}
/*注：Content-Left和Content-Main元素是Content元素的子元素，两个元素使用了float:left;设置成两列，这个两个元素的宽度和这个两个元素设置的padding、margin的和一定不能大于父层Content元素的宽度，否则设置列将失败*/
#Footer {
	height: 40px;
	background: #90C;
	margin-top: 0px;
}

.Clear {
	clear: both;
}
</style>
<!-- 获取当前的URL传递的参数
<script type="text/javascript" charset="gb2312">

function gettext(){
	var category=window.location.search;
	var cateval = category.substring(category.lastIndexOf('=')+1, category.length);
	alert(cateval)
	document.write(cateval)
}
</script>-->
<script type="text/javascript">
$(function(){

      vardf=newDate();

      varyear=df.getFullYear()

      $("#td1").text(year+" J2EE开发");

   });</script>
</head>

<body>
<table>
<tr>
<td id="id"></td>
</tr>
</table>
	<div id="Container">
		<div id="Header">
			<div id="logo">
			
				<%-- 网页的头部分--%>
<a id="tpye" href="view/divcss.jsp?str=dianqi">测试1</a>
<a id="" href="javascrip:void()">测试2</a>
<a id="tttt" onclick="gettext();" href="view/divcss.jsp">ceshi</a>

				<table style="margin-left: 660px;width: 700px">
					<tr>

						<td width="100px"><a href="">登陆</a></td>
						<td width="100px"><a href="">注册</a></td>
						<td width="150px"><a href="">购物车</a></td>
						<td width="150px"><a href="">我的订单</a></td>
						<td width="150px"><a href="">客服中心</a></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td colspan="2"><form action="" method="post">
								<input type="text" name="search" value="搜索你想要的宝贝" /> 
								<input type="submit" value="搜索" />
									
							</form></td>
						<td></td>
					</tr>
				</table>
			</div>
		</div>
		<div id="Content">
			<div id="Content-Left">
				<%-- 网页的左面部分--%>
				<center>
					<table height="400px" style="font-size: 20px;font-style: oblique;">
						<tr>
							<td><a href="">电&nbsp;&nbsp;&nbsp;器</a></td>
						</tr>
						<tr>
							<td><a href="">箱&nbsp;&nbsp;&nbsp;包</a></td>
						</tr>
						<tr>
							<td><a href="">食&nbsp;&nbsp;&nbsp;品</a></td>
						</tr>
						<tr>
							<td><a href="">酒&nbsp;&nbsp;&nbsp;水</a></td>
						</tr>
						<tr>
							<td><a href="">服&nbsp;&nbsp;&nbsp;饰</a></td>
						</tr>
						<tr>
							<td><a href="">鞋&nbsp;&nbsp;&nbsp;帽</a></td>
						</tr>
						<tr>
							<td><a href="">办&nbsp;&nbsp;&nbsp;公</a></td>
						</tr>
						<tr>
							<td><a href="">美&nbsp;&nbsp;&nbsp;妆</a></td>
						</tr>
						<tr>
							<td><a href="">家&nbsp;&nbsp;&nbsp;居</a></td>
						</tr>
					</table>
				</center>
			</div>
			<div id="Content-Main">
				<%-- 网页的右面部分--%>
				<a href="index.jsp"><img alt="" src="images/log.jpg"></a>
					<table border="1" rules="groups">
				<tr>
				<td rowspan="3">图片</td>
				<td>商品名称</td>
				</tr>
				<tr>
				
				<td>商品价格</td>
				</tr>
				<tr>
				
				<td>生产日期</td>
				</tr>
				<tr>
				<td colspan="2">商品详细信息</td>
				
				</tr>
				<tr>
				<td>加入购物车</td>
				<td>立即购买</td>
				</tr>
				</table>
			</div>
			<div id="Content-right">
			<center><table>
			<tr><td>
				<table border="1" style="margin: 30px;"><!-- 第一个行 -->			
					<tr><td>之后</td> <td>放入</td></tr>
					<tr><td>一张</td> <td>动态</td></tr>
					<tr><td>图</td> <td>画</td></tr>
				</table>
			
			</td></tr>
			
			
			<tr><td colspan="2" ><!-- 第二行 -->
			<table border="2" rules="groups" style="margin: 30px;">
			<tr><td><a href="">首页</a></td></tr>
			<tr><td><a href="">第一页</a></td></tr>
			<tr><td><a href="">第二页</a></td></tr>
			<tr><td><a href="">第三页</a></td></tr>
			<tr><td><a href="">尾页</a></td></tr>
			</table>
			</td></tr>
			</table>
			<a href="index.jsp?frist=3&two=4">测试多值的传递</a>
			<c:forEach begin="1" end="10" step="1" var="t1">
			<c:out value="t1"/>
			<c:forEach begin="11" end="20" step="1" var="t2">
			<c:out value="t2"/>
			</c:forEach>
			</c:forEach>
			<!-- 结果一个T1，十个T2 -->
			</center>
			<h3></h3>
			<form action="view/login.jsp">
			<input type="submit" value="注册"/>
			<input type="submit" value="登录"/>
			<a href="">测试</a>
			</form>
			</div>
		
		</div>
		<div class="Clear">
			<!--如何你上面用到float,下面布局开始前最好清除一下。--> 
		</div>
		<div id="Footer">@copyright tong.lu@sihuatech.com</div>
	</div>
</body>
</html>
