package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet("/logoutServlet")
public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false); 
		/*
		 * doing "false" --> do not make a new session here, rather gives me the old session.-->
		 * but if you do not have an old session, it will automatically make a new
		 * session for you, but still it keeps the value of the
		 *  variable "session" --> NULL
		 */
		if(session !=null) {
			session.invalidate();
		}
		req.getRequestDispatcher("logout.jsp").forward(req,resp);;
		
		
	}
	
}
