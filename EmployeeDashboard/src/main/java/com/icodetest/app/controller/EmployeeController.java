package com.icodetest.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.icodetest.app.entity.Employee;
import com.icodetest.app.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getPosts() {

		return employeeService.getEmployee();

	}

	@PostMapping(value = "/employees")
	public ResponseEntity<String> addPost(@RequestBody Employee employee) {
		Employee emp = employeeService.addPost(employee);
		if (emp == null) {
			return new ResponseEntity<>("Employee not added", HttpStatus.BAD_REQUEST);
		}else
		{
			return new ResponseEntity<>("Employee Added Successfully", HttpStatus.CREATED);
		}

	}
	
	@PostMapping(value = "/employeeslist")
	public void addPost(@RequestBody List<Employee> employee) {
		 employeeService.addPost(employee);
		

	}

}
