package dataBase.utils;

import dataBase.dao.entity.EmployeeEntity;

public interface SQLQueries {

    String INSERT_IN_EMP_TBL = "insert  into employee_tbl (eid ,userid, password, name, email, DOB, mobile, salary, ssn, createdate, updatedate) values (?,?,?,?,?,?,?,?,?,?,?) ";

    String SELECT_ALL_EMPLOYEES = "select  eid ,userid, password, name, email,DOB, mobile, salary, ssn, createdate, updatedate from employee_tbl ";
    String SELECT_EMP_BY_EID = "select eid ,userid, password, name, email,DOB, mobile, salary, ssn, createdate, updatedate from employee_tbl where eid = ?";
    String SELECT_EMP_BY_EMAIL = "select eid ,userid, password, name, email,DOB, mobile, salary, ssn, createdate, updatedate from employee_tbl where email = ?";
    String CHECK_LOGIN_USER = "select eid ,userid, password, name, email,DOB, mobile, salary, ssn, createdate, updatedate from employee_tbl where email = ? and password = ?";

    String UPDATE_EMP_TBL = "update employee_tbl set eid = ? ,userid = ?,  password = ?,name = ?, email = ?, DOB = ?, mobile = ?, salary = ?, ssn = ?, createdate = ?, updatedate = ? where eid = ?";
    String UPDATE_EMP_PASSWORD = "update employee_tbl set  password = ? where email = ?";

    String DELETE_EMP_BY_EID = "delete from employee_tbl where eid =?";
    String DELETE_EMP_BY_EMAIL = "delete from employee_tbl where email =?";
}




