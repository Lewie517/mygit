<%@ page language="java" import="java.util.*,vo.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'buyForm.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="css/input.css">

  </head>
  
  <body class="test">
     <%
     	String Strbookno =  request.getParameter("bookno");
     	int bookno = Integer.parseInt(Strbookno);
     	HashMap allbook = (HashMap) session.getAttribute("allbook");
     	Book book = (Book) allbook.get(bookno);
      %>
      	欢迎购买：<%=book.getBookname() %>
      	<form action="AddAction.action" method="post">
      		书本价格：<%= book.getBookprice()  %><br>
      		<input name="bookno" type="hidden" value="<%= book.getBookno()  %>">
      		<input name="bookname" type="hidden" value="<%= book.getBookname()  %>">
      		<input name="bookprice" type="hidden" value="<%= book.getBookprice() %>">
      		数量：<input name="booknumber" type="text">
      		<hr>
      		<input type="submit" value="购买">
      	</form>
  </body>
</html>
