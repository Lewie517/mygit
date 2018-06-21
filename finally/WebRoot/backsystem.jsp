<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'backsystem.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">		
		li{
			list-style-type:none;
			float:left;
			text-align:center;			
		}
		a{
			float:left;
			width:100px;
			text-decoration:none;			
			color:#FFFFFF;	
			background-color:purple;
			border-right:1px solid #FFFFFF;
					
		}
		a:hover{
			color:green;
			background-color: red;
		}
		a:active{
			color:gray;
			background-color:yellow;
		}
		div{
		 	width:400px;
			height:20px;
			margin:  0 auto;
		}
	</style>
  </head>
  
  <body>
      <form>
      <div align="center" style="margin: 0 auto;">
      	<ul >
			<li><a href="usermanage.jsp" target="2">用户管理</a></li>
			<li><a href="bookmanage.jsp" target="2">书本管理</a></li>		
			<li><a href="login.jsp" target="_top">退出</a></li>
		</ul>
      </div>
      		
      </form>
  </body>
</html>
