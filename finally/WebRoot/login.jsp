<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html style="height: 100%;">
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/input.css">
	
	<script type="text/javascript">
	function reLoadCode() {
		var time = new Date().getTime();
		document.getElementById("code").src="code.action?d="+time;
	}
	</script>
  </head>
  
  <body style="position: relative; min-height: 100%; margin:0px; padding: 0px; background-color: #0b4182;">
     <div style="position: absolute; top: 50px; left: 0px; width: 100%; min-height: 100%; background: linear-gradient(0deg, #0b4182 1%, #1e88e5 100%);">
		<div style="min-height:420px; max-width: 420px; padding:40px; background-color:#ffffff; margin-left: auto; margin-right: auto; border-radius:4px; overflow-x: hidden;">
			<form action="login.action" method="post">
				<h1 align="center">登录</h1>
				<hr>
				<p>
					<input type="text" name="username" placeholder="用户名" value="" style="width:100%;" required="required"><br>
					<hr>
					<input type="password" name="password" placeholder="密码" value="" style="width:100%;" required="required"><br>
					<hr>
					<input class="checkcode" type="text" name="checkcode"> 
					
					<img alt="验证码" id="code" src="code.action">
					<a href="javascript:reLoadCode();">看不清楚</a><br>
				</p>
				<p>
				<hr>
					<input type="submit" value="登录" class="login">
				</p>
			</form>
		</div>
	</div>
  </body>
</html>
