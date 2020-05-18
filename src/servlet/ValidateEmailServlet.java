package servlet;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;
import dataBase.dao.entity.EmployeeEntity;

@SuppressWarnings("serial")
@WebServlet("/validateEmailServlet")
public class ValidateEmailServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String email = req.getParameter("temail");
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		Optional<EmployeeEntity> employeeEntity = employeeDao.optionalEmployeeByEmail(email);
	
			
			if(employeeEntity.isPresent()) {
				HttpSession session = req.getSession(); ////benefits: we can get the data in everywhere, NOT on only forwarded page
				session.setAttribute("userData", employeeEntity.get());
				//"req.setAttribut()"//this only gives to the forwarded page
				req.getRequestDispatcher("getNewPasswords.jsp").forward(req,resp);
			
			
		}else {
			
			req.setAttribute("message","Sorry, Email not found. Try again");
			req.getRequestDispatcher("emailValidate.jsp").forward(req,resp);
		}
	}
	
	
	

}
