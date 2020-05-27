package filter;

import java.sql.Time;

import javax.servlet.ServletContext;

import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;
import dataBase.utils.LocalTimeUtil;

public class TimeBlockerFilter {
	public static void updateTimeBlocker(ServletContext servletContext) {

		EmployeeDao employeeDao = new EmployeeDaoImpl();

		Time startTime = employeeDao.getStartTime();
		long startTimeInMillis = LocalTimeUtil.getTimeInMillis(startTime);
		Time endTime = employeeDao.getEndTime();
		long endTimeInMillis = LocalTimeUtil.getTimeInMillis(endTime);

		servletContext.setAttribute("startTime", startTime);
		servletContext.setAttribute("endTime", endTime);

		servletContext.setAttribute("startTimeInMillis", startTimeInMillis);
		servletContext.setAttribute("endTimeInMillis", endTimeInMillis);
		servletContext.setAttribute("blockerTimeFlag", 0);
	}
}
