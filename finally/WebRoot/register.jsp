<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
      <form action="register.action" method="post" >
      	<h1 align="center">注册</h1>
      	<input type="text" name="username" placeholder="用户名" value="" ><br>
      	<input type="password" name="password" placeholder="密码" value="" ><br>
      	<input type="text" name="address" placeholder="地址"><br>
      	<input type="text" name="phone" placeholder="电话号码"><br>
      	<input type="submit" value="提交">
      	
      </form>
  </body>
</html>
