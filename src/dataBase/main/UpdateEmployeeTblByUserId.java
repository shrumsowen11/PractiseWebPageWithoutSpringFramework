package dataBase.main;

import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;
import dataBase.dao.entity.EmployeeEntity;
import dataBase.utils.DateUtils;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class UpdateEmployeeTblByUserId {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        EmployeeDao employeeDao = new EmployeeDaoImpl();
        employeeDao.findAll();

        Scanner scan = new Scanner(System.in);
		/*
		 * System.out.println("Enter the eid: "); int eid = scan.nextInt();
		 */

        System.out.println("Enter the userid: ");
        String userid = scan.next();

        System.out.println("Enter the password: ");
        String password = scan.next();

        System.out.println("Enter the name: " );
        String name = scan.next();

        System.out.println("Enter the email: ");
        String email = scan.next();

        System.out.println("Enter the DOB(YYYY-MM-DD): ");
        String date = scan.next();
        Date date1 = DateUtils.dateFromString(date);

        System.out.println("Enter the mobile number: ");
        long mobile = scan.nextLong();

        System.out.println("Enter the salary: ");
        double salary = scan.nextDouble();

        System.out.println("Enter the ssn: ");
        long ssn = scan.nextLong();

        EmployeeEntity entity = new EmployeeEntity(employeeDao.getIncrementedEId(),userid, password, name,email, new java.sql.Date(date1.getTime()), mobile,salary,ssn,null,null,new EmployeeEntity().getRole());

        System.out.println("Saving all the data of the new Employee inside the entity in the JAVA side first...");

        String message = employeeDao.updateEmployeeByUserId(entity);
        System.out.println("Display Data....");
        System.out.println(message);
        employeeDao.findAll();

        scan.close();



    }

}

