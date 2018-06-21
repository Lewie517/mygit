<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>留言</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="#87CEFF">
      <form action="message.action" method="post">
      	<table align="center" width="50%">
      		<tr>
      			<td align="center">输入留言信息：</td>
      		</tr>
      		<tr >
      			<td align="center" width="50%"><textarea rows="10" cols="20" name="message"></textarea></td>
      		</tr>
      		<tr>
      			<td align="center"><input type="submit" value="提交"></td>
      		</tr>
      		
      	</table>
      </form>
  </body>
</html>
