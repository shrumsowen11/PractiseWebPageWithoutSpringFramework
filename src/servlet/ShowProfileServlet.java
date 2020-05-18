package servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;
import dataBase.dao.entity.EmployeeEntity;

@SuppressWarnings("serial")
@WebServlet("/showProfileServlet")
public class ShowProfileServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity = employeeDao.employeeByEmail(email);
		req.setAttribute("entity", employeeEntity);
		req.getRequestDispatcher("showProfile.jsp").forward(req,resp);
	
	

}
}
