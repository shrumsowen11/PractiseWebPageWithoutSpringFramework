package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;



@SuppressWarnings("serial")
@WebServlet("/deletePersonServlet")
public class DeletePersonServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		employeeDao.deleteByEmail(email);
		req.getRequestDispatcher("showPerson.jsp").forward(req, resp);
	}

	

}
