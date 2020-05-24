package servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;

@SuppressWarnings("serial")
@WebServlet("/unBlockTimeServlet")
public class UnBlockTimeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			EmployeeDao employeeDao = new EmployeeDaoImpl();
			long startTimeInMillis = employeeDao.getStartTime();
			long endTimeInMillis = employeeDao.getEndTime();
			
			ServletContext servletContext = req.getServletContext();
			servletContext.setAttribute("startTimeInMillis", startTimeInMillis);
			servletContext.setAttribute("endTimeInMillis", endTimeInMillis);
			servletContext.setAttribute("blockerTimeFlag", 0);
			
			req.getRequestDispatcher(blockerTime).forward(req, resp);
			
	}
	

}
