<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function check()
	{
		
		{
			if(document.getElementById("username").value =="")
				alert("用户名不能为空！");
				return;
		}
			 if(document.getElementById("password").value == "")
			{	
				alert("密码不能为空！");
				return;
			}
			else  {form.submit();}
		}
	</script>
  </head>
  
  <body>
 
    <form name="loginForm" action="servlet/Login" method="post" >
      <table align="center">
        <tr>
          <td>用户名:</td>
          <td><input type="text" name="username" value="请输入用户名" 
          onclick="if(this.value=='请输入用户名') this.value='';" id="username"></td>
        </tr>
        <tr>
          <td>密码:</td>
          <td><input type="password" name="password"  id="password" ></td>
        </tr> 
        <tr>
          <td><button onclick="check();">登录</button></td>
          <td align="right"><input type="reset" value="重置" ></td>
        </tr>
      </table>
    </form>
  </body>
</html>
