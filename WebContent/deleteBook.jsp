<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>delete book page</title>
    
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
   	<form action="servlet/DeleteBook" method="post">
   		<table align="center">
   			<tr>
   				<td>书名：</td>
   				<td> <input type="text" name="bookname" value="请输入需要删除的图书的书名" 
   				onclick="if(this.value=='请输入需要删除的图书的书名') this.value='';"> </td>
   			</tr>
   			<tr>
   				<td align="center"> <input type="submit" value="删除"> </td>
   				<td align="center"> <input type="reset" value="重置">	</td>
   				<td> <input type="button" value="返回" onclick="javascript:history.back(-1)"> </td>
   			</tr>
   		</table>
   	</form>
  </body>
</html>
