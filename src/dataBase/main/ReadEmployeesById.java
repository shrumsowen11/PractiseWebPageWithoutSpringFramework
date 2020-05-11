package dataBase.main;

import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;
import dataBase.dao.entity.EmployeeEntity;

import java.sql.SQLException;
import java.util.Scanner;

public class ReadEmployeesById {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        EmployeeDao employeeDao= new EmployeeDaoImpl();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the eid: ");
        int eid = scan.nextInt();
        System.out.println("Showing the employees with the provided Eid "+eid+" below:");

        EmployeeEntity employeeEntity =  employeeDao.employeeById(eid);

        System.out.println(employeeEntity.toString());
        scan.close();

    }
}
