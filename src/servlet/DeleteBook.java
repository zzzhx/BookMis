package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import operate.Method;

@SuppressWarnings("serial")
public class DeleteBook extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public DeleteBook() {
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
		String bookname = request.getParameter("bookname");
		Boolean isSuccess = method.deleteBook(bookname);
		if(isSuccess)
		{	
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write("<script type=\"text/javascript\">alert(\"删除图书成功!\")</script>");
			response.getWriter().write("<script type=\"text/javascript\">window.location.href='http://localhost:8080/BookManageSystem/deleteBook.jsp'</script>");
			response.getWriter().flush();
			
		}
		else
		{
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write("<script type=\"text/javascript\">alert(\"删除图书失败\")</script>");
			response.getWriter().write("<script type=\"text/javascript\">window.location.href='http://localhost:8080/BookManageSystem/deleteBook.jsp'</script>");
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
