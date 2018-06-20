<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addBooks.jsp' starting page</title>
    
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
  	<form action="addbook.action" method="post" style="height: 272px; ">
      <table align="center" width="300" >
      		<tr>
      			<td><h1 align="center">书籍新增</h1></td>
      		</tr>
      		<tr>
      			<td>新增的书名:<input type="text" name="bookname" style="width: 68%;"></td>
      		</tr>
      		<tr>
      			<td>书价为:<input type="text" name="bookprice" style="width: 217px;"></td>
      		</tr>
      		<tr>
      			<td><input type="submit" value="确定" style="width: 100%;color: blue;" ></td>
      		</tr>
      		<tr>
      			<td align="center"><a href="bookmanage.jsp" style="width: 100%;border-color: navy;">返回</a></td>
      		</tr>
      </table>
    </form>
  </body>
</html>
