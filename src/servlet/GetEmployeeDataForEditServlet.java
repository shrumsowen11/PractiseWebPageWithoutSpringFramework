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
@WebServlet("/getEmployeeDataForEditServlet")
public class GetEmployeeDataForEditServlet extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userId = req.getParameter("userId");
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		EmployeeEntity employeeEntity = employeeDao.employeeByUserId(userId);
		req.setAttribute("message", "Please enter the fields you like to update.");
		req.setAttribute("employeeEntity", employeeEntity);
		req.getRequestDispatcher("editEmploeeData.jsp").forward(req,resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
