package servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;
import dataBase.dao.entity.EmployeeEntity;
import dataBase.utils.DateUtils;

@SuppressWarnings("serial")
@WebServlet("/updateEmployeeDataServlet")
public class UpdateEmployeeDataServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		boolean empty = false;

		final String userid = request.getParameter("userid");
		if (userid == null) {
			empty = true;
		}

		String password = request.getParameter("password");
		if (password == null) {
			empty = true;
		}

		String name = request.getParameter("name");
		if (name == null) {
			empty = true;
		}

		String email = request.getParameter("email");
		if (email == null) {
			empty = true;
		}

		String dob = request.getParameter("dob");
		Date dateFromStringAgain = null;
		if (dob == null) {
			empty = true;
		}else {
			dateFromStringAgain =  DateUtils.dateFromString(dob);
		}

		String mobile = request.getParameter("mobile");
		long mob = 0;
		if (mobile == null) {
			empty = true;
		} else {
			mob = Long.parseLong(mobile);
		}

		String salary = request.getParameter("salary");
		double sal = 0;
		if (salary == null) {
			empty = true;
		} else {
			sal = Double.parseDouble(salary);
		}

		String ssn = request.getParameter("ssn");
		long sssn = 0;
		if (ssn == null) {
			empty = true;
		} else {
			sssn = Long.parseLong(ssn);
		}

		// Setting the message inside the request scope
		if (empty) { // if "empty equals true"
			request.setAttribute("message", "Field with * cannot be empty.");
			request.getRequestDispatcher("editEmploeeData.jsp").forward(request, resp);
			
		} else {
			EmployeeDao employeeDao = new EmployeeDaoImpl();
			EmployeeEntity entity = new EmployeeEntity(employeeDao.getIncrementedEId(), userid, password, name, email, dateFromStringAgain, mob, sal,
					sssn, null, null, new EmployeeEntity().getRole());
			employeeDao.updateEmployeeByUserId(entity);

			request.setAttribute("message", "You have successfully updated.");
			request.getRequestDispatcher("showAllEmployeesServlet").forward(request, resp);

		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
