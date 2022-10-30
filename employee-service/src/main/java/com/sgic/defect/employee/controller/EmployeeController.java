package com.sgic.defect.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.defect.employee.dto.EmployeeDto;
import com.sgic.defect.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	
	@PostMapping("/employee")
	public ResponseEntity<Object> createEmployee(@RequestBody EmployeeDto employeeDto) {
		employeeService.createEmployee(employeeDto);
		return ResponseEntity.ok("save Successfully!");
	}
}
