package com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer> {

	Optional<EmployeeEntity> findByEmailIdAndPassword(String emailId, String password);

	

	/*
	 * void saveEmp(EmployeeEntity employeeEntity);
	 * 
	 * EmployeeEntity authenticate(String emailId, String password);
	 * 
	 * void deleteEmp(int employeeId);
	 */

}
