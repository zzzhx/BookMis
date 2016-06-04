<%@page import="java.io.PrintWriter"%>
<%@page import="model.BookList"%>
<%@page import="model.Book" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>search book page</title>
    
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
   <form action="servlet/SearchBook" method="post">
   	<table align="center">
   		<tr>
   				<td>通过
   					<select name="selection">
   						<option value="bookName">书名</option>
   						<option value="author">作者</option>
   					</select> 
   					查询</td>
   					<td> <input type="text" name="value"> </td>
   		</tr>
   			<tr>
   				<td align="center"><input  type="submit" value="查询"></td>
    		   <td align="center"><input type="reset" value="重置"></td> 
    		   <td><input type="button" value="返回" onclick="javascript:history.back(-1)"></td>
   			</tr>
   	</table>
   </form>
   
   <%
   		BookList bookList = new BookList();
   		bookList = (BookList) request.getAttribute("bookList");
   		if(bookList != null)
   		{	
   		out.write("<table align=\"center\" border=\"1\">");
   		out.write("<tr>");
   		out.write("<td>书名</td>");
   		out.write("<td>作者</td>");
   		out.write(" <td>价格</td>");
   		out.write("</tr>");
    		for(Book book: bookList)
    		{
    			out.write("<tr>");
    			out.write("<td>"+book.bookname+"</td>");
   				out.write("<td>"+book.author+"</td>");
   				out.write("<td>"+book.price+"</td>");
   				out.write("</tr>");
    		} 
    	 out.write("</table>");
    	 out.flush();
    		} %>
    	
  </body>
</html>
