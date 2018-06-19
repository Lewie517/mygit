<%@ page language="java" import="java.util.*,vo.*" contentType="text/html; charset=utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>购买页面</title>
    
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
     <h1 align="center">欢迎选购图书</h1>
     <%
     	HashMap allbook = (HashMap) session.getAttribute("allbook");
      %>
      <table border = "1" align="center">
      
      	<tr bgcolor="pink">
      	<td>书本名称</td>
      	<td>书本价格</td>
      	<td>购买</td>
      	</tr>
      	<%
      		Set<Integer> set = allbook.keySet();
      		Iterator<Integer> ite = set.iterator();
      		
      		while(ite.hasNext()){
      			Integer bookno = (Integer) ite.next();
      			Book book = (Book) allbook.get(bookno);
      	 %>
      	 <tr bgcolor="yellow">
      	 <td><%= book.getBookname() %></td>
      	 <td><%= book.getBookprice() %></td>
      	 <td><a href="buyForm.jsp?bookno=<%=bookno%>">购买</a></td>
      	 <% } %>
      	 </tr>
      
      </table>
      <div align="center"><a href="showCart.jsp" >查看购物车</a></div> 
      <div align="center"><a href="logout.action" >注销</a></div> 
      <div align="center"><a href="guestbook.jsp" >留言板</a></div>
  </body>
</html>
