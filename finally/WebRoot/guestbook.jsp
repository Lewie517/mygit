<%@ page language="java" import="java.util.*,dao.*,vo.Message" contentType="text/html; charset=UTF-8"%>
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
  
  <body bgcolor="#87CEFF">
  	<form>
      <table width="90%" align="center" border="1">
      	<tr>
      		<td colspan="7"><h2 align="center">留言板</h2>
      		</td>
      	</tr>
      	<%
      		ArrayList<Message> allmessage = MessageDao.queryMessage1();
      	%>
      	<tr>
      		<td colspan="6">当前有<%=allmessage.size() %>条留言。</td>
      		<td width="10%" align="center"><a href="givemessage.jsp">留言</a></td>
      	</tr>
      	<% 
      		Message temp;
      		for(int i=0;i<allmessage.size();i++){
      			temp = allmessage.get(i);
      			
      	%>
      	<tr>
      		<td align="center" colspan="0" width="20%"><%=temp.getUsername() %></td>
      		<td colspan="5" ><%=temp.getMessage() %></td>
      		<td align="center">第<%=i+1 %>楼</td>
     	</tr>
     	<%} %>
     	<tr><td colspan="7" align="center"><a href="showAllBook.jsp">返回购书</a></td></tr>
      </table>
    </form>
  </body>
</html>
