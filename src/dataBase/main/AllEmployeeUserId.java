package dataBase.main;

import java.util.List;

import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;

/*
 * All employee's userId
 * */
public class AllEmployeeUserId {
	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		List<String> userIds = employeeDao.findAllUserId();
		System.out.println(userIds);
	}

}
