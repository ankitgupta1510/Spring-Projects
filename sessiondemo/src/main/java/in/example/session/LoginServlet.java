package in.example.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		resp.getWriter().write(email);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getParameter("email");
		HttpSession session = req.getSession();
		
		Object currCount = session.getAttribute("count");
		int visits;
		if(currCount == null) {
			 visits=1;
			resp.getWriter().println("you visited 1 time");
		}else {
			 visits = (int)currCount+1;
			 resp.getWriter().println("you visited "+ visits + " times");
		}
		
		session.setAttribute("count", visits);
		//resp.getWriter().println(count++);
		resp.getWriter().println(req.getSession());
		//req.getAttribute(count);

	}

}
