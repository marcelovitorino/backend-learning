package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.EmployeeModel;

public interface EmployeeRepository extends CrudRepository<EmployeeModel, Long> {
	
	
	public void createEmployee(EmployeeModel employee);
	
	
	public void deleteEmployee(Long empID);

	public EmployeeModel findOne(Long id);
	
	public List<EmployeeModel> findAll();
	
}