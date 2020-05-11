package dataBase.main;

import java.sql.SQLException;

import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;

public class ReadAllEmployeeMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        employeeDao.findAll().forEach(System.out::println);
    }
}
