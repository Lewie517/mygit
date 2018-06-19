<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'rootlogin.jsp' starting page</title>
    
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
      <form action="" method="post">
      	<table align="center" width="50%">
      		<tr><td><h1 align="center">管理员登录</h1></td></tr>
      		<tr><td><hr width="50%"></td></tr>
      		<tr>
      			<td align="center" width="50%">管理员密码：<input type="text" name="username"></td>
      		</tr>
      		<tr >
      			<td align="center" width="50%">管理员密码：<input type="password" name="password" ></td>
      		</tr>
      		<tr>
      			<td align="center"><input type="submit" value="提交" width="40%"></td>
      		</tr>
      		
      	</table>
      </form>
  </body>
</html>
