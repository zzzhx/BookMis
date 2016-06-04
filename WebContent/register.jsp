<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>regiseter</title>
    
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
  	<% request.setCharacterEncoding("utf8"); %>
  		<h2 align="center"> 欢迎来到用户注册界面 </h2>
    <form action="servlet/Register"  method="post">
    	<table align="center"  >
    		<tr>
    			<td>用户名：</td>
    			<td> <input type ="text"  name="username"  value="请输入用户名" onclick="if(this.value=='请输入用户名') this.value='';"> </td>
    		</tr>
    		<tr>
    			<td>密码：</td>
    			<td> <input type ="password"  name="password" > </td>
    		</tr>
    		<tr>
    			<td>确认密码：</td>
    			<td> <input type ="password"  name="password" > </td>
    		</tr>
    		
    	</table>
    </form>
  </body>
</html>
