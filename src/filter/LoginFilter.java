package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println(" 过滤器已销毁~~~!");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,FilterChain chain) throws IOException, ServletException {
	
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		String path = new String(request.getRequestURL());
		System.out.println("235"+path);
		CheckLogin checkLogin = new CheckLogin();
		
		if(path.endsWith("login.jsp") || path.endsWith("Login")||path.endsWith("register.jsp") || path.endsWith("Register"))
			chain.doFilter(request, response);
		else if (checkLogin.Check(request, response)) {
			chain.doFilter(request, response);
		}	else {
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
