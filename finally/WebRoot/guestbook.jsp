<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'guestbook.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/guestbook.css">


  </head>
  
  <body >
  	<form action="">
      <table width="90%" align="center" border="1">
      	<tr>
      		<td colspan="7"><h2 align="center">留言板</h2>
      		</td>
      	</tr>
      	<tr>
      		<td colspan="6">当前有<% %>条留言。</td>
      		<td width="10%" align="center"><a href="givemessage.jsp">留言</a></td>
      	</tr>
      	<tr>
      		<td align="center" colspan="0" width="20%">user:</td>
      		<td colspan="5" >留言内容</td>
     	</tr>
     	<tr>
      		<td align="center">user:</td>
      		<td colspan="5">留言内容</td>
      	</tr>
      	<tr>
      		<td align="center">user:</td>
      		<td colspan="5">内容</td>
      	</tr>
      </table>
    </form>
  </body>
</html>
