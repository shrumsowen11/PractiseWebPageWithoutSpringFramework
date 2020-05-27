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
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String email = req.getParameter("temail");
	String password = req.getParameter("password");
	
	
	EmployeeDao employeeDao =  new EmployeeDaoImpl();
	
		Optional<EmployeeEntity> optionalEmplEntity = employeeDao.employeeLogin(email, password);
		
		if(optionalEmplEntity.isPresent()) {
			HttpSession session = req.getSession(); //benefits: we can get the data in everywhere, NOT on only forwarded page
			session.setAttribute("userData", optionalEmplEntity.get());
			
			//req.setAttribute("userData", optionalEmplEntity.get()); //this only gives to the forwarded page

			req.getRequestDispatcher("dashboard.jsp").forward(req,resp);
			
		}else {
			req.setAttribute("message","Sorry, Incorrect Email or password.");
			req.getRequestDispatcher("index.jsp").forward(req,resp);

		}
	

	
}
/*
 * if we want this Server to support both the doPost and doGet method then, you
 * can simply write the doGet method and the call the doPOst method inside the
 * doGet method
 */

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doPost(req, resp);
}

}
