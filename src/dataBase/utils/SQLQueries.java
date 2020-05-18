package dataBase.utils;

public interface SQLQueries {

    String INSERT_IN_EMP_TBL = "insert  into employee_tbl (eid ,userid, password, name, email, DOB, mobile, salary, ssn, createdate, updatedate) values (?,?,?,?,?,?,?,?,?,?,?) ";

    String SELECT_ALL_EMPLOYEES = "select  eid ,userid, password, name, email,DOB, mobile, salary, ssn, createdate, updatedate, role from employee_tbl ";
    String SELECT_ALL_USERID = "select  userid from employee_tbl ";

    String SELECT_EMP_BY_EID = "select eid ,userid, password, name, email,DOB, mobile, salary, ssn, createdate, updatedate, role from employee_tbl where eid = ?";
    String SELECT_EMP_BY_EMAIL = "select eid ,userid, password, name, email,DOB, mobile, salary, ssn, createdate, updatedate, role from employee_tbl where email = ?";
    String SELECT_EMP_BY_USERID = "select eid ,userid, password, name, email,DOB, mobile, salary, ssn, createdate, updatedate, role from employee_tbl where userId = ?";

    String CHECK_LOGIN_USER = "select eid ,userid, password, name, email,DOB, mobile, salary, ssn, createdate, updatedate, role from employee_tbl where email = ? and password = ?";
    String SELECT_MAX_EID = "select max(eid) from employee_tbl";
    String UPDATE_EMP_TBL_BY_EID = "update employee_tbl set eid = ? ,userid = ?,  password = ?,name = ?, email = ?, DOB = ?, mobile = ?, salary = ?, ssn = ?, createdate = ?, updatedate = ? where eid = ?";
    String UPDATE_EMP_PASSWORD = "update employee_tbl set  password = ? where email = ?";
    String UPDATE_EMP_TBL_BY_USERID = "update employee_tbl set eid = ? ,userid = ?,  password = ?,name = ?, email = ?, DOB = ?, mobile = ?, salary = ?, ssn = ?, createdate = ?, updatedate = ? where userid = ?";

    String DELETE_EMP_BY_EID = "delete from employee_tbl where eid =?";
    String DELETE_EMP_BY_EMAIL = "delete from employee_tbl where email =?";
}




