package in.cmp.beans;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        
        // 1. Naya Session banao (true matlab create new if not exists)
        HttpSession session = req.getSession(true);
        
        // 2. Data set kardo (Locker me samaan rakh diya)
        session.setAttribute("user", "Rahul");
        session.setAttribute("role", "ADMIN");

        resp.getWriter().write("<h1>Login Successful!</h1> <a href='/admin'>Go to Admin Page</a>");
    }
}