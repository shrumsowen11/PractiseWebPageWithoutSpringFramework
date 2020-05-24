package servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

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
@WebServlet("/registerProcessServlet")
public class RegisterProcessServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		// boolean empty = false;
		String check = "good";
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		List<String> previousUserIds = employeeDao.findAllUserId();

		String userid = request.getParameter("userid");
		/*
		 * if (userid == null) { check = null; }else
		 */if (previousUserIds.contains(userid)) {
			check = "Sorry,      \"" + userid + "\"     is already taken.";
		}

		String password = request.getParameter("password");
		/*
		 * if (password == null) { check = null; }
		 */

		String name = request.getParameter("name");
		/*
		 * if (name == null) { check = null; }
		 */

		String email = request.getParameter("email");
		/*
		 * if (email == null) { check = null; }
		 */

		String dob = request.getParameter("dob");
		Date dateFromStringAgain = DateUtils.dateFromString(dob);
		/*
		 * if (dob == null) { check = null; }
		 */

		String mobile = request.getParameter("mobile");
		/*
		 * long mob = 0; if (mobile == null) { check = null; } else {
		 */
		long mob = Long.parseLong(mobile);
		// }

		String salary = request.getParameter("salary");
		double sal = Double.parseDouble(salary);

		String ssn = request.getParameter("ssn");
		/*
		 * long sssn = 0; if (ssn == null) { check = null; } else {
		 */
		long sssn = Long.parseLong(ssn);
		// }

		// Setting the message inside the request scope

		/*
		 * if (check == null) { request.setAttribute("message",
		 * "Field with * cannot be empty.");
		 * request.getRequestDispatcher("register.jsp").forward(request, resp);
		 * 
		 * } else
		 */
		if (check != "good") {
			request.setAttribute("message", check);
			request.getRequestDispatcher("register.jsp").forward(request, resp);

		} else {

			EmployeeEntity entity = new EmployeeEntity(employeeDao.getIncrementedEId(), userid, password, name, email,
					dateFromStringAgain, mob, sal, sssn, null, null, new EmployeeEntity().getRole(), new EmployeeEntity().getStartTime(), new EmployeeEntity().getEndTime(), new EmployeeEntity().getActive());
			employeeDao.save(entity);

			request.setAttribute("message", "You have succcessfully registered..");
			request.getRequestDispatcher("register.jsp").forward(request, resp);
			;

		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
