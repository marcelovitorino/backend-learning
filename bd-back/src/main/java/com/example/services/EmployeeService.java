package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.EmployeeModel;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public List<EmployeeModel> findAll() {
		return repository.findAll();
	}
	
	public EmployeeModel findOne(Long id) {
		return repository.findOne(id);
	}
	
	public void save(EmployeeModel post) {
		repository.createEmployee(post);
	}
	
	public void delete(Long id) {
		repository.deleteEmployee(id);
	}
}
