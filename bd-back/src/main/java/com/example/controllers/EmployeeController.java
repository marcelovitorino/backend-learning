package com.example.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.EmployeeModel;
import com.example.services.EmployeeService;


@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class EmployeeController{
	
	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id){
			service.delete(id);
	}

	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public EmployeeModel save(@RequestBody EmployeeModel employee) {
		
		return service.save(employee);
	}


}
