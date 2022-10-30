package com.sgic.defect.employee.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.defect.employee.dto.EmployeeDto;
import com.sgic.defect.employee.entities.Employee;
import com.sgic.defect.employee.repositories.EmployeeRepository;

@Service
public abstract class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;


	@Override
	public void createEmployee(EmployeeDto employeeDto) {
		Employee employee = new Employee();
		BeanUtils.copyProperties(employeeDto, employee);
		employeeRepository.save(employee);
	}
}
