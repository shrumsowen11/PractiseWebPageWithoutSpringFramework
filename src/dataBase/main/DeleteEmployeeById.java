package dataBase.main;

import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployeeById {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Eid that you want to delete: ");
        int eid = scan.nextInt();

        System.out.println("Fetching the datas from the Employee_table database....");
       // System.out.println("Deleting the employees with the provided Eid " + eid + " below:");

        EmployeeDao employeeDao = new EmployeeDaoImpl();

        int rowCountMain = 0;
        rowCountMain = employeeDao.deleteById(eid);
        System.out.println(rowCountMain);
        if (rowCountMain > 0) {
            System.out.println("Data delete Successfully.");
        } else {
            System.out.println("Sorry! Data not affected.");
        }


        System.out.println("Type \"y\" to see the remaining data from the database: ");
        String select = scan.next();

        if (select.equals("y")){
            /*here we are doing the "content comparision", we cannot use "==" for comparing here, since "==" will try
             o see if the "address of "select" and "y" are same or no, which is obviously not correct.*/

            employeeDao.findAll().forEach(System.out::println);
        }else{
            System.exit(0);
        }
    }
}
