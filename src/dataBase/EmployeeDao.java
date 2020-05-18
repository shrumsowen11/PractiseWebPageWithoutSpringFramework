package dataBase;

import dataBase.dao.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {

    String save(EmployeeEntity entity);

    List<EmployeeEntity> findAll();
	List<String> findAllUserId();

    
    EmployeeEntity employeeById(int eID);
    EmployeeEntity employeeByEmail(String email);
    EmployeeEntity employeeByUserId(String userId);
	Optional<EmployeeEntity> optionalEmployeeByEmail(String email);

    Optional<EmployeeEntity> employeeLogin(String email, String password);
    
    String update(EmployeeEntity entity);
	String updatePassword(String email, String password);
	String updateEmployeeByUserId(EmployeeEntity entity);

    
    
    int deleteById(int eID);
	int deleteByEmail(String email);

	int getIncrementedEId();



	

	



}
