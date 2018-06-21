<%@ page language="java" import="java.util.*,vo.*,dao.*" contentType="text/html; charset=utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'bookmanage.jsp' starting page</title>
    
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
    <form>
    	<table border="1" width="80%" align="center">	
      	<tr>
      		<td colspan="4" align="center">书籍管理</td>
      	</tr>
      	<tr>
      		<td colspan="4" align="right"><a href="addBooks.jsp">新增书籍</a></td>
      	</tr>
		<tr>
			<td align="center">书    号</td>
			<td align="center">书    名</td>
			<td align="center">书    价</td>
			<td align="center">删除书本</td>
		</tr>	
		<%
			ArrayList<Book> books = BookDao.queryBook();
			Book book ;
			for(int i = 0 ;i < books.size();i++){
				book = books.get(i);
		 %>
		 <tr>
		 	<td align="center"><%=book.getBookno() %></td>
		 	<td align="center"><%=book.getBookname() %></td>
		 	<td align="center"><%=book.getBookprice() %>元</td>
		 	<td align="center"><a href="removebook.action?bookno=<%=book.getBookno() %>">删除</a></td>
		 </tr>
		 <%} %>
      	</table>
    </form>
  </body>
</html>
