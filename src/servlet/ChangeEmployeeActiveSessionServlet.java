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
@WebServlet("/changeEmployeeActiveSessionServlet")
public class ChangeEmployeeActiveSessionServlet extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userId = req.getParameter("userId");
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		employeeDao.updateEmployeeActiveStatus(userId); // first it will change the "Active" status based on the userId passed through and then
		
		
		//EmployeeEntity employeeEntity = employeeDao.employeeByUserId(userId); // gets the new employeeEntity based on the same userId passed through and then
		//req.setAttribute("message", "Active Role changed.");  
		//req.setAttribute("employeeEntity", employeeEntity);  //sets the attributes of the new updated employeeEntity and then
		req.getRequestDispatcher("showAllEmployeesBlockTimeServlet").forward(req,resp); //dispatches responses and set attributes to the request to the upcoming .jsp page
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
