package com.example.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.EmployeeModel;
import com.example.repository.EmployeeRepository;
import com.example.services.EmployeeService;

public class EmployeeController{
	
	private EmployeeService service;

	@GetMapping("/delete/{id}")

	public void delete(@PathVariable("id") Long id){
			service.delete(id);

	}

	
	@PostMapping("/save")
	public void save(@Valid EmployeeModel employee, BindingResult result) {
		
		if(result.hasErrors()) {
			//erro
		}
		
		service.save(employee);
	
	}


	

	
	
}
