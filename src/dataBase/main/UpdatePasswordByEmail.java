package dataBase.main;

import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;
import dataBase.dao.entity.EmployeeEntity;
import dataBase.utils.DateUtils;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class UpdatePasswordByEmail {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		EmployeeDao employeeDao = new EmployeeDaoImpl();
		employeeDao.findAll();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the email: ");
		String email = scan.next();

		System.out.println("Enter the password: ");
		String password1 = scan.next();

		System.out.println("Re-enter the password: ");
		String password2 = scan.next();
		if (password1.equals(password2)) {

			String result = employeeDao.updatePassword(email, password1);

			if (result.equals("Update Successful")) {

				System.out.println("Saving all the data of the new Employee inside the entity in the JAVA side first...");

				System.out.println("Display Data....");
				System.out.println(result);
				employeeDao.findAll();
			}
		} else {
			System.out.println("Password do not match.");

		}

		scan.close();

	}

}
