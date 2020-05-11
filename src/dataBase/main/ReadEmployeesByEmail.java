package dataBase.main;

import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;
import dataBase.dao.entity.EmployeeEntity;

import java.sql.SQLException;
import java.util.Scanner;

public class ReadEmployeesByEmail {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        EmployeeDao employeeDao= new EmployeeDaoImpl();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Email: ");
        String email = scan.next();
        System.out.println("Showing the employees with the provided Email "+email+" below:");

        EmployeeEntity employeeEntity =  employeeDao.employeeByEmail(email);

        System.out.println(employeeEntity.toString());
        scan.close();

    }
}
