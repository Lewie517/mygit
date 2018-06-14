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
      <table width="80%" align="center" border="1">
      	<tr>
      		<td><h2 align="left">留言板</h2>
      		</td>
      		<td colspan="5"></td>
      		<td>liuyan</td>
      	</tr>
      	<tr>
      		<td>留言板</td>
      		<td>留言板</td>
      		<td>留言板</td>
      		<td>留言板</td>
      		<td>留言板</td>
      		<td>留言板</td>
      		<td>liuyan</td>
     	</tr>
     	<tr>
      		<td>留言板</td>
      		<td>留言板</td>
      		<td>留言板</td>
      		<td>留言板</td>
      		<td>留言板</td>
      		<td>留言板</td>
      		<td>liuyan</td>
      	</tr>
      	<tr>
      		<td align="center">user:</td>
      		<td colspan="5">asdasdasdas1d2a23d1a23sd1a23s1d32as1d23a1d32a1s23da13</td>
      	</tr>
      </table>
    </form>
  </body>
</html>
