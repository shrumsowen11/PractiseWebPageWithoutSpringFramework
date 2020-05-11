package dataBase;

import dataBase.dao.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {

    String save(EmployeeEntity entity);

    List<EmployeeEntity> findAll();
    EmployeeEntity employeeById(int eID);
    EmployeeEntity employeeByEmail(String email);
	Optional<EmployeeEntity> optionalEmployeeByEmail(String email);

    Optional<EmployeeEntity> employeeLogin(String email, String password);
    
    String update(EmployeeEntity entity);
	String updatePassword(String email, String password);

    
    
    int deleteById(int eID);
	int deleteByEmail(String email);



}
