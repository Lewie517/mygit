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
    	<table border="1" width="100%">	
      	<tr>
      		<td colspan="4" align="center">用户管理</td>
      	</tr>
		<tr>
			<td align="center">书号</td>
			<td align="center">书名</td>
			<td align="center">书价</td>
			<td align="center">删除用户</td>
		</tr>	
		<%
			ArrayList<User> users = UserDao.queryAllUser();
			User user ;
			for(int i = 0 ;i < users.size();i++){
				user = users.get(i);
		 %>
		 <tr>
		 	<td align="center"><%=user.getId() %></td>
		 	<td align="center"><%=user.getUsername() %></td>
		 	<td align="center"><%=user.getAddress() %></td>
		 	<td align="center"><a href="removeuser.action?userid=<%=user.getId() %>">删除</a></td>
		 </tr>
		 <%} %>
      	</table>
    </form>
  </body>
</html>
