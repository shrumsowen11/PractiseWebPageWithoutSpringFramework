package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;

@SuppressWarnings("serial")
@WebServlet("/updatePasswordEqualityServlet")
public class UpdatePasswordEqualityServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		String email = request.getParameter("email"); /// this is from the "ValidateEmailServlet" through the "session"
		if (password1.equals(password2)) {

			EmployeeDao employeeDao = new EmployeeDaoImpl();
			//EmployeeEntity employeeEntity = employeeDao.employeeByEmail(email);
			String result = employeeDao.updatePassword(email, password1);

			if (result.equals("Update Successful")) {
				//request.setAttribute("updatedDataEmail", employeeEntity.getEmail());
				request.setAttribute("message", "Password changed successfully.");
				request.getRequestDispatcher("index.jsp").forward(request, resp);
			}

		} else {
			request.setAttribute("message", "Passwords do not match.");
			request.getRequestDispatcher("getNewPasswords.jsp").forward(request, resp);
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
