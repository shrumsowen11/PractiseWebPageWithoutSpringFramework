package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;
import dataBase.dao.entity.EmployeeEntity;

@SuppressWarnings("serial")
@WebServlet("/showAllEmployeesServlet")
public class ShowAllEmployeesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		List<EmployeeEntity> employeeList = new ArrayList<EmployeeEntity>();
		employeeList = employeeDao.findAll();
		req.setAttribute("employeeList", employeeList);
		req.getRequestDispatcher("showAllData.jsp").forward(req,resp);
	
	

}
}
