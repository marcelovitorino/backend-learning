package com.example.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.EmployeeModel;

//@Transactional
@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeModel, Long> {
	
	/*
	public void createEmployee(EmployeeModel employee);
	
	public void deleteEmployee(Long empID);

	public EmployeeModel findOne(Long id);
	
	public List<EmployeeModel> findAll();
	
	**/
	
}