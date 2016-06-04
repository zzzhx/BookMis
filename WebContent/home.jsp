<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>home page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
				<style type="text/css">
			   		a{text-decoration:none}
			   		</style>
  </head>
  <%request.setCharacterEncoding("utf8"); %>
  <body>
  		<h2 align="center"> <%=session.getAttribute("username") %>,welcome to 图书管理系统<br></h2>
   		<table align="center" border="1" bordercolor="red">
			   		
   			<tr>
			<td><a href=/BookMis/addBook.jsp >增加图书</a></td>
			<td><a href=/BookMis/deleteBook.jsp>删除图书</a></td>
		</tr>
		<tr>
			<td><a href=/BookMis/updateBook.jsp>修改图书</a></td>
			<td><a href=/BookMis/searchBook.jsp>查询图书</a></td>
		</tr>
		
   		</table>
  </body>
</html>
