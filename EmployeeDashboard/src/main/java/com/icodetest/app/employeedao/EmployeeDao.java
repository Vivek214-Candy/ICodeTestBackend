package com.icodetest.app.employeedao;

import org.springframework.data.repository.CrudRepository;

import com.icodetest.app.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
