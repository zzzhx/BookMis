package filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckLogin {
	
		public boolean Check(HttpServletRequest request, HttpServletResponse response)
		{
			if(request.getSession().getAttribute("username") != null)
				return true;
			else  
				return false;
			
		}
}
