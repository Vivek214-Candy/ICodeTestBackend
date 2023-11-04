package com.icodetest.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.icodetest.app.employeedao.EmployeeDao;
import com.icodetest.app.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao empDao;
	
	public	List<Employee> getEmployee() {

		List<Employee> list = new ArrayList<>();

		for (Employee post : empDao.findAll()) {
			list.add(post);
		}

		return list;

	}

	public Employee addPost(Employee employee) {
		
		return empDao.save(employee);
		
	}

	public void addPost(List<Employee> employee) {
		
		for (Employee post : employee) {
			empDao.save(post);
	    }
	}
	
	
}
