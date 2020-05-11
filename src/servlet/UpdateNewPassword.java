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
@WebServlet("/updateNewPassword")
public class UpdateNewPassword extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String password = req.getParameter("password1");
		
		String email = req.getParameter("email");
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		EmployeeEntity employeeEntity= employeeDao.employeeByEmail(email);
		String message = employeeDao.updatePassword(email, password);
		if (message.contentEquals("Update Successful")) {
			
			req.setAttribute("userData", employeeEntity.getClass());
			req.setAttribute("message","Password changed successfully.");

			req.getRequestDispatcher("index.jsp").forward(req,resp);
			
		}else {
			req.setAttribute("message","Sorry, Passwords do not match.");
			req.getRequestDispatcher("getNewPasswords.jsp").forward(req,resp);
		}
		
		
	}

}
