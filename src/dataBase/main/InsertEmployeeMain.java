package dataBase.main;

import dataBase.EmployeeDao;
import dataBase.EmployeeDaoImpl;
import dataBase.dao.entity.EmployeeEntity;
import dataBase.utils.DateUtils;

import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

public class InsertEmployeeMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        /*First we are putting the data in the JAVA program in a regular basis,
         and in order to put all these data in the mySQL online, we will have to
         make an "implementation" file interface which takes all these data and make the connection
         and all those in a different file.
         and for this, we will have to make a new object for the Interface which we made for the EmployeeDao
*/
        EmployeeDao employeeDao = new EmployeeDaoImpl();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the eid: ");
        int eid = scan.nextInt();

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
        System.out.println("The javaUtil version of above String date: \n"+date1+"\n");
        
        System.out.println("Enter the mobile number: ");
        long mobile = scan.nextLong();

        System.out.println("Enter the salary: ");
        double salary = scan.nextDouble();
       

        System.out.println("Enter the ssn: ");
        long ssn = scan.nextLong();
        
        System.out.println("Enter the Start Time: ");
        String startTime = scan.next();
        Time sTime = DateUtils.timeFromString(startTime);
        
        System.out.println("Enter the End Time: ");
        String endTime = scan.next();
        Time eTime = DateUtils.timeFromString(endTime);
        
        System.out.println("Are you Active: ");
        String active = scan.next();
        
         
        
        EmployeeEntity entity = new EmployeeEntity(eid,userid,password, name,email, new java.sql.Date(date1.getTime()), mobile,salary,ssn,null,null,new EmployeeEntity().getRole(), sTime,eTime,active);

        System.out.println("Saving all the data of the new Employee inside the entity in the JAVA side first...");

        employeeDao.save(entity);
        
        System.out.println("Display Data....");
       // employeeDao.forEach(System.out::println);
        scan.close();

    }
}
