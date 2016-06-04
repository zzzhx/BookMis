package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import operate.Method;
import model.Book;

public class AddBook extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddBook() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
//		out.println("<HTML>");
//		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
//		out.println("  <BODY>");
//		out.print("    This is ");
//		out.print(this.getClass());
//		out.println(", using the GET method");
//		out.println("  </BODY>");
//		out.println("</HTML>");
//		out.flush();
//		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Method method = new Method();
		request.setCharacterEncoding("utf-8");
		String bookname = request.getParameter("bookname");
		String author = request.getParameter("author");
		float price = Float.parseFloat(request.getParameter("price"));
		
		Boolean isSuccess = method.addBook(new Book(bookname, author, price));
		if(isSuccess)
		{
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write("<script type=\"text/javascript\">alert(\"添加图书成功!\")</script>");
			response.getWriter().write("<script type=\"text/javascript\">window.location.href='http://localhost:8080/BookManageSystem/addBook.jsp'</script>");
			response.getWriter().flush();
		}
		else
		{
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write("<script type=\"text/javascript\">alert(\"添加图书failed!\")</script>");
			response.getWriter().write("<script type=\"text/javascript\">window.location.href='http://localhost:8080/BookManageSystem/addBook.jsp'</script>");
			response.getWriter().flush();
		}
	
		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
