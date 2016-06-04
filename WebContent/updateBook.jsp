<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>update book page</title>
    
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
  	<form action="servlet/UpdateBook" method="post">
  	   	<table align="center">
  	   		<tr>
  	   			<td>旧书名：</td>
  	   			<td> <input type="text" name="oldBookName" value="请输入需要修改的书名" 
  	   					onclick="if(this.value == '请输入需要修改的书名') this.value='';">
  	   		</tr>
  	   		<tr>
  	   			<td>新书名：</td>
  	   			<td> <input type="text" name="newBookName" value="请输入新的书名"
  	   					onclick="if(this.value == '请输入新的书名') this.value='';">
  	   		</tr>
  	   		<tr>
  	   			<td>新作者：</td>
  	   			<td> <input type="text" name="newAuthor" value="请输入新的作者"
  	   					onclick="if(this.value == '请输入新的作者') this.value='';">
  	   		</tr>
  	   		<tr>
  	   			<td>新价格：</td>
  	   			<td> <input type="text" name="newPrice" value="请输入新的价格"
  	   					onclick="if(this.value == '请输入新的价格') this.value='';">
  	   		</tr>
  	   		<tr>
    		   <td align="center"><input align="left" type="submit" value="添加"></td>
    		   <td align="center"><input type="reset" value="重置"></td> 
    		   <td><input type="button" value="返回" onclick="javascript:history.back(-1)"></td>
			</tr>
  	   	</table>
  	</form>
  </body>
</html>
