<%@ page language="java" import="java.util.*,vo.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>购物车</title>
    
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
     <div style="margin:20% 0;">
     <table border="1" align="center"style="font-size:20px; text-align:center;">
     	<tr bgcolor="pink">
     		<td>书本名称</td>
     		<td>书本价格</td>
     		<td>数量</td>
     		<td>删除</td>
     	</tr>
     	<%
     		HashMap books = (HashMap) session.getAttribute("books");
     		Set set = books.keySet();
     		Iterator ite = set.iterator();
  			while(ite.hasNext()){
      			Integer bookno = (Integer) ite.next();
      			Book book = (Book) books.get(bookno);
      	 %>
      	 <tr bgcolor="yellow">
      	 <td><%= book.getBookname() %></td>
      	 <td><%= book.getBookprice() %></td>
      	 <td><%= book.getBooknumber() %></td>
      	 <td><a href="RemoveAction.action?bookno=<%=book.getBookno()%>">删除</a></td>
      	 </tr>
      	 <% } %>
     </table>
     <div align="center" style="font-size:20px; text-align:center;margin-top:10px;">
     	现金总额：<%=session.getAttribute("money") %>
     	<br>
     	<a href="showAllBook.jsp"style="margin-top:10px;">继续购书</a>
     </div>
     </div>
  </body>
</html>
